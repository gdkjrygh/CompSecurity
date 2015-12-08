// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


public final class  extends Enum
{

    public static final INFINITY AUTO;
    public static final INFINITY CONTINUOUS_PICTURE;
    public static final INFINITY CONTINUOUS_VIDEO;
    public static final INFINITY DELAYED_CONTINUOUS_PICTURE;
    public static final INFINITY DELAYED_CONTINUOUS_VIDEO;
    public static final INFINITY INFINITY;
    private static final INFINITY a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kui/uicontrols/ICameraSource$FocusMode, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        AUTO = new <init>("AUTO", 0);
        DELAYED_CONTINUOUS_PICTURE = new <init>("DELAYED_CONTINUOUS_PICTURE", 1);
        DELAYED_CONTINUOUS_VIDEO = new <init>("DELAYED_CONTINUOUS_VIDEO", 2);
        CONTINUOUS_PICTURE = new <init>("CONTINUOUS_PICTURE", 3);
        CONTINUOUS_VIDEO = new <init>("CONTINUOUS_VIDEO", 4);
        INFINITY = new <init>("INFINITY", 5);
        a = (new a[] {
            AUTO, DELAYED_CONTINUOUS_PICTURE, DELAYED_CONTINUOUS_VIDEO, CONTINUOUS_PICTURE, CONTINUOUS_VIDEO, INFINITY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
