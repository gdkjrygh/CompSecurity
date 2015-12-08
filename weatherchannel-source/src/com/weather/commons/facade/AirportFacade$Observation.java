// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.dal2.data.CurrentConditionsRecord;
import com.weather.util.UnitType;
import java.util.Locale;

// Referenced classes of package com.weather.commons.facade:
//            AirportFacade, Temperature, Distance, Speed

public static final class wind
{
    public static final class Pressure
    {

        public static final String IN = " In";
        public static final String MBAR = " MB";
        private static final String wholeFormat = "%.1f%s";
        public final String pressure;

        public Pressure(CurrentConditionsRecord currentconditionsrecord, UnitType unittype)
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata = AirportFacade.Observation.getCurrentConditionsData(currentconditionsrecord);
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

    public static final class UV
    {

        public final Integer index;

        public UV(CurrentConditionsRecord currentconditionsrecord)
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata = AirportFacade.Observation.getCurrentConditionsData(currentconditionsrecord);
            currentconditionsrecord = null;
            if (currentconditionsdata != null)
            {
                currentconditionsrecord = currentconditionsdata.getUvIndex();
            }
            index = (Integer)AirportFacade.access$000(currentconditionsrecord, Integer.valueOf(0));
        }
    }

    public static final class Wind
    {

        public final String directionCardinal;
        public final String speed;

        public Wind(CurrentConditionsRecord currentconditionsrecord, UnitType unittype)
        {
            com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata = AirportFacade.Observation.getCurrentConditionsData(currentconditionsrecord);
            String s = null;
            currentconditionsrecord = null;
            Integer integer = null;
            if (currentconditionsdata != null)
            {
                s = currentconditionsdata.getWindDirectionAscii();
                currentconditionsrecord = currentconditionsdata.getWindSpeedInKilometers();
                integer = currentconditionsdata.getWindSpeedInMiles();
            }
            directionCardinal = (String)AirportFacade.access$000(s, "");
            if (unittype != UnitType.METRIC)
            {
                currentconditionsrecord = integer;
            }
            speed = (new Speed(currentconditionsrecord, unittype)).format();
        }
    }


    public final String dewPoint;
    public final Pressure pressure;
    public final String relativeHumidity;
    public final UV uv;
    public final String visibility;
    public final Wind wind;

    private static com.weather.dal2.data.rrentConditionsDoc.CurrentConditionsData getCurrentConditionsData(CurrentConditionsRecord currentconditionsrecord)
    {
        com.weather.dal2.data.rrentConditionsDoc rrentconditionsdoc = currentconditionsrecord.getMoDoc();
        currentconditionsrecord = null;
        if (rrentconditionsdoc != null)
        {
            currentconditionsrecord = rrentconditionsdoc.getMoData();
        }
        return currentconditionsrecord;
    }


    public tionsData(CurrentConditionsRecord currentconditionsrecord, UnitType unittype)
    {
        com.weather.dal2.data.rrentConditionsDoc rrentconditionsdoc = currentconditionsrecord.getMoDoc();
        Object obj = null;
        if (rrentconditionsdoc != null)
        {
            obj = rrentconditionsdoc.getMoData();
        }
        if (obj != null)
        {
            uv = new UV(currentconditionsrecord);
            Integer integer;
            if (unittype == UnitType.ENGLISH)
            {
                integer = ((com.weather.dal2.data.rrentConditionsDoc.CurrentConditionsData) (obj)).getDewPointInFahrenheit();
            } else
            {
                integer = ((com.weather.dal2.data.rrentConditionsDoc.CurrentConditionsData) (obj)).getDewPointInCelsius();
            }
            dewPoint = (new Temperature(integer, unittype)).formatShort();
            relativeHumidity = AirportFacade.access$300(((com.weather.dal2.data.rrentConditionsDoc.CurrentConditionsData) (obj)).getRelativeHumidity(), "", "%");
            if (unittype == UnitType.ENGLISH)
            {
                obj = ((com.weather.dal2.data.rrentConditionsDoc.CurrentConditionsData) (obj)).getVisibilityInMiles();
            } else
            {
                obj = ((com.weather.dal2.data.rrentConditionsDoc.CurrentConditionsData) (obj)).getVisibilityInKilometers();
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
