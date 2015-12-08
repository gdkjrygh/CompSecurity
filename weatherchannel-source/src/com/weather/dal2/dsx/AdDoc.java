// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;


public final class AdDoc
    implements com.weather.dal2.data.AirportDelayRecord.AirportDelayDoc
{
    public static final class AdData
        implements com.weather.dal2.data.AirportDelayRecord.AirportDelayDoc.AirportDelayData
    {

        private final String ADFAAdlyRsn = null;
        private final String ADFAAdprtDlyRsn = null;
        private final String ADTWCdlyRsn = null;
        private final String ADTWCdprtDlyRsn = null;
        private final Integer ADarptClsd = null;
        private final Integer ADarrvlDly = null;
        private final String ADclsRpnTm = null;
        private final String ADclsStrtTm = null;
        private final Integer ADdlyTrnd = null;
        private final Integer ADdprtDly = null;
        private final Integer ADdprtDlyTrnd = null;
        private final Integer ADgnrlDly = null;
        private final Integer ADgrndDly = null;
        private final Integer ADgrndStp = null;
        private final String ADprocTm = null;
        private final String ADprsntNm = null;
        private final String ADupdTm = null;
        private final String ADupdTmISO = null;

        public Integer getAirportClosed()
        {
            return ADarptClsd;
        }

        public String getAirportName()
        {
            return ADprsntNm;
        }

        public Integer getArrivalDelay()
        {
            return ADarrvlDly;
        }

        public Integer getArrivalDelayTrend()
        {
            return ADdlyTrnd;
        }

        public String getClosureReopenTime()
        {
            return ADclsRpnTm;
        }

        public String getClosureStartTime()
        {
            return ADclsStrtTm;
        }

        public Integer getDepartureDelay()
        {
            return ADdprtDly;
        }

        public Integer getDepartureDelayTrend()
        {
            return ADdprtDlyTrnd;
        }

        public String getFAAArrivalDelayReason()
        {
            return ADFAAdlyRsn;
        }

        public String getFAADepartureDelayReason()
        {
            return ADFAAdprtDlyRsn;
        }

        public Integer getGeneralDelay()
        {
            return ADgnrlDly;
        }

        public String getProcessTime()
        {
            return ADprocTm;
        }

        public Integer getRunwayTrafficDelay()
        {
            return ADgrndDly;
        }

        public Integer getRunwayTrafficStopped()
        {
            return ADgrndStp;
        }

        public String getTWCArrivalDelayReason()
        {
            return ADTWCdlyRsn;
        }

        public String getTWCDepartureDelayReason()
        {
            return ADTWCdprtDlyRsn;
        }

        public String getUpdateTime()
        {
            return ADupdTm;
        }

        public String getUpdateTimeISO()
        {
            return ADupdTmISO;
        }

        public AdData()
        {
        }
    }

    public static final class AdHeader
        implements com.weather.dal2.data.AirportDelayRecord.AirportDelayDoc.AirportDelayHeader
    {

        private final String ADarprtId = null;
        private final Long procTm = null;

        public String getAirportId()
        {
            return ADarprtId;
        }

        public Long getProcTm()
        {
            return procTm;
        }

        public AdHeader()
        {
        }
    }


    private final AdData ADData = null;
    private final AdHeader ADHdr = null;

    public AdDoc()
    {
    }

    public com.weather.dal2.data.AirportDelayRecord.AirportDelayDoc.AirportDelayData getAirportDelayData()
    {
        return ADData;
    }

    public com.weather.dal2.data.AirportDelayRecord.AirportDelayDoc.AirportDelayHeader getAirportDelayHeader()
    {
        return ADHdr;
    }
}
