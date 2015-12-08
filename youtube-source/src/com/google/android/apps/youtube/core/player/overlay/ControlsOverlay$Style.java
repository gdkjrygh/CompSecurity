// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


public final class supportsShowTime extends Enum
{

    private static final LIVE $VALUES[];
    public static final LIVE AD;
    public static final LIVE LIVE;
    public static final LIVE REMOTE;
    public static final LIVE YOUTUBE;
    public final boolean alwaysVisibleTimeBar;
    public final int progressColor;
    public final boolean supportsBuffered;
    public final boolean supportsNextPrevious;
    public final boolean supportsPlayHQCC;
    public final boolean supportsScrubber;
    public final boolean supportsShowTime;
    public final boolean supportsTimeBar;

    public static supportsShowTime valueOf(String s)
    {
        return (supportsShowTime)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/ControlsOverlay$Style, s);
    }

    public static supportsShowTime[] values()
    {
        return (supportsShowTime[])$VALUES.clone();
    }

    static 
    {
        YOUTUBE = new <init>("YOUTUBE", 0, true, 0xb2cc181e, true, true, true, true, false, true);
        REMOTE = new <init>("REMOTE", 1, true, 0xb2cc181e, false, true, true, true, false, true);
        AD = new <init>("AD", 2, true, 0xffe8bb2b, false, false, true, false, true, false);
        LIVE = new <init>("LIVE", 3, true, 0xb2cc181e, false, false, true, true, false, false);
        $VALUES = (new .VALUES[] {
            YOUTUBE, REMOTE, AD, LIVE
        });
    }

    private (String s, int i, boolean flag, int j, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, boolean flag6)
    {
        super(s, i);
        supportsTimeBar = flag;
        progressColor = j;
        supportsBuffered = flag1;
        supportsScrubber = flag2;
        supportsPlayHQCC = flag3;
        supportsNextPrevious = flag4;
        alwaysVisibleTimeBar = flag5;
        supportsShowTime = flag6;
    }
}
