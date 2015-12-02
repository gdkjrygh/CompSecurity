// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


public final class Shape_GuidedPickupSnap_Location extends GuidedPickupSnap.Location
{

    private Double latitude;
    private Double longitude;

    Shape_GuidedPickupSnap_Location()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (GuidedPickupSnap.Location)obj;
            if (((GuidedPickupSnap.Location) (obj)).getLatitude() == null ? getLatitude() != null : !((GuidedPickupSnap.Location) (obj)).getLatitude().equals(getLatitude()))
            {
                return false;
            }
            if (((GuidedPickupSnap.Location) (obj)).getLongitude() == null ? getLongitude() != null : !((GuidedPickupSnap.Location) (obj)).getLongitude().equals(getLongitude()))
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
        if (latitude == null)
        {
            i = 0;
        } else
        {
            i = latitude.hashCode();
        }
        if (longitude != null)
        {
            j = longitude.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final GuidedPickupSnap.Location setLatitude(Double double1)
    {
        latitude = double1;
        return this;
    }

    final GuidedPickupSnap.Location setLongitude(Double double1)
    {
        longitude = double1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupSnap.Location{latitude=")).append(latitude).append(", longitude=").append(longitude).append("}").toString();
    }
}
