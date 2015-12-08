// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


public final class  extends Enum
{

    private static final ALL $VALUES[];
    public static final ALL ALL;
    public static final ALL BOTTOM_EDGE;
    public static final ALL LEFT_EDGE;
    public static final ALL RIGHT_EDGE;
    public static final ALL TOP_EDGE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/ui/SliderLayout$TouchInterceptArea, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LEFT_EDGE = new <init>("LEFT_EDGE", 0);
        TOP_EDGE = new <init>("TOP_EDGE", 1);
        RIGHT_EDGE = new <init>("RIGHT_EDGE", 2);
        BOTTOM_EDGE = new <init>("BOTTOM_EDGE", 3);
        ALL = new <init>("ALL", 4);
        $VALUES = (new .VALUES[] {
            LEFT_EDGE, TOP_EDGE, RIGHT_EDGE, BOTTOM_EDGE, ALL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
