// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute, Event

public final class LocalyticsEvent extends Enum
    implements Attribute, Event
{

    private static final LocalyticsEvent $VALUES[];
    public static final LocalyticsEvent ALERT_SETTINGS;
    public static final LocalyticsEvent ALLERGY_FEED_SUMMARY;
    public static final LocalyticsEvent APP_FEED_SUMMARY;
    public static final LocalyticsEvent APP_FEED_WEATHER_SUMMARY;
    public static final LocalyticsEvent BREAKING_NOW_CONTENT;
    public static final LocalyticsEvent COLD_FLU_FEED_SUMMARY;
    public static final LocalyticsEvent DEEP_LINK_URL;
    public static final LocalyticsEvent FEED_RESUMED;
    public static final LocalyticsEvent GENERAL_SETTINGS_SUMMARY;
    public static final LocalyticsEvent HC_FEED_SUMMARY;
    public static final LocalyticsEvent HC_MAP;
    public static final LocalyticsEvent HC_NWS_ALERTS;
    public static final LocalyticsEvent HC_PUBLIC_ADVISORY;
    public static final LocalyticsEvent HC_RED_CROSS;
    public static final LocalyticsEvent HC_SAFETY;
    public static final LocalyticsEvent HC_STORM_SWIPE;
    public static final LocalyticsEvent HC_TROPICAL_DISCUSSION;
    public static final LocalyticsEvent HC_TROPICAL_OUTLOOK;
    public static final LocalyticsEvent HURRICANE_CENTRAL_SUMMARY;
    public static final LocalyticsEvent LANGUAGE;
    public static final LocalyticsEvent LAUNCH_PARTNER;
    public static final LocalyticsEvent LAUNCH_SOURCE;
    public static final LocalyticsEvent ON_GOING_TEMP_NOTIFICATION;
    public static final LocalyticsEvent PERFORMANCE_METRICS;
    public static final LocalyticsEvent PHOTO_GALLERY;
    public static final LocalyticsEvent PRELOAD_PARTNER;
    public static final LocalyticsEvent REGION;
    public static final LocalyticsEvent RIGHTNOW_VIDEO;
    public static final LocalyticsEvent SCREEN_VIEWED;
    public static final LocalyticsEvent SESSION_SUMMARY;
    public static final LocalyticsEvent SHARE;
    public static final LocalyticsEvent SOCIAL_WEATHER_REPORTED;
    public static final LocalyticsEvent UPS_ACCOUNT_DELETED;
    public static final LocalyticsEvent UPS_LOGIN_STARTED;
    public static final LocalyticsEvent UPS_LOGIN_SUMMARY;
    public static final LocalyticsEvent UPS_LOGOUT;
    public static final LocalyticsEvent UPS_SIGNUP_COMPLETE;
    public static final LocalyticsEvent UPS_SIGNUP_STARTED;
    public static final LocalyticsEvent UPS_SIGNUP_SUMMARY;
    public static final LocalyticsEvent VIDEO_AD_COMPLETE;
    public static final LocalyticsEvent VIDEO_AD_START;
    public static final LocalyticsEvent VIDEO_ATTEMPT;
    public static final LocalyticsEvent VIDEO_COMPLETE;
    public static final LocalyticsEvent VIDEO_DETAILS;
    public static final LocalyticsEvent VIDEO_START;
    public static final LocalyticsEvent VIDEO_STREAM_FAILURE;
    public static final LocalyticsEvent VIDEO_SUMMARY;
    private final String eventName;

    private LocalyticsEvent(String s, int i, String s1)
    {
        super(s, i);
        eventName = s1;
    }

    public static LocalyticsEvent valueOf(String s)
    {
        return (LocalyticsEvent)Enum.valueOf(com/weather/commons/analytics/LocalyticsEvent, s);
    }

    public static LocalyticsEvent[] values()
    {
        return (LocalyticsEvent[])$VALUES.clone();
    }

    public String getName()
    {
        return eventName;
    }

    static 
    {
        LAUNCH_SOURCE = new LocalyticsEvent("LAUNCH_SOURCE", 0, "source");
        SCREEN_VIEWED = new LocalyticsEvent("SCREEN_VIEWED", 1, "first screen viewed");
        DEEP_LINK_URL = new LocalyticsEvent("DEEP_LINK_URL", 2, "deeplink URL");
        VIDEO_DETAILS = new LocalyticsEvent("VIDEO_DETAILS", 3, "video details");
        VIDEO_SUMMARY = new LocalyticsEvent("VIDEO_SUMMARY", 4, "video summary");
        VIDEO_ATTEMPT = new LocalyticsEvent("VIDEO_ATTEMPT", 5, "video attempt");
        VIDEO_START = new LocalyticsEvent("VIDEO_START", 6, "video start");
        VIDEO_COMPLETE = new LocalyticsEvent("VIDEO_COMPLETE", 7, "video complete");
        VIDEO_AD_START = new LocalyticsEvent("VIDEO_AD_START", 8, "video ad start");
        VIDEO_AD_COMPLETE = new LocalyticsEvent("VIDEO_AD_COMPLETE", 9, "video ad complete");
        VIDEO_STREAM_FAILURE = new LocalyticsEvent("VIDEO_STREAM_FAILURE", 10, "video stream failure");
        RIGHTNOW_VIDEO = new LocalyticsEvent("RIGHTNOW_VIDEO", 11, "right now video");
        PRELOAD_PARTNER = new LocalyticsEvent("PRELOAD_PARTNER", 12, "preload partner");
        LAUNCH_PARTNER = new LocalyticsEvent("LAUNCH_PARTNER", 13, "launch partner");
        ALERT_SETTINGS = new LocalyticsEvent("ALERT_SETTINGS", 14, "alert settings");
        UPS_SIGNUP_STARTED = new LocalyticsEvent("UPS_SIGNUP_STARTED", 15, "wx profile sign up started");
        UPS_SIGNUP_COMPLETE = new LocalyticsEvent("UPS_SIGNUP_COMPLETE", 16, "wx profile sign up complete");
        UPS_SIGNUP_SUMMARY = new LocalyticsEvent("UPS_SIGNUP_SUMMARY", 17, "wx profile sign up summary");
        UPS_ACCOUNT_DELETED = new LocalyticsEvent("UPS_ACCOUNT_DELETED", 18, "account deleted");
        APP_FEED_SUMMARY = new LocalyticsEvent("APP_FEED_SUMMARY", 19, "app feed summary");
        APP_FEED_WEATHER_SUMMARY = new LocalyticsEvent("APP_FEED_WEATHER_SUMMARY", 20, "app feed weather summary");
        SESSION_SUMMARY = new LocalyticsEvent("SESSION_SUMMARY", 21, "session summary");
        FEED_RESUMED = new LocalyticsEvent("FEED_RESUMED", 22, "feed resumed");
        PHOTO_GALLERY = new LocalyticsEvent("PHOTO_GALLERY", 23, "photo gallery");
        BREAKING_NOW_CONTENT = new LocalyticsEvent("BREAKING_NOW_CONTENT", 24, "breaking now content");
        SHARE = new LocalyticsEvent("SHARE", 25, "share");
        UPS_LOGIN_STARTED = new LocalyticsEvent("UPS_LOGIN_STARTED", 26, "LogInStarted");
        UPS_LOGIN_SUMMARY = new LocalyticsEvent("UPS_LOGIN_SUMMARY", 27, "LogInSummary");
        UPS_LOGOUT = new LocalyticsEvent("UPS_LOGOUT", 28, "LogOut");
        GENERAL_SETTINGS_SUMMARY = new LocalyticsEvent("GENERAL_SETTINGS_SUMMARY", 29, "General Settings");
        ON_GOING_TEMP_NOTIFICATION = new LocalyticsEvent("ON_GOING_TEMP_NOTIFICATION", 30, "OnGoingTemp");
        HURRICANE_CENTRAL_SUMMARY = new LocalyticsEvent("HURRICANE_CENTRAL_SUMMARY", 31, "Hurricane Central Summary");
        PERFORMANCE_METRICS = new LocalyticsEvent("PERFORMANCE_METRICS", 32, "Performance Metrics");
        HC_NWS_ALERTS = new LocalyticsEvent("HC_NWS_ALERTS", 33, "HC NWS Alerts Viewed");
        HC_PUBLIC_ADVISORY = new LocalyticsEvent("HC_PUBLIC_ADVISORY", 34, "HC Public Advisory Viewed");
        HC_TROPICAL_DISCUSSION = new LocalyticsEvent("HC_TROPICAL_DISCUSSION", 35, "Tropical Discussion Viewed");
        HC_TROPICAL_OUTLOOK = new LocalyticsEvent("HC_TROPICAL_OUTLOOK", 36, "HC Outlook Viewed");
        HC_RED_CROSS = new LocalyticsEvent("HC_RED_CROSS", 37, "HC Red Cross Viewed");
        HC_SAFETY = new LocalyticsEvent("HC_SAFETY", 38, "HC Safety & Preparedness Viewed");
        HC_MAP = new LocalyticsEvent("HC_MAP", 39, "HC Map Viewed");
        HC_STORM_SWIPE = new LocalyticsEvent("HC_STORM_SWIPE", 40, "Storm Swipe");
        HC_FEED_SUMMARY = new LocalyticsEvent("HC_FEED_SUMMARY", 41, "HC Feed Summary");
        ALLERGY_FEED_SUMMARY = new LocalyticsEvent("ALLERGY_FEED_SUMMARY", 42, "Allergy Feed Summary");
        COLD_FLU_FEED_SUMMARY = new LocalyticsEvent("COLD_FLU_FEED_SUMMARY", 43, "Cold Flu Feed Summary");
        LANGUAGE = new LocalyticsEvent("LANGUAGE", 44, "language");
        REGION = new LocalyticsEvent("REGION", 45, "region");
        SOCIAL_WEATHER_REPORTED = new LocalyticsEvent("SOCIAL_WEATHER_REPORTED", 46, "Social Weather Reported");
        $VALUES = (new LocalyticsEvent[] {
            LAUNCH_SOURCE, SCREEN_VIEWED, DEEP_LINK_URL, VIDEO_DETAILS, VIDEO_SUMMARY, VIDEO_ATTEMPT, VIDEO_START, VIDEO_COMPLETE, VIDEO_AD_START, VIDEO_AD_COMPLETE, 
            VIDEO_STREAM_FAILURE, RIGHTNOW_VIDEO, PRELOAD_PARTNER, LAUNCH_PARTNER, ALERT_SETTINGS, UPS_SIGNUP_STARTED, UPS_SIGNUP_COMPLETE, UPS_SIGNUP_SUMMARY, UPS_ACCOUNT_DELETED, APP_FEED_SUMMARY, 
            APP_FEED_WEATHER_SUMMARY, SESSION_SUMMARY, FEED_RESUMED, PHOTO_GALLERY, BREAKING_NOW_CONTENT, SHARE, UPS_LOGIN_STARTED, UPS_LOGIN_SUMMARY, UPS_LOGOUT, GENERAL_SETTINGS_SUMMARY, 
            ON_GOING_TEMP_NOTIFICATION, HURRICANE_CENTRAL_SUMMARY, PERFORMANCE_METRICS, HC_NWS_ALERTS, HC_PUBLIC_ADVISORY, HC_TROPICAL_DISCUSSION, HC_TROPICAL_OUTLOOK, HC_RED_CROSS, HC_SAFETY, HC_MAP, 
            HC_STORM_SWIPE, HC_FEED_SUMMARY, ALLERGY_FEED_SUMMARY, COLD_FLU_FEED_SUMMARY, LANGUAGE, REGION, SOCIAL_WEATHER_REPORTED
        });
    }
}
