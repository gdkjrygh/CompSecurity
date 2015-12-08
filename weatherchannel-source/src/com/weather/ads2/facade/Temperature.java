// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

public final class Temperature
{
    private static final class TemperatureRange
    {

        private final int maxTemperature;
        private final String value;

        public boolean isTemperatureInRange(int i)
        {
            return i <= maxTemperature;
        }


        private TemperatureRange(int i, String s)
        {
            maxTemperature = i;
            value = s;
        }

    }


    private static final List TEMPERATURE_RANGES = ImmutableList.of(new TemperatureRange(31, "icy"), new TemperatureRange(40, "cold"), new TemperatureRange(55, "thaw"), new TemperatureRange(69, "cool"), new TemperatureRange(79, "mod"), new TemperatureRange(89, "warm"), new TemperatureRange(100, "hot"), new TemperatureRange(0x7fffffff, "xhot"));
    public final String increment;
    public final String range;

    public Temperature(Integer integer)
    {
        if (integer == null)
        {
            increment = "nl";
            range = "nl";
            return;
        } else
        {
            increment = formatTemperature(integer.intValue());
            range = formatTemperatureRange(integer.intValue());
            return;
        }
    }

    private String formatTemperature(int i)
    {
        if (i < 20 || i > 100)
        {
            return "nl";
        }
        if (i == 100)
        {
            return "90h";
        }
        int j = i % 10;
        StringBuilder stringbuilder = (new StringBuilder()).append(String.valueOf(i - j));
        String s;
        if (j < 5)
        {
            s = "l";
        } else
        {
            s = "h";
        }
        return stringbuilder.append(s).toString();
    }

    private String formatTemperatureRange(int i)
    {
        for (Iterator iterator = TEMPERATURE_RANGES.iterator(); iterator.hasNext();)
        {
            TemperatureRange temperaturerange = (TemperatureRange)iterator.next();
            if (temperaturerange.isTemperatureInRange(i))
            {
                return temperaturerange.value;
            }
        }

        throw new RuntimeException("Temperature not found in any range.  The range list has become corrupt");
    }

}
