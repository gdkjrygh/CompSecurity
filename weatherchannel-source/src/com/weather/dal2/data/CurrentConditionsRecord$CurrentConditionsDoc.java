// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.math.BigDecimal;

// Referenced classes of package com.weather.dal2.data:
//            CurrentConditionsRecord

public static interface CurrentConditionsHeader
{
    public static interface CurrentConditionsData
    {

        public abstract Double getBarometricPressureInInches();

        public abstract Double getBarometricPressureInMillibars();

        public abstract String getBarometricTrendAscii();

        public abstract Integer getDewPointInCelsius();

        public abstract Integer getDewPointInFahrenheit();

        public abstract Integer getExtendedWeatherIconCode();

        public abstract Integer getFeelsLikeIndexInCelsius();

        public abstract Integer getFeelsLikeIndexInFahrenheit();

        public abstract String getObservationDateGMT();

        public abstract String getObservationTimeGMT();

        public abstract Integer getRelativeHumidity();

        public abstract Integer getTemperatureInCelsius();

        public abstract Integer getTemperatureInFahrenheit();

        public abstract Integer getUvIndex();

        public abstract String getUvIndexDescription();

        public abstract Integer getUvWarningCode();

        public abstract BigDecimal getVisibilityInKilometers();

        public abstract BigDecimal getVisibilityInMiles();

        public abstract Integer getWeatherIconCode();

        public abstract String getWeatherPhrase();

        public abstract String getWindDirectionAscii();

        public abstract Integer getWindDirectionInDegrees();

        public abstract Integer getWindSpeedInKilometers();

        public abstract Integer getWindSpeedInMiles();
    }

    public static interface CurrentConditionsHeader
    {

        public abstract String getObsStn();

        public abstract Long getProcTm();
    }


    public abstract CurrentConditionsData getMoData();

    public abstract CurrentConditionsHeader getMoHeader();
}
