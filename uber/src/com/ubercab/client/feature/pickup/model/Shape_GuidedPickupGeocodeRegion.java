// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            GuidedPickupGeocodeRegion

public final class Shape_GuidedPickupGeocodeRegion extends GuidedPickupGeocodeRegion
{

    private List data;
    private String status;

    Shape_GuidedPickupGeocodeRegion()
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
            obj = (GuidedPickupGeocodeRegion)obj;
            if (((GuidedPickupGeocodeRegion) (obj)).getStatus() == null ? getStatus() != null : !((GuidedPickupGeocodeRegion) (obj)).getStatus().equals(getStatus()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion) (obj)).getData() == null ? getData() != null : !((GuidedPickupGeocodeRegion) (obj)).getData().equals(getData()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getData()
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
        if (status == null)
        {
            i = 0;
        } else
        {
            i = status.hashCode();
        }
        if (data != null)
        {
            j = data.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final GuidedPickupGeocodeRegion setData(List list)
    {
        data = list;
        return this;
    }

    final GuidedPickupGeocodeRegion setStatus(String s)
    {
        status = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupGeocodeRegion{status=")).append(status).append(", data=").append(data).append("}").toString();
    }
}
