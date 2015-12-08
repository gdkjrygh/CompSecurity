// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute, Screen, LocalyticsTags

public static final class tagName extends Enum
    implements Attribute, Screen
{

    private static final PAUSED $VALUES[];
    public static final PAUSED ABOUT_THIS_APP;
    public static final PAUSED AIRPORT_MODULE;
    public static final PAUSED ALLERGY_FORECAST_MODULE;
    public static final PAUSED ALLERGY_HERO_MODULE;
    public static final PAUSED ALLERGY_MAP_MODULE;
    public static final PAUSED ARTICLE_TYPE;
    public static final PAUSED BOAT_BEACH_MODULE;
    public static final PAUSED BREAKING_NEWS_ALERTS;
    public static final PAUSED BREAKING_NEWS_DETAILS;
    public static final PAUSED BREAKING_NOW_MODULE;
    public static final PAUSED CHAT_DETAILS;
    public static final PAUSED CHECKIN_DETAILS;
    public static final PAUSED CLICKED_ARTICLE_POSITION;
    public static final PAUSED COLD_FLU_HERO_MODULE;
    public static final PAUSED DDI_MODULE;
    public static final PAUSED DEEP_LINK;
    public static final PAUSED FLU_MODULE;
    public static final PAUSED FRONT_PAGE;
    public static final PAUSED HC_BULLETINS_MODULE_MODULE;
    public static final PAUSED HC_NEWS_ONE_MODULE;
    public static final PAUSED HC_NEWS_THREE_MODULE;
    public static final PAUSED HC_NEWS_TWO_MODULE;
    public static final PAUSED HC_NWS_ALERT_MODULE;
    public static final PAUSED HC_SAFETY_MODULE;
    public static final PAUSED HC_STORM_TRACK_MODULE;
    public static final PAUSED HC_TROPICAL_OUTLOOKS_MODULE;
    public static final PAUSED HC_VIDEO_MODULE;
    public static final PAUSED HEALTH_MODULE;
    public static final PAUSED HOURLY_DETAILS;
    public static final PAUSED HOURLY_MODULE;
    public static final PAUSED HURRICANE_CENTRAL_FEED;
    public static final PAUSED HURRICANE_CENTRAL_MAP;
    public static final PAUSED HURRICANE_CENTRAL_NEWS;
    public static final PAUSED LIGHTNING_STRIKES_ALERTS;
    public static final PAUSED MAIN_FEED;
    public static final PAUSED MANAGE_LOCATIONS;
    public static final PAUSED MAP_DETAILS;
    public static final PAUSED MAP_LAYERS;
    public static final PAUSED MAP_MODULE;
    public static final PAUSED MAP_OVERLAYS;
    public static final PAUSED MODULE;
    public static final PAUSED MOLD_SLIDER_MODULE;
    public static final PAUSED NEWS_DETAILS;
    public static final PAUSED NEWS_MODULE;
    public static final PAUSED ONGOING_TEMPERATURE_ALERTS;
    public static final PAUSED OUR_FAVORITE_THINGS_MODULE;
    public static final PAUSED PAUSED;
    public static final PAUSED POLLEN_ALERTS;
    public static final PAUSED PREVIOUS_PAGE;
    public static final PAUSED PUBLIC_ADVISORY;
    public static final PAUSED RAIN_SNOW_ALERTS;
    public static final PAUSED REAL_TIME_RAIN_ALERTS;
    public static final PAUSED RIGHT_NOW_MODULE;
    public static final PAUSED SETTINGS;
    public static final PAUSED SEVERE_WEATHER_DETAILS;
    public static final PAUSED SEVERE_WX_ALERTS;
    public static final PAUSED SHARE_ARTICLE;
    public static final PAUSED SHARE_ARTICLE_TYPE;
    public static final PAUSED SKI_MODULE;
    public static final PAUSED SLIDESHOW_PHOTOS_ASSET_ID;
    public static final PAUSED SLIDESHOW_PHOTOS_TITLE;
    public static final PAUSED SLIDESHOW_PHOTOS_VIEWED;
    public static final PAUSED SOCIAL_MODULE;
    public static final PAUSED TEN_DAY_DETAILS;
    public static final PAUSED TEN_DAY_MODULE;
    public static final PAUSED TROPICAL_DISCUSSION;
    public static final PAUSED TROPICAL_OUTLOOK;
    public static final PAUSED VIDEO_DETAILS;
    public static final PAUSED VIDEO_MODULE;
    public static final PAUSED WEATHER_ALERTS;
    public static final PAUSED WX_PROFILE_FORGOT_PASSWORD;
    public static final PAUSED WX_PROFILE_LOGIN;
    public static final PAUSED WX_PROFILE_SETTINGS;
    public static final PAUSED WX_PROFILE_SIGNUP;
    private final String tagName;

    public static tagName valueOf(String s)
    {
        return (tagName)Enum.valueOf(com/weather/commons/analytics/LocalyticsTags$ScreenName, s);
    }

    public static tagName[] values()
    {
        return (tagName[])$VALUES.clone();
    }

    public String getName()
    {
        return tagName;
    }

    static 
    {
        FRONT_PAGE = new <init>("FRONT_PAGE", 0, "front page");
        BREAKING_NOW_MODULE = new <init>("BREAKING_NOW_MODULE", 1, "breaking now");
        RIGHT_NOW_MODULE = new <init>("RIGHT_NOW_MODULE", 2, "right now mod");
        HOURLY_MODULE = new <init>("HOURLY_MODULE", 3, "hourly mod");
        VIDEO_MODULE = new <init>("VIDEO_MODULE", 4, "video mod");
        NEWS_MODULE = new <init>("NEWS_MODULE", 5, "wx news");
        MAP_MODULE = new <init>("MAP_MODULE", 6, "map mod");
        DDI_MODULE = new <init>("DDI_MODULE", 7, "ddi mod");
        TEN_DAY_MODULE = new <init>("TEN_DAY_MODULE", 8, "10 day mod");
        SOCIAL_MODULE = new <init>("SOCIAL_MODULE", 9, "social wx mod");
        AIRPORT_MODULE = new <init>("AIRPORT_MODULE", 10, "airport mod");
        FLU_MODULE = new <init>("FLU_MODULE", 11, "flu mod");
        HEALTH_MODULE = new <init>("HEALTH_MODULE", 12, "health mod");
        SKI_MODULE = new <init>("SKI_MODULE", 13, "ski mod");
        BOAT_BEACH_MODULE = new <init>("BOAT_BEACH_MODULE", 14, "boat beach mod");
        OUR_FAVORITE_THINGS_MODULE = new <init>("OUR_FAVORITE_THINGS_MODULE", 15, "oft module");
        HOURLY_DETAILS = new <init>("HOURLY_DETAILS", 16, "hourly details");
        TEN_DAY_DETAILS = new <init>("TEN_DAY_DETAILS", 17, "10 day details");
        MANAGE_LOCATIONS = new <init>("MANAGE_LOCATIONS", 18, "manage locations");
        SEVERE_WEATHER_DETAILS = new <init>("SEVERE_WEATHER_DETAILS", 19, "severe weather details");
        VIDEO_DETAILS = new <init>("VIDEO_DETAILS", 20, "video details");
        NEWS_DETAILS = new <init>("NEWS_DETAILS", 21, "news details");
        BREAKING_NEWS_DETAILS = new <init>("BREAKING_NEWS_DETAILS", 22, "breaking news details");
        MAP_DETAILS = new <init>("MAP_DETAILS", 23, "map details");
        CHAT_DETAILS = new <init>("CHAT_DETAILS", 24, "chat details");
        CHECKIN_DETAILS = new <init>("CHECKIN_DETAILS", 25, "social wx details");
        SETTINGS = new <init>("SETTINGS", 26, "general settings");
        WX_PROFILE_LOGIN = new <init>("WX_PROFILE_LOGIN", 27, "wx profile login");
        WX_PROFILE_FORGOT_PASSWORD = new <init>("WX_PROFILE_FORGOT_PASSWORD", 28, "wx profile login - forgot password");
        WX_PROFILE_SIGNUP = new <init>("WX_PROFILE_SIGNUP", 29, "wx profile sign up");
        WX_PROFILE_SETTINGS = new <init>("WX_PROFILE_SETTINGS", 30, "wx profile settings");
        WEATHER_ALERTS = new <init>("WEATHER_ALERTS", 31, "wx alerts");
        SEVERE_WX_ALERTS = new <init>("SEVERE_WX_ALERTS", 32, "severe wx alerts");
        POLLEN_ALERTS = new <init>("POLLEN_ALERTS", 33, "pollen alerts");
        BREAKING_NEWS_ALERTS = new <init>("BREAKING_NEWS_ALERTS", 34, "breaking news alerts");
        RAIN_SNOW_ALERTS = new <init>("RAIN_SNOW_ALERTS", 35, "rain snow alerts");
        REAL_TIME_RAIN_ALERTS = new <init>("REAL_TIME_RAIN_ALERTS", 36, "real time rain alerts");
        LIGHTNING_STRIKES_ALERTS = new <init>("LIGHTNING_STRIKES_ALERTS", 37, "lightning strikes alerts");
        ONGOING_TEMPERATURE_ALERTS = new <init>("ONGOING_TEMPERATURE_ALERTS", 38, "on going temp alerts");
        ABOUT_THIS_APP = new <init>("ABOUT_THIS_APP", 39, "about this app");
        MAP_OVERLAYS = new <init>("MAP_OVERLAYS", 40, "map overlays");
        MAP_LAYERS = new <init>("MAP_LAYERS", 41, "map layers");
        MAIN_FEED = new <init>("MAIN_FEED", 42, "main feed");
        MODULE = new <init>("MODULE", 43, "module");
        SHARE_ARTICLE = new <init>("SHARE_ARTICLE", 44, "shared article name");
        SHARE_ARTICLE_TYPE = new <init>("SHARE_ARTICLE_TYPE", 45, "shared content type");
        CLICKED_ARTICLE_POSITION = new <init>("CLICKED_ARTICLE_POSITION", 46, "content position");
        PREVIOUS_PAGE = new <init>("PREVIOUS_PAGE", 47, "previous page");
        ARTICLE_TYPE = new <init>("ARTICLE_TYPE", 48, "article type");
        SLIDESHOW_PHOTOS_VIEWED = new <init>("SLIDESHOW_PHOTOS_VIEWED", 49, "photos viewed");
        SLIDESHOW_PHOTOS_TITLE = new <init>("SLIDESHOW_PHOTOS_TITLE", 50, "photos viewed asset title");
        SLIDESHOW_PHOTOS_ASSET_ID = new <init>("SLIDESHOW_PHOTOS_ASSET_ID", 51, "photos viewed asset id");
        HURRICANE_CENTRAL_FEED = new <init>("HURRICANE_CENTRAL_FEED", 52, "hurricane central");
        HURRICANE_CENTRAL_MAP = new <init>("HURRICANE_CENTRAL_MAP", 53, "hurricane central map");
        HURRICANE_CENTRAL_NEWS = new <init>("HURRICANE_CENTRAL_NEWS", 54, "hurricane central news");
        TROPICAL_OUTLOOK = new <init>("TROPICAL_OUTLOOK", 55, "tropical outlooks");
        TROPICAL_DISCUSSION = new <init>("TROPICAL_DISCUSSION", 56, "tropical discussion");
        PUBLIC_ADVISORY = new <init>("PUBLIC_ADVISORY", 57, "public advisory");
        HC_STORM_TRACK_MODULE = new <init>("HC_STORM_TRACK_MODULE", 58, "hc storm track mod");
        HC_NWS_ALERT_MODULE = new <init>("HC_NWS_ALERT_MODULE", 59, "hc nws mod");
        HC_VIDEO_MODULE = new <init>("HC_VIDEO_MODULE", 60, "hc video mod");
        HC_NEWS_ONE_MODULE = new <init>("HC_NEWS_ONE_MODULE", 61, "hc first news mod");
        HC_NEWS_TWO_MODULE = new <init>("HC_NEWS_TWO_MODULE", 62, "hc second news mod");
        HC_NEWS_THREE_MODULE = new <init>("HC_NEWS_THREE_MODULE", 63, "hc third news mod");
        HC_BULLETINS_MODULE_MODULE = new <init>("HC_BULLETINS_MODULE_MODULE", 64, "hc bulletins mod");
        HC_TROPICAL_OUTLOOKS_MODULE = new <init>("HC_TROPICAL_OUTLOOKS_MODULE", 65, "hc tropical outlooks mod");
        HC_SAFETY_MODULE = new <init>("HC_SAFETY_MODULE", 66, "hc safety module");
        ALLERGY_HERO_MODULE = new <init>("ALLERGY_HERO_MODULE", 67, "allergy hero module");
        ALLERGY_FORECAST_MODULE = new <init>("ALLERGY_FORECAST_MODULE", 68, "allergy forecast module");
        ALLERGY_MAP_MODULE = new <init>("ALLERGY_MAP_MODULE", 69, "allergy map module");
        MOLD_SLIDER_MODULE = new <init>("MOLD_SLIDER_MODULE", 70, "mold slider module");
        COLD_FLU_HERO_MODULE = new <init>("COLD_FLU_HERO_MODULE", 71, "cold and flu hero module");
        DEEP_LINK = new <init>("DEEP_LINK", 72, "deep link");
        PAUSED = new <init>("PAUSED", 73, "paused");
        $VALUES = (new .VALUES[] {
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

    private (String s, int i, String s1)
    {
        super(s, i);
        tagName = s1;
    }
}
