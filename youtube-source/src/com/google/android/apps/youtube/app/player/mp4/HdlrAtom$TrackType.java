// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.player.mp4;


public final class  extends Enum
{

    private static final TRACK_VIDEO $VALUES[];
    public static final TRACK_VIDEO TRACK_AUDIO;
    public static final TRACK_VIDEO TRACK_UNKNOWN;
    public static final TRACK_VIDEO TRACK_VIDEO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/player/mp4/HdlrAtom$TrackType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TRACK_UNKNOWN = new <init>("TRACK_UNKNOWN", 0);
        TRACK_AUDIO = new <init>("TRACK_AUDIO", 1);
        TRACK_VIDEO = new <init>("TRACK_VIDEO", 2);
        $VALUES = (new .VALUES[] {
            TRACK_UNKNOWN, TRACK_AUDIO, TRACK_VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
