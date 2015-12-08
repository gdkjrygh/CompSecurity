// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;


// Referenced classes of package com.weather.dal2.data:
//            HourlyForecastRecord

public static interface 
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
