// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;


// Referenced classes of package com.weather.commons.push:
//            PushService

public static final class offBeacon extends Enum
{

    private static final ICE $VALUES[];
    public static final ICE BREAKINGNEWS;
    public static final ICE DENSE_FOG;
    public static final ICE EXTREME_COLD;
    public static final ICE EXTREME_HEAT;
    public static final ICE FOLLOWME_LIGHTNING;
    public static final ICE FOLLOWME_SEVERE;
    public static final ICE HEAVY_RAIN;
    public static final ICE HEAVY_SNOWFALL;
    public static final ICE HIGH_WIND;
    public static final ICE ICE;
    public static final ICE POLLEN;
    public static final ICE RAINSNOW;
    public static final ICE REAL_TIME_RAIN;
    public static final ICE SEVERE;
    public static final ICE SIGNIFICANT_WEATHER_FORECAST;
    public static final ICE THUNDERSTORM;
    public final int offBeacon;
    public final int onBeacon;

    public static offBeacon valueOf(String s)
    {
        return (offBeacon)Enum.valueOf(com/weather/commons/push/PushService$ServiceType, s);
    }

    public static offBeacon[] values()
    {
        return (offBeacon[])$VALUES.clone();
    }

    static 
    {
        SEVERE = new <init>("SEVERE", 0, -1, -1);
        POLLEN = new <init>("POLLEN", 1, -1, -1);
        RAINSNOW = new <init>("RAINSNOW", 2, com.weather.commons.tion_rain_snow_on, com.weather.commons.tion_rain_snow_off);
        BREAKINGNEWS = new <init>("BREAKINGNEWS", 3, com.weather.commons.tion_breaking_news_on, com.weather.commons.tion_breaking_news_off);
        REAL_TIME_RAIN = new <init>("REAL_TIME_RAIN", 4, -1, -1);
        FOLLOWME_SEVERE = new <init>("FOLLOWME_SEVERE", 5, -1, -1);
        FOLLOWME_LIGHTNING = new <init>("FOLLOWME_LIGHTNING", 6, -1, -1);
        SIGNIFICANT_WEATHER_FORECAST = new <init>("SIGNIFICANT_WEATHER_FORECAST", 7, -1, -1);
        HEAVY_RAIN = new <init>("HEAVY_RAIN", 8, -1, -1);
        THUNDERSTORM = new <init>("THUNDERSTORM", 9, -1, -1);
        EXTREME_HEAT = new <init>("EXTREME_HEAT", 10, -1, -1);
        HIGH_WIND = new <init>("HIGH_WIND", 11, -1, -1);
        DENSE_FOG = new <init>("DENSE_FOG", 12, -1, -1);
        EXTREME_COLD = new <init>("EXTREME_COLD", 13, -1, -1);
        HEAVY_SNOWFALL = new <init>("HEAVY_SNOWFALL", 14, -1, -1);
        ICE = new <init>("ICE", 15, -1, -1);
        $VALUES = (new .VALUES[] {
            SEVERE, POLLEN, RAINSNOW, BREAKINGNEWS, REAL_TIME_RAIN, FOLLOWME_SEVERE, FOLLOWME_LIGHTNING, SIGNIFICANT_WEATHER_FORECAST, HEAVY_RAIN, THUNDERSTORM, 
            EXTREME_HEAT, HIGH_WIND, DENSE_FOG, EXTREME_COLD, HEAVY_SNOWFALL, ICE
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        onBeacon = j;
        offBeacon = k;
    }
}
