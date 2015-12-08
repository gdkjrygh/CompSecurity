// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;

// Referenced classes of package com.weather.dal2.data:
//            Record

public interface DailyForecastRecord
    extends Record
{
    public static interface DailyForecastDoc
    {

        public abstract List getDailyForecastData();

        public abstract DailyForecastHeader getDailyForecastHeader();
    }

    public static interface DailyForecastDoc.DailyForecastData
    {

        public abstract Long getForecastValidDateGMTMillis();

        public abstract Integer getHiTemperatureCelsius();

        public abstract Integer getHiTemperatureFahrenheit();

        public abstract Integer getLowTemperatureCelsius();

        public abstract Integer getLowTemperatureFahrenheit();

        public abstract Integer getPercentChanceOfPrecipitationDay();

        public abstract Integer getPercentChanceOfPrecipitationNight();

        public abstract Integer getRelativeHumidityDay();

        public abstract Integer getRelativeHumidityNight();

        public abstract String getSensibleWeatherPhraseDay();

        public abstract String getSensibleWeatherPhraseNight();

        public abstract String getShortCast();

        public abstract Double getSnowAccumulationForecastDay();

        public abstract Double getSnowAccumulationForecastNight();

        public abstract Double getSnowAccumulationForecastTerseDay();

        public abstract Double getSnowAccumulationForecastTerseNight();

        public abstract String getSnwAccumPhrase12();

        public abstract String getSnwAccumPhrase24();

        public abstract String getSnwAccumPhraseTerse12();

        public abstract String getSnwAccumPhraseTerse24();

        public abstract String getSunrise();

        public abstract String getSunriseISO();

        public abstract String getSunriseOffset();

        public abstract Long getSunriseTime();

        public abstract String getSunset();

        public abstract String getSunsetISO();

        public abstract String getSunsetOffset();

        public abstract Long getSunsetTime();

        public abstract String getTerseSensibleWeatherPhraseDay();

        public abstract String getTerseSensibleWeatherPhraseNight();

        public abstract Integer getUvIndex();

        public abstract Integer getWeatherIconCodeDay();

        public abstract String getWeatherIconCodeExtendedDay();

        public abstract String getWeatherIconCodeExtendedNight();

        public abstract Integer getWeatherIconCodeNight();

        public abstract String getWindDirectionAsciiDay();

        public abstract String getWindDirectionAsciiNight();

        public abstract Integer getWindDirectionInDegreesDay();

        public abstract Integer getWindDirectionInDegreesNight();

        public abstract Integer getWindSpeedInKilometersDay();

        public abstract Integer getWindSpeedInKilometersNight();

        public abstract Integer getWindSpeedInMilesDay();

        public abstract Integer getWindSpeedInMilesNight();

        public abstract String getWirelessWeatherPhraseDay();

        public abstract String getWirelessWeatherPhraseNight();
    }

    public static interface DailyForecastDoc.DailyForecastHeader
    {

        public abstract String getCoopId();

        public abstract Long getProcTm();

        public abstract String getProcessTimeLocal();

        public abstract String getStnNm();
    }


    public abstract DailyForecastDoc getDailyForecastDoc();
}
