// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.alerts;

import com.weather.commons.analytics.Attribute;

// Referenced classes of package com.weather.commons.analytics.alerts:
//            LocalyticsAlertsAttribute

public static final class alertAttribute extends Enum
    implements Attribute
{

    private static final ALERT_SETTING_LOCATION $VALUES[];
    public static final ALERT_SETTING_LOCATION ALERT_SETTING_LOCATION;
    public static final ALERT_SETTING_LOCATION BREAKING_NEWS;
    public static final ALERT_SETTING_LOCATION DAILY_RAIN;
    public static final ALERT_SETTING_LOCATION DAILY_RAIN_LOCATIONS_DESELECTED;
    public static final ALERT_SETTING_LOCATION DAILY_RAIN_LOCATIONS_SELECTED;
    public static final ALERT_SETTING_LOCATION INTERNATIONAL_SEVERE;
    public static final ALERT_SETTING_LOCATION PHONE_REGION;
    public static final ALERT_SETTING_LOCATION POLLEN;
    public static final ALERT_SETTING_LOCATION POLLEN_LOCATIONS_DESELECTED;
    public static final ALERT_SETTING_LOCATION POLLEN_LOCATIONS_SELECTED;
    public static final ALERT_SETTING_LOCATION SEVERE;
    public static final ALERT_SETTING_LOCATION SEVERE_LOCATIONS_DESELECTED;
    public static final ALERT_SETTING_LOCATION SEVERE_LOCATIONS_SELECTED;
    public static final ALERT_SETTING_LOCATION SEVERE_LOCATIONS_SELECTED_LIST;
    private final String alertAttribute;

    public static alertAttribute valueOf(String s)
    {
        return (alertAttribute)Enum.valueOf(com/weather/commons/analytics/alerts/LocalyticsAlertsAttribute$AlertAttribute, s);
    }

    public static alertAttribute[] values()
    {
        return (alertAttribute[])$VALUES.clone();
    }

    public String getName()
    {
        return alertAttribute;
    }

    static 
    {
        POLLEN_LOCATIONS_SELECTED = new <init>("POLLEN_LOCATIONS_SELECTED", 0, "pollen locations selected:");
        POLLEN_LOCATIONS_DESELECTED = new <init>("POLLEN_LOCATIONS_DESELECTED", 1, "pollen locations deselected:");
        SEVERE_LOCATIONS_SELECTED = new <init>("SEVERE_LOCATIONS_SELECTED", 2, "severe locations selected:");
        SEVERE_LOCATIONS_SELECTED_LIST = new <init>("SEVERE_LOCATIONS_SELECTED_LIST", 3, "severe locations selected list:");
        SEVERE_LOCATIONS_DESELECTED = new <init>("SEVERE_LOCATIONS_DESELECTED", 4, "severe locations deselected:");
        DAILY_RAIN_LOCATIONS_SELECTED = new <init>("DAILY_RAIN_LOCATIONS_SELECTED", 5, "daily rain locations selected:");
        DAILY_RAIN_LOCATIONS_DESELECTED = new <init>("DAILY_RAIN_LOCATIONS_DESELECTED", 6, "daily rain locations deselected:");
        POLLEN = new <init>("POLLEN", 7, "pollen:");
        SEVERE = new <init>("SEVERE", 8, "severe weather:");
        INTERNATIONAL_SEVERE = new <init>("INTERNATIONAL_SEVERE", 9, "international severe weather:");
        PHONE_REGION = new <init>("PHONE_REGION", 10, "phone region:");
        BREAKING_NEWS = new <init>("BREAKING_NEWS", 11, "breaking news:");
        DAILY_RAIN = new <init>("DAILY_RAIN", 12, "daily rain:");
        ALERT_SETTING_LOCATION = new <init>("ALERT_SETTING_LOCATION", 13, "alert set location:");
        $VALUES = (new .VALUES[] {
            POLLEN_LOCATIONS_SELECTED, POLLEN_LOCATIONS_DESELECTED, SEVERE_LOCATIONS_SELECTED, SEVERE_LOCATIONS_SELECTED_LIST, SEVERE_LOCATIONS_DESELECTED, DAILY_RAIN_LOCATIONS_SELECTED, DAILY_RAIN_LOCATIONS_DESELECTED, POLLEN, SEVERE, INTERNATIONAL_SEVERE, 
            PHONE_REGION, BREAKING_NEWS, DAILY_RAIN, ALERT_SETTING_LOCATION
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        alertAttribute = s1;
    }
}
