// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;


final class ParameterFormatter
{

    private static final int MAX_TEMP_CELSIUS = 50;
    private static final int MIN_TEMP_CELSIUS = -10;

    private ParameterFormatter()
    {
    }

    static String formatCelsius(Integer integer)
    {
        if (integer == null)
        {
            return "nl";
        } else
        {
            return String.valueOf(Math.min(50, Math.max(-10, integer.intValue())));
        }
    }
}
