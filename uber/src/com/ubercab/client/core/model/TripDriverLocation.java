// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class TripDriverLocation
    implements com.ubercab.rider.realtime.model.TripDriverLocation
{

    private double latitude;
    private double longitude;

    public TripDriverLocation()
    {
    }

    TripDriverLocation(double d, double d1)
    {
        latitude = d;
        longitude = d1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TripDriverLocation)obj;
            if (Double.compare(((TripDriverLocation) (obj)).latitude, latitude) != 0)
            {
                return false;
            }
            if (Double.compare(((TripDriverLocation) (obj)).longitude, longitude) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(latitude);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(longitude);
        return i * 31 + (int)(l ^ l >>> 32);
    }
}
