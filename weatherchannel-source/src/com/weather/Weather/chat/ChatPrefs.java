// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import com.weather.util.prefs.Prefs;

public final class ChatPrefs
{
    public static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys HAS_LAUNCHED;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/weather/Weather/chat/ChatPrefs$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            HAS_LAUNCHED = new Keys("HAS_LAUNCHED", 0);
            $VALUES = (new Keys[] {
                HAS_LAUNCHED
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FILE_NAME = "CHAT_PREFS";
    private static final Prefs INSTANCE = new Prefs("CHAT_PREFS");

    private ChatPrefs()
    {
    }

    public static Prefs getInstance()
    {
        return INSTANCE;
    }

}
