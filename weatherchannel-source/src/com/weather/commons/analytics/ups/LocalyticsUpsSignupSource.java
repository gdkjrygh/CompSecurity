// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.ups;


public final class LocalyticsUpsSignupSource extends Enum
{

    private static final LocalyticsUpsSignupSource $VALUES[];
    public static final LocalyticsUpsSignupSource BREAKING_NEWS_ALERT;
    public static final LocalyticsUpsSignupSource DAILY_PRECIP_ALERT;
    public static final LocalyticsUpsSignupSource LIGHTNING_STRIKES_ALERT;
    public static final LocalyticsUpsSignupSource LOCATION_SEARCH;
    public static final LocalyticsUpsSignupSource MARKETING;
    public static final LocalyticsUpsSignupSource POLLEN_ALERT;
    public static final LocalyticsUpsSignupSource REAL_TIME_RAIN_ALERT;
    public static final LocalyticsUpsSignupSource SETTINGS;
    public static final LocalyticsUpsSignupSource SEVERE_ALERT;
    public static final LocalyticsUpsSignupSource SIGNIFICANT_WEATHER_FORECAST_ALERT;
    private final String attributeValue;

    private LocalyticsUpsSignupSource(String s, int i, String s1)
    {
        super(s, i);
        attributeValue = s1;
    }

    public static LocalyticsUpsSignupSource valueOf(String s)
    {
        return (LocalyticsUpsSignupSource)Enum.valueOf(com/weather/commons/analytics/ups/LocalyticsUpsSignupSource, s);
    }

    public static LocalyticsUpsSignupSource[] values()
    {
        return (LocalyticsUpsSignupSource[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return attributeValue;
    }

    static 
    {
        LOCATION_SEARCH = new LocalyticsUpsSignupSource("LOCATION_SEARCH", 0, "location search");
        DAILY_PRECIP_ALERT = new LocalyticsUpsSignupSource("DAILY_PRECIP_ALERT", 1, "daily rain snow forecast alert settings");
        SEVERE_ALERT = new LocalyticsUpsSignupSource("SEVERE_ALERT", 2, "severe alert settings");
        BREAKING_NEWS_ALERT = new LocalyticsUpsSignupSource("BREAKING_NEWS_ALERT", 3, "breaking news alert settings");
        POLLEN_ALERT = new LocalyticsUpsSignupSource("POLLEN_ALERT", 4, "pollen alert settings");
        REAL_TIME_RAIN_ALERT = new LocalyticsUpsSignupSource("REAL_TIME_RAIN_ALERT", 5, "real time rain alert settings");
        LIGHTNING_STRIKES_ALERT = new LocalyticsUpsSignupSource("LIGHTNING_STRIKES_ALERT", 6, "lightning strikes alert settings");
        SIGNIFICANT_WEATHER_FORECAST_ALERT = new LocalyticsUpsSignupSource("SIGNIFICANT_WEATHER_FORECAST_ALERT", 7, "significant weather forecast alert settings");
        MARKETING = new LocalyticsUpsSignupSource("MARKETING", 8, "localytics marketing message");
        SETTINGS = new LocalyticsUpsSignupSource("SETTINGS", 9, "settings page");
        $VALUES = (new LocalyticsUpsSignupSource[] {
            LOCATION_SEARCH, DAILY_PRECIP_ALERT, SEVERE_ALERT, BREAKING_NEWS_ALERT, POLLEN_ALERT, REAL_TIME_RAIN_ALERT, LIGHTNING_STRIKES_ALERT, SIGNIFICANT_WEATHER_FORECAST_ALERT, MARKETING, SETTINGS
        });
    }
}
