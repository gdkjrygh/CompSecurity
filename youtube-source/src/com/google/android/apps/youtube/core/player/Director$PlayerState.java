// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


final class  extends Enum
{

    private static final PREPARED $VALUES[];
    public static final PREPARED NOT_PREPARED;
    public static final PREPARED PREPARED;
    public static final PREPARED PREPARING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/player/Director$PlayerState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_PREPARED = new <init>("NOT_PREPARED", 0);
        PREPARING = new <init>("PREPARING", 1);
        PREPARED = new <init>("PREPARED", 2);
        $VALUES = (new .VALUES[] {
            NOT_PREPARED, PREPARING, PREPARED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
