// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsMainFeedTag extends Enum
    implements Attribute
{

    private static final LocalyticsMainFeedTag $VALUES[];
    public static final LocalyticsMainFeedTag ADS_CLICKED;
    public static final LocalyticsMainFeedTag ADS_VIEWED;
    public static final LocalyticsMainFeedTag CURRENT_WEATHER_TYPE;
    public static final LocalyticsMainFeedTag FOLLOW_ME_CITY;
    public static final LocalyticsMainFeedTag FOLLOW_ME_CONDITION_TOMORROW;
    public static final LocalyticsMainFeedTag FOLLOW_ME_COUNTRY_CODE;
    public static final LocalyticsMainFeedTag FOLLOW_ME_CURRENT_CONDTION;
    public static final LocalyticsMainFeedTag FOLLOW_ME_LOCATION;
    public static final LocalyticsMainFeedTag FOLLOW_ME_PRECIPITATION_TOMORROW;
    public static final LocalyticsMainFeedTag FOLLOW_ME_STATE;
    public static final LocalyticsMainFeedTag FOLLOW_ME_THREAT_LEVEL;
    public static final LocalyticsMainFeedTag FOLLOW_ME_ZIP_CODE;
    public static final LocalyticsMainFeedTag LOCATION_IS_CURRENT;
    public static final LocalyticsMainFeedTag LOCATION_NAME;
    public static final LocalyticsMainFeedTag LOCATION_TYPE;
    public static final LocalyticsMainFeedTag NAVIGATION_METHOD;
    public static final LocalyticsMainFeedTag PREVIOUS_SCREEN;
    public static final LocalyticsMainFeedTag SCROLLED;
    public static final LocalyticsMainFeedTag SEVERE_WEATHER_WARNING;
    public static final LocalyticsMainFeedTag TIME_SPENT;
    private final String attributeName;

    private LocalyticsMainFeedTag(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static LocalyticsMainFeedTag valueOf(String s)
    {
        return (LocalyticsMainFeedTag)Enum.valueOf(com/weather/commons/analytics/feed/LocalyticsMainFeedTag, s);
    }

    public static LocalyticsMainFeedTag[] values()
    {
        return (LocalyticsMainFeedTag[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        CURRENT_WEATHER_TYPE = new LocalyticsMainFeedTag("CURRENT_WEATHER_TYPE", 0, "current weather type");
        SEVERE_WEATHER_WARNING = new LocalyticsMainFeedTag("SEVERE_WEATHER_WARNING", 1, "severe weather warning");
        PREVIOUS_SCREEN = new LocalyticsMainFeedTag("PREVIOUS_SCREEN", 2, "previous screen");
        NAVIGATION_METHOD = new LocalyticsMainFeedTag("NAVIGATION_METHOD", 3, "navigation method");
        TIME_SPENT = new LocalyticsMainFeedTag("TIME_SPENT", 4, "time spent");
        ADS_VIEWED = new LocalyticsMainFeedTag("ADS_VIEWED", 5, "ads view");
        ADS_CLICKED = new LocalyticsMainFeedTag("ADS_CLICKED", 6, "ads touched");
        SCROLLED = new LocalyticsMainFeedTag("SCROLLED", 7, "scrolled");
        LOCATION_TYPE = new LocalyticsMainFeedTag("LOCATION_TYPE", 8, "location type");
        LOCATION_NAME = new LocalyticsMainFeedTag("LOCATION_NAME", 9, "location name");
        LOCATION_IS_CURRENT = new LocalyticsMainFeedTag("LOCATION_IS_CURRENT", 10, "is current location");
        FOLLOW_ME_ZIP_CODE = new LocalyticsMainFeedTag("FOLLOW_ME_ZIP_CODE", 11, "zip code");
        FOLLOW_ME_STATE = new LocalyticsMainFeedTag("FOLLOW_ME_STATE", 12, "state");
        FOLLOW_ME_LOCATION = new LocalyticsMainFeedTag("FOLLOW_ME_LOCATION", 13, "location");
        FOLLOW_ME_CITY = new LocalyticsMainFeedTag("FOLLOW_ME_CITY", 14, "city");
        FOLLOW_ME_COUNTRY_CODE = new LocalyticsMainFeedTag("FOLLOW_ME_COUNTRY_CODE", 15, "country code");
        FOLLOW_ME_CURRENT_CONDTION = new LocalyticsMainFeedTag("FOLLOW_ME_CURRENT_CONDTION", 16, "weather condition current");
        FOLLOW_ME_CONDITION_TOMORROW = new LocalyticsMainFeedTag("FOLLOW_ME_CONDITION_TOMORROW", 17, "weather condition tomorrow");
        FOLLOW_ME_PRECIPITATION_TOMORROW = new LocalyticsMainFeedTag("FOLLOW_ME_PRECIPITATION_TOMORROW", 18, "chance of precipitation tomorrow");
        FOLLOW_ME_THREAT_LEVEL = new LocalyticsMainFeedTag("FOLLOW_ME_THREAT_LEVEL", 19, "NWS threat level");
        $VALUES = (new LocalyticsMainFeedTag[] {
            CURRENT_WEATHER_TYPE, SEVERE_WEATHER_WARNING, PREVIOUS_SCREEN, NAVIGATION_METHOD, TIME_SPENT, ADS_VIEWED, ADS_CLICKED, SCROLLED, LOCATION_TYPE, LOCATION_NAME, 
            LOCATION_IS_CURRENT, FOLLOW_ME_ZIP_CODE, FOLLOW_ME_STATE, FOLLOW_ME_LOCATION, FOLLOW_ME_CITY, FOLLOW_ME_COUNTRY_CODE, FOLLOW_ME_CURRENT_CONDTION, FOLLOW_ME_CONDITION_TOMORROW, FOLLOW_ME_PRECIPITATION_TOMORROW, FOLLOW_ME_THREAT_LEVEL
        });
    }
}
