// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;

import com.weather.util.prefs.Prefs;

final class WeatherFxPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys EXPIRES_AT;
        public static final Keys VALUE;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/ads2/weatherfx/WeatherFxPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            VALUE = new Keys("VALUE", 0);
            EXPIRES_AT = new Keys("EXPIRES_AT", 1);
            $VALUES = (new Keys[] {
                VALUE, EXPIRES_AT
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "WEATHERFX_PREFS";
    private static final Prefs INSTANCE = new Prefs("WEATHERFX_PREFS");
    public static final String PREF_NAME = "weatherfxprefs";

    private WeatherFxPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
