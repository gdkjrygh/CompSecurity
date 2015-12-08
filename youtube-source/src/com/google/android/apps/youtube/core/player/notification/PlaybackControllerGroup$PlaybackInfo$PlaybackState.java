// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;


public final class q extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR BUFFERING;
    public static final ERROR ENDED;
    public static final ERROR ERROR;
    public static final ERROR PAUSED;
    public static final ERROR PLAYING;
    public static final ERROR STOPPED;

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(com/google/android/apps/youtube/core/player/notification/PlaybackControllerGroup$PlaybackInfo$PlaybackState, s);
    }

    public static q[] values()
    {
        return (q[])$VALUES.clone();
    }

    static 
    {
        BUFFERING = new <init>("BUFFERING", 0);
        PAUSED = new <init>("PAUSED", 1);
        PLAYING = new <init>("PLAYING", 2);
        STOPPED = new <init>("STOPPED", 3);
        ENDED = new <init>("ENDED", 4);
        ERROR = new <init>("ERROR", 5);
        $VALUES = (new .VALUES[] {
            BUFFERING, PAUSED, PLAYING, STOPPED, ENDED, ERROR
        });
    }

    private q(String s, int i)
    {
        super(s, i);
    }
}
