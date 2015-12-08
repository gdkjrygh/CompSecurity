// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.dal2.data.AirportDelayRecord;
import com.weather.dal2.data.CurrentConditionsRecord;
import com.weather.dal2.dsx.AirportDelaysRecord;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.util.UnitType;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.weather.commons.facade:
//            Html5ModuleData, Temperature, Distance, Speed

public class AirportFacade
    implements Html5ModuleData
{
    public static final class Airport
    {

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
        public final Observation observation;
        public final String updateTime;

        public Airport(AirportDelayRecord airportdelayrecord, Observation observation1)
        {
            observation = observation1;
            com.weather.dal2.data.AirportDelayRecord.AirportDelayDoc airportdelaydoc = airportdelayrecord.getAirportDelayDoc();
            airportdelayrecord = null;
            observation1 = null;
            if (airportdelaydoc != null)
            {
                observation1 = airportdelaydoc.getAirportDelayHeader();
                airportdelayrecord = airportdelaydoc.getAirportDelayData();
            }
            if (observation1 != null && airportdelayrecord != null)
            {
                code = (String)AirportFacade.optionalGet(observation1.getAirportId(), "");
                name = (String)AirportFacade.optionalGet(airportdelayrecord.getAirportName(), "");
                generalDelay = ((Integer)AirportFacade.optionalGet(airportdelayrecord.getGeneralDelay(), Integer.valueOf(0))).intValue();
                isGroundClosed = AirportFacade.optionalGetBoolean(airportdelayrecord.getRunwayTrafficStopped());
                isGroundDelay = AirportFacade.optionalGetBoolean(airportdelayrecord.getRunwayTrafficDelay());
                isAirportClosed = AirportFacade.optionalGetBoolean(airportdelayrecord.getAirportClosed());
                closureStartTime = (String)AirportFacade.optionalGet(airportdelayrecord.getClosureStartTime(), "");
                closureEndTime = (String)AirportFacade.optionalGet(airportdelayrecord.getClosureReopenTime(), "");
                updateTime = (String)AirportFacade.optionalGet(airportdelayrecord.getUpdateTimeISO(), "");
                arrival = new DelayStatus((Integer)AirportFacade.optionalGet(airportdelayrecord.getArrivalDelay(), Integer.valueOf(0)), AirportFacade.optionalGetTrend(airportdelayrecord.getArrivalDelayTrend()), (String)AirportFacade.optionalGet(airportdelayrecord.getTWCArrivalDelayReason(), ""), (String)AirportFacade.optionalGet(airportdelayrecord.getFAAArrivalDelayReason(), ""));
                departure = new DelayStatus((Integer)AirportFacade.optionalGet(airportdelayrecord.getDepartureDelay(), Integer.valueOf(0)), AirportFacade.optionalGetTrend(airportdelayrecord.getDepartureDelayTrend()), (String)AirportFacade.optionalGet(airportdelayrecord.getTWCDepartureDelayReason(), ""), (String)AirportFacade.optionalGet(airportdelayrecord.getFAADepartureDelayReason(), ""));
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

    public static final class Airport.DelayStatus
    {

        public final Integer delay;
        public final String reasonFAA;
        public final String reasonTWC;
        public final String trend;

        public Airport.DelayStatus(Integer integer, String s, String s1, String s2)
        {
            delay = integer;
            trend = s;
            reasonTWC = s1;
            reasonFAA = s2;
        }
    }

    public static final class Observation
    {

        public final String dewPoint;
        public final Pressure pressure;
        public final String relativeHumidity;
        public final UV uv;
        public final String visibility;
        public final Wind wind;

        private static com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData getCurrentConditionsData(CurrentConditionsRecord currentconditionsrecord)
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc currentconditionsdoc = currentconditionsrecord.getMoDoc();
            currentconditionsrecord = null;
            if (currentconditionsdoc != null)
            {
                currentconditionsrecord = currentconditionsdoc.getMoData();
            }
            return currentconditionsrecord;
        }


        public Observation(CurrentConditionsRecord currentconditionsrecord, UnitType unittype)
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc currentconditionsdoc = currentconditionsrecord.getMoDoc();
            Object obj = null;
            if (currentconditionsdoc != null)
            {
                obj = currentconditionsdoc.getMoData();
            }
            if (obj != null)
            {
                uv = new UV(currentconditionsrecord);
                Integer integer;
                if (unittype == UnitType.ENGLISH)
                {
                    integer = ((com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData) (obj)).getDewPointInFahrenheit();
                } else
                {
                    integer = ((com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData) (obj)).getDewPointInCelsius();
                }
                dewPoint = (new Temperature(integer, unittype)).formatShort();
                relativeHumidity = AirportFacade.optionalGetWithSuffix(((com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData) (obj)).getRelativeHumidity(), "", "%");
                if (unittype == UnitType.ENGLISH)
                {
                    obj = ((com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData) (obj)).getVisibilityInMiles();
                } else
                {
                    obj = ((com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData) (obj)).getVisibilityInKilometers();
                }
                visibility = (new Distance(((java.math.BigDecimal) (obj)), unittype)).formatWhole();
                pressure = new Pressure(currentconditionsrecord, unittype);
                wind = new Wind(currentconditionsrecord, unittype);
                return;
            } else
            {
                uv = null;
                dewPoint = null;
                relativeHumidity = "";
                visibility = null;
                pressure = null;
                wind = null;
                return;
            }
        }
    }

    public static final class Observation.Pressure
    {

        public static final String IN = " In";
        public static final String MBAR = " MB";
        private static final String wholeFormat = "%.1f%s";
        public final String pressure;

        public Observation.Pressure(CurrentConditionsRecord currentconditionsrecord, UnitType unittype)
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata = Observation.getCurrentConditionsData(currentconditionsrecord);
            currentconditionsrecord = null;
            if (currentconditionsdata != null)
            {
                if (unittype == UnitType.ENGLISH)
                {
                    currentconditionsrecord = currentconditionsdata.getBarometricPressureInInches();
                } else
                {
                    currentconditionsrecord = currentconditionsdata.getBarometricPressureInMillibars();
                }
            }
            if (unittype == UnitType.ENGLISH)
            {
                unittype = " In";
            } else
            {
                unittype = " MB";
            }
            if (currentconditionsrecord == null)
            {
                currentconditionsrecord = "--";
            } else
            {
                currentconditionsrecord = String.format(Locale.getDefault(), "%.1f%s", new Object[] {
                    currentconditionsrecord, unittype
                });
            }
            pressure = currentconditionsrecord;
        }
    }

    public static final class Observation.UV
    {

        public final Integer index;

        public Observation.UV(CurrentConditionsRecord currentconditionsrecord)
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata = Observation.getCurrentConditionsData(currentconditionsrecord);
            currentconditionsrecord = null;
            if (currentconditionsdata != null)
            {
                currentconditionsrecord = currentconditionsdata.getUvIndex();
            }
            index = (Integer)AirportFacade.optionalGet(currentconditionsrecord, Integer.valueOf(0));
        }
    }

    public static final class Observation.Wind
    {

        public final String directionCardinal;
        public final String speed;

        public Observation.Wind(CurrentConditionsRecord currentconditionsrecord, UnitType unittype)
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata = Observation.getCurrentConditionsData(currentconditionsrecord);
            String s = null;
            currentconditionsrecord = null;
            Integer integer = null;
            if (currentconditionsdata != null)
            {
                s = currentconditionsdata.getWindDirectionAscii();
                currentconditionsrecord = currentconditionsdata.getWindSpeedInKilometers();
                integer = currentconditionsdata.getWindSpeedInMiles();
            }
            directionCardinal = (String)AirportFacade.optionalGet(s, "");
            if (unittype != UnitType.METRIC)
            {
                currentconditionsrecord = integer;
            }
            speed = (new Speed(currentconditionsrecord, unittype)).format();
        }
    }


    private static final String TAG = "AirportHtmlData";
    private static final String TREND_DECREASING = "Decreasing";
    private static final String TREND_INCREASING = "Increasing";
    private static final String TREND_NONE = "None";
    private final List airports;

    public AirportFacade(AirportDelaysRecord airportdelaysrecord, UnitType unittype)
    {
        Preconditions.checkNotNull(airportdelaysrecord, "adRecord cannot be null");
        Preconditions.checkNotNull(unittype, "unitType cannot be null");
        Object obj = airportdelaysrecord.getAirportDelayItems();
        List list = null;
        airportdelaysrecord = null;
        if (obj != null)
        {
            list = ((com.weather.dal2.data.AirportDelays.AirportDelayItems) (obj)).getCurrentConditionsRecords();
            airportdelaysrecord = ((com.weather.dal2.data.AirportDelays.AirportDelayItems) (obj)).getAirportDelayRecords();
        }
        obj = ImmutableList.builder();
        if (airportdelaysrecord != null)
        {
            for (int i = 0; i < airportdelaysrecord.size(); i++)
            {
                ((com.google.common.collect.ImmutableList.Builder) (obj)).add(new Airport((AirportDelayRecord)airportdelaysrecord.get(i), new Observation((CurrentConditionsRecord)list.get(i), unittype)));
            }

        }
        airports = ((com.google.common.collect.ImmutableList.Builder) (obj)).build();
    }

    private static Object optionalGet(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1;
        } else
        {
            return obj;
        }
    }

    private static boolean optionalGetBoolean(Integer integer)
    {
        return ((Integer)optionalGet(integer, Integer.valueOf(0))).intValue() == 1;
    }

    private static String optionalGetTrend(Integer integer)
    {
        switch (((Integer)optionalGet(integer, Integer.valueOf(0))).intValue())
        {
        default:
            Log.w("AirportHtmlData", (new StringBuilder()).append("Got unknown value for a trend: ").append(integer).toString());
            return "None";

        case 0: // '\0'
            return "None";

        case 1: // '\001'
            return "Increasing";

        case 2: // '\002'
            return "Decreasing";
        }
    }

    private static String optionalGetWithSuffix(Object obj, String s, String s1)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(obj).append(s1).toString();
        }
    }

    public String getData()
    {
        return JsonObjectMapper.toJson(airports);
    }




}
