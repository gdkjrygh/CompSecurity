// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;


// Referenced classes of package com.weather.commons.push:
//            AlertPrefs

public static final class  extends Enum
{

    private static final ICE $VALUES[];
    public static final ICE BREAKINGNEWS;
    public static final ICE DENSE_FOG;
    public static final ICE EXTREME_COLD;
    public static final ICE EXTREME_HEAT;
    public static final ICE HEAVY_RAIN;
    public static final ICE HEAVY_SNOWFALL;
    public static final ICE HIGH_WIND;
    public static final ICE ICE;
    public static final ICE LIGHTNING_STRIKE;
    public static final ICE POLLEN;
    public static final ICE RAINSNOW;
    public static final ICE REAL_TIME_RAIN;
    public static final ICE SEVERE;
    public static final ICE THUNDERSTORM;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/push/AlertPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        POLLEN = new <init>("POLLEN", 0);
        SEVERE = new <init>("SEVERE", 1);
        RAINSNOW = new <init>("RAINSNOW", 2);
        REAL_TIME_RAIN = new <init>("REAL_TIME_RAIN", 3);
        BREAKINGNEWS = new <init>("BREAKINGNEWS", 4);
        LIGHTNING_STRIKE = new <init>("LIGHTNING_STRIKE", 5);
        HEAVY_RAIN = new <init>("HEAVY_RAIN", 6);
        THUNDERSTORM = new <init>("THUNDERSTORM", 7);
        EXTREME_HEAT = new <init>("EXTREME_HEAT", 8);
        HIGH_WIND = new <init>("HIGH_WIND", 9);
        DENSE_FOG = new <init>("DENSE_FOG", 10);
        EXTREME_COLD = new <init>("EXTREME_COLD", 11);
        HEAVY_SNOWFALL = new <init>("HEAVY_SNOWFALL", 12);
        ICE = new <init>("ICE", 13);
        $VALUES = (new .VALUES[] {
            POLLEN, SEVERE, RAINSNOW, REAL_TIME_RAIN, BREAKINGNEWS, LIGHTNING_STRIKE, HEAVY_RAIN, THUNDERSTORM, EXTREME_HEAT, HIGH_WIND, 
            DENSE_FOG, EXTREME_COLD, HEAVY_SNOWFALL, ICE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
