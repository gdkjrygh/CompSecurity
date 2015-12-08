// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


final class  extends Enum
{

    private static final PAUSED $VALUES[];
    public static final PAUSED IDLE;
    public static final PAUSED PAUSED;
    public static final PAUSED PLAYING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/TvWidevineMediaPlayer$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IDLE = new <init>("IDLE", 0);
        PLAYING = new <init>("PLAYING", 1);
        PAUSED = new <init>("PAUSED", 2);
        $VALUES = (new .VALUES[] {
            IDLE, PLAYING, PAUSED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
