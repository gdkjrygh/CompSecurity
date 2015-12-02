// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;

public final class FareEstimateLocation
{

    private Double latitude;
    private Double longitude;

    public FareEstimateLocation()
    {
    }

    public static boolean isLocationEqual(FareEstimateLocation fareestimatelocation, RiderLocation riderlocation)
    {
        if (fareestimatelocation != null && riderlocation != null)
        {
            if ((riderlocation = riderlocation.getUberLatLng()) != null && fareestimatelocation.getLatitude() != null && fareestimatelocation.getLongitude() != null && fareestimatelocation.getLatitude().doubleValue() == riderlocation.a() && fareestimatelocation.getLongitude().doubleValue() == riderlocation.b())
            {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FareEstimateLocation)obj;
            if (latitude == null ? ((FareEstimateLocation) (obj)).latitude != null : !latitude.equals(((FareEstimateLocation) (obj)).latitude))
            {
                return false;
            }
            if (longitude == null ? ((FareEstimateLocation) (obj)).longitude != null : !longitude.equals(((FareEstimateLocation) (obj)).longitude))
            {
                return false;
            }
        }
        return true;
    }

    public final Double getLatitude()
    {
        return latitude;
    }

    public final Double getLongitude()
    {
        return longitude;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (latitude != null)
        {
            i = latitude.hashCode();
        } else
        {
            i = 0;
        }
        if (longitude != null)
        {
            j = longitude.hashCode();
        }
        return i * 31 + j;
    }

    public final void setLatitude(Double double1)
    {
        latitude = double1;
    }

    public final void setLongitude(Double double1)
    {
        longitude = double1;
    }
}
