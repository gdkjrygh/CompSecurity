// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;


// Referenced classes of package com.weather.ads2.facade:
//            Temperature

private static final class <init>
{

    private final int maxTemperature;
    private final String value;

    public boolean isTemperatureInRange(int i)
    {
        return i <= maxTemperature;
    }


    private (int i, String s)
    {
        maxTemperature = i;
        value = s;
    }

    value(int i, String s, value value1)
    {
        this(i, s);
    }
}
