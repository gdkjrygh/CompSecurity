// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;


public final class UnitType extends Enum
{

    private static final UnitType $VALUES[];
    public static final UnitType ENGLISH;
    public static final UnitType HYBRID;
    public static final UnitType METRIC;
    private final int index;

    private UnitType(String s, int i, int j)
    {
        super(s, i);
        index = j;
    }

    public static UnitType valueOf(String s)
    {
        return (UnitType)Enum.valueOf(com/weather/util/UnitType, s);
    }

    public static UnitType[] values()
    {
        return (UnitType[])$VALUES.clone();
    }

    public int getIndex()
    {
        return index;
    }

    static 
    {
        ENGLISH = new UnitType("ENGLISH", 0, 0);
        METRIC = new UnitType("METRIC", 1, 1);
        HYBRID = new UnitType("HYBRID", 2, 2);
        $VALUES = (new UnitType[] {
            ENGLISH, METRIC, HYBRID
        });
    }
}
