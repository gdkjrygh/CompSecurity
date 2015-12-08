// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;


// Referenced classes of package com.weather.dal2.dsx:
//            BeRecord

public static class BLocations
    implements com.weather.dal2.data.herAlertsDoc.WeatherAlertsHeader
{
    public static class BEvent
        implements com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader.WeatherAlertsEvent
    {

        private final String eDesc = null;
        private final String eETN = null;
        private final String eEndTmISO = null;
        private final String eOfficeId = null;
        private final String ePhenom = null;
        private final String eSgnfcnc = null;
        private final String eStTmISO = null;
        private final Integer eSvrty = null;
        private final Integer eTWCIId = null;

        public String getDescription()
        {
            return eDesc;
        }

        public String getEndTimeISO()
        {
            return eEndTmISO;
        }

        public String getEventTrackingNumber()
        {
            return eETN;
        }

        public String getIssuingOfficeCode()
        {
            return eOfficeId;
        }

        public String getPhenomenaCode()
        {
            return ePhenom;
        }

        public Integer getSeverity()
        {
            return eSvrty;
        }

        public String getSignificance()
        {
            return eSgnfcnc;
        }

        public String getStartTimeISO()
        {
            return eStTmISO;
        }

        public Integer getTwcInternalId()
        {
            return eTWCIId;
        }

        public BEvent()
        {
        }
    }

    public static class BLocations
        implements com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc.WeatherAlertsHeader.WeatherAlertsLocations
    {

        private final String bLocCd = null;
        private final String bLocCd__bLoc = null;

        public String getAreaId()
        {
            return bLocCd;
        }

        public String getAreaName()
        {
            return bLocCd__bLoc;
        }

        public BLocations()
        {
        }
    }


    private final BEvent bEvent = null;
    private final BLocations bLocations = null;
    private final String bPIL = null;
    private final Long procTm = null;

    public Long getProcessTime()
    {
        return procTm;
    }

    public String getProductIdentificationLabel()
    {
        return bPIL;
    }

    public com.weather.dal2.data.herAlertsDoc.WeatherAlertsHeader.WeatherAlertsEvent getWeatherAlertsEvent()
    {
        return bEvent;
    }

    public com.weather.dal2.data.herAlertsDoc.WeatherAlertsHeader.WeatherAlertsLocations getWeatherAlertsLocations()
    {
        return bLocations;
    }

    public BLocations()
    {
    }
}
