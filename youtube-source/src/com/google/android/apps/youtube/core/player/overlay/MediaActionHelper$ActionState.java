// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


public final class  extends Enum
{

    private static final GONE $VALUES[];
    public static final GONE ACTIVE;
    public static final GONE GONE;
    public static final GONE INACTIVE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/MediaActionHelper$ActionState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ACTIVE = new <init>("ACTIVE", 0);
        INACTIVE = new <init>("INACTIVE", 1);
        GONE = new <init>("GONE", 2);
        $VALUES = (new .VALUES[] {
            ACTIVE, INACTIVE, GONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
