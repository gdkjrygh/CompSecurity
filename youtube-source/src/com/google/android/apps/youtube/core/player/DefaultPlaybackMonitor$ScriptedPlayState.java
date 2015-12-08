// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


final class  extends Enum
{

    private static final USER_PLAY $VALUES[];
    public static final USER_PLAY SCRIPTED_NAVIGATION_PENDING;
    public static final USER_PLAY SCRIPTED_PLAY;
    public static final USER_PLAY USER_PLAY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/DefaultPlaybackMonitor$ScriptedPlayState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SCRIPTED_NAVIGATION_PENDING = new <init>("SCRIPTED_NAVIGATION_PENDING", 0);
        SCRIPTED_PLAY = new <init>("SCRIPTED_PLAY", 1);
        USER_PLAY = new <init>("USER_PLAY", 2);
        $VALUES = (new .VALUES[] {
            SCRIPTED_NAVIGATION_PENDING, SCRIPTED_PLAY, USER_PLAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
