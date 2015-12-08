// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;


final class  extends Enum
{

    private static final RIGHTONTOP $VALUES[];
    public static final RIGHTONTOP BOTTOMUP;
    public static final RIGHTONTOP LEFTONTOP;
    public static final RIGHTONTOP RIGHTONTOP;
    public static final RIGHTONTOP UNKNOWN;
    public static final RIGHTONTOP UPRIGHT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/utils/DeviceOrientationHelper$DeviceOrientation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        UPRIGHT = new <init>("UPRIGHT", 1);
        LEFTONTOP = new <init>("LEFTONTOP", 2);
        BOTTOMUP = new <init>("BOTTOMUP", 3);
        RIGHTONTOP = new <init>("RIGHTONTOP", 4);
        $VALUES = (new .VALUES[] {
            UNKNOWN, UPRIGHT, LEFTONTOP, BOTTOMUP, RIGHTONTOP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
