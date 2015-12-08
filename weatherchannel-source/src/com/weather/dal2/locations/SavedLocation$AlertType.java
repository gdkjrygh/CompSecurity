// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.weather.util.enums.EnumConverter;
import com.weather.util.enums.ReverseEnumMap;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.weather.dal2.locations:
//            SavedLocation

public static final class value extends Enum
    implements EnumConverter
{

    private static final ice $VALUES[];
    public static final List SIGNIFICANT_WEATHER_ALERTS_LIST;
    public static final ice STATIC;
    public static final ice breaking;
    public static final ice dense_fog;
    public static final ice extreme_cold;
    public static final ice extreme_heat;
    public static final ice flu;
    public static final ice heavy_rain;
    public static final ice heavy_snowfall;
    public static final ice high_wind;
    public static final ice ice;
    public static final ice lightning;
    private static final ReverseEnumMap map = new ReverseEnumMap(com/weather/dal2/locations/SavedLocation$AlertType);
    public static final ice pollen;
    public static final ice rainSnow;
    public static final ice realTimeRain;
    public static final ice severe;
    public static final ice significantWeatherForecast;
    public static final ice ski;
    public static final ice temperature;
    public static final ice thunderstorm;
    private static final Function toStringFunction = new Function() {

        public volatile Object apply(Object obj)
        {
            return apply((SavedLocation.AlertType)obj);
        }

        public String apply(SavedLocation.AlertType alerttype)
        {
            if (alerttype == null)
            {
                return null;
            } else
            {
                return alerttype.convert();
            }
        }

    };
    public static final convert traffic;
    public static final convert weekend;
    private final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/weather/dal2/locations/SavedLocation$AlertType, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public e_3B_.clone convert(String s)
    {
        return (e_3B_.clone)map.get(s);
    }

    public volatile Enum convert(String s)
    {
        return convert(s);
    }

    public String convert()
    {
        return value;
    }

    static 
    {
        temperature = new <init>("temperature", 0, "temperature");
        severe = new <init>("severe", 1, "severe");
        realTimeRain = new <init>("realTimeRain", 2, "realTimeRain");
        breaking = new <init>("breaking", 3, "breaking");
        pollen = new <init>("pollen", 4, "pollen");
        rainSnow = new <init>("rainSnow", 5, "rainSnow");
        weekend = new <init>("weekend", 6, "weekend");
        lightning = new <init>("lightning", 7, "lightning");
        traffic = new <init>("traffic", 8, "traffic");
        ski = new <init>("ski", 9, "ski");
        flu = new <init>("flu", 10, "flu");
        significantWeatherForecast = new <init>("significantWeatherForecast", 11, "significantWeatherForecast");
        heavy_rain = new <init>("heavy_rain", 12, "heavy-rain");
        thunderstorm = new <init>("thunderstorm", 13, "thunder-storm");
        extreme_heat = new <init>("extreme_heat", 14, "extreme-heat");
        high_wind = new <init>("high_wind", 15, "high-wind");
        dense_fog = new <init>("dense_fog", 16, "dense-fog");
        extreme_cold = new <init>("extreme_cold", 17, "extreme-cold");
        heavy_snowfall = new <init>("heavy_snowfall", 18, "heavy-snowfall");
        ice = new <init>("ice", 19, "ice");
        $VALUES = (new .VALUES[] {
            temperature, severe, realTimeRain, breaking, pollen, rainSnow, weekend, lightning, traffic, ski, 
            flu, significantWeatherForecast, heavy_rain, thunderstorm, extreme_heat, high_wind, dense_fog, extreme_cold, heavy_snowfall, ice
        });
        STATIC = temperature;
        SIGNIFICANT_WEATHER_ALERTS_LIST = Arrays.asList(new SIGNIFICANT_WEATHER_ALERTS_LIST[] {
            heavy_rain, thunderstorm, extreme_heat, high_wind, dense_fog, extreme_cold, heavy_snowfall, ice
        });
    }


    private _cls1(String s, int i, String s1)
    {
        super(s, i);
        value = (String)Preconditions.checkNotNull(s1);
    }
}
