// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class BarCodeDataFormat extends Enum
{

    private static final BarCodeDataFormat $VALUES[];
    public static final BarCodeDataFormat ASCII;
    public static final BarCodeDataFormat BASE_64;
    public static final BarCodeDataFormat UNKNOWN;

    private BarCodeDataFormat(String s, int i)
    {
        super(s, i);
    }

    public static BarCodeDataFormat valueOf(String s)
    {
        return (BarCodeDataFormat)Enum.valueOf(com/kofax/kmc/ken/engines/data/BarCodeDataFormat, s);
    }

    public static BarCodeDataFormat[] values()
    {
        return (BarCodeDataFormat[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new BarCodeDataFormat("UNKNOWN", 0);
        ASCII = new BarCodeDataFormat("ASCII", 1);
        BASE_64 = new BarCodeDataFormat("BASE_64", 2);
        $VALUES = (new BarCodeDataFormat[] {
            UNKNOWN, ASCII, BASE_64
        });
    }
}
