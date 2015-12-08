// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.facebook.AppEventsLogger;
import com.localytics.android.Localytics;
import com.weather.Weather.widgets.WidgetType;
import com.weather.ads2.util.LaunchPartner;
import com.weather.ads2.util.PreloadPartner;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.ProductType;
import com.weather.commons.ups.backend.location.UpsLocationManager;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.facade.WeatherDataManager;
import com.weather.util.CountryCodeUtil;
import com.weather.util.StringUtils;
import com.weather.util.TwcPreconditions;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.Tracking;

// Referenced classes of package com.weather.Weather.app:
//            FlagshipApplication, SuppressLaunchBeacon

private class <init>
    implements android.app.leCallbacks
{

    private static final String DEEP_LINK = "DEEP_LINK";
    private static final String ICON_LAUNCH = "ICON_LAUNCH";
    public static final int NO_ACTIVITIES_APP_STOP_MILLIS = 2000;
    private static final String TAG = "FlagshipActivityLCC";
    int activeActivities;
    boolean appIsStopped;
    private final Runnable appStoppedCheck;
    private final Handler handler;
    final FlagshipApplication this$0;

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_GENERAL, "onActivityCreated activity=%s", new Object[] {
            StringUtils.objectString(activity)
        });
    }

    public void onActivityDestroyed(Activity activity)
    {
        LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_GENERAL, "onActivityDestroyed activity=%s", new Object[] {
            StringUtils.objectString(activity)
        });
        try
        {
            unregisterReceiver(FlagshipApplication.access$500(FlagshipApplication.this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_UI, "ScreenOnListener not registered yet", new Object[0]);
        }
    }

    public void onActivityPaused(Activity activity)
    {
        LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_GENERAL, "onActivityPaused activity=%s", new Object[] {
            StringUtils.objectString(activity)
        });
    }

    public void onActivityResumed(Activity activity)
    {
        LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_GENERAL, "onActivityResumed activity=%s", new Object[] {
            StringUtils.objectString(activity)
        });
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_GENERAL, "onActivitySaveInstanceState activity=%s", new Object[] {
            StringUtils.objectString(activity)
        });
    }

    public void onActivityStarted(Activity activity)
    {
        Object obj;
        AppEventsLogger.activateApp(activity);
        LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_GENERAL, "onActivityStarted activity=%s", new Object[] {
            StringUtils.objectString(activity)
        });
        CrashManager.register(getApplicationContext(), FlagshipApplication.access$300(FlagshipApplication.this), FlagshipApplication.access$400(FlagshipApplication.this));
        Tracking.startUsage(activity);
        activeActivities = activeActivities + 1;
        handler.removeCallbacksAndMessages(appStoppedCheck);
        boolean flag;
        try
        {
            unregisterReceiver(FlagshipApplication.access$500(FlagshipApplication.this));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_UI, "ScreenOnListener not registered yet", new Object[0]);
        }
        Localytics.upload();
        if (activity instanceof FragmentActivity)
        {
            Localytics.setInAppMessageDisplayActivity((FragmentActivity)activity);
        }
        if (!appIsStopped) goto _L2; else goto _L1
_L1:
        appIsStopped = false;
        flag = activity.getClass().isAnnotationPresent(com/weather/Weather/app/SuppressLaunchBeacon);
        obj = activity.getIntent();
        if (!flag)
        {
            LaunchPartner.getInstance().handleIntent(((Intent) (obj)));
        }
        DataAccessLayer.BUS.post(new AppEvent(com.weather.dal2.system.appIsStopped));
        UpsLocationManager.getInstance().setSavedLocationsAtAppStartUp(FixedLocations.getInstance().viewLocations());
        Localytics.openSession();
        Localytics.upload();
        if (!flag) goto _L4; else goto _L3
_L3:
        Log.i("FlagshipActivityLCC", "application resumed, launch beacon suppressed");
_L2:
        if (TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.tAppStartUp, false) && FlagshipApplication.access$700(FlagshipApplication.this).hasLocation())
        {
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs..this._fld0, false);
            FollowMe.getInstance().setTemperatureNotification(true);
            FlagshipApplication.access$800(FlagshipApplication.this).postOnGoingTemperatureNotifications();
        }
        return;
_L4:
        Resources resources;
        EnumMap enummap;
        ArrayMap arraymap;
        resources = activity.getResources();
        enummap = new EnumMap(com/weather/beacons/targeting/BeaconTargetingParam);
        arraymap = new ArrayMap();
        enummap.put(BeaconTargetingParam.PRELOAD_PARTNER, (new PreloadPartner()).getPreloadPartner());
        arraymap.put(LocalyticsEvent.PRELOAD_PARTNER, (new PreloadPartner()).getPreloadPartner());
        arraymap.put(LocalyticsEvent.LANGUAGE, LocaleUtil.getLocale().getLanguage());
        arraymap.put(LocalyticsEvent.REGION, LocaleUtil.getLocale().getCountry());
        if (obj == null || ((Intent) (obj)).getExtras() == null) goto _L6; else goto _L5
_L5:
        Object obj1;
        obj1 = ((Intent) (obj)).getExtras();
        enummap.put(BeaconTargetingParam.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner());
        arraymap.put(LocalyticsEvent.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner());
        if (!((Bundle) (obj1)).getBoolean("burda-launch", false)) goto _L8; else goto _L7
_L7:
        LogUtil.i("FlagshipActivityLCC", LoggingMetaTags.TWC_LOCALYTICS, "Burda launch", new Object[0]);
        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, com.weather.commons.analytics..());
        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics..());
_L19:
        if (!enummap.isEmpty())
        {
            Analytics.trackAction(resources.getString(0x7f0704ed), enummap);
        }
        if (!arraymap.isEmpty())
        {
            FlagshipApplication.access$600(FlagshipApplication.this, arraymap);
            LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.LAUNCH_SOURCE, arraymap);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if ("android.intent.action.VIEW".equals(((Intent) (obj)).getAction()))
        {
            LogUtil.i("FlagshipActivityLCC", LoggingMetaTags.TWC_LOCALYTICS, (new StringBuilder()).append("application resumed, intent=").append(obj).append(", extras=").append(obj1).append(", VIEW intent, ").append("launch beacon DEEP_LINK").toString(), new Object[0]);
            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, "DEEP_LINK");
            Uri uri = LocationUtils.getViewIntentUri(((Intent) (obj)));
            BeaconTargetingParam beacontargetingparam = BeaconTargetingParam.DEEP_LINK_URI;
            if (uri == null)
            {
                activity = "";
            } else
            {
                activity = uri.toString();
            }
            enummap.put(beacontargetingparam, activity);
            if (uri != null)
            {
                activity = uri.getQueryParameter("par");
                if ("google_onebox".equalsIgnoreCase(activity))
                {
                    arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics..());
                } else
                if ("google_nowcard".equalsIgnoreCase(activity))
                {
                    arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics..());
                } else
                {
                    arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics..());
                    arraymap.put(LocalyticsEvent.DEEP_LINK_URL, uri.toString());
                }
            }
            obj1 = ((Bundle) (obj1)).getString("com.weather.moduleId");
            activity = ((Intent) (obj)).getComponent();
            obj = new StringBuilder();
            if (activity == null)
            {
                activity = "";
            } else
            {
                activity = activity.getShortClassName();
            }
            obj = ((StringBuilder) (obj)).append(activity);
            if (obj1 == null)
            {
                activity = "";
            } else
            {
                activity = (new StringBuilder()).append(':').append(((String) (obj1))).toString();
            }
            activity = ((StringBuilder) (obj)).append(activity).toString();
            enummap.put(BeaconTargetingParam.DEEP_LINK_LANDING, activity);
            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, activity);
            continue; /* Loop/switch isn't completed */
        }
        if (!((Bundle) (obj1)).containsKey("com.weather.Weather.widgets.FROM_WIDGET")) goto _L10; else goto _L9
_L9:
        LogUtil.i("FlagshipActivityLCC", LoggingMetaTags.TWC_LOCALYTICS, (new StringBuilder()).append("application resumed, intent=").append(obj).append(", extras=").append(obj1).append(", launch beacon FROM_WIDGET").toString(), new Object[0]);
        activity = Integer.valueOf(((Bundle) (obj1)).getInt("com.weather.Weather.widgets.FROM_WIDGET", -1));
        obj = WidgetType.getWidget(activity.intValue());
        if (obj == null) goto _L12; else goto _L11
_L11:
        dgets.WidgetType[((WidgetType) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 1008
    //                   1 1042
    //                   2 1062
    //                   3 1082
    //                   4 1102;
           goto _L13 _L14 _L15 _L16 _L17
_L13:
        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.WidgetType.WidgetType());
_L12:
        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, activity.toString());
        continue; /* Loop/switch isn't completed */
_L14:
        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.WidgetType.WidgetType());
        continue; /* Loop/switch isn't completed */
_L15:
        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.WidgetType.WidgetType());
        continue; /* Loop/switch isn't completed */
_L16:
        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.WidgetType.WidgetType());
        continue; /* Loop/switch isn't completed */
_L17:
        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.WidgetType.WidgetType());
        if (true) goto _L13; else goto _L10
_L10:
        if (!((Bundle) (obj1)).containsKey("com.weather.commons.service.ON_GOING_TEMPERATURE_NOTIFICATION"))
        {
            break; /* Loop/switch isn't completed */
        }
        LogUtil.i("FlagshipActivityLCC", LoggingMetaTags.TWC_LOCALYTICS, (new StringBuilder()).append("application resumed, intent=").append(obj).append(", extras=").append(obj1).append(", launch beacon ").append("BEACON_ON_GOING_TEMPERATURE").toString(), new Object[0]);
        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704aa));
        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.WidgetType.WidgetType());
        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.WidgetType.WidgetType());
        if (true) goto _L19; else goto _L18
_L18:
        if (((Bundle) (obj1)).containsKey(AlertResponseField.PRODUCT.getName()))
        {
            activity = ((Bundle) (obj1)).getString(AlertResponseField.PRODUCT.getName());
            if (activity != null)
            {
                activity = ProductType.getProduct(activity);
                if (activity != null)
                {
                    switch (sh.ProductType[activity.ordinal()])
                    {
                    case 1: // '\001'
                        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a4));
                        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.ductType.ductType());
                        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.ductType.ductType());
                        break;

                    case 2: // '\002'
                        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a6));
                        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.ductType.ductType());
                        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.ductType.ductType());
                        break;

                    case 3: // '\003'
                        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a7));
                        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.ductType.ductType());
                        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.ductType.ductType());
                        break;

                    case 4: // '\004'
                        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a9));
                        if (CountryCodeUtil.isUs(((Bundle) (obj1)).getString(AlertResponseField.COUNTRY_CODE.getName(), "US")))
                        {
                            activity = com.weather.commons.analytics.ductType.ductType();
                        } else
                        {
                            activity = com.weather.commons.analytics.RT.RT();
                        }
                        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, activity);
                        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.RT.RT());
                        break;

                    case 5: // '\005'
                        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a8));
                        activity = FollowMe.getInstance().getLocation();
                        if (activity != null)
                        {
                            if (activity.getCountryCode().equals("US"))
                            {
                                activity = com.weather.commons.analytics.RT.RT();
                            } else
                            {
                                activity = com.weather.commons.analytics.RAIN_ALERT.RAIN_ALERT();
                            }
                            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, activity);
                        }
                        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.RAIN_ALERT.RAIN_ALERT());
                        break;

                    case 6: // '\006'
                        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a5));
                        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.RAIN_ALERT.RAIN_ALERT());
                        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.RAIN_ALERT.RAIN_ALERT());
                        break;
                    }
                    continue; /* Loop/switch isn't completed */
                }
            }
        } else
        {
            if ("android.intent.action.PICK".equals(((Intent) (obj)).getAction()))
            {
                LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_DEEPLINK, (new StringBuilder()).append("application resumed, intent=").append(obj).append(", extras=").append(obj1).append(", launch beacon From FACEBOOK MESSENGER reply").toString(), new Object[0]);
                enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704bf));
            } else
            {
                enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, "ICON_LAUNCH");
                enummap.put(BeaconTargetingParam.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner());
                arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.RAIN_ALERT.RAIN_ALERT());
                arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.RAIN_ALERT.RAIN_ALERT());
                arraymap.put(LocalyticsEvent.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner());
            }
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L19; else goto _L6
_L6:
        enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, "ICON_LAUNCH");
        enummap.put(BeaconTargetingParam.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner());
        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.RAIN_ALERT.RAIN_ALERT());
        arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.RAIN_ALERT.RAIN_ALERT());
        arraymap.put(LocalyticsEvent.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner());
        if (true) goto _L19; else goto _L20
_L20:
        if (true) goto _L2; else goto _L21
_L21:
    }

    public void onActivityStopped(Activity activity)
    {
        LogUtil.d("FlagshipActivityLCC", LoggingMetaTags.TWC_GENERAL, "onActivityStopped activity=%s", new Object[] {
            StringUtils.objectString(activity)
        });
        AppEventsLogger.deactivateApp(activity);
        Tracking.stopUsage(activity);
        activeActivities = Math.max(0, activeActivities - 1);
        if (activeActivities == 0)
        {
            handler.postDelayed(appStoppedCheck, 2000L);
        }
        IntentFilter intentfilter = new IntentFilter("android.intent.action.SCREEN_ON");
        registerReceiver(FlagshipApplication.access$500(FlagshipApplication.this), intentfilter);
        if (activity instanceof FragmentActivity)
        {
            Localytics.dismissCurrentInAppMessage();
            Localytics.clearInAppMessageDisplayActivity();
        }
        Localytics.upload();
    }

    private _cls1()
    {
        this$0 = FlagshipApplication.this;
        super();
        handler = new Handler();
        appIsStopped = true;
    /* block-local class not found */
    class _cls1 {}

        appStoppedCheck = new _cls1();
        TwcPreconditions.checkOnMainThread();
    }

    _cls1(_cls1 _pcls1)
    {
        this();
    }
}
