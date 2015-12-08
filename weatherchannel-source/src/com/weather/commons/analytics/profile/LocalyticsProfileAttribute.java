// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.profile;


public final class LocalyticsProfileAttribute extends Enum
{

    private static final LocalyticsProfileAttribute $VALUES[];
    public static final LocalyticsProfileAttribute AGE_GROUP;
    public static final LocalyticsProfileAttribute BREAKING_NEWS_ALERTS_ENABLED_STATE;
    public static final LocalyticsProfileAttribute DAILY_RAIN_ALERTS_ENABLED_STATE;
    public static final LocalyticsProfileAttribute DAILY_RAIN_ALERT_COUNT;
    public static final LocalyticsProfileAttribute FOLLOW_ME_CITY;
    public static final LocalyticsProfileAttribute FOLLOW_ME_COUNTRY_CODE;
    public static final LocalyticsProfileAttribute FOLLOW_ME_ENABLED_STATE;
    public static final LocalyticsProfileAttribute FOLLOW_ME_LOCATION;
    public static final LocalyticsProfileAttribute FOLLOW_ME_STATE;
    public static final LocalyticsProfileAttribute GENDER;
    public static final LocalyticsProfileAttribute LIGHTENING_STRIKE_ALERTS_ENABLED_STATE;
    public static final LocalyticsProfileAttribute LOGGED_IN;
    public static final LocalyticsProfileAttribute M_POINTS_ENABLED_STATE;
    public static final LocalyticsProfileAttribute NEWS_ARTICLES_READ_COUNT;
    public static final LocalyticsProfileAttribute POLLEN_ALERTS_ENABLED_STATE;
    public static final LocalyticsProfileAttribute POLLEN_ALERT_COUNT;
    public static final LocalyticsProfileAttribute REAL_TIME_RAIN_ALERTS_ENABLED_STATE;
    public static final LocalyticsProfileAttribute SAVED_LOCATIONS_COUNT;
    public static final LocalyticsProfileAttribute SAVED_LOCATIONS_LIST;
    public static final LocalyticsProfileAttribute SEVERE_ALERTS_ENABLED_STATE;
    public static final LocalyticsProfileAttribute SEVERE_WEATHER_ALERT_COUNT;
    public static final LocalyticsProfileAttribute VIDEOS_WATCHED_COUNT;
    private String attributeName;

    private LocalyticsProfileAttribute(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static LocalyticsProfileAttribute valueOf(String s)
    {
        return (LocalyticsProfileAttribute)Enum.valueOf(com/weather/commons/analytics/profile/LocalyticsProfileAttribute, s);
    }

    public static LocalyticsProfileAttribute[] values()
    {
        return (LocalyticsProfileAttribute[])$VALUES.clone();
    }

    public String getAttributeName()
    {
        return attributeName;
    }

    static 
    {
        SAVED_LOCATIONS_LIST = new LocalyticsProfileAttribute("SAVED_LOCATIONS_LIST", 0, "Saved Locations");
        SAVED_LOCATIONS_COUNT = new LocalyticsProfileAttribute("SAVED_LOCATIONS_COUNT", 1, "Saved Location Count");
        LOGGED_IN = new LocalyticsProfileAttribute("LOGGED_IN", 2, "Logged In");
        GENDER = new LocalyticsProfileAttribute("GENDER", 3, "Gender");
        AGE_GROUP = new LocalyticsProfileAttribute("AGE_GROUP", 4, "Age Group");
        POLLEN_ALERT_COUNT = new LocalyticsProfileAttribute("POLLEN_ALERT_COUNT", 5, "Pollen Alert Count");
        SEVERE_WEATHER_ALERT_COUNT = new LocalyticsProfileAttribute("SEVERE_WEATHER_ALERT_COUNT", 6, "Severe Weather Alert Count");
        DAILY_RAIN_ALERT_COUNT = new LocalyticsProfileAttribute("DAILY_RAIN_ALERT_COUNT", 7, "Daily Rain Alert Count");
        VIDEOS_WATCHED_COUNT = new LocalyticsProfileAttribute("VIDEOS_WATCHED_COUNT", 8, "Videos Watched");
        NEWS_ARTICLES_READ_COUNT = new LocalyticsProfileAttribute("NEWS_ARTICLES_READ_COUNT", 9, "News Articles Read");
        SEVERE_ALERTS_ENABLED_STATE = new LocalyticsProfileAttribute("SEVERE_ALERTS_ENABLED_STATE", 10, "Severe Alerts");
        POLLEN_ALERTS_ENABLED_STATE = new LocalyticsProfileAttribute("POLLEN_ALERTS_ENABLED_STATE", 11, "Pollen Alerts");
        DAILY_RAIN_ALERTS_ENABLED_STATE = new LocalyticsProfileAttribute("DAILY_RAIN_ALERTS_ENABLED_STATE", 12, "Daily Rain");
        BREAKING_NEWS_ALERTS_ENABLED_STATE = new LocalyticsProfileAttribute("BREAKING_NEWS_ALERTS_ENABLED_STATE", 13, "Breaking News");
        REAL_TIME_RAIN_ALERTS_ENABLED_STATE = new LocalyticsProfileAttribute("REAL_TIME_RAIN_ALERTS_ENABLED_STATE", 14, "Real Time Rain");
        LIGHTENING_STRIKE_ALERTS_ENABLED_STATE = new LocalyticsProfileAttribute("LIGHTENING_STRIKE_ALERTS_ENABLED_STATE", 15, "Lightening");
        FOLLOW_ME_LOCATION = new LocalyticsProfileAttribute("FOLLOW_ME_LOCATION", 16, "Current Location");
        FOLLOW_ME_CITY = new LocalyticsProfileAttribute("FOLLOW_ME_CITY", 17, "City");
        FOLLOW_ME_STATE = new LocalyticsProfileAttribute("FOLLOW_ME_STATE", 18, "State");
        FOLLOW_ME_COUNTRY_CODE = new LocalyticsProfileAttribute("FOLLOW_ME_COUNTRY_CODE", 19, "Country Code");
        FOLLOW_ME_ENABLED_STATE = new LocalyticsProfileAttribute("FOLLOW_ME_ENABLED_STATE", 20, "Follow Me Forecast");
        M_POINTS_ENABLED_STATE = new LocalyticsProfileAttribute("M_POINTS_ENABLED_STATE", 21, "Mpoints");
        $VALUES = (new LocalyticsProfileAttribute[] {
            SAVED_LOCATIONS_LIST, SAVED_LOCATIONS_COUNT, LOGGED_IN, GENDER, AGE_GROUP, POLLEN_ALERT_COUNT, SEVERE_WEATHER_ALERT_COUNT, DAILY_RAIN_ALERT_COUNT, VIDEOS_WATCHED_COUNT, NEWS_ARTICLES_READ_COUNT, 
            SEVERE_ALERTS_ENABLED_STATE, POLLEN_ALERTS_ENABLED_STATE, DAILY_RAIN_ALERTS_ENABLED_STATE, BREAKING_NEWS_ALERTS_ENABLED_STATE, REAL_TIME_RAIN_ALERTS_ENABLED_STATE, LIGHTENING_STRIKE_ALERTS_ENABLED_STATE, FOLLOW_ME_LOCATION, FOLLOW_ME_CITY, FOLLOW_ME_STATE, FOLLOW_ME_COUNTRY_CODE, 
            FOLLOW_ME_ENABLED_STATE, M_POINTS_ENABLED_STATE
        });
    }
}
