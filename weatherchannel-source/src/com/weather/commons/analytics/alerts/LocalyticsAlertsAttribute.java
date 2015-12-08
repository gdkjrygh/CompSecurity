// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.alerts;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsAlertsAttribute
{
    public static final class AlertAttribute extends Enum
        implements Attribute
    {

        private static final AlertAttribute $VALUES[];
        public static final AlertAttribute ALERT_SETTING_LOCATION;
        public static final AlertAttribute BREAKING_NEWS;
        public static final AlertAttribute DAILY_RAIN;
        public static final AlertAttribute DAILY_RAIN_LOCATIONS_DESELECTED;
        public static final AlertAttribute DAILY_RAIN_LOCATIONS_SELECTED;
        public static final AlertAttribute INTERNATIONAL_SEVERE;
        public static final AlertAttribute PHONE_REGION;
        public static final AlertAttribute POLLEN;
        public static final AlertAttribute POLLEN_LOCATIONS_DESELECTED;
        public static final AlertAttribute POLLEN_LOCATIONS_SELECTED;
        public static final AlertAttribute SEVERE;
        public static final AlertAttribute SEVERE_LOCATIONS_DESELECTED;
        public static final AlertAttribute SEVERE_LOCATIONS_SELECTED;
        public static final AlertAttribute SEVERE_LOCATIONS_SELECTED_LIST;
        private final String alertAttribute;

        public static AlertAttribute valueOf(String s)
        {
            return (AlertAttribute)Enum.valueOf(com/weather/commons/analytics/alerts/LocalyticsAlertsAttribute$AlertAttribute, s);
        }

        public static AlertAttribute[] values()
        {
            return (AlertAttribute[])$VALUES.clone();
        }

        public String getName()
        {
            return alertAttribute;
        }

        static 
        {
            POLLEN_LOCATIONS_SELECTED = new AlertAttribute("POLLEN_LOCATIONS_SELECTED", 0, "pollen locations selected:");
            POLLEN_LOCATIONS_DESELECTED = new AlertAttribute("POLLEN_LOCATIONS_DESELECTED", 1, "pollen locations deselected:");
            SEVERE_LOCATIONS_SELECTED = new AlertAttribute("SEVERE_LOCATIONS_SELECTED", 2, "severe locations selected:");
            SEVERE_LOCATIONS_SELECTED_LIST = new AlertAttribute("SEVERE_LOCATIONS_SELECTED_LIST", 3, "severe locations selected list:");
            SEVERE_LOCATIONS_DESELECTED = new AlertAttribute("SEVERE_LOCATIONS_DESELECTED", 4, "severe locations deselected:");
            DAILY_RAIN_LOCATIONS_SELECTED = new AlertAttribute("DAILY_RAIN_LOCATIONS_SELECTED", 5, "daily rain locations selected:");
            DAILY_RAIN_LOCATIONS_DESELECTED = new AlertAttribute("DAILY_RAIN_LOCATIONS_DESELECTED", 6, "daily rain locations deselected:");
            POLLEN = new AlertAttribute("POLLEN", 7, "pollen:");
            SEVERE = new AlertAttribute("SEVERE", 8, "severe weather:");
            INTERNATIONAL_SEVERE = new AlertAttribute("INTERNATIONAL_SEVERE", 9, "international severe weather:");
            PHONE_REGION = new AlertAttribute("PHONE_REGION", 10, "phone region:");
            BREAKING_NEWS = new AlertAttribute("BREAKING_NEWS", 11, "breaking news:");
            DAILY_RAIN = new AlertAttribute("DAILY_RAIN", 12, "daily rain:");
            ALERT_SETTING_LOCATION = new AlertAttribute("ALERT_SETTING_LOCATION", 13, "alert set location:");
            $VALUES = (new AlertAttribute[] {
                POLLEN_LOCATIONS_SELECTED, POLLEN_LOCATIONS_DESELECTED, SEVERE_LOCATIONS_SELECTED, SEVERE_LOCATIONS_SELECTED_LIST, SEVERE_LOCATIONS_DESELECTED, DAILY_RAIN_LOCATIONS_SELECTED, DAILY_RAIN_LOCATIONS_DESELECTED, POLLEN, SEVERE, INTERNATIONAL_SEVERE, 
                PHONE_REGION, BREAKING_NEWS, DAILY_RAIN, ALERT_SETTING_LOCATION
            });
        }

        private AlertAttribute(String s, int i, String s1)
        {
            super(s, i);
            alertAttribute = s1;
        }
    }

    public static final class AlertAttributeValues extends Enum
    {

        private static final AlertAttributeValues $VALUES[];
        public static final AlertAttributeValues ACTIVATION_SCREEN;
        public static final AlertAttributeValues ALERT_SETTING_SCREEN;
        private final String alertAttribute;

        public static AlertAttributeValues valueOf(String s)
        {
            return (AlertAttributeValues)Enum.valueOf(com/weather/commons/analytics/alerts/LocalyticsAlertsAttribute$AlertAttributeValues, s);
        }

        public static AlertAttributeValues[] values()
        {
            return (AlertAttributeValues[])$VALUES.clone();
        }

        public String getAttributeValue()
        {
            return alertAttribute;
        }

        static 
        {
            ACTIVATION_SCREEN = new AlertAttributeValues("ACTIVATION_SCREEN", 0, "activation");
            ALERT_SETTING_SCREEN = new AlertAttributeValues("ALERT_SETTING_SCREEN", 1, "settings");
            $VALUES = (new AlertAttributeValues[] {
                ACTIVATION_SCREEN, ALERT_SETTING_SCREEN
            });
        }

        private AlertAttributeValues(String s, int i, String s1)
        {
            super(s, i);
            alertAttribute = s1;
        }
    }


    private LocalyticsAlertsAttribute()
    {
    }
}
