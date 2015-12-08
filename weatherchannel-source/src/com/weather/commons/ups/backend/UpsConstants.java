// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.util.Log;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.config.ConfigException;
import com.weather.util.device.DeviceUtils;
import com.weather.util.intent.MimeType;

public class UpsConstants
{
    private static final class StringHolder
    {

        private static final String ANDROID_DEVICE_ID = DeviceUtils.getUuidDigest(AbstractTwcApplication.getRootContext());



        private StringHolder()
        {
        }
    }


    public static final int ACCESS_FORBIDDEN = 403;
    public static final String ACCOUNT_CREATION_URL;
    public static final String ACCOUNT_LINKING_ANON;
    public static final String ACCOUNT_LINKING_AWS;
    public static final String ACCOUNT_LINKING_FB;
    public static final String ACCOUNT_LINKING_GP;
    public static final String ACCOUNT_LINKING_WX;
    public static final String ACCOUNT_LOGIN_URL;
    public static final String ADM_CHANNEL_NAME;
    public static final String AGE_RANGE_13_TO_17 = "13-17";
    public static final String AGE_RANGE_18_TO_24 = "18-24";
    public static final String AGE_RANGE_25_TO_34 = "25-34";
    public static final String AGE_RANGE_35_TO_44 = "35-44";
    public static final String AGE_RANGE_45_TO_54 = "45-54";
    public static final String AGE_RANGE_55_TO_64 = "55-64";
    public static final String AGE_RANGE_UNDER = "under13";
    public static final String APPLICATION_JSON = "application/json";
    public static final String BREAKINGNEWS = "cms-push/";
    public static final String BREAKING_NEWS_SERVICE_URL;
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CHANGE_WX_PASSWORD_URL;
    public static final int CONFLICT = 409;
    public static final int CONNECT_TIMEOUT = 15000;
    public static final String COOKIE = "Cookie";
    public static final String DEMOGRAPHICS_SETTINGS_URL;
    public static final String DENSE_FOG = "global8/nfg";
    public static final String DENSE_FOG_SERVICE_URL;
    public static final String DISABLED = "disabled";
    public static final String DSX_SERVER;
    public static final String EDIT_PROFILE = "edit_profile";
    public static final String ENABLED = "enabled";
    public static final String ENDPOINT = "endpoint";
    public static final String EXTREME_COLD = "global8/nec";
    public static final String EXTREME_COLD_SERVICE_URL;
    public static final String EXTREME_HEAT = "global8/neh";
    public static final String EXTREME_HEAT_SERVICE_URL;
    public static final String FOLLOWME_LAT = "lat";
    public static final String FOLLOWME_LIGHTNING = "followme-lightning/";
    public static final String FOLLOWME_LIGHTNING_SERVICE_URL;
    public static final String FOLLOWME_LONG = "lon";
    public static final String FOLLOWME_SEVERE = "followme-severe/";
    public static final String FOLLOW_ME_LOCATION_URL;
    public static final String FOLLOW_SEVERE_SERVICE_URL;
    public static final String GCM_CHANNEL_NAME;
    public static final String HEAVY_RAIN = "global8/nrf";
    public static final String HEAVY_RAIN_SERVICE_URL;
    public static final String HEAVY_SNOWFALL = "global8/nsf";
    public static final String HEAVY_SNOW_SERVICE_URL;
    public static final String HIGH_WIND = "global8/nhw";
    public static final String HIGH_WIND_SERVICE_URL;
    public static final String HOME = "home";
    public static final String HOUR = "hour";
    public static final int HOUR_DEFAULT_INDEX = 1;
    public static final String ICE = "global8/nic";
    public static final String ICE_SERVICE_URL;
    public static final String ID = "id";
    public static final String LANGUAGE = "language";
    public static final String LANGUAGE_PREFERENCE_URL;
    public static final String LOCATION = "location";
    public static final String NO_CACHE = "no-cache";
    public static final int NO_CONTENT = 204;
    public static final String NULL_ADDRESS_COMPONENT = "null";
    public static final String OTHER = "other";
    public static final String PASSWORD_RECOVERY_BASE_URL;
    public static final String POLLEN = "pollen/";
    public static final String POLLEN_SERVICE_URL;
    public static final String RAINSNOW = "scheduled/";
    public static final String RAINSNOW_SERVICE_URL;
    public static final int READ_TIMEOUT = 15000;
    public static final String REAL_TIME_RAIN = "followme-rain/";
    public static final String REAL_TIME_RAIN_SERVICE_URL;
    public static final String SAVED_LOCATION_URL;
    public static final String SERVICE_URL;
    public static final String SESSION_LOGIN_URL;
    public static final String SET_COOKIE = "Set-Cookie";
    public static final String SET_UP_ENDPOINT_URL;
    public static final String SEVERE = "severe/";
    public static final String SEVERE_SERVICE_URL;
    public static final String SIGNIFICANT_WEATHER_SERVICE_URL;
    public static final String STATUS = "status";
    public static final String SYNC_RESULT = "sync_result";
    private static final String TAG = "UpsConstants";
    public static final String TEXT_PLAIN;
    public static final String THRESHOLD = "threshold";
    public static final String THUNDERSTORM = "global8/nts";
    public static final String THUNDERSTORM_SERVICE_URL;
    public static final int UNAUTHORIZED_ACCESS = 401;
    public static final String WORK = "work";
    public static final String WX_ACCOUNT = "wx/";

    private UpsConstants()
    {
    }

    public static String getAndroidDeviceId()
    {
        return StringHolder.ANDROID_DEVICE_ID;
    }

    public static String getBreakingNewsServiceId()
    {
        return (new StringBuilder()).append("cms-push/").append(getAndroidDeviceId()).toString();
    }

    public static String getBreakingNewsServiceUrl()
    {
        return (new StringBuilder()).append(BREAKING_NEWS_SERVICE_URL).append(getAndroidDeviceId()).toString();
    }

    private static String getChannelSuffix()
    {
        String s;
        try
        {
            s = ConfigurationManagers.getInstance().getFlagshipConfig().upsChannelSuffix;
        }
        catch (ConfigException configexception)
        {
            Log.e("UpsConstants", configexception.getMessage());
            return "";
        }
        return s;
    }

    public static String getFollowMeLightningServiceId()
    {
        return (new StringBuilder()).append("followme-lightning/").append(getAndroidDeviceId()).toString();
    }

    public static String getFollowMeLightningServiceUrl()
    {
        return (new StringBuilder()).append(FOLLOWME_LIGHTNING_SERVICE_URL).append(getAndroidDeviceId()).toString();
    }

    public static String getFollowMeSevereServiceId()
    {
        return (new StringBuilder()).append("followme-severe/").append(getAndroidDeviceId()).toString();
    }

    public static String getFollowMeSevereServiceUrl()
    {
        return (new StringBuilder()).append(FOLLOW_SEVERE_SERVICE_URL).append(getAndroidDeviceId()).toString();
    }

    public static String getFollowMeUpdateUrl()
    {
        return (new StringBuilder()).append(FOLLOW_ME_LOCATION_URL).append(getAndroidDeviceId()).toString();
    }

    public static String getRealTimeRainServiceId()
    {
        return (new StringBuilder()).append("followme-rain/").append(getAndroidDeviceId()).toString();
    }

    public static String getRealTimeRainServiceUrl()
    {
        return (new StringBuilder()).append(REAL_TIME_RAIN_SERVICE_URL).append(getAndroidDeviceId()).toString();
    }

    static 
    {
        String s;
        TEXT_PLAIN = MimeType.TEXT_PLAIN.getMimeString();
        s = "https://dsx-secure.weather.com";
        String s1 = ConfigurationManagers.getInstance().getFlagshipConfig().upsDsxServer;
        s = s1;
_L2:
        DSX_SERVER = s;
        PASSWORD_RECOVERY_BASE_URL = (new StringBuilder()).append(DSX_SERVER).append("/u/tempPwd/").toString();
        CHANGE_WX_PASSWORD_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/sso/wx/").toString();
        FOLLOW_ME_LOCATION_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/currloc/").toString();
        SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/").toString();
        BREAKING_NEWS_SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/cms-push/").toString();
        FOLLOW_SEVERE_SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/followme-severe/").toString();
        REAL_TIME_RAIN_SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/followme-rain/").toString();
        FOLLOWME_LIGHTNING_SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/followme-lightning/").toString();
        RAINSNOW_SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/scheduled/").toString();
        SIGNIFICANT_WEATHER_SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/global8").toString();
        HEAVY_RAIN_SERVICE_URL = (new StringBuilder()).append(SIGNIFICANT_WEATHER_SERVICE_URL).append("/nrf/").toString();
        THUNDERSTORM_SERVICE_URL = (new StringBuilder()).append(SIGNIFICANT_WEATHER_SERVICE_URL).append("/nts/").toString();
        EXTREME_HEAT_SERVICE_URL = (new StringBuilder()).append(SIGNIFICANT_WEATHER_SERVICE_URL).append("/neh/").toString();
        HIGH_WIND_SERVICE_URL = (new StringBuilder()).append(SIGNIFICANT_WEATHER_SERVICE_URL).append("/nhw/").toString();
        EXTREME_COLD_SERVICE_URL = (new StringBuilder()).append(SIGNIFICANT_WEATHER_SERVICE_URL).append("/nec/").toString();
        HEAVY_SNOW_SERVICE_URL = (new StringBuilder()).append(SIGNIFICANT_WEATHER_SERVICE_URL).append("/nsf/").toString();
        DENSE_FOG_SERVICE_URL = (new StringBuilder()).append(SIGNIFICANT_WEATHER_SERVICE_URL).append("/nfg/").toString();
        ICE_SERVICE_URL = (new StringBuilder()).append(SIGNIFICANT_WEATHER_SERVICE_URL).append("/nic/").toString();
        POLLEN_SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/pollen/").toString();
        SEVERE_SERVICE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/services/severe/").toString();
        LANGUAGE_PREFERENCE_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/preferences").toString();
        SAVED_LOCATION_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/locations/").toString();
        SET_UP_ENDPOINT_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/endpoints/").toString();
        DEMOGRAPHICS_SETTINGS_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/demographics/").toString();
        ACCOUNT_LINKING_ANON = (new StringBuilder()).append(DSX_SERVER).append("/p/sso/anon/").toString();
        ACCOUNT_LINKING_AWS = (new StringBuilder()).append(DSX_SERVER).append("/p/sso/aws/").toString();
        ACCOUNT_LINKING_WX = (new StringBuilder()).append(DSX_SERVER).append("/p/sso/wx/").toString();
        ACCOUNT_LINKING_GP = (new StringBuilder()).append(DSX_SERVER).append("/p/sso/gp/").toString();
        ACCOUNT_LINKING_FB = (new StringBuilder()).append(DSX_SERVER).append("/p/sso/fb/").toString();
        ACCOUNT_LOGIN_URL = (new StringBuilder()).append(DSX_SERVER).append("/p/sso").toString();
        ACCOUNT_CREATION_URL = (new StringBuilder()).append(DSX_SERVER).append("/p").toString();
        SESSION_LOGIN_URL = (new StringBuilder()).append(DSX_SERVER).append("/dsx/session").toString();
        ADM_CHANNEL_NAME = (new StringBuilder()).append("adm").append(getChannelSuffix()).toString();
        GCM_CHANNEL_NAME = (new StringBuilder()).append("gcm").append(getChannelSuffix()).toString();
        return;
        ConfigException configexception;
        configexception;
        Log.e("UpsConstants", configexception.toString(), configexception);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
