// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class BarCodeDirection extends Enum
{

    private static final BarCodeDirection $VALUES[];
    public static final BarCodeDirection BOTTOM_UP;
    public static final BarCodeDirection LEFT_RIGHT;
    public static final BarCodeDirection RIGHT_LEFT;
    public static final BarCodeDirection TOP_DOWN;
    public static final BarCodeDirection UNKNOWN;

    private BarCodeDirection(String s, int i)
    {
        super(s, i);
    }

    public static BarCodeDirection valueOf(String s)
    {
        return (BarCodeDirection)Enum.valueOf(com/kofax/kmc/ken/engines/data/BarCodeDirection, s);
    }

    public static BarCodeDirection[] values()
    {
        return (BarCodeDirection[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new BarCodeDirection("UNKNOWN", 0);
        LEFT_RIGHT = new BarCodeDirection("LEFT_RIGHT", 1);
        TOP_DOWN = new BarCodeDirection("TOP_DOWN", 2);
        RIGHT_LEFT = new BarCodeDirection("RIGHT_LEFT", 3);
        BOTTOM_UP = new BarCodeDirection("BOTTOM_UP", 4);
        $VALUES = (new BarCodeDirection[] {
            UNKNOWN, LEFT_RIGHT, TOP_DOWN, RIGHT_LEFT, BOTTOM_UP
        });
    }
}
