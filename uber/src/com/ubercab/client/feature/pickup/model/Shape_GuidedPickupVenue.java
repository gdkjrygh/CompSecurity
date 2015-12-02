// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            GuidedPickupVenue

public final class Shape_GuidedPickupVenue extends GuidedPickupVenue
{

    private GuidedPickupVenue.VenueFeature data;
    private String status;

    Shape_GuidedPickupVenue()
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
            obj = (GuidedPickupVenue)obj;
            if (((GuidedPickupVenue) (obj)).getData() == null ? getData() != null : !((GuidedPickupVenue) (obj)).getData().equals(getData()))
            {
                return false;
            }
            if (((GuidedPickupVenue) (obj)).getStatus() == null ? getStatus() != null : !((GuidedPickupVenue) (obj)).getStatus().equals(getStatus()))
            {
                return false;
            }
        }
        return true;
    }

    public final GuidedPickupVenue.VenueFeature getData()
    {
        return data;
    }

    public final String getStatus()
    {
        return status;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (data == null)
        {
            i = 0;
        } else
        {
            i = data.hashCode();
        }
        if (status != null)
        {
            j = status.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final GuidedPickupVenue setData(GuidedPickupVenue.VenueFeature venuefeature)
    {
        data = venuefeature;
        return this;
    }

    final GuidedPickupVenue setStatus(String s)
    {
        status = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenue{data=")).append(data).append(", status=").append(status).append("}").toString();
    }
}
