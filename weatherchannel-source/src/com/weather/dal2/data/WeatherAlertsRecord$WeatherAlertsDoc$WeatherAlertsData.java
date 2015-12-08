// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;

// Referenced classes of package com.weather.dal2.data:
//            WeatherAlertsRecord

public static interface WeatherAlertsParameter
{
    public static interface WeatherAlertsHeadline
    {

        public abstract String getHeadlineText();
    }

    public static interface WeatherAlertsParameter
    {

        public abstract String getParameterLabel();

        public abstract List getParameterLines();
    }


    public abstract Long getAlertIssueTime();

    // Unreferenced inner class com/weather/dal2/data/WeatherAlertsRecord$WeatherAlertsDoc$WeatherAlertsData$WeatherAlertsNarrativeText
    /* block-local class not found */
    class WeatherAlertsNarrativeText {}

}
