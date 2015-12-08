// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import java.io.Serializable;

public class LatLongExtra
    implements Serializable
{

    private static final long serialVersionUID = 0x3e8b6b11871083b2L;
    private final double lat;
    private final double lng;

    public LatLongExtra(double d, double d1)
    {
        lat = d;
        lng = d1;
    }

    public double getLat()
    {
        return lat;
    }

    public double getLng()
    {
        return lng;
    }
}
