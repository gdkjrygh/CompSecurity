// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import com.weather.util.prefs.Prefs;

public class CheckinPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys HAS_LAUNCHED;
        public static final Keys LAST_CHECKIN_CODE;
        public static final Keys LAST_CHECKIN_ID;
        public static final Keys LAST_CHECKIN_LAT;
        public static final Keys LAST_CHECKIN_LONG;
        public static final Keys LAST_CHECKIN_TIME;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/Weather/checkin/CheckinPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            LAST_CHECKIN_TIME = new Keys("LAST_CHECKIN_TIME", 0);
            LAST_CHECKIN_ID = new Keys("LAST_CHECKIN_ID", 1);
            LAST_CHECKIN_LAT = new Keys("LAST_CHECKIN_LAT", 2);
            LAST_CHECKIN_LONG = new Keys("LAST_CHECKIN_LONG", 3);
            LAST_CHECKIN_CODE = new Keys("LAST_CHECKIN_CODE", 4);
            HAS_LAUNCHED = new Keys("HAS_LAUNCHED", 5);
            $VALUES = (new Keys[] {
                LAST_CHECKIN_TIME, LAST_CHECKIN_ID, LAST_CHECKIN_LAT, LAST_CHECKIN_LONG, LAST_CHECKIN_CODE, HAS_LAUNCHED
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "CHECKIN_PREFS";
    private static final Prefs INSTANCE = new Prefs("CHECKIN_PREFS");

    private CheckinPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
