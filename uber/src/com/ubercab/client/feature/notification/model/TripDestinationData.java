// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import com.ubercab.rider.realtime.model.Location;

public final class TripDestinationData
{

    private String address;
    private double latitude;
    private double longitude;

    public TripDestinationData()
    {
    }

    public static TripDestinationData createFakeTripDestinationData()
    {
        TripDestinationData tripdestinationdata = new TripDestinationData();
        tripdestinationdata.setAddress("50 Stow Lake Drive");
        tripdestinationdata.setLatitude(37.768999999999998D);
        tripdestinationdata.setLongitude(-122.4773D);
        return tripdestinationdata;
    }

    public static TripDestinationData fromCnLocation(Location location)
    {
        TripDestinationData tripdestinationdata = new TripDestinationData();
        tripdestinationdata.setAddress(location.getAddress());
        tripdestinationdata.setLatitude(location.getLatitude());
        tripdestinationdata.setLongitude(location.getLongitude());
        return tripdestinationdata;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TripDestinationData)obj;
            if (Double.compare(((TripDestinationData) (obj)).latitude, latitude) != 0)
            {
                return false;
            }
            if (Double.compare(((TripDestinationData) (obj)).longitude, longitude) != 0)
            {
                return false;
            }
            if (address == null ? ((TripDestinationData) (obj)).address != null : !address.equals(((TripDestinationData) (obj)).address))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAddress()
    {
        return address;
    }

    public final double getLatitude()
    {
        return latitude;
    }

    public final double getLongitude()
    {
        return longitude;
    }

    public final int hashCode()
    {
        long l = Double.doubleToLongBits(latitude);
        int j = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(longitude);
        int k = (int)(l ^ l >>> 32);
        int i;
        if (address != null)
        {
            i = address.hashCode();
        } else
        {
            i = 0;
        }
        return i + (j * 31 + k) * 31;
    }

    public final void setAddress(String s)
    {
        address = s;
    }

    public final void setLatitude(double d)
    {
        latitude = d;
    }

    public final void setLongitude(double d)
    {
        longitude = d;
    }
}
