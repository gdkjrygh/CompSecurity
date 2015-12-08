// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.urbanairship.actions.ActionActivity;
import com.urbanairship.actions.ActionRegistry;
import com.urbanairship.actions.ActionService;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.EventService;
import com.urbanairship.location.LocationService;
import com.urbanairship.location.UALocationManager;
import com.urbanairship.push.GCMPushReceiver;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushService;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushUpdateService;
import com.urbanairship.util.ManifestUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.urbanairship:
//            CoreReceiver, Logger, AirshipConfigOptions, UrbanAirshipProvider, 
//            LocationOptions, ApplicationMetrics

public class UAirship
{

    private static final UAirship sharedAirship = new UAirship();
    AirshipConfigOptions airshipConfigOptions;
    Analytics analytics;
    Context applicationContext;
    ApplicationMetrics applicationMetrics;
    boolean flying;

    private UAirship()
    {
        flying = false;
    }

    private void checkManifest()
    {
        ManifestUtils.checkRequiredPermission("android.permission.INTERNET");
        ManifestUtils.checkRequiredPermission("android.permission.ACCESS_NETWORK_STATE");
        Map map = getUrbanAirshipComponentInfoMap();
        if (map.get(com/urbanairship/CoreReceiver) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required receiver: ").append(com/urbanairship/CoreReceiver.getCanonicalName()).toString());
        }
        if (airshipConfigOptions.analyticsEnabled && map.get(com/urbanairship/analytics/EventService) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/analytics/EventService.getCanonicalName()).toString());
        }
        if (airshipConfigOptions.pushServiceEnabled)
        {
            if (map.get(com/urbanairship/push/PushService) == null)
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/push/PushService.getCanonicalName()).toString());
            }
            PushManager.validateManifest();
        }
        if (airshipConfigOptions.richPushEnabled && map.get(com/urbanairship/richpush/RichPushUpdateService) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/richpush/RichPushUpdateService.getCanonicalName()).toString());
        }
        if (map.get(com/urbanairship/actions/ActionService) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/actions/ActionService.getCanonicalName()).toString());
        }
        if (map.get(com/urbanairship/actions/ActionActivity) == null)
        {
            Logger.warn("AndroidManifest.xml missing ActionActivity.  Action.startActivityForResult will not work.");
        }
        Object obj = (new Intent("com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION", Uri.parse("http://"))).setPackage(getPackageName()).addFlags(0x10000000).addCategory("android.intent.category.DEFAULT");
        if (getPackageManager().resolveActivity(((Intent) (obj)), 0) == null)
        {
            Logger.warn("AndroidManifest.xml missing activity with an intent filter for action com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION, category android.intent.category.DEFAULT, and data with scheme http.  Landing page action may not function properly.");
        }
        obj = (new Intent("com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION", Uri.parse("https://"))).setPackage(getPackageName()).addFlags(0x10000000).addCategory("android.intent.category.DEFAULT");
        if (getPackageManager().resolveActivity(((Intent) (obj)), 0) == null)
        {
            Logger.error("AndroidManifest.xml missing activity with an intent filter for action com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION, category android.intent.category.DEFAULT, and data with scheme https Landing page action may not function properly.");
        }
        Iterator iterator;
        if (getAppInfo() == null)
        {
            obj = getPackageName();
        } else
        {
            obj = getAppInfo().processName;
        }
        iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Class class1 = (Class)iterator.next();
            ComponentInfo componentinfo = (ComponentInfo)map.get(class1);
            if (componentinfo != null && !((String) (obj)).equals(componentinfo.processName))
            {
                Logger.warn((new StringBuilder()).append("A separate process is detected for: ").append(class1.getCanonicalName()).append(". In the ").append("AndroidManifest.xml, remove the android:process attribute.").toString());
            }
        } while (true);
        if (map.get(com/urbanairship/UrbanAirshipProvider) == null)
        {
            throw new IllegalStateException("Unable to resolve UrbanAirshipProvider. Please check that the provider is defined in your AndroidManifest.xml, and that the authority string is set to  \"YOUR_PACKAGENAME.urbanairship.provider\"");
        } else
        {
            return;
        }
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
        return sharedAirship.applicationContext.getApplicationInfo();
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
        return sharedAirship.applicationContext.getPackageManager();
    }

    public static String getPackageName()
    {
        return sharedAirship.applicationContext.getPackageName();
    }

    private Map getUrbanAirshipComponentInfoMap()
    {
        return new HashMap() {

            final UAirship this$0;

            
            {
                this$0 = UAirship.this;
                super();
                put(com/urbanairship/analytics/EventService, ManifestUtils.getServiceInfo(com/urbanairship/analytics/EventService));
                put(com/urbanairship/push/PushService, ManifestUtils.getServiceInfo(com/urbanairship/push/PushService));
                put(com/urbanairship/richpush/RichPushUpdateService, ManifestUtils.getServiceInfo(com/urbanairship/richpush/RichPushUpdateService));
                put(com/urbanairship/location/LocationService, ManifestUtils.getServiceInfo(com/urbanairship/location/LocationService));
                put(com/urbanairship/actions/ActionService, ManifestUtils.getServiceInfo(com/urbanairship/actions/ActionService));
                put(com/urbanairship/CoreReceiver, ManifestUtils.getReceiverInfo(com/urbanairship/CoreReceiver));
                put(com/urbanairship/push/GCMPushReceiver, ManifestUtils.getReceiverInfo(com/urbanairship/push/GCMPushReceiver));
                put(com/urbanairship/UrbanAirshipProvider, ManifestUtils.getProviderInfo(UrbanAirshipProvider.getAuthorityString()));
                put(com/urbanairship/actions/ActionActivity, ManifestUtils.getActivityInfo(com/urbanairship/actions/ActionActivity));
            }
        };
    }

    public static String getVersion()
    {
        return "4.0.4";
    }

    public static void land()
    {
        sharedAirship.flying = false;
    }

    public static UAirship shared()
    {
        return sharedAirship;
    }

    public static void takeOff(Application application)
    {
        takeOff(application, null);
    }

    public static void takeOff(Application application, AirshipConfigOptions airshipconfigoptions)
    {
        com/urbanairship/UAirship;
        JVM INSTR monitorenter ;
        if (application != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        throw new IllegalArgumentException("Application argument must not be null");
        application;
        com/urbanairship/UAirship;
        JVM INSTR monitorexit ;
        throw application;
        if (!sharedAirship.flying) goto _L2; else goto _L1
_L1:
        Logger.error("You can only call UAirship.takeOff once.");
_L3:
        com/urbanairship/UAirship;
        JVM INSTR monitorexit ;
        return;
_L2:
        Context context;
        UAirship uairship = sharedAirship;
        context = application.getApplicationContext();
        uairship.applicationContext = context;
        UrbanAirshipProvider.init();
        AirshipConfigOptions airshipconfigoptions1;
        airshipconfigoptions1 = airshipconfigoptions;
        if (airshipconfigoptions != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        airshipconfigoptions1 = AirshipConfigOptions.loadDefaultOptions(context);
        sharedAirship.airshipConfigOptions = airshipconfigoptions1;
        Logger.logLevel = airshipconfigoptions1.getLoggerLevel();
        Logger.TAG = (new StringBuilder()).append(getAppName()).append(" - UALib").toString();
        airshipconfigoptions = (new StringBuilder()).append("Airship Take Off! Lib Version: ");
        UAirship uairship1 = sharedAirship;
        Logger.debug(airshipconfigoptions.append(getVersion()).append(" / App key = ").append(airshipconfigoptions1.getAppKey()).toString());
        Logger.debug((new StringBuilder()).append("In Production? ").append(airshipconfigoptions1.inProduction).toString());
        if (!airshipconfigoptions1.isValid())
        {
            Logger.error("AirshipConfigOptions are not valid. Unable to take off! Check your airshipconfig.properties file for the errors listed above.");
            throw new IllegalArgumentException("Application configuration is invalid.");
        }
        if (!airshipconfigoptions1.inProduction)
        {
            sharedAirship.checkManifest();
        }
        sharedAirship.flying = true;
        if (airshipconfigoptions1.pushServiceEnabled)
        {
            Logger.debug("Initializing Push.");
            PushManager.init();
            if (Logger.logLevel < 7)
            {
                Log.d((new StringBuilder()).append(getAppName()).append(" APID").toString(), (new StringBuilder()).append("").append(PushManager.shared().getAPID()).toString());
            }
        }
        if (airshipconfigoptions1.richPushEnabled)
        {
            Logger.debug("Initializing Rich Push.");
            RichPushManager.init();
        }
        if (airshipconfigoptions1.locationOptions.locationServiceEnabled)
        {
            Logger.debug("Initializing Location.");
            UALocationManager.init();
        }
        Logger.debug("Registering default Actions.");
        ActionRegistry.shared().registerDefaultActions();
        Logger.debug("Initializing Analytics.");
        sharedAirship.applicationMetrics = new ApplicationMetrics(application);
        sharedAirship.analytics = new Analytics(application);
          goto _L3
    }

    public AirshipConfigOptions getAirshipConfigOptions()
    {
        return airshipConfigOptions;
    }

    public Analytics getAnalytics()
    {
        return analytics;
    }

    public Context getApplicationContext()
    {
        return applicationContext;
    }

    public ApplicationMetrics getApplicationMetrics()
    {
        return applicationMetrics;
    }

    public boolean isFlying()
    {
        return flying;
    }

}
