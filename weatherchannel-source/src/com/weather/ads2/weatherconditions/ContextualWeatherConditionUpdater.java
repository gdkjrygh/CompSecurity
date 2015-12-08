// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherconditions;

import com.google.common.collect.ImmutableMap;
import com.weather.ads2.facade.CurrentConditions;
import com.weather.ads2.facade.Forecast;
import com.weather.ads2.facade.Pollen;
import com.weather.ads2.facade.Ski;
import com.weather.ads2.facade.Temperature;
import com.weather.ads2.facade.WeatherAlerts;
import com.weather.ads2.facade.WxData;
import com.weather.ads2.targeting.AdTargetingChange;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.dal2.system.TwcBus;

public class ContextualWeatherConditionUpdater
{

    private final TwcBus bus;

    public ContextualWeatherConditionUpdater(TwcBus twcbus)
    {
        bus = twcbus;
    }

    public void onWeatherUpdate(WxData wxdata)
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(AdTargetingParam.WEATHER_CONDITION, wxdata.currentConditions.condition);
        builder.put(AdTargetingParam.WEATHER_TEMPERATURE_INCREMENT, wxdata.currentConditions.temperature.increment);
        builder.put(AdTargetingParam.WEATHER_TEMPERATURE_RANGE, wxdata.currentConditions.temperature.range);
        builder.put(AdTargetingParam.WEATHER_TEMPERATURE_CELSIUS, wxdata.currentConditions.temperatureInCelsius);
        builder.put(AdTargetingParam.WEATHER_FEELS_LIKE_TEMPERATURE_CELSIUS, wxdata.currentConditions.feelsLikeTemperatureInCelsius);
        builder.put(AdTargetingParam.WEATHER_WIND_SPEED, wxdata.currentConditions.wind);
        builder.put(AdTargetingParam.WEATHER_HUMIDITY, wxdata.currentConditions.humidity);
        builder.put(AdTargetingParam.WEATHER_UV_INDEX, wxdata.currentConditions.uv);
        builder.put(AdTargetingParam.WEATHER_SEVERE_ALERTS, wxdata.weatherAlerts.weatherAlertSummary);
        builder.put(AdTargetingParam.WEATHER_POLLEN, wxdata.pollen.pollenLabel);
        builder.put(AdTargetingParam.WEATHER_FORECAST_LOW_TEMPERATURE_CELSIUS, wxdata.forecast.lowTemperatureCelsius);
        builder.put(AdTargetingParam.WEATHER_FORECAST_HIGH_TEMPERATURE_CELSIUS, wxdata.forecast.highTemperatureCelsius);
        builder.put(AdTargetingParam.H20, wxdata.ski.skiData);
        bus.post(new AdTargetingChange(builder.build()));
    }
}
