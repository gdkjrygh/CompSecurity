// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Analytics, TrackerHandler, GAThread, AdHitIdGenerator, 
//            AnalyticsThread, GAUsage, Tracker, GoogleTracker, 
//            Utils, Log

public class GoogleAnalytics
    implements Analytics, TrackerHandler
{

    private static GoogleAnalytics instance;
    private AdHitIdGenerator adHitIdGenerator;
    private volatile Boolean appOptOut;
    private volatile String clientId;
    private Context context;
    private boolean debug;
    private Tracker defaultTracker;
    private String lastTrackingId;
    private AnalyticsThread thread;
    private final Map trackers;

    private GoogleAnalytics()
    {
        trackers = new HashMap();
    }

    private GoogleAnalytics(Context context1)
    {
        this(context1, ((AnalyticsThread) (GAThread.getInstance(context1))));
    }

    private GoogleAnalytics(Context context1, AnalyticsThread analyticsthread)
    {
        trackers = new HashMap();
        if (context1 == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            context = context1.getApplicationContext();
            thread = analyticsthread;
            adHitIdGenerator = new AdHitIdGenerator();
            thread.requestAppOptOut(new Analytics.AppOptOutCallback() {

                final GoogleAnalytics this$0;

                public void reportAppOptOut(boolean flag)
                {
                    appOptOut = Boolean.valueOf(flag);
                }

            
            {
                this$0 = GoogleAnalytics.this;
                super();
            }
            });
            thread.requestClientId(new AnalyticsThread.ClientIdCallback() {

                final GoogleAnalytics this$0;

                public void reportClientId(String s)
                {
                    clientId = s;
                }

            
            {
                this$0 = GoogleAnalytics.this;
                super();
            }
            });
            return;
        }
    }

    static void clearInstance()
    {
        com/google/analytics/tracking/android/GoogleAnalytics;
        JVM INSTR monitorenter ;
        instance = null;
        com/google/analytics/tracking/android/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static GoogleAnalytics getInstance()
    {
        com/google/analytics/tracking/android/GoogleAnalytics;
        JVM INSTR monitorenter ;
        GoogleAnalytics googleanalytics = instance;
        com/google/analytics/tracking/android/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return googleanalytics;
        Exception exception;
        exception;
        throw exception;
    }

    public static GoogleAnalytics getInstance(Context context1)
    {
        com/google/analytics/tracking/android/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new GoogleAnalytics(context1);
        }
        context1 = instance;
        com/google/analytics/tracking/android/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return context1;
        context1;
        throw context1;
    }

    static GoogleAnalytics getNewInstance(Context context1, AnalyticsThread analyticsthread)
    {
        com/google/analytics/tracking/android/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (instance != null)
        {
            instance.close();
        }
        instance = new GoogleAnalytics(context1, analyticsthread);
        context1 = instance;
        com/google/analytics/tracking/android/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return context1;
        context1;
        throw context1;
    }

    void close()
    {
    }

    public void closeTracker(Tracker tracker)
    {
        this;
        JVM INSTR monitorenter ;
        trackers.values().remove(tracker);
        if (tracker == defaultTracker)
        {
            defaultTracker = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        tracker;
        throw tracker;
    }

    public boolean debugEnabled()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_DEBUG);
        return debug;
    }

    Boolean getAppOptOut()
    {
        return appOptOut;
    }

    String getClientIdForAds()
    {
        if (clientId == null)
        {
            return null;
        } else
        {
            return clientId.toString();
        }
    }

    public Tracker getDefaultTracker()
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker;
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_DEFAULT_TRACKER);
        tracker = defaultTracker;
        this;
        JVM INSTR monitorexit ;
        return tracker;
        Exception exception;
        exception;
        throw exception;
    }

    public Tracker getTracker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("trackingId cannot be null");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        Object obj1 = (Tracker)trackers.get(s);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj1 = new GoogleTracker(s, this);
        trackers.put(s, obj1);
        obj = obj1;
        if (defaultTracker != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        defaultTracker = ((Tracker) (obj1));
        obj = obj1;
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_TRACKER);
        this;
        JVM INSTR monitorexit ;
        return ((Tracker) (obj));
    }

    String getTrackingIdForAds()
    {
        return lastTrackingId;
    }

    public void requestAppOptOut(Analytics.AppOptOutCallback appoptoutcallback)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.REQUEST_APP_OPT_OUT);
        if (appOptOut != null)
        {
            appoptoutcallback.reportAppOptOut(appOptOut.booleanValue());
            return;
        } else
        {
            thread.requestAppOptOut(appoptoutcallback);
            return;
        }
    }

    public void sendHit(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("hit cannot be null");
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
        map.put("language", Utils.getLanguage(Locale.getDefault()));
        map.put("adSenseAdMobHitId", Integer.toString(adHitIdGenerator.getAdHitId()));
        map.put("screenResolution", (new StringBuilder()).append(context.getResources().getDisplayMetrics().widthPixels).append("x").append(context.getResources().getDisplayMetrics().heightPixels).toString());
        map.put("usage", GAUsage.getInstance().getAndClearSequence());
        GAUsage.getInstance().getAndClearUsage();
        thread.sendHit(map);
        lastTrackingId = (String)map.get("trackingId");
        this;
        JVM INSTR monitorexit ;
    }

    public void setAppOptOut(boolean flag)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_OPT_OUT);
        appOptOut = Boolean.valueOf(flag);
        thread.setAppOptOut(flag);
    }

    public void setDebug(boolean flag)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_DEBUG);
        debug = flag;
        Log.setDebug(flag);
    }

    public void setDefaultTracker(Tracker tracker)
    {
        this;
        JVM INSTR monitorenter ;
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_DEFAULT_TRACKER);
        defaultTracker = tracker;
        this;
        JVM INSTR monitorexit ;
        return;
        tracker;
        throw tracker;
    }


/*
    static Boolean access$002(GoogleAnalytics googleanalytics, Boolean boolean1)
    {
        googleanalytics.appOptOut = boolean1;
        return boolean1;
    }

*/


/*
    static String access$102(GoogleAnalytics googleanalytics, String s)
    {
        googleanalytics.clientId = s;
        return s;
    }

*/
}
