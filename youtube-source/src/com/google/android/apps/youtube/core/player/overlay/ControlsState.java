// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


public final class ControlsState extends Enum
{

    private static final ControlsState $VALUES[];
    public static final ControlsState ENDED;
    public static final ControlsState LOADING;
    public static final ControlsState NEW;
    public static final ControlsState PAUSED;
    public static final ControlsState PLAYING;
    public static final ControlsState RECOVERABLE_ERROR;
    public static final ControlsState UNRECOVERABLE_ERROR;

    private ControlsState(String s, int i)
    {
        super(s, i);
    }

    public static ControlsState valueOf(String s)
    {
        return (ControlsState)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/ControlsState, s);
    }

    public static ControlsState[] values()
    {
        return (ControlsState[])$VALUES.clone();
    }

    public final boolean isError()
    {
        return this == RECOVERABLE_ERROR || this == UNRECOVERABLE_ERROR;
    }

    public final boolean isOnVideo()
    {
        return isReady() || this == LOADING;
    }

    public final boolean isReady()
    {
        return this == PLAYING || this == PAUSED || this == ENDED;
    }

    static 
    {
        NEW = new ControlsState("NEW", 0);
        PLAYING = new ControlsState("PLAYING", 1);
        PAUSED = new ControlsState("PAUSED", 2);
        LOADING = new ControlsState("LOADING", 3);
        RECOVERABLE_ERROR = new ControlsState("RECOVERABLE_ERROR", 4);
        UNRECOVERABLE_ERROR = new ControlsState("UNRECOVERABLE_ERROR", 5);
        ENDED = new ControlsState("ENDED", 6);
        $VALUES = (new ControlsState[] {
            NEW, PLAYING, PAUSED, LOADING, RECOVERABLE_ERROR, UNRECOVERABLE_ERROR, ENDED
        });
    }
}
