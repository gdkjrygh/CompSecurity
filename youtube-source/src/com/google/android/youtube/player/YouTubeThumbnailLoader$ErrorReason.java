// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;


public final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN INTERNAL_ERROR;
    public static final UNKNOWN NETWORK_ERROR;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/youtube/player/YouTubeThumbnailLoader$ErrorReason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 0);
        INTERNAL_ERROR = new <init>("INTERNAL_ERROR", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            NETWORK_ERROR, INTERNAL_ERROR, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
