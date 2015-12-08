// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.factual;

import com.weather.util.prefs.Prefs;

public class FactualPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys AUDIENCE;
        public static final Keys DOCUMENT;
        public static final Keys PROXIMITY;
        public static final Keys UPDATE_TIME;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/ads2/factual/FactualPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            DOCUMENT = new Keys("DOCUMENT", 0);
            UPDATE_TIME = new Keys("UPDATE_TIME", 1);
            AUDIENCE = new Keys("AUDIENCE", 2);
            PROXIMITY = new Keys("PROXIMITY", 3);
            $VALUES = (new Keys[] {
                DOCUMENT, UPDATE_TIME, AUDIENCE, PROXIMITY
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "FACTUAL";
    private static final Prefs INSTANCE = new Prefs("FACTUAL");
    public static final String PREF_NAME = "FACTUAL";

    private FactualPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
