// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.dal2.data:
//            WeatherAlertsRecord

public static interface WeatherAlertsHeader
{
    public static interface WeatherAlertsData
    {

        public abstract Long getAlertIssueTime();
    }

    public static interface WeatherAlertsData.WeatherAlertsHeadline
    {

        public abstract String getHeadlineText();
    }

    public static interface WeatherAlertsData.WeatherAlertsParameter
    {

        public abstract String getParameterLabel();

        public abstract List getParameterLines();
    }

    public static interface WeatherAlertsHeader
    {

        public abstract Long getProcessTime();

        public abstract String getProductIdentificationLabel();

        public abstract WeatherAlertsEvent getWeatherAlertsEvent();

        public abstract WeatherAlertsLocations getWeatherAlertsLocations();
    }

    public static interface WeatherAlertsHeader.WeatherAlertsEvent
    {

        public abstract String getDescription();

        public abstract String getEndTimeISO();

        public abstract String getEventTrackingNumber();

        public abstract String getIssuingOfficeCode();

        public abstract String getPhenomenaCode();

        public abstract Integer getSeverity();

        public abstract String getSignificance();

        public abstract String getStartTimeISO();

        public abstract Integer getTwcInternalId();
    }

    public static interface WeatherAlertsHeader.WeatherAlertsLocations
    {

        public abstract String getAreaId();

        public abstract String getAreaName();
    }


    public abstract String getHeadline();

    public abstract List getNarrativeText();

    public abstract Map getParameters();

    public abstract String getTextLanguage();

    public abstract WeatherAlertsData getWeatherAlertsData();

    public abstract WeatherAlertsHeader getWeatherAlertsHeader();

    // Unreferenced inner class com/weather/dal2/data/WeatherAlertsRecord$WeatherAlertsDoc$WeatherAlertsData$WeatherAlertsNarrativeText
    /* block-local class not found */
    class WeatherAlertsData.WeatherAlertsNarrativeText {}

}
