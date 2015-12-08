// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;

import com.weather.util.prefs.Prefs;

public final class AlertPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys BREAKINGNEWS;
        public static final Keys DENSE_FOG;
        public static final Keys EXTREME_COLD;
        public static final Keys EXTREME_HEAT;
        public static final Keys HEAVY_RAIN;
        public static final Keys HEAVY_SNOWFALL;
        public static final Keys HIGH_WIND;
        public static final Keys ICE;
        public static final Keys LIGHTNING_STRIKE;
        public static final Keys POLLEN;
        public static final Keys RAINSNOW;
        public static final Keys REAL_TIME_RAIN;
        public static final Keys SEVERE;
        public static final Keys THUNDERSTORM;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/commons/push/AlertPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            POLLEN = new Keys("POLLEN", 0);
            SEVERE = new Keys("SEVERE", 1);
            RAINSNOW = new Keys("RAINSNOW", 2);
            REAL_TIME_RAIN = new Keys("REAL_TIME_RAIN", 3);
            BREAKINGNEWS = new Keys("BREAKINGNEWS", 4);
            LIGHTNING_STRIKE = new Keys("LIGHTNING_STRIKE", 5);
            HEAVY_RAIN = new Keys("HEAVY_RAIN", 6);
            THUNDERSTORM = new Keys("THUNDERSTORM", 7);
            EXTREME_HEAT = new Keys("EXTREME_HEAT", 8);
            HIGH_WIND = new Keys("HIGH_WIND", 9);
            DENSE_FOG = new Keys("DENSE_FOG", 10);
            EXTREME_COLD = new Keys("EXTREME_COLD", 11);
            HEAVY_SNOWFALL = new Keys("HEAVY_SNOWFALL", 12);
            ICE = new Keys("ICE", 13);
            $VALUES = (new Keys[] {
                POLLEN, SEVERE, RAINSNOW, REAL_TIME_RAIN, BREAKINGNEWS, LIGHTNING_STRIKE, HEAVY_RAIN, THUNDERSTORM, EXTREME_HEAT, HIGH_WIND, 
                DENSE_FOG, EXTREME_COLD, HEAVY_SNOWFALL, ICE
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "ALERTS";
    private static final Prefs INSTANCE = new Prefs("ALERTS");

    private AlertPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
