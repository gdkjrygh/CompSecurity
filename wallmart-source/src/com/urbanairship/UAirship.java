// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import com.urbanairship.actions.ActionRegistry;
import com.urbanairship.amazon.ADMUtils;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.google.GCMUtils;
import com.urbanairship.google.PlayServicesUtils;
import com.urbanairship.js.Whitelist;
import com.urbanairship.location.UALocationManager;
import com.urbanairship.push.PushManager;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.util.ManifestUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship:
//            ApplicationMetrics, AirshipConfigOptions, Logger, PreferenceDataStore, 
//            BaseManager, CancelableOperation, UrbanAirshipProvider, Cancelable

public class UAirship
{
    public static interface OnReadyCallback
    {

        public abstract void onAirshipReady(UAirship uairship);
    }


    public static final int AMAZON_PLATFORM = 1;
    public static final int ANDROID_PLATFORM = 2;
    private static final String LIBRARY_VERSION_KEY = "com.urbanairship.application.device.LIBRARY_VERSION";
    private static final String PLATFORM_KEY = "com.urbanairship.application.device.PLATFORM";
    private static final Object airshipLock = new Object();
    static Application application;
    static volatile boolean isFlying = false;
    static volatile boolean isTakingOff = false;
    private static List pendingAirshipRequests;
    static UAirship sharedAirship;
    AirshipConfigOptions airshipConfigOptions;
    Analytics analytics;
    ApplicationMetrics applicationMetrics;
    UALocationManager locationManager;
    PreferenceDataStore preferenceDataStore;
    PushManager pushManager;
    RichPushManager richPushManager;
    Whitelist whitelist;

    UAirship(Context context, AirshipConfigOptions airshipconfigoptions, PreferenceDataStore preferencedatastore)
    {
        airshipConfigOptions = airshipconfigoptions;
        preferenceDataStore = preferencedatastore;
        analytics = new Analytics(context, preferencedatastore, airshipconfigoptions);
        applicationMetrics = new ApplicationMetrics(context, preferencedatastore);
        richPushManager = new RichPushManager(preferencedatastore);
        locationManager = new UALocationManager(context, preferencedatastore);
        pushManager = new PushManager(context, preferencedatastore);
        whitelist = Whitelist.createDefaultWhitelist(airshipconfigoptions);
    }

    private static void executeTakeOff(Application application1, AirshipConfigOptions airshipconfigoptions, OnReadyCallback onreadycallback)
    {
        AirshipConfigOptions airshipconfigoptions1;
        airshipconfigoptions1 = airshipconfigoptions;
        if (airshipconfigoptions == null)
        {
            airshipconfigoptions1 = AirshipConfigOptions.loadDefaultOptions(application1.getApplicationContext());
        }
        Logger.debug((new StringBuilder()).append("Lib Version: ").append(getVersion()).append(" / App key = ").append(airshipconfigoptions1.getAppKey()).toString());
        Logger.debug((new StringBuilder()).append("In Production? ").append(airshipconfigoptions1.inProduction).toString());
        if (!airshipconfigoptions1.isValid())
        {
            synchronized (airshipLock)
            {
                isTakingOff = false;
                airshipLock.notifyAll();
            }
            Logger.error("AirshipConfigOptions are not valid. Unable to take off! Check your airshipconfig.properties file for the errors listed above.");
            throw new IllegalArgumentException("Application configuration is invalid.");
        }
        break MISSING_BLOCK_LABEL_120;
        airshipconfigoptions;
        application1;
        JVM INSTR monitorexit ;
        throw airshipconfigoptions;
        Logger.logLevel = airshipconfigoptions1.getLoggerLevel();
        Logger.TAG = (new StringBuilder()).append(getAppName()).append(" - UALib").toString();
        Logger.debug((new StringBuilder()).append("Airship log level: ").append(Logger.logLevel).toString());
        airshipconfigoptions = new PreferenceDataStore(application1.getApplicationContext());
        airshipconfigoptions.loadAll();
        sharedAirship = new UAirship(application1.getApplicationContext(), airshipconfigoptions1, airshipconfigoptions);
        sharedAirship.init();
        application1 = getVersion();
        String s = airshipconfigoptions.getString("com.urbanairship.application.device.LIBRARY_VERSION", null);
        if (s != null && !s.equals(application1))
        {
            Logger.info((new StringBuilder()).append("Urban Airship library changed from ").append(s).append(" to ").append(application1).append(".").toString());
        }
        airshipconfigoptions.put("com.urbanairship.application.device.LIBRARY_VERSION", getVersion());
        ActionRegistry.shared().registerDefaultActions();
        if (!airshipconfigoptions1.inProduction)
        {
            sharedAirship.validateManifest();
        }
        application1 = ((Application) (airshipLock));
        application1;
        JVM INSTR monitorenter ;
        isFlying = true;
        isTakingOff = false;
        if (onreadycallback == null)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        onreadycallback.onAirshipReady(sharedAirship);
        if (pendingAirshipRequests == null)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        for (airshipconfigoptions = (new ArrayList(pendingAirshipRequests)).iterator(); airshipconfigoptions.hasNext(); ((Runnable)airshipconfigoptions.next()).run()) { }
        break MISSING_BLOCK_LABEL_385;
        airshipconfigoptions;
        application1;
        JVM INSTR monitorexit ;
        throw airshipconfigoptions;
        pendingAirshipRequests = null;
        airshipLock.notifyAll();
        application1;
        JVM INSTR monitorexit ;
    }

    public static int getAppIcon()
    {
        ApplicationInfo applicationinfo = getAppInfo();
        if (applicationinfo != null)
        {
            return applicationinfo.icon;
        } else
        {
            return -1;
        }
    }

    public static ApplicationInfo getAppInfo()
    {
        return application.getApplicationInfo();
    }

    public static String getAppName()
    {
        if (getAppInfo() != null)
        {
            return getPackageManager().getApplicationLabel(getAppInfo()).toString();
        } else
        {
            return null;
        }
    }

    public static Context getApplicationContext()
    {
        if (application == null)
        {
            throw new IllegalStateException("TakeOff must be called first.");
        } else
        {
            return application.getApplicationContext();
        }
    }

    public static PackageInfo getPackageInfo()
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Logger.info((new StringBuilder()).append("NameNotFound for: ").append(getPackageName()).append(". Disabling.").toString());
            return null;
        }
        return packageinfo;
    }

    public static PackageManager getPackageManager()
    {
        return application.getPackageManager();
    }

    public static String getPackageName()
    {
        return application.getPackageName();
    }

    public static String getUrbanAirshipPermission()
    {
        return (new StringBuilder()).append(application.getPackageName()).append(".permission.UA_DATA").toString();
    }

    public static String getVersion()
    {
        return "5.1.3";
    }

    private void init()
    {
        sharedAirship.getRichPushManager().init();
        sharedAirship.getPushManager().init();
        sharedAirship.getLocationManager().init();
    }

    public static boolean isFlying()
    {
        return isFlying;
    }

    public static boolean isTakingOff()
    {
        return isTakingOff;
    }

    static void land()
    {
label0:
        {
            synchronized (airshipLock)
            {
                if (isTakingOff || isFlying)
                {
                    break label0;
                }
            }
            return;
        }
        UAirship uairship;
        Analytics.unregisterLifeCycleCallbacks(application);
        uairship = shared();
        if (uairship == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        uairship.tearDown();
        isFlying = false;
        isTakingOff = false;
        sharedAirship = null;
        application = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Cancelable shared(OnReadyCallback onreadycallback)
    {
        return shared(onreadycallback, null);
    }

    public static Cancelable shared(OnReadyCallback onreadycallback, Looper looper)
    {
        looper = new _cls1(looper, onreadycallback);
        onreadycallback = ((OnReadyCallback) (airshipLock));
        onreadycallback;
        JVM INSTR monitorenter ;
        if (!isFlying)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        looper.run();
_L2:
        return looper;
        if (pendingAirshipRequests == null)
        {
            pendingAirshipRequests = new ArrayList();
        }
        pendingAirshipRequests.add(looper);
        if (true) goto _L2; else goto _L1
_L1:
        looper;
        onreadycallback;
        JVM INSTR monitorexit ;
        throw looper;
    }

    public static UAirship shared()
    {
label0:
        {
            UAirship uairship;
            synchronized (airshipLock)
            {
                if (!isFlying)
                {
                    break label0;
                }
                uairship = sharedAirship;
            }
            return uairship;
        }
        if (!isTakingOff)
        {
            throw new IllegalStateException("Take off must be called before shared()");
        }
        break MISSING_BLOCK_LABEL_42;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        airshipLock.wait();
_L1:
        if (isFlying)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        InterruptedException interruptedexception;
        interruptedexception;
        Logger.error("Failed to wait for UAirship instance.", interruptedexception);
          goto _L1
        UAirship uairship1 = sharedAirship;
        obj;
        JVM INSTR monitorexit ;
        return uairship1;
    }

    public static void takeOff(Application application1)
    {
        takeOff(application1, null, null);
    }

    public static void takeOff(Application application1, AirshipConfigOptions airshipconfigoptions)
    {
        takeOff(application1, airshipconfigoptions, null);
    }

    public static void takeOff(Application application1, AirshipConfigOptions airshipconfigoptions, OnReadyCallback onreadycallback)
    {
label0:
        {
            Logger.debug("Airship Takeoff!");
            if (application1 == null)
            {
                throw new IllegalArgumentException("Application argument must not be null");
            }
            if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper())
            {
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    try
                    {
                        Class.forName("android.os.AsyncTask");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Logger.error("AsyncTask workaround failed.", ((Throwable) (obj)));
                    }
                }
            } else
            {
                Logger.error("takeOff() must be called on the main thread!");
            }
            synchronized (airshipLock)
            {
                if (!isFlying && !isTakingOff)
                {
                    break label0;
                }
                Logger.error("You can only call takeOff() once.");
            }
            return;
        }
        isTakingOff = true;
        application = application1;
        UrbanAirshipProvider.init();
        Analytics.registerLifeCycleCallbacks(application1);
        (new Thread(new _cls2(application1, airshipconfigoptions, onreadycallback))).start();
        obj;
        JVM INSTR monitorexit ;
        return;
        application1;
        obj;
        JVM INSTR monitorexit ;
        throw application1;
    }

    public static void takeOff(Application application1, OnReadyCallback onreadycallback)
    {
        takeOff(application1, null, onreadycallback);
    }

    private void tearDown()
    {
        sharedAirship.getRichPushManager().tearDown();
        sharedAirship.getPushManager().tearDown();
        sharedAirship.getLocationManager().tearDown();
    }

    private void validateManifest()
    {
        ManifestUtils.validateManifest(airshipConfigOptions);
        switch (sharedAirship.getPlatformType())
        {
        default:
            return;

        case 2: // '\002'
            if (airshipConfigOptions.isTransportAllowed("GCM"))
            {
                GCMUtils.validateManifest(airshipConfigOptions);
                return;
            } else
            {
                Logger.error("Android platform detected but GCM transport is disabled. The device will not be able to receive push notifications.");
                return;
            }

        case 1: // '\001'
            break;
        }
        if (airshipConfigOptions.isTransportAllowed("ADM"))
        {
            ADMUtils.validateManifest();
            return;
        } else
        {
            Logger.error("Amazon platform detected but ADM transport is disabled. The device will not be able to receive push notifications.");
            return;
        }
    }

    public AirshipConfigOptions getAirshipConfigOptions()
    {
        return airshipConfigOptions;
    }

    public Analytics getAnalytics()
    {
        return analytics;
    }

    public ApplicationMetrics getApplicationMetrics()
    {
        return applicationMetrics;
    }

    public UALocationManager getLocationManager()
    {
        return locationManager;
    }

    public int getPlatformType()
    {
        int j = preferenceDataStore.getInt("com.urbanairship.application.device.PLATFORM", -1);
        int i = j;
        if (j == -1)
        {
            if (ADMUtils.isADMAvailable())
            {
                Logger.info("ADM available. Setting platform to Amazon.");
                i = 1;
            } else
            if (PlayServicesUtils.isGooglePlayStoreAvailable())
            {
                Logger.info("Google Play Store available. Setting platform to Android.");
                i = 2;
            } else
            if ("amazon".equalsIgnoreCase(Build.MANUFACTURER))
            {
                Logger.info("Build.MANUFACTURER is AMAZON. Setting platform to Amazon.");
                i = 1;
            } else
            {
                Logger.info("Defaulting platform to ANDROID.");
                i = 2;
            }
            preferenceDataStore.put("com.urbanairship.application.device.PLATFORM", Integer.valueOf(i));
        }
        return i;
    }

    public PushManager getPushManager()
    {
        return pushManager;
    }

    public RichPushManager getRichPushManager()
    {
        return richPushManager;
    }

    public Whitelist getWhitelist()
    {
        return whitelist;
    }



    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
