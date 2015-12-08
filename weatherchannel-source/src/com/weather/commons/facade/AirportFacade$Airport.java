// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.dal2.data.AirportDelayRecord;

// Referenced classes of package com.weather.commons.facade:
//            AirportFacade

public static final class departure
{
    public static final class DelayStatus
    {

        public final Integer delay;
        public final String reasonFAA;
        public final String reasonTWC;
        public final String trend;

        public DelayStatus(Integer integer, String s, String s1, String s2)
        {
            delay = integer;
            trend = s;
            reasonTWC = s1;
            reasonFAA = s2;
        }
    }


    public final DelayStatus arrival;
    public final String closureEndTime;
    public final String closureStartTime;
    public final String code;
    public final DelayStatus departure;
    public final int generalDelay;
    public final boolean isAirportClosed;
    public final boolean isGroundClosed;
    public final boolean isGroundDelay;
    public final String name;
    public final ion observation;
    public final String updateTime;

    public elayDoc(AirportDelayRecord airportdelayrecord, ion ion)
    {
        observation = ion;
        com.weather.dal2.data.portDelayDoc portdelaydoc = airportdelayrecord.getAirportDelayDoc();
        airportdelayrecord = null;
        ion = null;
        if (portdelaydoc != null)
        {
            ion = portdelaydoc.getAirportDelayHeader();
            airportdelayrecord = portdelaydoc.getAirportDelayData();
        }
        if (ion != null && airportdelayrecord != null)
        {
            code = (String)AirportFacade.access$000(ion.getAirportId(), "");
            name = (String)AirportFacade.access$000(airportdelayrecord.getAirportName(), "");
            generalDelay = ((Integer)AirportFacade.access$000(airportdelayrecord.getGeneralDelay(), Integer.valueOf(0))).intValue();
            isGroundClosed = AirportFacade.access$100(airportdelayrecord.getRunwayTrafficStopped());
            isGroundDelay = AirportFacade.access$100(airportdelayrecord.getRunwayTrafficDelay());
            isAirportClosed = AirportFacade.access$100(airportdelayrecord.getAirportClosed());
            closureStartTime = (String)AirportFacade.access$000(airportdelayrecord.getClosureStartTime(), "");
            closureEndTime = (String)AirportFacade.access$000(airportdelayrecord.getClosureReopenTime(), "");
            updateTime = (String)AirportFacade.access$000(airportdelayrecord.getUpdateTimeISO(), "");
            arrival = new DelayStatus((Integer)AirportFacade.access$000(airportdelayrecord.getArrivalDelay(), Integer.valueOf(0)), AirportFacade.access$200(airportdelayrecord.getArrivalDelayTrend()), (String)AirportFacade.access$000(airportdelayrecord.getTWCArrivalDelayReason(), ""), (String)AirportFacade.access$000(airportdelayrecord.getFAAArrivalDelayReason(), ""));
            departure = new DelayStatus((Integer)AirportFacade.access$000(airportdelayrecord.getDepartureDelay(), Integer.valueOf(0)), AirportFacade.access$200(airportdelayrecord.getDepartureDelayTrend()), (String)AirportFacade.access$000(airportdelayrecord.getTWCDepartureDelayReason(), ""), (String)AirportFacade.access$000(airportdelayrecord.getFAADepartureDelayReason(), ""));
            return;
        } else
        {
            code = null;
            name = null;
            generalDelay = 0;
            isGroundClosed = false;
            isGroundDelay = false;
            isAirportClosed = false;
            closureStartTime = null;
            closureEndTime = null;
            updateTime = null;
            arrival = null;
            departure = null;
            return;
        }
    }
}
