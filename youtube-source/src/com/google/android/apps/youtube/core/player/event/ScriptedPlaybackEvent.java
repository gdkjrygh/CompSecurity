// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.event;


public final class ScriptedPlaybackEvent extends Enum
{

    private static final ScriptedPlaybackEvent $VALUES[];
    public static final ScriptedPlaybackEvent NAVIGATION;
    public static final ScriptedPlaybackEvent PLAYER_CONTROL;

    private ScriptedPlaybackEvent(String s, int i)
    {
        super(s, i);
    }

    public static ScriptedPlaybackEvent valueOf(String s)
    {
        return (ScriptedPlaybackEvent)Enum.valueOf(com/google/android/apps/youtube/core/player/event/ScriptedPlaybackEvent, s);
    }

    public static ScriptedPlaybackEvent[] values()
    {
        return (ScriptedPlaybackEvent[])$VALUES.clone();
    }

    static 
    {
        NAVIGATION = new ScriptedPlaybackEvent("NAVIGATION", 0);
        PLAYER_CONTROL = new ScriptedPlaybackEvent("PLAYER_CONTROL", 1);
        $VALUES = (new ScriptedPlaybackEvent[] {
            NAVIGATION, PLAYER_CONTROL
        });
    }
}
