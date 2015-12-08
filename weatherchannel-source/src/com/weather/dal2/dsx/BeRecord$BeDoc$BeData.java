// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import java.util.List;

// Referenced classes of package com.weather.dal2.dsx:
//            BeRecord

public static class BParameter
    implements com.weather.dal2.data.atherAlertsDoc.WeatherAlertsData
{
    public static class BHeadline
        implements com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsData.WeatherAlertsHeadline
    {

        private final String bHdlnTxt = null;

        public String getHeadlineText()
        {
            return bHdlnTxt;
        }


        public BHeadline()
        {
        }
    }

    public static class BParameter
        implements com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsData.WeatherAlertsParameter
    {

        private final String bLabel = null;
        private final String bLn[] = null;

        public String getParameterLabel()
        {
            return bLabel;
        }

        public List getParameterLines()
        {
            return BeRecord.cleanListFromStringArray(bLn);
        }

        public BParameter()
        {
        }
    }


    private final BHeadline bHdln[] = null;
    private final Long bIssueTmUTC = null;
    private final String bNarrTextLang[] = null;
    private final BNarrText bNarrTxt[] = null;
    private final BParameter bParameter[] = null;

    public Long getAlertIssueTime()
    {
        return bIssueTmUTC;
    }





    public BParameter()
    {
    }

    // Unreferenced inner class com/weather/dal2/dsx/BeRecord$BeDoc$BeData$BNarrText
    /* block-local class not found */
    class BNarrText {}

}
