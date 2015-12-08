// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;


// Referenced classes of package com.weather.dal2.data:
//            AirportDelayRecord

public static interface AirportDelayHeader
{
    public static interface AirportDelayData
    {

        public abstract Integer getAirportClosed();

        public abstract String getAirportName();

        public abstract Integer getArrivalDelay();

        public abstract Integer getArrivalDelayTrend();

        public abstract String getClosureReopenTime();

        public abstract String getClosureStartTime();

        public abstract Integer getDepartureDelay();

        public abstract Integer getDepartureDelayTrend();

        public abstract String getFAAArrivalDelayReason();

        public abstract String getFAADepartureDelayReason();

        public abstract Integer getGeneralDelay();

        public abstract String getProcessTime();

        public abstract Integer getRunwayTrafficDelay();

        public abstract Integer getRunwayTrafficStopped();

        public abstract String getTWCArrivalDelayReason();

        public abstract String getTWCDepartureDelayReason();

        public abstract String getUpdateTime();

        public abstract String getUpdateTimeISO();
    }

    public static interface AirportDelayHeader
    {

        public abstract String getAirportId();

        public abstract Long getProcTm();
    }


    public abstract AirportDelayData getAirportDelayData();

    public abstract AirportDelayHeader getAirportDelayHeader();
}
