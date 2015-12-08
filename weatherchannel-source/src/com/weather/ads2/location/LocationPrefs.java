// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.location;

import com.weather.util.prefs.Prefs;

final class LocationPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys LATITUDE;
        public static final Keys LONGITUDE;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/ads2/location/LocationPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            LATITUDE = new Keys("LATITUDE", 0);
            LONGITUDE = new Keys("LONGITUDE", 1);
            $VALUES = (new Keys[] {
                LATITUDE, LONGITUDE
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "DEVICE_LOCATION_PREFS";
    private static final Prefs INSTANCE = new Prefs("DEVICE_LOCATION_PREFS");

    private LocationPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
