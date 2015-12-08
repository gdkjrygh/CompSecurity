// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.utils;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;

public class LocationMath
{

    public LocationMath()
    {
    }

    public static double computeDistance(double d, double d1, double d2, double d3, 
            char c)
    {
        float af[] = new float[1];
        Location.distanceBetween(d, d1, d2, d3, af);
        d = af[0];
        if (c != 'm')
        {
            if (c == 'M')
            {
                return d / 1609.3399999999999D;
            }
            if (c == 'K')
            {
                return d / 1000D;
            }
        }
        return d;
    }

    public static double computeDistance(LatLng latlng, LatLng latlng1, char c)
    {
        return computeDistance(latlng.latitude, latlng.longitude, latlng1.latitude, latlng1.longitude, c);
    }

    public static double deg2rad(double d)
    {
        return (3.1415926535897931D * d) / 180D;
    }
}
