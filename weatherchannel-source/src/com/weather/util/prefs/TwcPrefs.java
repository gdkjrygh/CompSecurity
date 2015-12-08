// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.prefs;


// Referenced classes of package com.weather.util.prefs:
//            Prefs

public final class TwcPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys ACCEPTED_LEGAL_AGREEMENTS;
        public static final Keys ADVERTISING_ID;
        public static final Keys AD_CONFIG;
        public static final Keys AD_PARTNER;
        public static final Keys AD_TEST_ENABLED;
        public static final Keys ALERTS_LOG;
        public static final Keys ALERTS_LOG_ENABLED;
        public static final Keys APP_FIRST_LAUNCH;
        public static final Keys BREAKING_NEWS_ACTIVE;
        public static final Keys BREAKING_NEWS_ALERTS;
        public static final Keys BREAKING_NEWS_ALERT_LIGHT;
        public static final Keys BREAKING_NEWS_ALERT_SOUND;
        public static final Keys BREAKING_NEWS_ALERT_VIBRATION;
        public static final Keys BREAKING_NEWS_REFRESH_TIME;
        public static final Keys BREAKING_NEWS_SERVICE_ID;
        public static final Keys DALTON_SOUNDS_INSTALLED;
        public static final Keys DDI_MAP_FIRST_LAUNCH;
        public static final Keys DEFAULT_BACKGROUND_NOW;
        public static final Keys DENSE_FOG;
        public static final Keys DISMISSED_NEW_SESSIONM_DIALOG;
        public static final Keys DO_NOT_DISTURB_END_TIME;
        public static final Keys DO_NOT_DISTURB_START_TIME;
        public static final Keys DSX_SERVER;
        public static final Keys DSX_SERVER_SECURE;
        public static final Keys EXTREME_COLD;
        public static final Keys EXTREME_HEAT;
        public static final Keys FILTERED_ID;
        public static final Keys FOLLOW_ME_LIGHTNING_SERVICE_ID;
        public static final Keys FOLLOW_ME_SEVERE_SERVICE_ID;
        public static final Keys HEAVY_RAIN;
        public static final Keys HEAVY_SNOWFALL;
        public static final Keys HIGH_WIND;
        public static final Keys ICE;
        public static final Keys INSTALLED_VERSION_CODE;
        public static final Keys IS_DO_NOT_DISTURB_ENABLED;
        public static final Keys LANDSCAPE_ACTION_BAR_HEIGHT;
        public static final Keys LANDSCAPE_SCREEN_HEIGHT;
        public static final Keys LANDSCAPE_SCREEN_WIDTH;
        public static final Keys LAST_BACKGROUND_URL;
        public static final Keys LAST_NON_ANON_LOGGED_IN_ACCOUNT_TYPE;
        public static final Keys LAST_SUCCESSFUL_START_SYNC_TIME;
        public static final Keys LAST_TABLET_BACKGROUND_FILE;
        public static final Keys LAST_TABLET_BACKGROUND_URL;
        public static final Keys LAST_TWC_EMAIL;
        public static final Keys LAUNCH_PARTNER;
        public static final Keys LAUNCH_PARTNER_TIME;
        public static final Keys LIGHTNING_ALERTS;
        public static final Keys LIGHTNING_ALERT_LIGHT;
        public static final Keys LIGHTNING_ALERT_SOUND;
        public static final Keys LIGHTNING_ALERT_VIBRATION;
        public static final Keys LOCATION_UPDATE_ALARM_SCHEDULED;
        public static final Keys LOCATION_UPDATE_LOG;
        public static final Keys LOGGED_IN_ACCOUNT_TYPE;
        public static final Keys MODULE_CONFIG;
        public static final Keys NEWS_REFRESH_TIME;
        public static final Keys ON_GOING_NOTIFICATION_FIRST_LAUNCH;
        public static final Keys POLLEN_ALERTS;
        public static final Keys POLLEN_ALERT_LIGHT;
        public static final Keys POLLEN_ALERT_SOUND;
        public static final Keys POLLEN_ALERT_VIBRATION;
        public static final Keys PORTRAIT_ACTION_BAR_HEIGHT;
        public static final Keys PORTRAIT_SCREEN_HEIGHT;
        public static final Keys PORTRAIT_SCREEN_WIDTH;
        public static final Keys PRELOAD_PARTNER;
        public static final Keys QA_CONFIG_ENABLED;
        public static final Keys RAIN_SNOW_ALERTS;
        public static final Keys RAIN_SNOW_ALERT_LIGHT;
        public static final Keys RAIN_SNOW_ALERT_SOUND;
        public static final Keys RAIN_SNOW_ALERT_VIBRATION;
        public static final Keys RANDOM_INT;
        public static final Keys REAL_TIME_RAIN_ALERTS;
        public static final Keys REAL_TIME_RAIN_ALERT_LIGHT;
        public static final Keys REAL_TIME_RAIN_ALERT_SOUND;
        public static final Keys REAL_TIME_RAIN_ALERT_VIBRATION;
        public static final Keys REAL_TIME_RAIN_SERVICE_ID;
        public static final Keys SAW_NEW_SESSIONM_DIALOG;
        public static final Keys SCREEN_HEIGHT;
        public static final Keys SCREEN_WIDTH;
        public static final Keys SESSIONM_BANNERS;
        public static final Keys SESSIONM_DISMISS_TIME;
        public static final Keys SESSIONM_KILL;
        public static final Keys SESSIONM_OPTED_OUT;
        public static final Keys SESSIONM_TRANSITION_DELAY;
        public static final Keys SEVERE_ALERTS;
        public static final Keys SEVERE_ALERT_LIGHT;
        public static final Keys SEVERE_ALERT_SOUND;
        public static final Keys SEVERE_ALERT_VIBRATION;
        public static final Keys SIGNIFICANT_WEATHER_FORECAST_ALERTS;
        public static final Keys SIGNIFICANT_WEATHER_FORECAST_ALERTS_LIGHT;
        public static final Keys SIGNIFICANT_WEATHER_FORECAST_ALERTS_SOUND;
        public static final Keys SIGNIFICANT_WEATHER_FORECAST_ALERTS_VIBRATION;
        public static final Keys TEST_MODE;
        public static final Keys THUNDERSTORM;
        public static final Keys TUTORIAL_FORECAST_HOURLY;
        public static final Keys TUTORIAL_FORECAST_TEN_DAY;
        public static final Keys TUTORIAL_INTERACTIVE_MAP;
        public static final Keys TUTORIAL_NOW;
        public static final Keys TUTORIAL_STATIC_MAP;
        public static final Keys TWC_PRESENTS_REFRESH_TIME;
        public static final Keys UNITS;
        public static final Keys UPS_ACCOUNT_COOKIE;
        public static final Keys UPS_AVATAR_URI;
        public static final Keys UPS_LAST_FOLLOW_ME_UPDATE_TIME;
        public static final Keys UPS_USER_ID;
        public static final Keys USER_LOGIN_STATUS;
        public static final Keys USE_CUSTOM_AVATAR;
        public static final Keys USE_LBS;
        public static final Keys WELCOME_SCREEN;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/util/prefs/TwcPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            UNITS = new Keys("UNITS", 0);
            USE_LBS = new Keys("USE_LBS", 1);
            SIGNIFICANT_WEATHER_FORECAST_ALERTS_SOUND = new Keys("SIGNIFICANT_WEATHER_FORECAST_ALERTS_SOUND", 2);
            SIGNIFICANT_WEATHER_FORECAST_ALERTS_VIBRATION = new Keys("SIGNIFICANT_WEATHER_FORECAST_ALERTS_VIBRATION", 3);
            SIGNIFICANT_WEATHER_FORECAST_ALERTS_LIGHT = new Keys("SIGNIFICANT_WEATHER_FORECAST_ALERTS_LIGHT", 4);
            SEVERE_ALERT_SOUND = new Keys("SEVERE_ALERT_SOUND", 5);
            SEVERE_ALERT_VIBRATION = new Keys("SEVERE_ALERT_VIBRATION", 6);
            SEVERE_ALERT_LIGHT = new Keys("SEVERE_ALERT_LIGHT", 7);
            POLLEN_ALERT_SOUND = new Keys("POLLEN_ALERT_SOUND", 8);
            POLLEN_ALERT_VIBRATION = new Keys("POLLEN_ALERT_VIBRATION", 9);
            POLLEN_ALERT_LIGHT = new Keys("POLLEN_ALERT_LIGHT", 10);
            RAIN_SNOW_ALERT_SOUND = new Keys("RAIN_SNOW_ALERT_SOUND", 11);
            RAIN_SNOW_ALERT_VIBRATION = new Keys("RAIN_SNOW_ALERT_VIBRATION", 12);
            RAIN_SNOW_ALERT_LIGHT = new Keys("RAIN_SNOW_ALERT_LIGHT", 13);
            BREAKING_NEWS_ALERT_SOUND = new Keys("BREAKING_NEWS_ALERT_SOUND", 14);
            BREAKING_NEWS_ALERT_VIBRATION = new Keys("BREAKING_NEWS_ALERT_VIBRATION", 15);
            BREAKING_NEWS_ALERT_LIGHT = new Keys("BREAKING_NEWS_ALERT_LIGHT", 16);
            REAL_TIME_RAIN_ALERT_SOUND = new Keys("REAL_TIME_RAIN_ALERT_SOUND", 17);
            LIGHTNING_ALERT_LIGHT = new Keys("LIGHTNING_ALERT_LIGHT", 18);
            LIGHTNING_ALERT_VIBRATION = new Keys("LIGHTNING_ALERT_VIBRATION", 19);
            LIGHTNING_ALERT_SOUND = new Keys("LIGHTNING_ALERT_SOUND", 20);
            REAL_TIME_RAIN_ALERT_LIGHT = new Keys("REAL_TIME_RAIN_ALERT_LIGHT", 21);
            REAL_TIME_RAIN_ALERT_VIBRATION = new Keys("REAL_TIME_RAIN_ALERT_VIBRATION", 22);
            IS_DO_NOT_DISTURB_ENABLED = new Keys("IS_DO_NOT_DISTURB_ENABLED", 23);
            DO_NOT_DISTURB_END_TIME = new Keys("DO_NOT_DISTURB_END_TIME", 24);
            DO_NOT_DISTURB_START_TIME = new Keys("DO_NOT_DISTURB_START_TIME", 25);
            ACCEPTED_LEGAL_AGREEMENTS = new Keys("ACCEPTED_LEGAL_AGREEMENTS", 26);
            WELCOME_SCREEN = new Keys("WELCOME_SCREEN", 27);
            ON_GOING_NOTIFICATION_FIRST_LAUNCH = new Keys("ON_GOING_NOTIFICATION_FIRST_LAUNCH", 28);
            TUTORIAL_NOW = new Keys("TUTORIAL_NOW", 29);
            TUTORIAL_FORECAST_TEN_DAY = new Keys("TUTORIAL_FORECAST_TEN_DAY", 30);
            TUTORIAL_FORECAST_HOURLY = new Keys("TUTORIAL_FORECAST_HOURLY", 31);
            TUTORIAL_STATIC_MAP = new Keys("TUTORIAL_STATIC_MAP", 32);
            TUTORIAL_INTERACTIVE_MAP = new Keys("TUTORIAL_INTERACTIVE_MAP", 33);
            SAW_NEW_SESSIONM_DIALOG = new Keys("SAW_NEW_SESSIONM_DIALOG", 34);
            DISMISSED_NEW_SESSIONM_DIALOG = new Keys("DISMISSED_NEW_SESSIONM_DIALOG", 35);
            SESSIONM_OPTED_OUT = new Keys("SESSIONM_OPTED_OUT", 36);
            SESSIONM_TRANSITION_DELAY = new Keys("SESSIONM_TRANSITION_DELAY", 37);
            SESSIONM_DISMISS_TIME = new Keys("SESSIONM_DISMISS_TIME", 38);
            SESSIONM_KILL = new Keys("SESSIONM_KILL", 39);
            SESSIONM_BANNERS = new Keys("SESSIONM_BANNERS", 40);
            SCREEN_HEIGHT = new Keys("SCREEN_HEIGHT", 41);
            SCREEN_WIDTH = new Keys("SCREEN_WIDTH", 42);
            DEFAULT_BACKGROUND_NOW = new Keys("DEFAULT_BACKGROUND_NOW", 43);
            MODULE_CONFIG = new Keys("MODULE_CONFIG", 44);
            AD_CONFIG = new Keys("AD_CONFIG", 45);
            LOGGED_IN_ACCOUNT_TYPE = new Keys("LOGGED_IN_ACCOUNT_TYPE", 46);
            LAST_NON_ANON_LOGGED_IN_ACCOUNT_TYPE = new Keys("LAST_NON_ANON_LOGGED_IN_ACCOUNT_TYPE", 47);
            LAST_TWC_EMAIL = new Keys("LAST_TWC_EMAIL", 48);
            UPS_USER_ID = new Keys("UPS_USER_ID", 49);
            UPS_ACCOUNT_COOKIE = new Keys("UPS_ACCOUNT_COOKIE", 50);
            USER_LOGIN_STATUS = new Keys("USER_LOGIN_STATUS", 51);
            APP_FIRST_LAUNCH = new Keys("APP_FIRST_LAUNCH", 52);
            LAST_SUCCESSFUL_START_SYNC_TIME = new Keys("LAST_SUCCESSFUL_START_SYNC_TIME", 53);
            LAST_BACKGROUND_URL = new Keys("LAST_BACKGROUND_URL", 54);
            TEST_MODE = new Keys("TEST_MODE", 55);
            LOCATION_UPDATE_ALARM_SCHEDULED = new Keys("LOCATION_UPDATE_ALARM_SCHEDULED", 56);
            BREAKING_NEWS_ACTIVE = new Keys("BREAKING_NEWS_ACTIVE", 57);
            BREAKING_NEWS_REFRESH_TIME = new Keys("BREAKING_NEWS_REFRESH_TIME", 58);
            NEWS_REFRESH_TIME = new Keys("NEWS_REFRESH_TIME", 59);
            TWC_PRESENTS_REFRESH_TIME = new Keys("TWC_PRESENTS_REFRESH_TIME", 60);
            UPS_LAST_FOLLOW_ME_UPDATE_TIME = new Keys("UPS_LAST_FOLLOW_ME_UPDATE_TIME", 61);
            PORTRAIT_SCREEN_WIDTH = new Keys("PORTRAIT_SCREEN_WIDTH", 62);
            PORTRAIT_SCREEN_HEIGHT = new Keys("PORTRAIT_SCREEN_HEIGHT", 63);
            LANDSCAPE_SCREEN_WIDTH = new Keys("LANDSCAPE_SCREEN_WIDTH", 64);
            LANDSCAPE_SCREEN_HEIGHT = new Keys("LANDSCAPE_SCREEN_HEIGHT", 65);
            LAST_TABLET_BACKGROUND_FILE = new Keys("LAST_TABLET_BACKGROUND_FILE", 66);
            LAST_TABLET_BACKGROUND_URL = new Keys("LAST_TABLET_BACKGROUND_URL", 67);
            PORTRAIT_ACTION_BAR_HEIGHT = new Keys("PORTRAIT_ACTION_BAR_HEIGHT", 68);
            LANDSCAPE_ACTION_BAR_HEIGHT = new Keys("LANDSCAPE_ACTION_BAR_HEIGHT", 69);
            INSTALLED_VERSION_CODE = new Keys("INSTALLED_VERSION_CODE", 70);
            AD_PARTNER = new Keys("AD_PARTNER", 71);
            AD_TEST_ENABLED = new Keys("AD_TEST_ENABLED", 72);
            QA_CONFIG_ENABLED = new Keys("QA_CONFIG_ENABLED", 73);
            LOCATION_UPDATE_LOG = new Keys("LOCATION_UPDATE_LOG", 74);
            SEVERE_ALERTS = new Keys("SEVERE_ALERTS", 75);
            POLLEN_ALERTS = new Keys("POLLEN_ALERTS", 76);
            RAIN_SNOW_ALERTS = new Keys("RAIN_SNOW_ALERTS", 77);
            REAL_TIME_RAIN_ALERTS = new Keys("REAL_TIME_RAIN_ALERTS", 78);
            LIGHTNING_ALERTS = new Keys("LIGHTNING_ALERTS", 79);
            BREAKING_NEWS_ALERTS = new Keys("BREAKING_NEWS_ALERTS", 80);
            FILTERED_ID = new Keys("FILTERED_ID", 81);
            ADVERTISING_ID = new Keys("ADVERTISING_ID", 82);
            PRELOAD_PARTNER = new Keys("PRELOAD_PARTNER", 83);
            LAUNCH_PARTNER = new Keys("LAUNCH_PARTNER", 84);
            LAUNCH_PARTNER_TIME = new Keys("LAUNCH_PARTNER_TIME", 85);
            DALTON_SOUNDS_INSTALLED = new Keys("DALTON_SOUNDS_INSTALLED", 86);
            RANDOM_INT = new Keys("RANDOM_INT", 87);
            UPS_AVATAR_URI = new Keys("UPS_AVATAR_URI", 88);
            USE_CUSTOM_AVATAR = new Keys("USE_CUSTOM_AVATAR", 89);
            DSX_SERVER = new Keys("DSX_SERVER", 90);
            DSX_SERVER_SECURE = new Keys("DSX_SERVER_SECURE", 91);
            REAL_TIME_RAIN_SERVICE_ID = new Keys("REAL_TIME_RAIN_SERVICE_ID", 92);
            FOLLOW_ME_SEVERE_SERVICE_ID = new Keys("FOLLOW_ME_SEVERE_SERVICE_ID", 93);
            FOLLOW_ME_LIGHTNING_SERVICE_ID = new Keys("FOLLOW_ME_LIGHTNING_SERVICE_ID", 94);
            BREAKING_NEWS_SERVICE_ID = new Keys("BREAKING_NEWS_SERVICE_ID", 95);
            ALERTS_LOG = new Keys("ALERTS_LOG", 96);
            ALERTS_LOG_ENABLED = new Keys("ALERTS_LOG_ENABLED", 97);
            SIGNIFICANT_WEATHER_FORECAST_ALERTS = new Keys("SIGNIFICANT_WEATHER_FORECAST_ALERTS", 98);
            HEAVY_RAIN = new Keys("HEAVY_RAIN", 99);
            THUNDERSTORM = new Keys("THUNDERSTORM", 100);
            EXTREME_HEAT = new Keys("EXTREME_HEAT", 101);
            HIGH_WIND = new Keys("HIGH_WIND", 102);
            DENSE_FOG = new Keys("DENSE_FOG", 103);
            EXTREME_COLD = new Keys("EXTREME_COLD", 104);
            HEAVY_SNOWFALL = new Keys("HEAVY_SNOWFALL", 105);
            ICE = new Keys("ICE", 106);
            DDI_MAP_FIRST_LAUNCH = new Keys("DDI_MAP_FIRST_LAUNCH", 107);
            $VALUES = (new Keys[] {
                UNITS, USE_LBS, SIGNIFICANT_WEATHER_FORECAST_ALERTS_SOUND, SIGNIFICANT_WEATHER_FORECAST_ALERTS_VIBRATION, SIGNIFICANT_WEATHER_FORECAST_ALERTS_LIGHT, SEVERE_ALERT_SOUND, SEVERE_ALERT_VIBRATION, SEVERE_ALERT_LIGHT, POLLEN_ALERT_SOUND, POLLEN_ALERT_VIBRATION, 
                POLLEN_ALERT_LIGHT, RAIN_SNOW_ALERT_SOUND, RAIN_SNOW_ALERT_VIBRATION, RAIN_SNOW_ALERT_LIGHT, BREAKING_NEWS_ALERT_SOUND, BREAKING_NEWS_ALERT_VIBRATION, BREAKING_NEWS_ALERT_LIGHT, REAL_TIME_RAIN_ALERT_SOUND, LIGHTNING_ALERT_LIGHT, LIGHTNING_ALERT_VIBRATION, 
                LIGHTNING_ALERT_SOUND, REAL_TIME_RAIN_ALERT_LIGHT, REAL_TIME_RAIN_ALERT_VIBRATION, IS_DO_NOT_DISTURB_ENABLED, DO_NOT_DISTURB_END_TIME, DO_NOT_DISTURB_START_TIME, ACCEPTED_LEGAL_AGREEMENTS, WELCOME_SCREEN, ON_GOING_NOTIFICATION_FIRST_LAUNCH, TUTORIAL_NOW, 
                TUTORIAL_FORECAST_TEN_DAY, TUTORIAL_FORECAST_HOURLY, TUTORIAL_STATIC_MAP, TUTORIAL_INTERACTIVE_MAP, SAW_NEW_SESSIONM_DIALOG, DISMISSED_NEW_SESSIONM_DIALOG, SESSIONM_OPTED_OUT, SESSIONM_TRANSITION_DELAY, SESSIONM_DISMISS_TIME, SESSIONM_KILL, 
                SESSIONM_BANNERS, SCREEN_HEIGHT, SCREEN_WIDTH, DEFAULT_BACKGROUND_NOW, MODULE_CONFIG, AD_CONFIG, LOGGED_IN_ACCOUNT_TYPE, LAST_NON_ANON_LOGGED_IN_ACCOUNT_TYPE, LAST_TWC_EMAIL, UPS_USER_ID, 
                UPS_ACCOUNT_COOKIE, USER_LOGIN_STATUS, APP_FIRST_LAUNCH, LAST_SUCCESSFUL_START_SYNC_TIME, LAST_BACKGROUND_URL, TEST_MODE, LOCATION_UPDATE_ALARM_SCHEDULED, BREAKING_NEWS_ACTIVE, BREAKING_NEWS_REFRESH_TIME, NEWS_REFRESH_TIME, 
                TWC_PRESENTS_REFRESH_TIME, UPS_LAST_FOLLOW_ME_UPDATE_TIME, PORTRAIT_SCREEN_WIDTH, PORTRAIT_SCREEN_HEIGHT, LANDSCAPE_SCREEN_WIDTH, LANDSCAPE_SCREEN_HEIGHT, LAST_TABLET_BACKGROUND_FILE, LAST_TABLET_BACKGROUND_URL, PORTRAIT_ACTION_BAR_HEIGHT, LANDSCAPE_ACTION_BAR_HEIGHT, 
                INSTALLED_VERSION_CODE, AD_PARTNER, AD_TEST_ENABLED, QA_CONFIG_ENABLED, LOCATION_UPDATE_LOG, SEVERE_ALERTS, POLLEN_ALERTS, RAIN_SNOW_ALERTS, REAL_TIME_RAIN_ALERTS, LIGHTNING_ALERTS, 
                BREAKING_NEWS_ALERTS, FILTERED_ID, ADVERTISING_ID, PRELOAD_PARTNER, LAUNCH_PARTNER, LAUNCH_PARTNER_TIME, DALTON_SOUNDS_INSTALLED, RANDOM_INT, UPS_AVATAR_URI, USE_CUSTOM_AVATAR, 
                DSX_SERVER, DSX_SERVER_SECURE, REAL_TIME_RAIN_SERVICE_ID, FOLLOW_ME_SEVERE_SERVICE_ID, FOLLOW_ME_LIGHTNING_SERVICE_ID, BREAKING_NEWS_SERVICE_ID, ALERTS_LOG, ALERTS_LOG_ENABLED, SIGNIFICANT_WEATHER_FORECAST_ALERTS, HEAVY_RAIN, 
                THUNDERSTORM, EXTREME_HEAT, HIGH_WIND, DENSE_FOG, EXTREME_COLD, HEAVY_SNOWFALL, ICE, DDI_MAP_FIRST_LAUNCH
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "TWC_PREFS_V5";
    private static final Prefs INSTANCE = new Prefs("TWC_PREFS_V5");
    public static final String PREF_NAME = "twcprefs";

    private TwcPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
