// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.Temperature;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.dal2.locations.SavedLocation;

public final class LocationDisplayItem
{

    public final String formattedLocationName;
    public final int iconNumber;
    public final int severityLevel;
    public final Temperature temperature;

    public LocationDisplayItem(CurrentWeatherFacade currentweatherfacade, SavedLocation savedlocation)
    {
        Temperature temperature1;
        int i;
        if (currentweatherfacade.isEmpty())
        {
            i = 44;
        } else
        {
            i = currentweatherfacade.getSkyCode();
        }
        iconNumber = i;
        if (currentweatherfacade.isEmpty())
        {
            temperature1 = Temperature.NONE;
        } else
        {
            temperature1 = currentweatherfacade.getCurrentTemp();
        }
        temperature = temperature1;
        formattedLocationName = savedlocation.getNickname();
        savedlocation = currentweatherfacade.getWeatherAlertsFacade();
        if (currentweatherfacade.isEmpty() || savedlocation == null)
        {
            i = 4;
        } else
        {
            i = savedlocation.getLowestSeverityNumber();
        }
        severityLevel = i;
    }

    public String toString()
    {
        return formattedLocationName;
    }
}
