// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.lotame;

import com.weather.util.prefs.Prefs;

final class LotamePrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys AUDIENCE_EXPIRES_AT;
        public static final Keys AUDIENCE_VALUE;
        public static final Keys LAST_V1_UPDATE;
        public static final Keys LPID_EXPIRES_AT;
        public static final Keys LPID_VALUE;
        public static final Keys TPID_EXPIRES_AT;
        public static final Keys TPID_VALUE;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/ads2/lotame/LotamePrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            AUDIENCE_VALUE = new Keys("AUDIENCE_VALUE", 0);
            AUDIENCE_EXPIRES_AT = new Keys("AUDIENCE_EXPIRES_AT", 1);
            TPID_VALUE = new Keys("TPID_VALUE", 2);
            LPID_VALUE = new Keys("LPID_VALUE", 3);
            TPID_EXPIRES_AT = new Keys("TPID_EXPIRES_AT", 4);
            LPID_EXPIRES_AT = new Keys("LPID_EXPIRES_AT", 5);
            LAST_V1_UPDATE = new Keys("LAST_V1_UPDATE", 6);
            $VALUES = (new Keys[] {
                AUDIENCE_VALUE, AUDIENCE_EXPIRES_AT, TPID_VALUE, LPID_VALUE, TPID_EXPIRES_AT, LPID_EXPIRES_AT, LAST_V1_UPDATE
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "LOTAME_PREFS";
    private static final Prefs INSTANCE = new Prefs("LOTAME_PREFS");
    public static final String PREF_NAME = "lotameprefs";

    private LotamePrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
