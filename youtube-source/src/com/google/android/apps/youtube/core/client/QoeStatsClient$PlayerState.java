// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


final class value extends Enum
{

    private static final PAUSED_BUFFERING $VALUES[];
    public static final PAUSED_BUFFERING BUFFERING;
    public static final PAUSED_BUFFERING ENDED;
    public static final PAUSED_BUFFERING ERROR;
    public static final PAUSED_BUFFERING NOT_PLAYING;
    public static final PAUSED_BUFFERING NOT_VALID;
    public static final PAUSED_BUFFERING PAUSED;
    public static final PAUSED_BUFFERING PAUSED_BUFFERING;
    public static final PAUSED_BUFFERING PLAYING;
    public static final PAUSED_BUFFERING SEEKING;
    private final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/google/android/apps/youtube/core/client/QoeStatsClient$PlayerState, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public final String toString()
    {
        return value;
    }

    static 
    {
        BUFFERING = new <init>("BUFFERING", 0, "B");
        ERROR = new <init>("ERROR", 1, "ER");
        ENDED = new <init>("ENDED", 2, "EN");
        NOT_PLAYING = new <init>("NOT_PLAYING", 3, "N");
        PAUSED = new <init>("PAUSED", 4, "PA");
        PLAYING = new <init>("PLAYING", 5, "PL");
        SEEKING = new <init>("SEEKING", 6, "S");
        NOT_VALID = new <init>("NOT_VALID", 7, "X");
        PAUSED_BUFFERING = new <init>("PAUSED_BUFFERING", 8, "PB");
        $VALUES = (new .VALUES[] {
            BUFFERING, ERROR, ENDED, NOT_PLAYING, PAUSED, PLAYING, SEEKING, NOT_VALID, PAUSED_BUFFERING
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
