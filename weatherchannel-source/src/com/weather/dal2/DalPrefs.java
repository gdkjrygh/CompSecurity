// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2;

import com.weather.util.prefs.Prefs;

public final class DalPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys DEMOGRAPHICS_AGE_RANGE;
        public static final Keys DEMOGRAPHICS_CABLE_PROVIDER;
        public static final Keys DEMOGRAPHICS_DOB;
        public static final Keys DEMOGRAPHICS_EMAIL;
        public static final Keys DEMOGRAPHICS_GENDER;
        public static final Keys DEMOGRAPHICS_USERNAME;
        public static final Keys DSX_KEY;
        public static final Keys IS_APP_RUNNING;
        public static final Keys IS_SCREEN_MONITOR_REGISTERED;
        public static final Keys LAST_LATITUDE;
        public static final Keys LAST_LBS_SERVICE_INTENT;
        public static final Keys LAST_LONGITUDE;
        public static final Keys LAST_UPDATE_TIME;
        public static final Keys LOGGED_IN_ACCOUNT_ID;
        public static final Keys LOGGED_IN_ACCOUNT_TYPE_ID;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/dal2/DalPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            LAST_UPDATE_TIME = new Keys("LAST_UPDATE_TIME", 0);
            DSX_KEY = new Keys("DSX_KEY", 1);
            IS_SCREEN_MONITOR_REGISTERED = new Keys("IS_SCREEN_MONITOR_REGISTERED", 2);
            LAST_LBS_SERVICE_INTENT = new Keys("LAST_LBS_SERVICE_INTENT", 3);
            LAST_LATITUDE = new Keys("LAST_LATITUDE", 4);
            LAST_LONGITUDE = new Keys("LAST_LONGITUDE", 5);
            IS_APP_RUNNING = new Keys("IS_APP_RUNNING", 6);
            DEMOGRAPHICS_USERNAME = new Keys("DEMOGRAPHICS_USERNAME", 7);
            DEMOGRAPHICS_AGE_RANGE = new Keys("DEMOGRAPHICS_AGE_RANGE", 8);
            DEMOGRAPHICS_DOB = new Keys("DEMOGRAPHICS_DOB", 9);
            DEMOGRAPHICS_EMAIL = new Keys("DEMOGRAPHICS_EMAIL", 10);
            DEMOGRAPHICS_GENDER = new Keys("DEMOGRAPHICS_GENDER", 11);
            DEMOGRAPHICS_CABLE_PROVIDER = new Keys("DEMOGRAPHICS_CABLE_PROVIDER", 12);
            LOGGED_IN_ACCOUNT_TYPE_ID = new Keys("LOGGED_IN_ACCOUNT_TYPE_ID", 13);
            LOGGED_IN_ACCOUNT_ID = new Keys("LOGGED_IN_ACCOUNT_ID", 14);
            $VALUES = (new Keys[] {
                LAST_UPDATE_TIME, DSX_KEY, IS_SCREEN_MONITOR_REGISTERED, LAST_LBS_SERVICE_INTENT, LAST_LATITUDE, LAST_LONGITUDE, IS_APP_RUNNING, DEMOGRAPHICS_USERNAME, DEMOGRAPHICS_AGE_RANGE, DEMOGRAPHICS_DOB, 
                DEMOGRAPHICS_EMAIL, DEMOGRAPHICS_GENDER, DEMOGRAPHICS_CABLE_PROVIDER, LOGGED_IN_ACCOUNT_TYPE_ID, LOGGED_IN_ACCOUNT_ID
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "DAL_PREFS";
    private static final Prefs INSTANCE = new Prefs("DAL_PREFS");

    private DalPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
