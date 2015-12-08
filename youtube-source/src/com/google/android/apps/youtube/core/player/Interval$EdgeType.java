// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


public final class  extends Enum
{

    private static final EXIT $VALUES[];
    public static final EXIT ENTER;
    public static final EXIT EXIT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/Interval$EdgeType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ENTER = new <init>("ENTER", 0);
        EXIT = new <init>("EXIT", 1);
        $VALUES = (new .VALUES[] {
            ENTER, EXIT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
