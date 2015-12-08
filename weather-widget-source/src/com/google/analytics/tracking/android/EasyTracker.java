// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.analytics.tracking.android:
//            ParameterLoader, Log, Analytics, Tracker, 
//            ServiceManager, ExceptionReporter, Clock, GAServiceManager, 
//            ParameterLoaderImpl, GoogleAnalytics, ExceptionParser, Transaction

public class EasyTracker
{
    class NoopTracker
        implements Tracker
    {

        private boolean anonymizeIp;
        private String appId;
        private String appInstallerId;
        private ExceptionParser exceptionParser;
        private double sampleRate;
        final EasyTracker this$0;
        private boolean useSecure;

        public boolean anonymizeIpEnabled()
        {
            return anonymizeIp;
        }

        public void close()
        {
        }

        public Map constructEvent(String s, String s1, String s2, Long long1)
        {
            return new HashMap();
        }

        public Map constructException(String s, boolean flag)
        {
            return new HashMap();
        }

        public Map constructRawException(String s, Throwable throwable, boolean flag)
        {
            return new HashMap();
        }

        public Map constructSocial(String s, String s1, String s2)
        {
            return new HashMap();
        }

        public Map constructTiming(String s, long l, String s1, String s2)
        {
            return new HashMap();
        }

        public Map constructTransaction(Transaction transaction)
        {
            return new HashMap();
        }

        public String get(String s)
        {
            return "";
        }

        public String getAppId()
        {
            return appId;
        }

        public String getAppInstallerId()
        {
            return appInstallerId;
        }

        public ExceptionParser getExceptionParser()
        {
            return exceptionParser;
        }

        public double getSampleRate()
        {
            return sampleRate;
        }

        public String getTrackingId()
        {
            return "";
        }

        public boolean getUseSecure()
        {
            return useSecure;
        }

        public void send(String s, Map map)
        {
        }

        public void set(String s, String s1)
        {
        }

        public void setAnonymizeIp(boolean flag)
        {
            anonymizeIp = flag;
        }

        public void setAppId(String s)
        {
            appId = s;
        }

        public void setAppInstallerId(String s)
        {
            appInstallerId = s;
        }

        public void setAppName(String s)
        {
        }

        public void setAppScreen(String s)
        {
        }

        public void setAppVersion(String s)
        {
        }

        public void setCampaign(String s)
        {
        }

        public void setCustomDimension(int i, String s)
        {
        }

        public void setCustomDimensionsAndMetrics(Map map, Map map1)
        {
        }

        public void setCustomMetric(int i, Long long1)
        {
        }

        public void setExceptionParser(ExceptionParser exceptionparser)
        {
            exceptionParser = exceptionparser;
        }

        public void setReferrer(String s)
        {
        }

        public void setSampleRate(double d)
        {
            sampleRate = d;
        }

        public void setStartSession(boolean flag)
        {
        }

        public void setUseSecure(boolean flag)
        {
            useSecure = flag;
        }

        public void trackEvent(String s, String s1, String s2, Long long1)
        {
        }

        public void trackException(String s, Throwable throwable, boolean flag)
        {
        }

        public void trackException(String s, boolean flag)
        {
        }

        public void trackSocial(String s, String s1, String s2)
        {
        }

        public void trackTiming(String s, long l, String s1, String s2)
        {
        }

        public void trackTransaction(Transaction transaction)
        {
        }

        public void trackView()
        {
        }

        public void trackView(String s)
        {
        }

        NoopTracker()
        {
            this$0 = EasyTracker.this;
            super();
            sampleRate = 100D;
        }
    }

    private class NotInForegroundTimerTask extends TimerTask
    {

        final EasyTracker this$0;

        public void run()
        {
            inForeground = false;
        }

        private NotInForegroundTimerTask()
        {
            this$0 = EasyTracker.this;
            super();
        }

    }


    static final int NUM_MILLISECONDS_TO_WAIT_FOR_OPEN_ACTIVITY = 1000;
    private static EasyTracker instance;
    private int activitiesActive;
    private final Map activityNameMap = new HashMap();
    private boolean autoActivityTracking;
    private Clock clock;
    private Analytics ga;
    private boolean gaAnonymizeIp;
    private String gaAppName;
    private String gaAppVersion;
    private Context gaContext;
    private boolean gaDebug;
    private int gaDispatchPeriod;
    private boolean gaEnabled;
    private boolean gaReportUncaughtExceptions;
    private Double gaSampleRate;
    private long gaSessionTimeout;
    private String gaTrackingId;
    private Thread.UncaughtExceptionHandler handler;
    private boolean inForeground;
    private long lastOnStopTime;
    private ParameterLoader parameterFetcher;
    private ServiceManager serviceManager;
    private Timer timer;
    private TimerTask timerTask;
    private Tracker tracker;

    private EasyTracker()
    {
        gaEnabled = false;
        gaDispatchPeriod = 1800;
        autoActivityTracking = false;
        activitiesActive = 0;
        tracker = null;
        inForeground = false;
        clock = new Clock() {

            final EasyTracker this$0;

            public long currentTimeMillis()
            {
                return System.currentTimeMillis();
            }

            
            {
                this$0 = EasyTracker.this;
                super();
            }
        };
    }

    private void clearExistingTimer()
    {
        this;
        JVM INSTR monitorenter ;
        if (timer != null)
        {
            timer.cancel();
            timer = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void clearTracker()
    {
        instance = null;
    }

    private String getActivityName(Activity activity)
    {
        String s = activity.getClass().getCanonicalName();
        if (activityNameMap.containsKey(s))
        {
            return (String)activityNameMap.get(s);
        }
        String s1 = parameterFetcher.getString(s);
        activity = s1;
        if (s1 == null)
        {
            activity = s;
        }
        activityNameMap.put(s, activity);
        return activity;
    }

    public static EasyTracker getInstance()
    {
        if (instance == null)
        {
            instance = new EasyTracker();
        }
        return instance;
    }

    public static Tracker getTracker()
    {
        if (getInstance().gaContext == null)
        {
            throw new IllegalStateException("You must call EasyTracker.getInstance().setContext(context) or startActivity(activity) before calling getTracker()");
        } else
        {
            return getInstance().tracker;
        }
    }

    private void loadParameters()
    {
        boolean flag1;
        flag1 = true;
        gaTrackingId = parameterFetcher.getString("ga_trackingId");
        if (!TextUtils.isEmpty(gaTrackingId)) goto _L2; else goto _L1
_L1:
        gaTrackingId = parameterFetcher.getString("ga_api_key");
        if (!TextUtils.isEmpty(gaTrackingId)) goto _L2; else goto _L3
_L3:
        Log.e("EasyTracker requested, but missing required ga_trackingId");
        tracker = new NoopTracker();
_L5:
        return;
_L2:
        gaEnabled = true;
        gaAppName = parameterFetcher.getString("ga_appName");
        gaAppVersion = parameterFetcher.getString("ga_appVersion");
        gaDebug = parameterFetcher.getBoolean("ga_debug");
        gaSampleRate = parameterFetcher.getDoubleFromString("ga_sampleFrequency");
        if (gaSampleRate == null)
        {
            gaSampleRate = new Double(parameterFetcher.getInt("ga_sampleRate", 100));
        }
        gaDispatchPeriod = parameterFetcher.getInt("ga_dispatchPeriod", 1800);
        gaSessionTimeout = parameterFetcher.getInt("ga_sessionTimeout", 30) * 1000;
        boolean flag = flag1;
        if (!parameterFetcher.getBoolean("ga_autoActivityTracking"))
        {
            if (parameterFetcher.getBoolean("ga_auto_activity_tracking"))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        autoActivityTracking = flag;
        gaAnonymizeIp = parameterFetcher.getBoolean("ga_anonymizeIp");
        gaReportUncaughtExceptions = parameterFetcher.getBoolean("ga_reportUncaughtExceptions");
        tracker = ga.getTracker(gaTrackingId);
        if (!TextUtils.isEmpty(gaAppName))
        {
            Log.i((new StringBuilder()).append("setting appName to ").append(gaAppName).toString());
            tracker.setAppName(gaAppName);
        }
        if (gaAppVersion != null)
        {
            tracker.setAppVersion(gaAppVersion);
        }
        tracker.setAnonymizeIp(gaAnonymizeIp);
        tracker.setSampleRate(gaSampleRate.doubleValue());
        ga.setDebug(gaDebug);
        serviceManager.setDispatchPeriod(gaDispatchPeriod);
        if (gaReportUncaughtExceptions)
        {
            Thread.UncaughtExceptionHandler uncaughtexceptionhandler = handler;
            Object obj = uncaughtexceptionhandler;
            if (uncaughtexceptionhandler == null)
            {
                obj = new ExceptionReporter(tracker, serviceManager, Thread.getDefaultUncaughtExceptionHandler());
            }
            Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (obj)));
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void activityStart(Activity activity)
    {
        setContext(activity);
        if (gaEnabled)
        {
            clearExistingTimer();
            if (!inForeground && activitiesActive == 0 && checkForNewSession())
            {
                tracker.setStartSession(true);
                if (autoActivityTracking);
            }
            inForeground = true;
            activitiesActive = activitiesActive + 1;
            if (autoActivityTracking)
            {
                tracker.trackView(getActivityName(activity));
                return;
            }
        }
    }

    public void activityStop(Activity activity)
    {
        setContext(activity);
        if (gaEnabled)
        {
            activitiesActive = activitiesActive - 1;
            activitiesActive = Math.max(0, activitiesActive);
            lastOnStopTime = clock.currentTimeMillis();
            if (activitiesActive == 0)
            {
                clearExistingTimer();
                timerTask = new NotInForegroundTimerTask();
                timer = new Timer("waitForActivityStart");
                timer.schedule(timerTask, 1000L);
                return;
            }
        }
    }

    boolean checkForNewSession()
    {
        return gaSessionTimeout == 0L || gaSessionTimeout > 0L && clock.currentTimeMillis() > lastOnStopTime + gaSessionTimeout;
    }

    public void dispatch()
    {
        if (gaEnabled)
        {
            serviceManager.dispatch();
        }
    }

    int getActivitiesActive()
    {
        return activitiesActive;
    }

    void setClock(Clock clock1)
    {
        clock = clock1;
    }

    public void setContext(Context context)
    {
        if (context == null)
        {
            Log.e("Context cannot be null");
            return;
        } else
        {
            GAServiceManager gaservicemanager = GAServiceManager.getInstance();
            setContext(context, ((ParameterLoader) (new ParameterLoaderImpl(context.getApplicationContext()))), ((Analytics) (GoogleAnalytics.getInstance(context.getApplicationContext()))), ((ServiceManager) (gaservicemanager)));
            return;
        }
    }

    void setContext(Context context, ParameterLoader parameterloader, Analytics analytics, ServiceManager servicemanager)
    {
        if (context == null)
        {
            Log.e("Context cannot be null");
        }
        if (gaContext == null)
        {
            gaContext = context.getApplicationContext();
            ga = analytics;
            serviceManager = servicemanager;
            parameterFetcher = parameterloader;
            loadParameters();
        }
    }

    void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        handler = uncaughtexceptionhandler;
    }


/*
    static boolean access$102(EasyTracker easytracker, boolean flag)
    {
        easytracker.inForeground = flag;
        return flag;
    }

*/
}
