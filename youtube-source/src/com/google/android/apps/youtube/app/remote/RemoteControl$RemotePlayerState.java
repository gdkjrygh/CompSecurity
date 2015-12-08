// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;


public final class code extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ADVERTISEMENT;
    public static final UNKNOWN BUFFERING;
    public static final UNKNOWN ENDED;
    public static final UNKNOWN ERROR;
    public static final UNKNOWN PAUSED;
    public static final UNKNOWN PLAYING;
    public static final UNKNOWN UNCONFIRMED;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN UNSTARTED;
    public static final UNKNOWN VIDEO_CUED;
    private final int code;

    public static code valueOf(int i)
    {
        code acode[] = values();
        int k = acode.length;
        for (int j = 0; j < k; j++)
        {
            code code1 = acode[j];
            if (code1.code == i)
            {
                return code1;
            }
        }

        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/google/android/apps/youtube/app/remote/RemoteControl$RemotePlayerState, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    static 
    {
        UNSTARTED = new <init>("UNSTARTED", 0, -1);
        ENDED = new <init>("ENDED", 1, 0);
        PLAYING = new <init>("PLAYING", 2, 1);
        PAUSED = new <init>("PAUSED", 3, 2);
        BUFFERING = new <init>("BUFFERING", 4, 3);
        VIDEO_CUED = new <init>("VIDEO_CUED", 5, 5);
        ADVERTISEMENT = new <init>("ADVERTISEMENT", 6, 1081);
        UNCONFIRMED = new <init>("UNCONFIRMED", 7, -8002);
        ERROR = new <init>("ERROR", 8, -8003);
        UNKNOWN = new <init>("UNKNOWN", 9, -8001);
        $VALUES = (new .VALUES[] {
            UNSTARTED, ENDED, PLAYING, PAUSED, BUFFERING, VIDEO_CUED, ADVERTISEMENT, UNCONFIRMED, ERROR, UNKNOWN
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
