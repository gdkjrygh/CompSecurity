// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.StrictMode;
import android.support.multidex.MultiDex;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.adobe.mobile.Config;
import com.comscore.analytics.comScore;
import com.comscore.utils.TransmissionMode;
import com.facebook.AppEventsLogger;
import com.kahuna.sdk.IKahuna;
import com.kahuna.sdk.Kahuna;
import com.localytics.android.Localytics;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.picasso.Picasso;
import com.weather.Weather.metric.MetricUtil;
import com.weather.Weather.push.KahunaOnPushClickReceiver;
import com.weather.Weather.widgets.WidgetType;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.targeting.TargetingManager;
import com.weather.ads2.util.LaunchPartner;
import com.weather.ads2.util.PreloadPartner;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.analytics.Attribute;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.TwcLocalyticsActivityLifecycleCallbacks;
import com.weather.commons.analytics.TwcLocalyticsListener;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.session.SessionTracker;
import com.weather.commons.config.ConfigPrefs;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.locations.SQSLocationUpdateUtil;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.push.ProductType;
import com.weather.commons.tropical.StormDataManager;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.location.UpsLocationManager;
import com.weather.commons.video2.VideoManager;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.PerformanceEventList;
import com.weather.dal2.PerformanceEvents;
import com.weather.dal2.cache.CleanupService;
import com.weather.dal2.config.DalConfigManager;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.MigrationManager;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.sensors.PressureSensor;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.dal2.weatherconnections.ScreenOnListener;
import com.weather.facade.WeatherDataManager;
import com.weather.util.CountryCodeUtil;
import com.weather.util.DataUnits;
import com.weather.util.StringUtils;
import com.weather.util.TwcPreconditions;
import com.weather.util.UnitType;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.app.TWCUncaughtExceptionHandler;
import com.weather.util.device.DeviceUtils;
import com.weather.util.device.LocaleUtil;
import com.weather.util.device.RmidUtils;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.metric.MetricBuildInfo;
import com.weather.util.metric.MetricDeviceInfo;
import com.weather.util.metric.MetricRegistry;
import com.weather.util.metric.MetricReporter;
import com.weather.util.metric.MetricReporterFactory;
import com.weather.util.metric.TimerMetric;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;
import com.weather.util.sound.SoundUtil;
import com.wsi.android.weather.ui.MapApplication;
import dagger.ObjectGraph;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.Tracking;
import org.json.JSONException;

// Referenced classes of package com.weather.Weather.app:
//            HockeyCrashListener, AppInjection, SuppressLaunchBeacon

public final class FlagshipApplication extends MapApplication
{
    private class FlagshipActivityLifeCycleCallbacks
        implements android.app.Application.ActivityLifecycleCallbacks
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
                unregisterReceiver(screenOnListener);
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
            CrashManager.register(getApplicationContext(), hockeyAppId, hockeyCrashListener);
            Tracking.startUsage(activity);
            activeActivities = activeActivities + 1;
            handler.removeCallbacksAndMessages(appStoppedCheck);
            boolean flag;
            try
            {
                unregisterReceiver(screenOnListener);
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
            DataAccessLayer.BUS.post(new AppEvent(com.weather.dal2.system.AppEvent.Cause.APP_START));
            UpsLocationManager.getInstance().setSavedLocationsAtAppStartUp(FixedLocations.getInstance().viewLocations());
            Localytics.openSession();
            Localytics.upload();
            if (!flag) goto _L4; else goto _L3
_L3:
            Log.i("FlagshipActivityLCC", "application resumed, launch beacon suppressed");
_L2:
            if (TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.ON_GOING_NOTIFICATION_FIRST_LAUNCH, false) && locationManager.hasLocation())
            {
                TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.ON_GOING_NOTIFICATION_FIRST_LAUNCH, false);
                FollowMe.getInstance().setTemperatureNotification(true);
                weatherDataManager.postOnGoingTemperatureNotifications();
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
            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.BURDA.getTagName());
            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.BURDA.getTagName());
_L19:
            if (!enummap.isEmpty())
            {
                Analytics.trackAction(resources.getString(0x7f0704ed), enummap);
            }
            if (!arraymap.isEmpty())
            {
                setFollowMeLocationAttributes(arraymap);
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
                        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.ONE_BOX.getTagName());
                    } else
                    if ("google_nowcard".equalsIgnoreCase(activity))
                    {
                        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.NOW_CARD.getTagName());
                    } else
                    {
                        arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.DEEP_LINK.getTagName());
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
            static class _cls5
            {

                static final int $SwitchMap$com$weather$Weather$widgets$WidgetType[];
                static final int $SwitchMap$com$weather$commons$push$ProductType[];
                static final int $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType[];

                static 
                {
                    $SwitchMap$com$weather$commons$push$ProductType = new int[ProductType.values().length];
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_BREAKINGNEWS.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_POLLEN.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_RAINSNOW.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_SEVERE.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_REAL_TIME_RAIN.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_LIGHTNING_STRIKES.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    $SwitchMap$com$weather$Weather$widgets$WidgetType = new int[WidgetType.values().length];
                    try
                    {
                        $SwitchMap$com$weather$Weather$widgets$WidgetType[WidgetType.OneByOne.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$weather$Weather$widgets$WidgetType[WidgetType.TwoByTwo.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$weather$Weather$widgets$WidgetType[WidgetType.FourByOne.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$weather$Weather$widgets$WidgetType[WidgetType.FourByTwo.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType = new int[com.weather.dal2.locations.SavedLocation.AlertType.values().length];
                    try
                    {
                        $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType[com.weather.dal2.locations.SavedLocation.AlertType.lightning.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType[com.weather.dal2.locations.SavedLocation.AlertType.realTimeRain.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType[com.weather.dal2.locations.SavedLocation.AlertType.severe.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls5..SwitchMap.com.weather.Weather.widgets.WidgetType[((WidgetType) (obj)).ordinal()];
            JVM INSTR tableswitch 1 4: default 1008
        //                       1 1042
        //                       2 1062
        //                       3 1082
        //                       4 1102;
               goto _L13 _L14 _L15 _L16 _L17
_L13:
            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.FRONT_PAGE.getName());
_L12:
            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, activity.toString());
            continue; /* Loop/switch isn't completed */
_L14:
            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.WIDGET_1x1.getTagName());
            continue; /* Loop/switch isn't completed */
_L15:
            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.WIDGET_2x2.getTagName());
            continue; /* Loop/switch isn't completed */
_L16:
            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.WIDGET_4x1.getTagName());
            continue; /* Loop/switch isn't completed */
_L17:
            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.WIDGET_4x2.getTagName());
            if (true) goto _L13; else goto _L10
_L10:
            if (!((Bundle) (obj1)).containsKey("com.weather.commons.service.ON_GOING_TEMPERATURE_NOTIFICATION"))
            {
                break; /* Loop/switch isn't completed */
            }
            LogUtil.i("FlagshipActivityLCC", LoggingMetaTags.TWC_LOCALYTICS, (new StringBuilder()).append("application resumed, intent=").append(obj).append(", extras=").append(obj1).append(", launch beacon ").append("BEACON_ON_GOING_TEMPERATURE").toString(), new Object[0]);
            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704aa));
            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.ONGOING_TEMP_ALERT.getTagName());
            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.FRONT_PAGE.getName());
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
                        switch (_cls5..SwitchMap.com.weather.commons.push.ProductType[activity.ordinal()])
                        {
                        case 1: // '\001'
                            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a4));
                            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.BREAKING_ALERT.getTagName());
                            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.NEWS_DETAILS.getName());
                            break;

                        case 2: // '\002'
                            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a6));
                            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.POLLEN_ALERT.getTagName());
                            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.HEALTH_MODULE.getName());
                            break;

                        case 3: // '\003'
                            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a7));
                            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.RAINSNOW_ALERT.getTagName());
                            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.HOURLY_DETAILS.getName());
                            break;

                        case 4: // '\004'
                            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a9));
                            if (CountryCodeUtil.isUs(((Bundle) (obj1)).getString(AlertResponseField.COUNTRY_CODE.getName(), "US")))
                            {
                                activity = com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.SEVERE_ALERT.getTagName();
                            } else
                            {
                                activity = com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.SEVERE_INTERNATIONAL_ALERT.getTagName();
                            }
                            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, activity);
                            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.SEVERE_WEATHER_DETAILS.getName());
                            break;

                        case 5: // '\005'
                            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a8));
                            activity = FollowMe.getInstance().getLocation();
                            if (activity != null)
                            {
                                if (activity.getCountryCode().equals("US"))
                                {
                                    activity = com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.REAL_TIME_RAIN_ALERT.getTagName();
                                } else
                                {
                                    activity = com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.INTERNATIONAL_REAL_TIME_RAIN_ALERT.getTagName();
                                }
                                arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, activity);
                            }
                            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.MAP_DETAILS.getName());
                            break;

                        case 6: // '\006'
                            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, getString(0x7f0704a5));
                            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.LIGHTNING_STRIKES_ALERT.getTagName());
                            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.MAP_DETAILS.getName());
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
                    arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.LAUNCHER_ICON.getTagName());
                    arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.FRONT_PAGE.getName());
                    arraymap.put(LocalyticsEvent.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner());
                }
                continue; /* Loop/switch isn't completed */
            }
            if (true) goto _L19; else goto _L6
_L6:
            enummap.put(BeaconTargetingParam.LAUNCH_SOURCE, "ICON_LAUNCH");
            enummap.put(BeaconTargetingParam.LAUNCH_PARTNER, LaunchPartner.getInstance().getLaunchPartner());
            arraymap.put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.LAUNCHER_ICON.getTagName());
            arraymap.put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.FRONT_PAGE.getName());
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
            registerReceiver(screenOnListener, intentfilter);
            if (activity instanceof FragmentActivity)
            {
                Localytics.dismissCurrentInAppMessage();
                Localytics.clearInAppMessageDisplayActivity();
            }
            Localytics.upload();
        }

        private FlagshipActivityLifeCycleCallbacks()
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

    }


    private static final String BURDA_LAUNCH = "burda-launch";
    static final String ICONS_ASSETS_FOLDER = "icons";
    public static final String IMAGE_LOCATION = "sdcard/Android/data/com.weather.Weather/";
    private static final String SESSIONM_OPTED_OUT = "SESSIONM_OPTED_OUT";
    private static final String TAG = "FlagshipApplication";
    private static final String TWC_PREFS = "TWC_PREFS";
    private static FlagshipApplication instance;
    private ObjectGraph baseObjectGraph;
    private String hockeyAppId;
    private HockeyCrashListener hockeyCrashListener;
    private final Boolean isSDPresent = Boolean.valueOf(Environment.getExternalStorageState().equals("mounted"));
    private final LocationManager locationManager = LocationManager.getLocationManager();
    private MetricReporter metricReporter;
    private ExecutorService metricsExecutor;
    private final ScreenOnListener screenOnListener = new ScreenOnListener();
    private final SessionTracker sessionTracker = new SessionTracker(LocalyticsHandler.getInstance(), LocationManager.getLocationManager());
    private VideoManager videoManager;
    private final WeatherDataManager weatherDataManager;

    public FlagshipApplication()
    {
        weatherDataManager = new WeatherDataManager(locationManager, UnitType.ENGLISH);
        metricsExecutor = Executors.newSingleThreadExecutor();
    }

    private void doMigration()
    {
        MigrationManager migrationmanager = new MigrationManager();
        migrationmanager.register();
        migrationmanager.migrate();
    }

    public static FlagshipApplication getInstance()
    {
        return instance;
    }

    private void initializeAdTargeting()
    {
        TargetingManager.INSTANCE.start();
        TargetingManager.INSTANCE.refresh(false);
    }

    public static boolean isFirstTimeLaunch()
    {
        boolean flag = false;
        if (!TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.WELCOME_SCREEN, false))
        {
            flag = true;
        }
        return flag;
    }

    private void replaceEndpoints(com.weather.util.prefs.TwcPrefs.Keys keys, com.weather.commons.push.PushService.ServiceType servicetype, com.weather.dal2.locations.SavedLocation.AlertType alerttype)
    {
        String s = TwcPrefs.getInstance().getString(keys, "");
        if (s.isEmpty()) goto _L2; else goto _L1
_L1:
        AlertServiceManager.getInstance().createAlertService(null, null, servicetype, null, true);
        AlertServiceManager.getInstance().deleteAlertService(s);
        TwcPrefs.getInstance().putString(keys, "");
_L6:
        _cls5..SwitchMap.com.weather.dal2.locations.SavedLocation.AlertType[alerttype.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 108
    //                   2 116
    //                   3 124;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
        keys;
_L7:
        LogUtil.e("FlagshipApplication", LoggingMetaTags.TWC_UPS, "Something Went wrong after upgrade when trying to replace the previous endpoint with new one for follow me alert Type %s %s", new Object[] {
            alerttype, keys
        });
          goto _L6
_L3:
        FollowMe.getInstance().setLightningStrikeNotification(true);
        return;
_L4:
        FollowMe.getInstance().setRealtimeRainNotification(true);
        return;
_L5:
        FollowMe.getInstance().setSevereNotification(true);
        return;
        keys;
          goto _L7
        keys;
          goto _L7
    }

    private void reportMetrics()
    {
        metricReporter.report();
        MetricUtil.resetMetrics(MetricRegistry.getInstance());
        LogUtil.v("FlagshipApplication", LoggingMetaTags.TWC_METRICS, (new StringBuilder()).append("Reporting metrics and clearing data with ").append(metricReporter).toString(), new Object[0]);
    }

    private void setFollowMeLocationAttributes(Map map)
    {
        String s2 = "";
        String s3 = "";
        SavedLocation savedlocation = FollowMe.getInstance().getLocation();
        String s1 = s3;
        String s = s2;
        if (LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            s1 = s3;
            s = s2;
            if (savedlocation != null)
            {
                s = savedlocation.getZipCode();
                s1 = savedlocation.getState();
            }
        }
        map.put(LocalyticsMainFeedTag.FOLLOW_ME_ZIP_CODE, s);
        map.put(LocalyticsMainFeedTag.FOLLOW_ME_STATE, s1);
    }

    private static void setMembers(Context context)
    {
        setContext(context.getApplicationContext());
        if ("release".equals("release"))
        {
            AbstractTwcApplication.setBuildServerDebug(false);
        }
    }

    private void setUpComScore()
    {
        comScore.setAppContext(getApplicationContext());
        comScore.allowOfflineTransmission(TransmissionMode.DISABLED);
    }

    public static void updateConfigFiles()
    {
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(3, new ThreadFactory() {

            private final AtomicInteger threadCount = new AtomicInteger();

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable, (new StringBuilder()).append("ConfigUpdate-").append(threadCount.incrementAndGet()).toString());
                runnable.setDaemon(true);
                return runnable;
            }

        });
        ConfigurationManagers.getInstance().updateConfig(scheduledexecutorservice);
        scheduledexecutorservice.shutdown();
        ConfigurationManagers.getInstance().scheduleUpdates();
        AdConfigManager.INSTANCE.setAdConfigProvider(ConfigurationManagers.getInstance());
        DalConfigManager.INSTANCE.setDalConfigProvider(ConfigurationManagers.getInstance());
    }

    private void updateEndpointsForFollowmeServices()
    {
        replaceEndpoints(com.weather.util.prefs.TwcPrefs.Keys.FOLLOW_ME_SEVERE_SERVICE_ID, com.weather.commons.push.PushService.ServiceType.FOLLOWME_SEVERE, com.weather.dal2.locations.SavedLocation.AlertType.severe);
        replaceEndpoints(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_SERVICE_ID, com.weather.commons.push.PushService.ServiceType.REAL_TIME_RAIN, com.weather.dal2.locations.SavedLocation.AlertType.realTimeRain);
        replaceEndpoints(com.weather.util.prefs.TwcPrefs.Keys.FOLLOW_ME_LIGHTNING_SERVICE_ID, com.weather.commons.push.PushService.ServiceType.FOLLOWME_LIGHTNING, com.weather.dal2.locations.SavedLocation.AlertType.lightning);
    }

    private void updateSounds(Context context)
    {
        boolean flag = false;
        Resources resources = context.getResources();
        Prefs prefs = TwcPrefs.getInstance();
        if (!prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.DALTON_SOUNDS_INSTALLED, false))
        {
            flag = true;
        }
        SoundUtil.installNotificationTone(com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERT_SOUND, resources.getString(0x7f0705c0), 0x7f060029, context, flag);
        SoundUtil.installNotificationTone(com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERT_SOUND, resources.getString(0x7f0705c1), 0x7f06002f, context, flag);
        SoundUtil.installNotificationTone(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERT_SOUND, resources.getString(0x7f0705c0), 0x7f060029, context, flag);
        SoundUtil.installNotificationTone(com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERT_SOUND, resources.getString(0x7f0705c0), 0x7f060029, context, flag);
        SoundUtil.installNotificationTone(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERT_SOUND, resources.getString(0x7f0705c0), 0x7f060029, context, flag);
        SoundUtil.installNotificationTone(com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERT_SOUND, resources.getString(0x7f0705c0), 0x7f060029, context, flag);
        SoundUtil.installNotificationTone(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS_SOUND, resources.getString(0x7f0705c0), 0x7f060029, context, flag);
        if (flag)
        {
            SoundUtil.deleteNotificationTone(context, resources.getString(0x7f0705c2));
            SoundUtil.deleteNotificationTone(context, resources.getString(0x7f0705c3));
            SoundUtil.deleteNotificationTone(context, resources.getString(0x7f0705c4));
            SoundUtil.deleteNotificationTone(context, resources.getString(0x7f0705c5));
        }
        prefs.putBoolean(com.weather.util.prefs.TwcPrefs.Keys.DALTON_SOUNDS_INSTALLED, true);
    }

    private void warmUp()
    {
        Thread thread = new Thread(new Runnable() {

            final FlagshipApplication this$0;

            public void run()
            {
                try
                {
                    Prefs prefs = TwcPrefs.getInstance();
                    Picasso picasso = Picasso.with(FlagshipApplication.this);
                    if (LogUtil.isLoggable(LoggingMetaTags.TWC_GENERAL, 3))
                    {
                        LogUtil.d("FlagshipApplication", LoggingMetaTags.TWC_GENERAL, "warmup.run prefs: %s", new Object[] {
                            prefs
                        });
                        LogUtil.d("FlagshipApplication", LoggingMetaTags.TWC_GENERAL, "warmup.run picasso: %s", new Object[] {
                            picasso
                        });
                    }
                }
                catch (Exception exception)
                {
                    Log.w("FlagshipApplication", (new StringBuilder()).append("warmup.run ex:").append(exception).toString());
                }
                SQSLocationUpdateUtil.initialize();
            }

            
            {
                this$0 = FlagshipApplication.this;
                super();
            }
        }, "warmup");
        thread.setDaemon(true);
        thread.start();
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    public ObjectGraph getBaseObjectGraph()
    {
        return baseObjectGraph;
    }

    public LocationManager getLocationManager()
    {
        return locationManager;
    }

    public VideoManager getVideoManager()
    {
        return videoManager;
    }

    public WeatherDataManager getWeatherDataManager()
    {
        return weatherDataManager;
    }

    public void onCreate()
    {
        LogUtil.i("FlagshipApplication", LoggingMetaTags.TWC_GENERAL, "onCreate", new Object[0]);
        super.onCreate();
        instance = this;
        LeakCanary.install(this);
        hockeyCrashListener = new HockeyCrashListener(this);
        hockeyAppId = getString(0x7f070525);
        baseObjectGraph = ObjectGraph.create(new Object[] {
            new AppInjection()
        });
        MetricRegistry.getInstance().timer(com.weather.util.metric.Metric.MetricTag.TIMER_COLDAPPLAUNCH_NETWORK.getMetricName()).start();
        MetricRegistry.getInstance().timer(com.weather.util.metric.Metric.MetricTag.TIMER_COLDAPPLAUNCH_DISKCACHE.getMetricName()).start();
        AbstractTwcApplication.setBuildServerDebug(false);
        if (isUpgrade())
        {
            ConfigPrefs.clearAll();
            FollowMe.getInstance().activateLbs(-1);
            (new Thread(new Runnable() {

                final FlagshipApplication this$0;

                public void run()
                {
                    updateEndpointsForFollowmeServices();
                }

            
            {
                this$0 = FlagshipApplication.this;
                super();
            }
            })).start();
        }
        if (AbstractTwcApplication.isBuildServerDebug())
        {
            StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyLog().build());
            StrictMode.setVmPolicy((new android.os.StrictMode.VmPolicy.Builder()).detectAll().penaltyLog().build());
            Thread.setDefaultUncaughtExceptionHandler(new TWCUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler()));
        }
        registerActivityLifecycleCallbacks(new FlagshipActivityLifeCycleCallbacks());
        weatherDataManager.setUnitType(DataUnits.getCurrentUnitType());
        setMembers(this);
        setUpComScore();
        updateConfigFiles();
        initializeAdTargeting();
        RmidUtils.init(this);
        if (LogUtil.isLoggable(LoggingMetaTags.TWC_BITMAPS, 3))
        {
            Picasso.with(this).setDebugging(true);
        }
        warmUp();
        Object obj = getApplicationContext();
        Config.setContext(((Context) (obj)));
        Localytics.integrate(((Context) (obj)));
        updateSounds(((Context) (obj)));
        Localytics.setLoggingEnabled(LogUtil.isLoggable(LoggingMetaTags.TWC_LOCALYTICS, 3));
        registerActivityLifecycleCallbacks(new TwcLocalyticsActivityLifecycleCallbacks());
        Localytics.addAnalyticsListener(new TwcLocalyticsListener());
        Kahuna.getInstance().setDebugMode(false);
        Kahuna.getInstance().onAppCreate(this, getString(0x7f070530), "385394700893");
        Kahuna.getInstance().setPushReceiver(com/weather/Weather/push/KahunaOnPushClickReceiver);
        DataAccessLayer.BUS.register(locationManager);
        DataAccessLayer.BUS.register(weatherDataManager);
        DataAccessLayer.BUS.register(baseObjectGraph.get(com/weather/commons/tropical/StormDataManager));
        CleanupService.register();
        DataAccessLayer.BUS.register(this);
        DataAccessLayer.BUS.register(PressureSensor.getInstance());
        DataAccessLayer.BUS.register(sessionTracker);
        DataAccessLayer.init();
        DataAccessLayer.BUS.post(new AppEvent(com.weather.dal2.system.AppEvent.Cause.APP_CREATE));
        SessionMUtils.syncOptOut();
        if (isFirstTimeLaunch())
        {
            doMigration();
            obj = TwcPrefs.getInstance();
            ((Prefs) (obj)).putBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS, true);
            Object obj1 = new ArrayMap();
            ((Map) (obj1)).put(LocalyticsEvent.LAUNCH_SOURCE, com.weather.commons.analytics.LocalyticsTags.LaunchSourceTag.FIRST_TIME.getTagName());
            ((Map) (obj1)).put(LocalyticsEvent.SCREEN_VIEWED, com.weather.commons.analytics.LocalyticsTags.ScreenName.FRONT_PAGE.getName());
            setFollowMeLocationAttributes(((Map) (obj1)));
            LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.LAUNCH_SOURCE, ((Map) (obj1)));
            obj1 = AbstractTwcApplication.getRootContext().getSharedPreferences("TWC_PREFS", 0);
            if (obj1 != null && ((SharedPreferences) (obj1)).getBoolean("SESSIONM_OPTED_OUT", false))
            {
                ((Prefs) (obj)).putBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, true);
            }
            ((Prefs) (obj)).putBoolean(com.weather.util.prefs.TwcPrefs.Keys.ON_GOING_NOTIFICATION_FIRST_LAUNCH, true);
            ((Prefs) (obj)).putBoolean(com.weather.util.prefs.TwcPrefs.Keys.WELCOME_SCREEN, true);
        }
        videoManager = new VideoManager();
        obj = new MetricBuildInfo("5.12.0", "bd0761b", "457", "release");
        MetricDeviceInfo metricdeviceinfo = new MetricDeviceInfo(DeviceUtils.getUUID(getRootContext()), Build.MANUFACTURER, Build.MODEL, android.os.Build.VERSION.RELEASE);
        metricReporter = MetricReporterFactory.getReporter(metricsExecutor, ((MetricBuildInfo) (obj)), metricdeviceinfo);
    }

    public void releaseAnalyticsEvents(PerformanceEventList performanceeventlist)
    {
        HashMap hashmap = new HashMap();
        final com.weather.dal2.PerformanceEvents.WeatherDataPerformanceEvent weatherDataPerformanceEvent;
        for (performanceeventlist = performanceeventlist.getPerformanceEventsList().iterator(); performanceeventlist.hasNext(); hashmap.put(new Attribute() {

        final FlagshipApplication this$0;
        final com.weather.dal2.PerformanceEvents.WeatherDataPerformanceEvent val$weatherDataPerformanceEvent;

        public String getName()
        {
            return weatherDataPerformanceEvent.event.getEvent();
        }

            
            {
                this$0 = FlagshipApplication.this;
                weatherDataPerformanceEvent = weatherdataperformanceevent;
                super();
            }
    }, String.valueOf(weatherDataPerformanceEvent.attributeValue)))
        {
            weatherDataPerformanceEvent = (com.weather.dal2.PerformanceEvents.WeatherDataPerformanceEvent)performanceeventlist.next();
            LogUtil.d("FlagshipApplication", LoggingMetaTags.TWC_LOCALYTICS, " Performing localytics Event for %s", new Object[] {
                weatherDataPerformanceEvent.event.getEvent()
            });
        }

        if (!hashmap.isEmpty())
        {
            LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.PERFORMANCE_METRICS, hashmap);
        }
    }








}
