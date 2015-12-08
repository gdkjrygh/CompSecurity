// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;

// Referenced classes of package com.weather.dal2.data:
//            Record

public interface HourlyForecastRecord
    extends Record
{
    public static interface HourlyForecastDoc
    {

        public abstract List getDhData();

        public abstract HourlyForecastHeader getDhHeader();
    }

    public static interface HourlyForecastDoc.HourlyForecastData
    {

        public abstract Integer getDewPointInFahrenheit();

        public abstract Long getForecastDateInGMTMillis();

        public abstract Integer getPercentChanceOfPrecipitation();

        public abstract Integer getRelativeHumidity();

        public abstract Integer getTemperatureInCelsius();

        public abstract Integer getTemperatureInFahrenheit();

        public abstract String getTerseSensibleWeatherPhrase();

        public abstract Integer getUvIndex();

        public abstract Integer getWeatherIconCode();

        public abstract String getWindDirectionAscii();

        public abstract Integer getWindDirectionInDegrees();

        public abstract Integer getWindSpeedInKilometers();

        public abstract Integer getWindSpeedInMiles();

        public abstract boolean isFirstHourOfDay();
    }

    public static interface HourlyForecastDoc.HourlyForecastHeader
    {

        public abstract Long getProcessTime();

        public abstract String getProcessTimeLocal();

        public abstract String getStationId();

        public abstract String getStationName();
    }


    public abstract HourlyForecastDoc getDhDoc();
}
