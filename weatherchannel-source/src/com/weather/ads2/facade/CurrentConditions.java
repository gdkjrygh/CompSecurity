// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.google.common.base.Preconditions;
import com.weather.dal2.data.CurrentConditionsRecord;
import com.weather.dal2.dsx.RecordSets;
import com.weather.dal2.locations.SavedLocation;

// Referenced classes of package com.weather.ads2.facade:
//            Temperature, WxIcon, ParameterFormatter

public final class CurrentConditions
{

    public static final CurrentConditions EMPTY = new CurrentConditions("nl", new Temperature(null), "nl", "nl", "nl", "nl", "nl");
    private static final String VALUE_HIGH = "hi";
    private static final String VALUE_LOW = "lo";
    public final String condition;
    public final String feelsLikeTemperatureInCelsius;
    public final String humidity;
    public final Temperature temperature;
    public final String temperatureInCelsius;
    public final String uv;
    public final String wind;

    public CurrentConditions(RecordSets recordsets, SavedLocation savedlocation)
    {
        Preconditions.checkNotNull(recordsets);
        Preconditions.checkNotNull(savedlocation);
        Object obj = null;
        com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata = obj;
        if (recordsets.hasDataFor(savedlocation))
        {
            recordsets = recordsets.wxdv2MORecord;
            currentconditionsdata = obj;
            if (recordsets != null)
            {
                recordsets = recordsets.getMoDoc();
                currentconditionsdata = obj;
                if (recordsets != null)
                {
                    currentconditionsdata = recordsets.getMoData();
                }
            }
        }
        if (currentconditionsdata != null)
        {
            recordsets = currentconditionsdata.getWeatherIconCode();
            if (recordsets != null)
            {
                condition = WxIcon.getAdText(recordsets.intValue());
            } else
            {
                condition = "";
            }
            temperature = new Temperature(currentconditionsdata.getTemperatureInFahrenheit());
            wind = formatWindSpeed(currentconditionsdata.getWindSpeedInMiles());
            humidity = formatHumidity(currentconditionsdata.getRelativeHumidity());
            uv = formatUV(currentconditionsdata.getUvIndex());
            temperatureInCelsius = ParameterFormatter.formatCelsius(currentconditionsdata.getTemperatureInCelsius());
            feelsLikeTemperatureInCelsius = ParameterFormatter.formatCelsius(currentconditionsdata.getFeelsLikeIndexInCelsius());
            return;
        } else
        {
            condition = "nl";
            wind = "nl";
            humidity = "nl";
            uv = "nl";
            temperature = new Temperature(null);
            temperatureInCelsius = "nl";
            feelsLikeTemperatureInCelsius = "nl";
            return;
        }
    }

    public CurrentConditions(String s, Temperature temperature1, String s1, String s2, String s3, String s4, String s5)
    {
        condition = s;
        temperature = temperature1;
        temperatureInCelsius = s1;
        feelsLikeTemperatureInCelsius = s2;
        wind = s3;
        humidity = s4;
        uv = s5;
    }

    private static String formatHumidity(Integer integer)
    {
        if (integer == null)
        {
            return "nl";
        }
        if (integer.intValue() < 61)
        {
            return "lo";
        } else
        {
            return "hi";
        }
    }

    private static String formatUV(Integer integer)
    {
        if (integer == null || integer.intValue() < 5)
        {
            return "nl";
        } else
        {
            return "hi";
        }
    }

    private static String formatWindSpeed(Integer integer)
    {
        if (integer == null || integer.intValue() < 6)
        {
            return "nl";
        }
        if (integer.intValue() < 30)
        {
            return "lo";
        } else
        {
            return "hi";
        }
    }

}
