// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.TrafficStats;
import android.preference.PreferenceManager;
import com.google.gson.Gson;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.UpsConstants;
import com.weather.commons.ups.backend.location.UpsLocationManager;
import com.weather.commons.ups.facade.Profile;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.date.DateUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.log.alerts.AlertsLogger;
import com.weather.util.log.alerts.CurLocLogEntry;
import com.weather.util.net.HttpRequest;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.push:
//            AlertResponseField, ProductType, PushService

public class AlertServiceManager
{

    private static final String TAG = "AlertServiceManager";
    private static final AlertServiceManager alertServiceManager = new AlertServiceManager();
    private final AccountManager accountManager = AccountManager.getInstance();
    private boolean needsSync;

    private AlertServiceManager()
    {
        needsSync = true;
    }

    private JSONObject getAlertServiceJsonObject(Profile profile, PushService.ServiceType servicetype, boolean flag, SavedLocation savedlocation)
        throws JSONException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$weather$commons$push$PushService$ServiceType[];

            static 
            {
                $SwitchMap$com$weather$commons$push$PushService$ServiceType = new int[PushService.ServiceType.values().length];
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.SEVERE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.POLLEN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.RAINSNOW.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.HEAVY_RAIN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.THUNDERSTORM.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.EXTREME_HEAT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.HIGH_WIND.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.DENSE_FOG.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.EXTREME_COLD.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.HEAVY_SNOWFALL.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.ICE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.BREAKINGNEWS.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.REAL_TIME_RAIN.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.FOLLOWME_LIGHTNING.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$PushService$ServiceType[PushService.ServiceType.FOLLOWME_SEVERE.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        String s;
        String s1;
        if (flag)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        s1 = UpsConstants.getAndroidDeviceId();
        if (savedlocation == null || profile == null)
        {
            profile = null;
        } else
        {
            profile = UpsLocationManager.getInstance().getLocationId(profile, savedlocation);
        }
        savedlocation = new JSONObject();
        _cls1..SwitchMap.com.weather.commons.push.PushService.ServiceType[servicetype.ordinal()];
        JVM INSTR tableswitch 1 15: default 116
    //                   1 159
    //                   2 181
    //                   3 443
    //                   4 203
    //                   5 233
    //                   6 263
    //                   7 293
    //                   8 323
    //                   9 353
    //                   10 383
    //                   11 413
    //                   12 571
    //                   13 116
    //                   14 116
    //                   15 116;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L1 _L1 _L1
_L1:
        savedlocation.put("status", s);
        savedlocation.put("endpoint", s1);
        return savedlocation;
_L2:
        savedlocation.put("threshold", "M");
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L3:
        savedlocation.put("threshold", "H");
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L5:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.HEAVY_RAIN.getProductName());
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L6:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.THUNDERSTORM.getProductName());
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L7:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.EXTREME_HEAT.getProductName());
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L8:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.HIGH_WIND.getProductName());
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L9:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.DENSE_FOG.getProductName());
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L10:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.EXTREME_COLD.getProductName());
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L11:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.HEAVY_SNOWFALL.getProductName());
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L12:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.ICE.getProductName());
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L4:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.PRODUCT_RAINSNOW.getProductName());
        savedlocation.put("threshold", "H");
        servicetype = PreferenceManager.getDefaultSharedPreferences(AbstractTwcApplication.getRootContext());
        List list = Arrays.asList(AbstractTwcApplication.getRootContext().getResources().getStringArray(com.weather.commons.R.array.rain_snow_alert_delivery_times_values));
        int ai[] = AbstractTwcApplication.getRootContext().getResources().getIntArray(com.weather.commons.R.array.rain_snow_alert_delivery_times_values_int);
        int j = list.indexOf(servicetype.getString("rain_snow_alert_delivery_times", ""));
        int i = j;
        if (j < 0)
        {
            i = 1;
        }
        savedlocation.put("hour", DateUtil.getRoundedUpTimeInGMT(ai[i], System.currentTimeMillis()));
        savedlocation.put("location", profile);
        continue; /* Loop/switch isn't completed */
_L13:
        savedlocation.put(AlertResponseField.PRODUCT.getName(), ProductType.PRODUCT_BREAKINGNEWS.getProductName());
        if (true) goto _L1; else goto _L14
_L14:
    }

    public static AlertServiceManager getInstance()
    {
        return alertServiceManager;
    }

    public void createAlertService(Profile profile, SavedLocation savedlocation, PushService.ServiceType servicetype, String s, boolean flag)
        throws JSONException, AbnormalHttpResponseException, com.weather.util.net.HttpRequest.HttpRequestException
    {
        JSONObject jsonobject = getAlertServiceJsonObject(profile, servicetype, flag, savedlocation);
        _cls1..SwitchMap.com.weather.commons.push.PushService.ServiceType[servicetype.ordinal()];
        JVM INSTR tableswitch 1 14: default 88
    //                   1 245
    //                   2 301
    //                   3 357
    //                   4 413
    //                   5 469
    //                   6 525
    //                   7 581
    //                   8 637
    //                   9 693
    //                   10 749
    //                   11 805
    //                   12 861
    //                   13 868
    //                   14 875;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        profile = UpsConstants.getFollowMeSevereServiceUrl();
_L21:
        s = null;
        TrafficStats.setThreadStatsTag(61446);
        savedlocation = s;
        String s1 = accountManager.getDsxCookie();
        if (s1 == null) goto _L17; else goto _L16
_L16:
        savedlocation = s;
        profile = HttpRequest.put(profile).header("Cookie", s1).trustAllHosts().contentType("application/json").readTimeout(15000).connectTimeout(15000).send(jsonobject.toString());
_L19:
        savedlocation = profile;
        if (!profile.ok())
        {
            break; /* Loop/switch isn't completed */
        }
        savedlocation = profile;
        accountManager.setDsxCookie(profile.header("Set-Cookie"));
        savedlocation = profile;
        LogUtil.i("AlertServiceManager", LoggingMetaTags.TWC_UPS, (new StringBuilder()).append("Successfully created ").append(servicetype).append(" weather alert service ").append(profile.code()).toString(), new Object[0]);
        if (profile != null)
        {
            profile.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.SEVERE_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.POLLEN_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.RAINSNOW_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.HEAVY_RAIN_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.THUNDERSTORM_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.EXTREME_HEAT_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.HIGH_WIND_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.DENSE_FOG_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.EXTREME_COLD_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.HEAVY_SNOW_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (s == null)
        {
            profile = (new StringBuilder()).append(UpsConstants.ICE_SERVICE_URL).append(UUID.randomUUID()).toString();
        } else
        {
            profile = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        }
        continue; /* Loop/switch isn't completed */
_L13:
        profile = UpsConstants.getBreakingNewsServiceUrl();
        continue; /* Loop/switch isn't completed */
_L14:
        profile = UpsConstants.getRealTimeRainServiceUrl();
        continue; /* Loop/switch isn't completed */
_L15:
        profile = UpsConstants.getFollowMeLightningServiceUrl();
        continue; /* Loop/switch isn't completed */
_L17:
        savedlocation = s;
        profile = HttpRequest.put(profile).trustAllHosts().contentType("application/json").readTimeout(15000).connectTimeout(15000).send(jsonobject.toString());
        if (true) goto _L19; else goto _L18
_L18:
        savedlocation = profile;
        if (profile.code() != 401)
        {
            break MISSING_BLOCK_LABEL_959;
        }
        savedlocation = profile;
        LogUtil.e("AlertServiceManager", LoggingMetaTags.TWC_UPS, "Cookie is bad! Clearing cookie from cache", new Object[0]);
        savedlocation = profile;
        accountManager.clearDsxCookie();
        savedlocation = profile;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Create service failed ").append(profile.code()).toString());
        profile;
        if (savedlocation != null)
        {
            savedlocation.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw profile;
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void deleteAlertService(String s)
        throws JSONException, com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException
    {
        Object obj;
        Object obj1;
        String s1;
        obj = (new StringBuilder()).append(UpsConstants.SERVICE_URL).append(s).toString();
        s1 = accountManager.getDsxCookie();
        obj1 = null;
        TrafficStats.setThreadStatsTag(61446);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        obj = HttpRequest.delete(((CharSequence) (obj))).header("Cookie", s1).trustAllHosts().contentType("application/json").readTimeout(15000).connectTimeout(15000);
_L4:
        obj1 = obj;
        if (!((HttpRequest) (obj)).ok())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        accountManager.setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        obj1 = obj;
        LogUtil.i("AlertServiceManager", LoggingMetaTags.TWC_UPS, (new StringBuilder()).append("Successfully deleted service ").append(s).toString(), new Object[0]);
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        obj = HttpRequest.delete(((CharSequence) (obj))).trustAllHosts().contentType("application/json").readTimeout(15000).connectTimeout(15000);
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        obj1 = obj;
        LogUtil.e("AlertServiceManager", LoggingMetaTags.TWC_UPS, "Cookie is bad! Clearing cookie from cache", new Object[0]);
        obj1 = obj;
        accountManager.clearDsxCookie();
        obj1 = obj;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to delete service ").append(((HttpRequest) (obj)).code()).toString());
        s;
        if (obj1 != null)
        {
            ((HttpRequest) (obj1)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public boolean isNeedsSync()
    {
        return needsSync;
    }

    public void setNeedsSync(boolean flag)
    {
        needsSync = flag;
    }

    public void updateAlertService(Profile profile, SavedLocation savedlocation, PushService.ServiceType servicetype, boolean flag)
        throws JSONException, AbnormalHttpResponseException, com.weather.util.net.HttpRequest.HttpRequestException
    {
        Object obj1 = getAlertServiceJsonObject(profile, servicetype, flag, savedlocation);
        Gson gson = new Gson();
        Object obj = profile.getService(savedlocation, servicetype);
        com.weather.commons.ups.facade.Profile.Service.ServiceDoc servicedoc;
        if (obj == null)
        {
            servicedoc = null;
        } else
        {
            servicedoc = ((com.weather.commons.ups.facade.Profile.Service) (obj)).getDoc();
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((com.weather.commons.ups.facade.Profile.Service) (obj)).getId();
        }
        if (obj == null)
        {
            createAlertService(profile, savedlocation, servicetype, null, flag);
        } else
        {
            obj1 = (com.weather.commons.ups.facade.Profile.Service.ServiceDoc)gson.fromJson(((JSONObject) (obj1)).toString(), com/weather/commons/ups/facade/Profile$Service$ServiceDoc);
            if (obj1 == null || !((com.weather.commons.ups.facade.Profile.Service.ServiceDoc) (obj1)).equals(servicedoc))
            {
                createAlertService(profile, savedlocation, servicetype, ((String) (obj)), flag);
                return;
            }
        }
    }

    public void updateFollowMeLocation(SavedLocation savedlocation)
        throws JSONException, com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException
    {
        HttpRequest httprequest;
        Object obj;
        String s;
        Object obj1;
        if (savedlocation == null)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        double d = savedlocation.getLat();
        double d1 = savedlocation.getLng();
        obj = UpsConstants.getFollowMeUpdateUrl();
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("lat", d);
        ((JSONObject) (obj1)).put("lon", d1);
        s = (new StringBuilder()).append("lat: ").append(d).append(", long: ").append(d1).toString();
        AlertsLogger.getInstance().addLogEntry(new CurLocLogEntry(d, d1, System.currentTimeMillis()));
        httprequest = null;
        TrafficStats.setThreadStatsTag(61446);
        obj = HttpRequest.post(((CharSequence) (obj))).contentType("application/json").header("Cookie", accountManager.getDsxCookie()).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(((JSONObject) (obj1)).toString());
        httprequest = ((HttpRequest) (obj));
        if (!((HttpRequest) (obj)).ok())
        {
            break MISSING_BLOCK_LABEL_272;
        }
        httprequest = ((HttpRequest) (obj));
        accountManager.setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        httprequest = ((HttpRequest) (obj));
        LogUtil.logToFile((new StringBuilder()).append("currloc: ").append(s).toString());
        httprequest = ((HttpRequest) (obj));
        LogUtil.i("AlertServiceManager", LoggingMetaTags.TWC_UPS, (new StringBuilder()).append("Successfully updated follow me location: ").append(((HttpRequest) (obj)).code()).toString(), new Object[0]);
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 403) goto _L2; else goto _L1
_L1:
        httprequest = ((HttpRequest) (obj));
        LogUtil.d("AlertServiceManager", LoggingMetaTags.TWC_UPS, "Received 403 error so set up the endpoint again.", new Object[0]);
        httprequest = ((HttpRequest) (obj));
        if (accountManager.isEndPointSetup())
        {
            break MISSING_BLOCK_LABEL_370;
        }
        httprequest = ((HttpRequest) (obj));
        obj1 = PushService.getRegistrationIdFromSharedPrefs(AbstractTwcApplication.getRootContext());
        httprequest = ((HttpRequest) (obj));
        String s1 = PushService.getChannelNameFromSharedPrefs(AbstractTwcApplication.getRootContext());
        if (obj1 == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        httprequest = ((HttpRequest) (obj));
        accountManager.setupEndPoint(((String) (obj1)), s1, true);
        httprequest = ((HttpRequest) (obj));
        obj1 = accountManager.getUserProfile();
        httprequest = ((HttpRequest) (obj));
        if (!savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.severe))
        {
            break MISSING_BLOCK_LABEL_447;
        }
        httprequest = ((HttpRequest) (obj));
        if (((Profile) (obj1)).getServiceId(savedlocation, PushService.ServiceType.FOLLOWME_SEVERE) != null)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        httprequest = ((HttpRequest) (obj));
        LogUtil.d("AlertServiceManager", LoggingMetaTags.TWC_UPS, "Followme severe not configured.", new Object[0]);
        httprequest = ((HttpRequest) (obj));
        createAlertService(null, null, PushService.ServiceType.FOLLOWME_SEVERE, null, true);
        httprequest = ((HttpRequest) (obj));
        if (!savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.realTimeRain))
        {
            break MISSING_BLOCK_LABEL_511;
        }
        httprequest = ((HttpRequest) (obj));
        if (((Profile) (obj1)).getServiceId(savedlocation, PushService.ServiceType.REAL_TIME_RAIN) != null)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        httprequest = ((HttpRequest) (obj));
        LogUtil.d("AlertServiceManager", LoggingMetaTags.TWC_UPS, "Followme rain not configured.", new Object[0]);
        httprequest = ((HttpRequest) (obj));
        createAlertService(null, null, PushService.ServiceType.REAL_TIME_RAIN, null, true);
        httprequest = ((HttpRequest) (obj));
        if (!savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.lightning))
        {
            break MISSING_BLOCK_LABEL_575;
        }
        httprequest = ((HttpRequest) (obj));
        if (((Profile) (obj1)).getServiceId(savedlocation, PushService.ServiceType.FOLLOWME_LIGHTNING) != null)
        {
            break MISSING_BLOCK_LABEL_575;
        }
        httprequest = ((HttpRequest) (obj));
        LogUtil.d("AlertServiceManager", LoggingMetaTags.TWC_UPS, "Followme lightning not configured.", new Object[0]);
        httprequest = ((HttpRequest) (obj));
        createAlertService(null, null, PushService.ServiceType.FOLLOWME_LIGHTNING, null, true);
_L4:
        httprequest = ((HttpRequest) (obj));
        LogUtil.logToFile((new StringBuilder()).append("status ").append(((HttpRequest) (obj)).code()).append(": currloc: ").append(s).toString());
        httprequest = ((HttpRequest) (obj));
        ((HttpRequest) (obj)).disconnect();
        httprequest = ((HttpRequest) (obj));
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to update follow me location: ").append(((HttpRequest) (obj)).code()).toString());
        savedlocation;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw savedlocation;
_L2:
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 401) goto _L4; else goto _L3
_L3:
        httprequest = ((HttpRequest) (obj));
        LogUtil.e("AlertServiceManager", LoggingMetaTags.TWC_UPS, "Cookie is bad! Clearing cookie from cache", new Object[0]);
        httprequest = ((HttpRequest) (obj));
        accountManager.clearDsxCookie();
          goto _L4
    }

}
