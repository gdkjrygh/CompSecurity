// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute, Screen

public final class LocalyticsTags
{
    public static final class LaunchSourceTag extends Enum
    {

        private static final LaunchSourceTag $VALUES[];
        public static final LaunchSourceTag BREAKING_ALERT;
        public static final LaunchSourceTag BURDA;
        public static final LaunchSourceTag DEEP_LINK;
        public static final LaunchSourceTag FIRST_TIME;
        public static final LaunchSourceTag INTERNATIONAL_REAL_TIME_RAIN_ALERT;
        public static final LaunchSourceTag LAUNCHER_ICON;
        public static final LaunchSourceTag LIGHTNING_STRIKES_ALERT;
        public static final LaunchSourceTag NOW_CARD;
        public static final LaunchSourceTag ONE_BOX;
        public static final LaunchSourceTag ONGOING_TEMP_ALERT;
        public static final LaunchSourceTag POLLEN_ALERT;
        public static final LaunchSourceTag RAINSNOW_ALERT;
        public static final LaunchSourceTag REAL_TIME_RAIN_ALERT;
        public static final LaunchSourceTag SEVERE_ALERT;
        public static final LaunchSourceTag SEVERE_INTERNATIONAL_ALERT;
        public static final LaunchSourceTag WIDGET_1x1;
        public static final LaunchSourceTag WIDGET_2x2;
        public static final LaunchSourceTag WIDGET_4x1;
        public static final LaunchSourceTag WIDGET_4x2;
        private final String tagName;

        public static LaunchSourceTag valueOf(String s)
        {
            return (LaunchSourceTag)Enum.valueOf(com/weather/commons/analytics/LocalyticsTags$LaunchSourceTag, s);
        }

        public static LaunchSourceTag[] values()
        {
            return (LaunchSourceTag[])$VALUES.clone();
        }

        public String getTagName()
        {
            return tagName;
        }

        static 
        {
            LAUNCHER_ICON = new LaunchSourceTag("LAUNCHER_ICON", 0, "launcher icon");
            WIDGET_1x1 = new LaunchSourceTag("WIDGET_1x1", 1, "widget1x1");
            WIDGET_2x2 = new LaunchSourceTag("WIDGET_2x2", 2, "widget2x2");
            WIDGET_4x1 = new LaunchSourceTag("WIDGET_4x1", 3, "widget4x1");
            WIDGET_4x2 = new LaunchSourceTag("WIDGET_4x2", 4, "widget4x2");
            BREAKING_ALERT = new LaunchSourceTag("BREAKING_ALERT", 5, "breaking news alert");
            RAINSNOW_ALERT = new LaunchSourceTag("RAINSNOW_ALERT", 6, "rain snow alert");
            POLLEN_ALERT = new LaunchSourceTag("POLLEN_ALERT", 7, "pollen alert");
            SEVERE_ALERT = new LaunchSourceTag("SEVERE_ALERT", 8, "severe alert");
            SEVERE_INTERNATIONAL_ALERT = new LaunchSourceTag("SEVERE_INTERNATIONAL_ALERT", 9, "international severe alert");
            INTERNATIONAL_REAL_TIME_RAIN_ALERT = new LaunchSourceTag("INTERNATIONAL_REAL_TIME_RAIN_ALERT", 10, "international real time rain alert");
            REAL_TIME_RAIN_ALERT = new LaunchSourceTag("REAL_TIME_RAIN_ALERT", 11, "real time rain alert");
            LIGHTNING_STRIKES_ALERT = new LaunchSourceTag("LIGHTNING_STRIKES_ALERT", 12, "lightning alert");
            ONGOING_TEMP_ALERT = new LaunchSourceTag("ONGOING_TEMP_ALERT", 13, "on going temp alert");
            FIRST_TIME = new LaunchSourceTag("FIRST_TIME", 14, "first time launch");
            DEEP_LINK = new LaunchSourceTag("DEEP_LINK", 15, "goog deep link");
            ONE_BOX = new LaunchSourceTag("ONE_BOX", 16, "goog onebox");
            NOW_CARD = new LaunchSourceTag("NOW_CARD", 17, "goog nowcard");
            BURDA = new LaunchSourceTag("BURDA", 18, "evar37");
            $VALUES = (new LaunchSourceTag[] {
                LAUNCHER_ICON, WIDGET_1x1, WIDGET_2x2, WIDGET_4x1, WIDGET_4x2, BREAKING_ALERT, RAINSNOW_ALERT, POLLEN_ALERT, SEVERE_ALERT, SEVERE_INTERNATIONAL_ALERT, 
                INTERNATIONAL_REAL_TIME_RAIN_ALERT, REAL_TIME_RAIN_ALERT, LIGHTNING_STRIKES_ALERT, ONGOING_TEMP_ALERT, FIRST_TIME, DEEP_LINK, ONE_BOX, NOW_CARD, BURDA
            });
        }

        private LaunchSourceTag(String s, int i, String s1)
        {
            super(s, i);
            tagName = s1;
        }
    }

    public static final class ScreenName extends Enum
        implements Attribute, Screen
    {

        private static final ScreenName $VALUES[];
        public static final ScreenName ABOUT_THIS_APP;
        public static final ScreenName AIRPORT_MODULE;
        public static final ScreenName ALLERGY_FORECAST_MODULE;
        public static final ScreenName ALLERGY_HERO_MODULE;
        public static final ScreenName ALLERGY_MAP_MODULE;
        public static final ScreenName ARTICLE_TYPE;
        public static final ScreenName BOAT_BEACH_MODULE;
        public static final ScreenName BREAKING_NEWS_ALERTS;
        public static final ScreenName BREAKING_NEWS_DETAILS;
        public static final ScreenName BREAKING_NOW_MODULE;
        public static final ScreenName CHAT_DETAILS;
        public static final ScreenName CHECKIN_DETAILS;
        public static final ScreenName CLICKED_ARTICLE_POSITION;
        public static final ScreenName COLD_FLU_HERO_MODULE;
        public static final ScreenName DDI_MODULE;
        public static final ScreenName DEEP_LINK;
        public static final ScreenName FLU_MODULE;
        public static final ScreenName FRONT_PAGE;
        public static final ScreenName HC_BULLETINS_MODULE_MODULE;
        public static final ScreenName HC_NEWS_ONE_MODULE;
        public static final ScreenName HC_NEWS_THREE_MODULE;
        public static final ScreenName HC_NEWS_TWO_MODULE;
        public static final ScreenName HC_NWS_ALERT_MODULE;
        public static final ScreenName HC_SAFETY_MODULE;
        public static final ScreenName HC_STORM_TRACK_MODULE;
        public static final ScreenName HC_TROPICAL_OUTLOOKS_MODULE;
        public static final ScreenName HC_VIDEO_MODULE;
        public static final ScreenName HEALTH_MODULE;
        public static final ScreenName HOURLY_DETAILS;
        public static final ScreenName HOURLY_MODULE;
        public static final ScreenName HURRICANE_CENTRAL_FEED;
        public static final ScreenName HURRICANE_CENTRAL_MAP;
        public static final ScreenName HURRICANE_CENTRAL_NEWS;
        public static final ScreenName LIGHTNING_STRIKES_ALERTS;
        public static final ScreenName MAIN_FEED;
        public static final ScreenName MANAGE_LOCATIONS;
        public static final ScreenName MAP_DETAILS;
        public static final ScreenName MAP_LAYERS;
        public static final ScreenName MAP_MODULE;
        public static final ScreenName MAP_OVERLAYS;
        public static final ScreenName MODULE;
        public static final ScreenName MOLD_SLIDER_MODULE;
        public static final ScreenName NEWS_DETAILS;
        public static final ScreenName NEWS_MODULE;
        public static final ScreenName ONGOING_TEMPERATURE_ALERTS;
        public static final ScreenName OUR_FAVORITE_THINGS_MODULE;
        public static final ScreenName PAUSED;
        public static final ScreenName POLLEN_ALERTS;
        public static final ScreenName PREVIOUS_PAGE;
        public static final ScreenName PUBLIC_ADVISORY;
        public static final ScreenName RAIN_SNOW_ALERTS;
        public static final ScreenName REAL_TIME_RAIN_ALERTS;
        public static final ScreenName RIGHT_NOW_MODULE;
        public static final ScreenName SETTINGS;
        public static final ScreenName SEVERE_WEATHER_DETAILS;
        public static final ScreenName SEVERE_WX_ALERTS;
        public static final ScreenName SHARE_ARTICLE;
        public static final ScreenName SHARE_ARTICLE_TYPE;
        public static final ScreenName SKI_MODULE;
        public static final ScreenName SLIDESHOW_PHOTOS_ASSET_ID;
        public static final ScreenName SLIDESHOW_PHOTOS_TITLE;
        public static final ScreenName SLIDESHOW_PHOTOS_VIEWED;
        public static final ScreenName SOCIAL_MODULE;
        public static final ScreenName TEN_DAY_DETAILS;
        public static final ScreenName TEN_DAY_MODULE;
        public static final ScreenName TROPICAL_DISCUSSION;
        public static final ScreenName TROPICAL_OUTLOOK;
        public static final ScreenName VIDEO_DETAILS;
        public static final ScreenName VIDEO_MODULE;
        public static final ScreenName WEATHER_ALERTS;
        public static final ScreenName WX_PROFILE_FORGOT_PASSWORD;
        public static final ScreenName WX_PROFILE_LOGIN;
        public static final ScreenName WX_PROFILE_SETTINGS;
        public static final ScreenName WX_PROFILE_SIGNUP;
        private final String tagName;

        public static ScreenName valueOf(String s)
        {
            return (ScreenName)Enum.valueOf(com/weather/commons/analytics/LocalyticsTags$ScreenName, s);
        }

        public static ScreenName[] values()
        {
            return (ScreenName[])$VALUES.clone();
        }

        public String getName()
        {
            return tagName;
        }

        static 
        {
            FRONT_PAGE = new ScreenName("FRONT_PAGE", 0, "front page");
            BREAKING_NOW_MODULE = new ScreenName("BREAKING_NOW_MODULE", 1, "breaking now");
            RIGHT_NOW_MODULE = new ScreenName("RIGHT_NOW_MODULE", 2, "right now mod");
            HOURLY_MODULE = new ScreenName("HOURLY_MODULE", 3, "hourly mod");
            VIDEO_MODULE = new ScreenName("VIDEO_MODULE", 4, "video mod");
            NEWS_MODULE = new ScreenName("NEWS_MODULE", 5, "wx news");
            MAP_MODULE = new ScreenName("MAP_MODULE", 6, "map mod");
            DDI_MODULE = new ScreenName("DDI_MODULE", 7, "ddi mod");
            TEN_DAY_MODULE = new ScreenName("TEN_DAY_MODULE", 8, "10 day mod");
            SOCIAL_MODULE = new ScreenName("SOCIAL_MODULE", 9, "social wx mod");
            AIRPORT_MODULE = new ScreenName("AIRPORT_MODULE", 10, "airport mod");
            FLU_MODULE = new ScreenName("FLU_MODULE", 11, "flu mod");
            HEALTH_MODULE = new ScreenName("HEALTH_MODULE", 12, "health mod");
            SKI_MODULE = new ScreenName("SKI_MODULE", 13, "ski mod");
            BOAT_BEACH_MODULE = new ScreenName("BOAT_BEACH_MODULE", 14, "boat beach mod");
            OUR_FAVORITE_THINGS_MODULE = new ScreenName("OUR_FAVORITE_THINGS_MODULE", 15, "oft module");
            HOURLY_DETAILS = new ScreenName("HOURLY_DETAILS", 16, "hourly details");
            TEN_DAY_DETAILS = new ScreenName("TEN_DAY_DETAILS", 17, "10 day details");
            MANAGE_LOCATIONS = new ScreenName("MANAGE_LOCATIONS", 18, "manage locations");
            SEVERE_WEATHER_DETAILS = new ScreenName("SEVERE_WEATHER_DETAILS", 19, "severe weather details");
            VIDEO_DETAILS = new ScreenName("VIDEO_DETAILS", 20, "video details");
            NEWS_DETAILS = new ScreenName("NEWS_DETAILS", 21, "news details");
            BREAKING_NEWS_DETAILS = new ScreenName("BREAKING_NEWS_DETAILS", 22, "breaking news details");
            MAP_DETAILS = new ScreenName("MAP_DETAILS", 23, "map details");
            CHAT_DETAILS = new ScreenName("CHAT_DETAILS", 24, "chat details");
            CHECKIN_DETAILS = new ScreenName("CHECKIN_DETAILS", 25, "social wx details");
            SETTINGS = new ScreenName("SETTINGS", 26, "general settings");
            WX_PROFILE_LOGIN = new ScreenName("WX_PROFILE_LOGIN", 27, "wx profile login");
            WX_PROFILE_FORGOT_PASSWORD = new ScreenName("WX_PROFILE_FORGOT_PASSWORD", 28, "wx profile login - forgot password");
            WX_PROFILE_SIGNUP = new ScreenName("WX_PROFILE_SIGNUP", 29, "wx profile sign up");
            WX_PROFILE_SETTINGS = new ScreenName("WX_PROFILE_SETTINGS", 30, "wx profile settings");
            WEATHER_ALERTS = new ScreenName("WEATHER_ALERTS", 31, "wx alerts");
            SEVERE_WX_ALERTS = new ScreenName("SEVERE_WX_ALERTS", 32, "severe wx alerts");
            POLLEN_ALERTS = new ScreenName("POLLEN_ALERTS", 33, "pollen alerts");
            BREAKING_NEWS_ALERTS = new ScreenName("BREAKING_NEWS_ALERTS", 34, "breaking news alerts");
            RAIN_SNOW_ALERTS = new ScreenName("RAIN_SNOW_ALERTS", 35, "rain snow alerts");
            REAL_TIME_RAIN_ALERTS = new ScreenName("REAL_TIME_RAIN_ALERTS", 36, "real time rain alerts");
            LIGHTNING_STRIKES_ALERTS = new ScreenName("LIGHTNING_STRIKES_ALERTS", 37, "lightning strikes alerts");
            ONGOING_TEMPERATURE_ALERTS = new ScreenName("ONGOING_TEMPERATURE_ALERTS", 38, "on going temp alerts");
            ABOUT_THIS_APP = new ScreenName("ABOUT_THIS_APP", 39, "about this app");
            MAP_OVERLAYS = new ScreenName("MAP_OVERLAYS", 40, "map overlays");
            MAP_LAYERS = new ScreenName("MAP_LAYERS", 41, "map layers");
            MAIN_FEED = new ScreenName("MAIN_FEED", 42, "main feed");
            MODULE = new ScreenName("MODULE", 43, "module");
            SHARE_ARTICLE = new ScreenName("SHARE_ARTICLE", 44, "shared article name");
            SHARE_ARTICLE_TYPE = new ScreenName("SHARE_ARTICLE_TYPE", 45, "shared content type");
            CLICKED_ARTICLE_POSITION = new ScreenName("CLICKED_ARTICLE_POSITION", 46, "content position");
            PREVIOUS_PAGE = new ScreenName("PREVIOUS_PAGE", 47, "previous page");
            ARTICLE_TYPE = new ScreenName("ARTICLE_TYPE", 48, "article type");
            SLIDESHOW_PHOTOS_VIEWED = new ScreenName("SLIDESHOW_PHOTOS_VIEWED", 49, "photos viewed");
            SLIDESHOW_PHOTOS_TITLE = new ScreenName("SLIDESHOW_PHOTOS_TITLE", 50, "photos viewed asset title");
            SLIDESHOW_PHOTOS_ASSET_ID = new ScreenName("SLIDESHOW_PHOTOS_ASSET_ID", 51, "photos viewed asset id");
            HURRICANE_CENTRAL_FEED = new ScreenName("HURRICANE_CENTRAL_FEED", 52, "hurricane central");
            HURRICANE_CENTRAL_MAP = new ScreenName("HURRICANE_CENTRAL_MAP", 53, "hurricane central map");
            HURRICANE_CENTRAL_NEWS = new ScreenName("HURRICANE_CENTRAL_NEWS", 54, "hurricane central news");
            TROPICAL_OUTLOOK = new ScreenName("TROPICAL_OUTLOOK", 55, "tropical outlooks");
            TROPICAL_DISCUSSION = new ScreenName("TROPICAL_DISCUSSION", 56, "tropical discussion");
            PUBLIC_ADVISORY = new ScreenName("PUBLIC_ADVISORY", 57, "public advisory");
            HC_STORM_TRACK_MODULE = new ScreenName("HC_STORM_TRACK_MODULE", 58, "hc storm track mod");
            HC_NWS_ALERT_MODULE = new ScreenName("HC_NWS_ALERT_MODULE", 59, "hc nws mod");
            HC_VIDEO_MODULE = new ScreenName("HC_VIDEO_MODULE", 60, "hc video mod");
            HC_NEWS_ONE_MODULE = new ScreenName("HC_NEWS_ONE_MODULE", 61, "hc first news mod");
            HC_NEWS_TWO_MODULE = new ScreenName("HC_NEWS_TWO_MODULE", 62, "hc second news mod");
            HC_NEWS_THREE_MODULE = new ScreenName("HC_NEWS_THREE_MODULE", 63, "hc third news mod");
            HC_BULLETINS_MODULE_MODULE = new ScreenName("HC_BULLETINS_MODULE_MODULE", 64, "hc bulletins mod");
            HC_TROPICAL_OUTLOOKS_MODULE = new ScreenName("HC_TROPICAL_OUTLOOKS_MODULE", 65, "hc tropical outlooks mod");
            HC_SAFETY_MODULE = new ScreenName("HC_SAFETY_MODULE", 66, "hc safety module");
            ALLERGY_HERO_MODULE = new ScreenName("ALLERGY_HERO_MODULE", 67, "allergy hero module");
            ALLERGY_FORECAST_MODULE = new ScreenName("ALLERGY_FORECAST_MODULE", 68, "allergy forecast module");
            ALLERGY_MAP_MODULE = new ScreenName("ALLERGY_MAP_MODULE", 69, "allergy map module");
            MOLD_SLIDER_MODULE = new ScreenName("MOLD_SLIDER_MODULE", 70, "mold slider module");
            COLD_FLU_HERO_MODULE = new ScreenName("COLD_FLU_HERO_MODULE", 71, "cold and flu hero module");
            DEEP_LINK = new ScreenName("DEEP_LINK", 72, "deep link");
            PAUSED = new ScreenName("PAUSED", 73, "paused");
            $VALUES = (new ScreenName[] {
                FRONT_PAGE, BREAKING_NOW_MODULE, RIGHT_NOW_MODULE, HOURLY_MODULE, VIDEO_MODULE, NEWS_MODULE, MAP_MODULE, DDI_MODULE, TEN_DAY_MODULE, SOCIAL_MODULE, 
                AIRPORT_MODULE, FLU_MODULE, HEALTH_MODULE, SKI_MODULE, BOAT_BEACH_MODULE, OUR_FAVORITE_THINGS_MODULE, HOURLY_DETAILS, TEN_DAY_DETAILS, MANAGE_LOCATIONS, SEVERE_WEATHER_DETAILS, 
                VIDEO_DETAILS, NEWS_DETAILS, BREAKING_NEWS_DETAILS, MAP_DETAILS, CHAT_DETAILS, CHECKIN_DETAILS, SETTINGS, WX_PROFILE_LOGIN, WX_PROFILE_FORGOT_PASSWORD, WX_PROFILE_SIGNUP, 
                WX_PROFILE_SETTINGS, WEATHER_ALERTS, SEVERE_WX_ALERTS, POLLEN_ALERTS, BREAKING_NEWS_ALERTS, RAIN_SNOW_ALERTS, REAL_TIME_RAIN_ALERTS, LIGHTNING_STRIKES_ALERTS, ONGOING_TEMPERATURE_ALERTS, ABOUT_THIS_APP, 
                MAP_OVERLAYS, MAP_LAYERS, MAIN_FEED, MODULE, SHARE_ARTICLE, SHARE_ARTICLE_TYPE, CLICKED_ARTICLE_POSITION, PREVIOUS_PAGE, ARTICLE_TYPE, SLIDESHOW_PHOTOS_VIEWED, 
                SLIDESHOW_PHOTOS_TITLE, SLIDESHOW_PHOTOS_ASSET_ID, HURRICANE_CENTRAL_FEED, HURRICANE_CENTRAL_MAP, HURRICANE_CENTRAL_NEWS, TROPICAL_OUTLOOK, TROPICAL_DISCUSSION, PUBLIC_ADVISORY, HC_STORM_TRACK_MODULE, HC_NWS_ALERT_MODULE, 
                HC_VIDEO_MODULE, HC_NEWS_ONE_MODULE, HC_NEWS_TWO_MODULE, HC_NEWS_THREE_MODULE, HC_BULLETINS_MODULE_MODULE, HC_TROPICAL_OUTLOOKS_MODULE, HC_SAFETY_MODULE, ALLERGY_HERO_MODULE, ALLERGY_FORECAST_MODULE, ALLERGY_MAP_MODULE, 
                MOLD_SLIDER_MODULE, COLD_FLU_HERO_MODULE, DEEP_LINK, PAUSED
            });
        }

        private ScreenName(String s, int i, String s1)
        {
            super(s, i);
            tagName = s1;
        }
    }

    public static final class Tags extends Enum
        implements Attribute
    {

        private static final Tags $VALUES[];
        public static final Tags INTERNATIONAL_REAL_TIME_RAIN_ALERT;
        public static final Tags LIGHTNING_STRIKES_ALERT;
        public static final Tags LOCATION;
        public static final Tags REAL_TIME_RAIN_ALERT;
        public static final Tags SETTINGS_FEEDBACK;
        private final String tagName;

        public static Tags valueOf(String s)
        {
            return (Tags)Enum.valueOf(com/weather/commons/analytics/LocalyticsTags$Tags, s);
        }

        public static Tags[] values()
        {
            return (Tags[])$VALUES.clone();
        }

        public String getName()
        {
            return tagName;
        }

        static 
        {
            SETTINGS_FEEDBACK = new Tags("SETTINGS_FEEDBACK", 0, "settings_feedback");
            REAL_TIME_RAIN_ALERT = new Tags("REAL_TIME_RAIN_ALERT", 1, "real time rain alert");
            INTERNATIONAL_REAL_TIME_RAIN_ALERT = new Tags("INTERNATIONAL_REAL_TIME_RAIN_ALERT", 2, "international real time rain alert");
            LIGHTNING_STRIKES_ALERT = new Tags("LIGHTNING_STRIKES_ALERT", 3, "lightning alert");
            LOCATION = new Tags("LOCATION", 4, "Location");
            $VALUES = (new Tags[] {
                SETTINGS_FEEDBACK, REAL_TIME_RAIN_ALERT, INTERNATIONAL_REAL_TIME_RAIN_ALERT, LIGHTNING_STRIKES_ALERT, LOCATION
            });
        }

        private Tags(String s, int i, String s1)
        {
            super(s, i);
            tagName = s1;
        }
    }


    private LocalyticsTags()
    {
    }
}
