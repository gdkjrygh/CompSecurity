// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;


public final class UnitConversionUtil
{

    private static final double KILOMETERS_PER_MILE = 1.60934D;

    private UnitConversionUtil()
    {
    }

    public static int convertMilesToKilometers(int i)
    {
        return (int)((double)i * 1.60934D);
    }
}
