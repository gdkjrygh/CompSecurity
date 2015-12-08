// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


final class  extends Enum
{

    private static final SKIPPABLE $VALUES[];
    public static final SKIPPABLE NOT_SKIPPABLE;
    public static final SKIPPABLE SKIPPABLE;
    public static final SKIPPABLE WAITING_TO_SKIP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/DefaultAdOverlay$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_SKIPPABLE = new <init>("NOT_SKIPPABLE", 0);
        WAITING_TO_SKIP = new <init>("WAITING_TO_SKIP", 1);
        SKIPPABLE = new <init>("SKIPPABLE", 2);
        $VALUES = (new .VALUES[] {
            NOT_SKIPPABLE, WAITING_TO_SKIP, SKIPPABLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
