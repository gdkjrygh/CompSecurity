// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.PreferenceDataStore;
import com.urbanairship.UAirship;
import com.urbanairship.location.LocationRequestOptions;
import com.urbanairship.util.UAStringUtil;
import java.util.UUID;

// Referenced classes of package com.urbanairship.analytics:
//            ActivityMonitor, AnalyticsPreferences, EventDataManager, LifeCycleCallbacks, 
//            Event, EventService, LocationEvent

public class Analytics
{

    public static final String ACTION_APP_BACKGROUND = (new StringBuilder()).append(UAirship.getPackageName()).append(".urbanairship.analytics.APP_BACKGROUND").toString();
    public static final String ACTION_APP_FOREGROUND = (new StringBuilder()).append(UAirship.getPackageName()).append(".urbanairship.analytics.APP_FOREGROUND").toString();
    private static LifeCycleCallbacks lifeCycleCallbacks;
    private final ActivityMonitor activityMonitor;
    private boolean analyticsEnabled;
    private BroadcastReceiver appStateChangeReceiver;
    private Context context;
    private String conversionSendId;
    private final EventDataManager dataManager;
    private boolean inBackground;
    private int minSdkVersion;
    private final AnalyticsPreferences preferences;
    private String sessionId;
    private boolean stickyBroadcastAllowed;

    public Analytics(Context context1, PreferenceDataStore preferencedatastore, AirshipConfigOptions airshipconfigoptions)
    {
        this(context1, preferencedatastore, airshipconfigoptions, new ActivityMonitor(airshipconfigoptions.minSdkVersion, android.os.Build.VERSION.SDK_INT, airshipconfigoptions.analyticsEnabled));
    }

    Analytics(Context context1, PreferenceDataStore preferencedatastore, AirshipConfigOptions airshipconfigoptions, ActivityMonitor activitymonitor)
    {
        appStateChangeReceiver = new _cls1();
        stickyBroadcastAllowed = false;
        preferences = new AnalyticsPreferences(preferencedatastore);
        context = context1.getApplicationContext();
        dataManager = new EventDataManager();
        minSdkVersion = airshipconfigoptions.minSdkVersion;
        inBackground = true;
        analyticsEnabled = airshipconfigoptions.analyticsEnabled;
        startNewSession();
        preferencedatastore = airshipconfigoptions.analyticsServer;
        if (analyticsEnabled && UAStringUtil.isEmpty(preferencedatastore))
        {
            Logger.error("Unable to send analytics to an empty server. Disabling analytics.");
            analyticsEnabled = false;
        }
        activityMonitor = activitymonitor;
        activityMonitor.setListener(new _cls2());
        registerBroadcastReceiver(context1);
    }

    public static void activityStarted(Activity activity)
    {
        UAirship.shared(new _cls3(activity, System.currentTimeMillis()));
    }

    public static void activityStopped(Activity activity)
    {
        UAirship.shared(new _cls4(activity, System.currentTimeMillis()));
    }

    private void registerBroadcastReceiver(Context context1)
    {
        if (UAirship.getPackageManager().checkPermission("android.permission.BROADCAST_STICKY", UAirship.getPackageName()) == 0)
        {
            stickyBroadcastAllowed = true;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(ACTION_APP_BACKGROUND);
        intentfilter.addAction(ACTION_APP_FOREGROUND);
        intentfilter.addCategory(UAirship.getPackageName());
        context1.registerReceiver(appStateChangeReceiver, intentfilter);
    }

    public static void registerLifeCycleCallbacks(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT > 14 && lifeCycleCallbacks == null)
        {
            lifeCycleCallbacks = new _cls5();
            lifeCycleCallbacks.register(application);
        }
    }

    private void reportActivityStarted(Activity activity, ActivityMonitor.Source source, long l)
    {
        if (minSdkVersion >= 14 && analyticsEnabled && ActivityMonitor.Source.MANUAL_INSTRUMENTATION == source)
        {
            Logger.warn("activityStarted call is no longer necessary starting with SDK 14 - ICE CREAM SANDWICH. Analytics is auto-instrumented for you.");
        }
        activityMonitor.activityStarted(activity, source, l);
    }

    private void reportActivityStopped(Activity activity, ActivityMonitor.Source source, long l)
    {
        if (minSdkVersion >= 14 && analyticsEnabled && ActivityMonitor.Source.MANUAL_INSTRUMENTATION == source)
        {
            Logger.warn("activityStopped call is no longer necessary starting with SDK 14 - ICE CREAM SANDWICH. Analytics is auto-instrumented for you.");
        }
        activityMonitor.activityStopped(activity, source, l);
    }

    private void sendBackgroundBroadcast()
    {
        Intent intent = new Intent(ACTION_APP_BACKGROUND);
        intent.addCategory(UAirship.getPackageName());
        if (stickyBroadcastAllowed)
        {
            context.sendStickyBroadcast(intent);
            return;
        } else
        {
            context.sendBroadcast(intent);
            return;
        }
    }

    private void sendForegroundBroadcast()
    {
        Intent intent = new Intent(ACTION_APP_FOREGROUND);
        intent.addCategory(UAirship.getPackageName());
        if (stickyBroadcastAllowed)
        {
            context.sendStickyBroadcast(intent);
            return;
        } else
        {
            context.sendBroadcast(intent);
            return;
        }
    }

    public static void unregisterLifeCycleCallbacks(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT > 14 && lifeCycleCallbacks != null)
        {
            lifeCycleCallbacks.unregister(application);
        }
    }

    public void addEvent(Event event)
    {
        if (!analyticsEnabled || event == null)
        {
            return;
        }
        String s = event.createEventPayload(sessionId);
        if (s == null)
        {
            Logger.error((new StringBuilder()).append("Failed to add event ").append(event.getType()).toString());
        }
        Context context1 = UAirship.getApplicationContext();
        if (context1.startService((new Intent(context1, com/urbanairship/analytics/EventService)).setAction("com.urbanairship.analytics.ADD").putExtra("EXTRA_EVENT_TYPE", event.getType()).putExtra("EXTRA_EVENT_ID", event.getEventId()).putExtra("EXTRA_EVENT_DATA", s).putExtra("EXTRA_EVENT_TIME_STAMP", event.getTime()).putExtra("EXTRA_EVENT_SESSION_ID", sessionId)) == null)
        {
            Logger.warn("Unable to start analytics service. Check that the event service is added to the manifest.");
            return;
        } else
        {
            Logger.debug((new StringBuilder()).append("Added ").append(event.getType()).append(": ").append(s).toString());
            return;
        }
    }

    public String getConversionSendId()
    {
        return conversionSendId;
    }

    EventDataManager getDataManager()
    {
        return dataManager;
    }

    AnalyticsPreferences getPreferences()
    {
        return preferences;
    }

    String getSessionId()
    {
        return sessionId;
    }

    public boolean isAppInForeground()
    {
        return !inBackground;
    }

    public void recordLocation(Location location)
    {
        recordLocation(location, null, LocationEvent.UpdateType.SINGLE);
    }

    public void recordLocation(Location location, LocationRequestOptions locationrequestoptions, LocationEvent.UpdateType updatetype)
    {
        byte byte0;
        int i;
        if (locationrequestoptions == null)
        {
            byte0 = -1;
            i = -1;
        } else
        {
            i = (int)locationrequestoptions.getMinDistance();
            if (locationrequestoptions.getPriority() == 1)
            {
                byte0 = 1;
            } else
            {
                byte0 = 2;
            }
        }
        addEvent(new LocationEvent(location, updatetype, byte0, i, isAppInForeground()));
    }

    public void setConversionSendId(String s)
    {
        Logger.debug((new StringBuilder()).append("Setting conversion send id: ").append(s).toString());
        conversionSendId = s;
    }

    void startNewSession()
    {
        sessionId = UUID.randomUUID().toString();
        Logger.verbose((new StringBuilder()).append("New session: ").append(sessionId).toString());
    }



/*
    static boolean access$002(Analytics analytics, boolean flag)
    {
        analytics.inBackground = flag;
        return flag;
    }

*/





    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}

}
