// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.amazon.device.messaging.ADM;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.UpsConstants;
import com.weather.commons.ups.facade.Profile;
import com.weather.dal2.locations.FixedLocationsSnapshot;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.ui.UIUtil;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.push:
//            AlertServiceManager

public class PushService extends IntentService
{
    public static final class ServiceType extends Enum
    {

        private static final ServiceType $VALUES[];
        public static final ServiceType BREAKINGNEWS;
        public static final ServiceType DENSE_FOG;
        public static final ServiceType EXTREME_COLD;
        public static final ServiceType EXTREME_HEAT;
        public static final ServiceType FOLLOWME_LIGHTNING;
        public static final ServiceType FOLLOWME_SEVERE;
        public static final ServiceType HEAVY_RAIN;
        public static final ServiceType HEAVY_SNOWFALL;
        public static final ServiceType HIGH_WIND;
        public static final ServiceType ICE;
        public static final ServiceType POLLEN;
        public static final ServiceType RAINSNOW;
        public static final ServiceType REAL_TIME_RAIN;
        public static final ServiceType SEVERE;
        public static final ServiceType SIGNIFICANT_WEATHER_FORECAST;
        public static final ServiceType THUNDERSTORM;
        public final int offBeacon;
        public final int onBeacon;

        public static ServiceType valueOf(String s)
        {
            return (ServiceType)Enum.valueOf(com/weather/commons/push/PushService$ServiceType, s);
        }

        public static ServiceType[] values()
        {
            return (ServiceType[])$VALUES.clone();
        }

        static 
        {
            SEVERE = new ServiceType("SEVERE", 0, -1, -1);
            POLLEN = new ServiceType("POLLEN", 1, -1, -1);
            RAINSNOW = new ServiceType("RAINSNOW", 2, com.weather.commons.R.string.beacon_notification_rain_snow_on, com.weather.commons.R.string.beacon_notification_rain_snow_off);
            BREAKINGNEWS = new ServiceType("BREAKINGNEWS", 3, com.weather.commons.R.string.beacon_notification_breaking_news_on, com.weather.commons.R.string.beacon_notification_breaking_news_off);
            REAL_TIME_RAIN = new ServiceType("REAL_TIME_RAIN", 4, -1, -1);
            FOLLOWME_SEVERE = new ServiceType("FOLLOWME_SEVERE", 5, -1, -1);
            FOLLOWME_LIGHTNING = new ServiceType("FOLLOWME_LIGHTNING", 6, -1, -1);
            SIGNIFICANT_WEATHER_FORECAST = new ServiceType("SIGNIFICANT_WEATHER_FORECAST", 7, -1, -1);
            HEAVY_RAIN = new ServiceType("HEAVY_RAIN", 8, -1, -1);
            THUNDERSTORM = new ServiceType("THUNDERSTORM", 9, -1, -1);
            EXTREME_HEAT = new ServiceType("EXTREME_HEAT", 10, -1, -1);
            HIGH_WIND = new ServiceType("HIGH_WIND", 11, -1, -1);
            DENSE_FOG = new ServiceType("DENSE_FOG", 12, -1, -1);
            EXTREME_COLD = new ServiceType("EXTREME_COLD", 13, -1, -1);
            HEAVY_SNOWFALL = new ServiceType("HEAVY_SNOWFALL", 14, -1, -1);
            ICE = new ServiceType("ICE", 15, -1, -1);
            $VALUES = (new ServiceType[] {
                SEVERE, POLLEN, RAINSNOW, BREAKINGNEWS, REAL_TIME_RAIN, FOLLOWME_SEVERE, FOLLOWME_LIGHTNING, SIGNIFICANT_WEATHER_FORECAST, HEAVY_RAIN, THUNDERSTORM, 
                EXTREME_HEAT, HIGH_WIND, DENSE_FOG, EXTREME_COLD, HEAVY_SNOWFALL, ICE
            });
        }

        private ServiceType(String s, int i, int j, int k)
        {
            super(s, i);
            onBeacon = j;
            offBeacon = k;
        }
    }

    public static final class ServicesSet extends Enum
    {

        private static final ServicesSet $VALUES[];
        public static final ServicesSet ALL_SERVICES;
        public static final ServicesSet BASIC_SERVICES;

        public static ServicesSet valueOf(String s)
        {
            return (ServicesSet)Enum.valueOf(com/weather/commons/push/PushService$ServicesSet, s);
        }

        public static ServicesSet[] values()
        {
            return (ServicesSet[])$VALUES.clone();
        }

        static 
        {
            ALL_SERVICES = new ServicesSet("ALL_SERVICES", 0);
            BASIC_SERVICES = new ServicesSet("BASIC_SERVICES", 1);
            $VALUES = (new ServicesSet[] {
                ALL_SERVICES, BASIC_SERVICES
            });
        }

        private ServicesSet(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String PROPERTY_APP_VERSION = "weatherAppVersion";
    private static final String PROPERTY_CHANNEL_NAME = "channel_name";
    private static final String PROPERTY_REG_ID = "registrationId";
    private static final String PUSH_PREF_FILE = "PushSettings";
    public static final String SENDER_ID = "385394700893";
    private static final String SERVICES_SET_EXTRA = "com.weather.services_set";
    private static final String TAG = "PushService";
    private String regId;
    private Profile userProfile;

    public PushService()
    {
        super("PushService");
        regId = getRegistrationIdFromSharedPrefs(AbstractTwcApplication.getRootContext());
    }

    public static boolean checkADM(Context context)
    {
        context = new ADM(context);
        if (context.isSupported())
        {
            if (context.getRegistrationId() == null)
            {
                context.startRegister();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean checkPlayServices(Context context)
    {
        int i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            if (!GoogleApiAvailability.getInstance().isUserResolvableError(i))
            {
                Log.i("PushService", "Google play services not supported on this device.");
            } else
            {
                Log.i("PushService", "Play service not available but recoverable");
            }
            return false;
        } else
        {
            return true;
        }
    }

    private static int getAppVersion(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not get package name: ").append(context).toString());
        }
        return i;
    }

    public static String getChannelNameFromSharedPrefs(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("PushSettings", 0);
        String s1 = sharedpreferences.getString("channel_name", null);
        String s = s1;
        if (s1 != null)
        {
            s = s1;
            if (sharedpreferences.getInt("weatherAppVersion", 0x80000000) != getAppVersion(context))
            {
                s = null;
            }
        }
        return s;
    }

    public static String getRegistrationIdFromSharedPrefs(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("PushSettings", 0);
        String s1 = sharedpreferences.getString("registrationId", null);
        String s = s1;
        if (s1 != null)
        {
            s = s1;
            if (sharedpreferences.getInt("weatherAppVersion", 0x80000000) != getAppVersion(context))
            {
                s = null;
            }
        }
        return s;
    }

    private String registerGcmClient()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        s = GoogleCloudMessaging.getInstance(AbstractTwcApplication.getRootContext()).register(new String[] {
            "385394700893"
        });
        storeRegistrationIdInSharedPrefs(AbstractTwcApplication.getRootContext(), s, UpsConstants.GCM_CHANNEL_NAME);
        Log.i("PushService", (new StringBuilder()).append("registerId=").append(s).toString());
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    private static void startNewIntentService(String s, ServicesSet servicesset)
    {
        Intent intent = new Intent(AbstractTwcApplication.getRootContext(), com/weather/commons/push/PushService);
        intent.putExtra("channel_name", s);
        intent.putExtra("com.weather.services_set", servicesset);
        AbstractTwcApplication.getRootContext().startService(intent);
    }

    public static boolean startPushService(ServicesSet servicesset)
    {
        boolean flag1 = false;
        boolean flag;
        if (checkPlayServices(AbstractTwcApplication.getRootContext()))
        {
            startNewIntentService(UpsConstants.GCM_CHANNEL_NAME, servicesset);
            flag = true;
        } else
        {
            flag = flag1;
            if (UIUtil.isAmazonMessaging())
            {
                ADM adm = new ADM(AbstractTwcApplication.getRootContext());
                flag = flag1;
                if (adm.isSupported())
                {
                    String s = adm.getRegistrationId();
                    if (s == null)
                    {
                        adm.startRegister();
                        return false;
                    } else
                    {
                        storeRegistrationIdInSharedPrefs(AbstractTwcApplication.getRootContext(), s, UpsConstants.ADM_CHANNEL_NAME);
                        startNewIntentService(UpsConstants.ADM_CHANNEL_NAME, servicesset);
                        return true;
                    }
                }
            }
        }
        return flag;
    }

    private static void storeRegistrationIdInSharedPrefs(Context context, String s, String s1)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("PushSettings", 0);
        int i = getAppVersion(context);
        context = sharedpreferences.edit();
        context.putString("registrationId", s);
        context.putString("channel_name", s1);
        context.putInt("weatherAppVersion", i);
        context.commit();
    }

    private void updateBreakingNewsAlertService()
        throws JSONException, AbnormalHttpResponseException, com.weather.util.net.HttpRequest.HttpRequestException
    {
        boolean flag = TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS, false);
        String s = userProfile.getServiceId(null, ServiceType.BREAKINGNEWS);
        if (Boolean.valueOf(flag).booleanValue())
        {
            if (s == null)
            {
                AlertServiceManager.getInstance().createAlertService(userProfile, null, ServiceType.BREAKINGNEWS, null, true);
                Analytics.trackAction(getString(ServiceType.BREAKINGNEWS.onBeacon), null);
            }
        } else
        if (s != null)
        {
            AlertServiceManager.getInstance().deleteAlertService(s);
            Analytics.trackAction(getString(ServiceType.BREAKINGNEWS.offBeacon), null);
            return;
        }
    }

    private void updateFollowMeSevereAlertService()
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException, JSONException
    {
        SavedLocation savedlocation = (new FollowMeSnapshot()).getLocation();
        String s;
        boolean flag;
        boolean flag1;
        if (savedlocation != null && savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.severe))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS, false);
        s = userProfile.getServiceId(null, ServiceType.FOLLOWME_SEVERE);
        if (flag && flag1)
        {
            if (s == null)
            {
                AlertServiceManager.getInstance().createAlertService(userProfile, null, ServiceType.FOLLOWME_SEVERE, null, flag1);
                AlertServiceManager.getInstance().updateFollowMeLocation(savedlocation);
            }
        } else
        if (s != null)
        {
            AlertServiceManager.getInstance().deleteAlertService(s);
            return;
        }
    }

    private void updateLightningStrikeAlertService()
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException, JSONException
    {
        SavedLocation savedlocation = (new FollowMeSnapshot()).getLocation();
        boolean flag = TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERTS, false);
        String s = userProfile.getServiceId(null, ServiceType.FOLLOWME_LIGHTNING);
        if (flag)
        {
            if (s == null)
            {
                AlertServiceManager.getInstance().createAlertService(userProfile, null, ServiceType.FOLLOWME_LIGHTNING, null, true);
                AlertServiceManager.getInstance().updateFollowMeLocation(savedlocation);
            }
        } else
        if (s != null)
        {
            AlertServiceManager.getInstance().deleteAlertService(s);
            return;
        }
    }

    private void updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType alerttype, ServiceType servicetype, boolean flag)
        throws JSONException, AbnormalHttpResponseException, com.weather.util.net.HttpRequest.HttpRequestException
    {
        boolean flag2 = false;
        boolean flag3 = false;
        Iterator iterator = (new FixedLocationsSnapshot()).viewLocations().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            String s = userProfile.getServiceId(savedlocation, servicetype);
            boolean flag1;
            if (s != null && userProfile.isServiceEnabled(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (savedlocation.hasAlert(alerttype))
            {
                flag2 = flag;
                AlertServiceManager.getInstance().updateAlertService(userProfile, savedlocation, servicetype, flag);
                flag3 = flag1;
            } else
            {
                flag3 = flag1;
                if (s != null)
                {
                    AlertServiceManager.getInstance().deleteAlertService(s);
                    flag3 = flag1;
                }
            }
        } while (true);
        if (flag2 != flag3)
        {
            if (flag2)
            {
                if (servicetype.onBeacon != -1)
                {
                    Analytics.trackAction(getString(servicetype.onBeacon), null);
                }
            } else
            if (servicetype.offBeacon != -1)
            {
                Analytics.trackAction(getString(servicetype.offBeacon), null);
                return;
            }
        }
    }

    private void updateRealTimeRainAlertService()
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException, JSONException
    {
        SavedLocation savedlocation = (new FollowMeSnapshot()).getLocation();
        boolean flag = TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, false);
        String s = userProfile.getServiceId(null, ServiceType.REAL_TIME_RAIN);
        if (flag)
        {
            if (s == null)
            {
                AlertServiceManager.getInstance().createAlertService(userProfile, null, ServiceType.REAL_TIME_RAIN, null, true);
                AlertServiceManager.getInstance().updateFollowMeLocation(savedlocation);
            }
        } else
        if (s != null)
        {
            AlertServiceManager.getInstance().deleteAlertService(s);
            return;
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = intent.getExtras();
        intent = AccountManager.getInstance();
        if (obj == null) goto _L1; else goto _L3
_L3:
        ServicesSet servicesset;
        String s;
        servicesset = (ServicesSet)((Bundle) (obj)).get("com.weather.services_set");
        s = ((Bundle) (obj)).getString("channel_name");
        if (servicesset == null || s == null) goto _L1; else goto _L4
_L4:
        obj = new Intent(getString(com.weather.commons.R.string.sync_task_result));
        if (!checkPlayServices(AbstractTwcApplication.getRootContext())) goto _L6; else goto _L5
_L5:
        regId = registerGcmClient();
_L8:
        if (regId != null)
        {
            userProfile = intent.getUserProfile();
            if (!userProfile.deviceIdRegistered(regId))
            {
                intent.setupEndPoint(regId, s, true);
            }
            if (!userProfile.dsxLanguageDidSetup())
            {
                intent.setupLanguage(AbstractTwcApplication.getRootContext());
            }
            updateFollowMeSevereAlertService();
            updateRealTimeRainAlertService();
            updateLightningStrikeAlertService();
            updateBreakingNewsAlertService();
            if (servicesset == ServicesSet.ALL_SERVICES)
            {
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.severe, ServiceType.SEVERE, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.rainSnow, ServiceType.RAINSNOW, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.pollen, ServiceType.POLLEN, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.heavy_rain, ServiceType.HEAVY_RAIN, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.thunderstorm, ServiceType.THUNDERSTORM, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.extreme_heat, ServiceType.EXTREME_HEAT, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.high_wind, ServiceType.HIGH_WIND, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.dense_fog, ServiceType.DENSE_FOG, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.extreme_cold, ServiceType.EXTREME_COLD, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.heavy_snowfall, ServiceType.HEAVY_SNOWFALL, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false));
                updateLocationAlertService(com.weather.dal2.locations.SavedLocation.AlertType.ice, ServiceType.ICE, TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false));
            }
            AlertServiceManager.getInstance().setNeedsSync(false);
            ((Intent) (obj)).putExtra("sync_result", 1);
            sendBroadcast(((Intent) (obj)));
            return;
        }
          goto _L1
        intent;
        ((Intent) (obj)).putExtra("sync_result", 0);
        sendBroadcast(((Intent) (obj)));
        Log.e("PushService", intent.getMessage(), intent);
        return;
_L6:
        if (!UIUtil.isAmazonMessaging()) goto _L8; else goto _L7
_L7:
        ADM adm = new ADM(this);
        if (adm.isSupported() && adm.getRegistrationId() != null)
        {
            regId = adm.getRegistrationId();
        }
          goto _L8
    }
}
