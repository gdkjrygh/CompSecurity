// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;


public final class  extends Enum
{

    private static final PAUSED $VALUES[];
    public static final PAUSED PAUSED;
    public static final PAUSED PLAYING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/api/jar/ApiTvControlsView$PlaybackState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PLAYING = new <init>("PLAYING", 0);
        PAUSED = new <init>("PAUSED", 1);
        $VALUES = (new .VALUES[] {
            PLAYING, PAUSED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
