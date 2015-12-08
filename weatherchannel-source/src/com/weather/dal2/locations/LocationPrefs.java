// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.weather.util.prefs.Prefs;

public final class LocationPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys FIXED_LOCATIONS;
        public static final Keys FOLLOW_ME;
        public static final Keys WIDGET_LOCATIONS;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/dal2/locations/LocationPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            FIXED_LOCATIONS = new Keys("FIXED_LOCATIONS", 0);
            WIDGET_LOCATIONS = new Keys("WIDGET_LOCATIONS", 1);
            FOLLOW_ME = new Keys("FOLLOW_ME", 2);
            $VALUES = (new Keys[] {
                FIXED_LOCATIONS, WIDGET_LOCATIONS, FOLLOW_ME
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "DAL2_LOCATION_PREFS";
    private static final Prefs INSTANCE = new Prefs("DAL2_LOCATION_PREFS");

    private LocationPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
