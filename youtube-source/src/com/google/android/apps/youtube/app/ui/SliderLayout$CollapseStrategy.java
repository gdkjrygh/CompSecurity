// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class  extends Enum
{

    private static final OCCLUDE $VALUES[];
    public static final OCCLUDE DISPLACE;
    public static final OCCLUDE OCCLUDE;
    public static final OCCLUDE RESIZE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/ui/SliderLayout$CollapseStrategy, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DISPLACE = new <init>("DISPLACE", 0);
        RESIZE = new <init>("RESIZE", 1);
        OCCLUDE = new <init>("OCCLUDE", 2);
        $VALUES = (new .VALUES[] {
            DISPLACE, RESIZE, OCCLUDE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
