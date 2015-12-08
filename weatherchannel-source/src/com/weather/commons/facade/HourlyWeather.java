// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.google.common.base.Preconditions;
import com.weather.util.UnitType;
import com.weather.util.date.TwcDateFormatter;
import java.util.Date;

// Referenced classes of package com.weather.commons.facade:
//            Temperature, Wind, PrecipitationRoundedValue

public class HourlyWeather
{

    private final Date dateGMT;
    private final boolean isFirstHourOfDay;
    private final String phrase;
    private final PrecipitationRoundedValue precipitation;
    private final Integer sky;
    private final Temperature temperature;
    private final String timeOffset;
    private final UnitType unitType;
    private final Wind wind;

    public HourlyWeather(com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastData hourlyforecastdata, String s, UnitType unittype)
    {
        timeOffset = (String)Preconditions.checkNotNull(s);
        unitType = (UnitType)Preconditions.checkNotNull(unittype);
        Preconditions.checkNotNull(hourlyforecastdata);
        if (UnitType.ENGLISH == unittype)
        {
            s = hourlyforecastdata.getTemperatureInFahrenheit();
        } else
        {
            s = hourlyforecastdata.getTemperatureInCelsius();
        }
        temperature = new Temperature(s, unittype);
        wind = new Wind(hourlyforecastdata.getWindDirectionAscii(), hourlyforecastdata.getWindSpeedInKilometers(), hourlyforecastdata.getWindSpeedInMiles(), unittype);
        precipitation = new PrecipitationRoundedValue(hourlyforecastdata.getPercentChanceOfPrecipitation());
        sky = hourlyforecastdata.getWeatherIconCode();
        s = hourlyforecastdata.getForecastDateInGMTMillis();
        if (s == null)
        {
            dateGMT = null;
        } else
        {
            dateGMT = new Date(s.longValue());
        }
        isFirstHourOfDay = hourlyforecastdata.isFirstHourOfDay();
        phrase = hourlyforecastdata.getTerseSensibleWeatherPhrase();
    }

    public final String formatDay()
    {
        if (dateGMT == null)
        {
            return "";
        } else
        {
            return TwcDateFormatter.formatM(dateGMT, getTimeOffset());
        }
    }

    public final String formatHour()
    {
        if (dateGMT == null)
        {
            return "";
        }
        String s;
        if (UnitType.METRIC == getUnitType())
        {
            s = TwcDateFormatter.formatH(dateGMT, getTimeOffset());
        } else
        {
            s = TwcDateFormatter.formath(dateGMT, getTimeOffset());
        }
        return s;
    }

    public Date getDateGMT()
    {
        if (dateGMT == null)
        {
            return null;
        } else
        {
            return new Date(dateGMT.getTime());
        }
    }

    public String getPhrase()
    {
        return phrase;
    }

    public PrecipitationRoundedValue getPrecipitation()
    {
        return precipitation;
    }

    public Integer getSky()
    {
        return sky;
    }

    public Temperature getTemperature()
    {
        return temperature;
    }

    public String getTimeOffset()
    {
        return timeOffset;
    }

    public UnitType getUnitType()
    {
        return unitType;
    }

    public Wind getWind()
    {
        return wind;
    }

    public boolean isFirstHourOfDay()
    {
        return isFirstHourOfDay;
    }
}
