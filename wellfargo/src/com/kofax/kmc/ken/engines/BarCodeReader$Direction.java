// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;


public final class a extends Enum
{

    public static final ALL ALL;
    public static final ALL BOTTOM_UP;
    public static final ALL LEFT_RIGHT;
    public static final ALL RIGHT_LEFT;
    public static final ALL TOP_DOWN;
    private static final ALL b[];
    private final int a;

    static int a(a a1)
    {
        return a1.a;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/kofax/kmc/ken/engines/BarCodeReader$Direction, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    static 
    {
        LEFT_RIGHT = new <init>("LEFT_RIGHT", 0, 1);
        RIGHT_LEFT = new <init>("RIGHT_LEFT", 1, 4);
        TOP_DOWN = new <init>("TOP_DOWN", 2, 2);
        BOTTOM_UP = new <init>("BOTTOM_UP", 3, 8);
        ALL = new <init>("ALL", 4, LEFT_RIGHT.a | RIGHT_LEFT.a | TOP_DOWN.a | BOTTOM_UP.a);
        b = (new b[] {
            LEFT_RIGHT, RIGHT_LEFT, TOP_DOWN, BOTTOM_UP, ALL
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
