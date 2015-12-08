// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import java.util.Locale;

public final class LocationUtils
{

    static final Object LOCATION_LOCK = new Object();

    private LocationUtils()
    {
    }

    public static String formatLatLong(double d, double d1, int i)
    {
        if (i > -1)
        {
            String s = (new StringBuilder()).append("%.").append(i).append("f,%.").append(i).append('f').toString();
            return String.format(Locale.US, s, new Object[] {
                Double.valueOf(d), Double.valueOf(d1)
            });
        } else
        {
            return (new StringBuilder()).append(d).append(",").append(d1).toString();
        }
    }

}
