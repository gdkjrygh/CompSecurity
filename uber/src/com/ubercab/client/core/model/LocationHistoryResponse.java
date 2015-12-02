// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            LocationSearchResults

public class LocationHistoryResponse
{

    LocationSearchResults dropoffs;
    LocationSearchResults pickups;
    List tagged;

    public LocationHistoryResponse()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LocationHistoryResponse)obj;
            if (dropoffs == null ? ((LocationHistoryResponse) (obj)).dropoffs != null : !dropoffs.equals(((LocationHistoryResponse) (obj)).dropoffs))
            {
                return false;
            }
            if (pickups == null ? ((LocationHistoryResponse) (obj)).pickups != null : !pickups.equals(((LocationHistoryResponse) (obj)).pickups))
            {
                return false;
            }
            if (tagged == null ? ((LocationHistoryResponse) (obj)).tagged != null : !tagged.equals(((LocationHistoryResponse) (obj)).tagged))
            {
                return false;
            }
        }
        return true;
    }

    public LocationSearchResults getDropoffs()
    {
        return dropoffs;
    }

    public LocationSearchResults getPickups()
    {
        return pickups;
    }

    public List getTagged()
    {
        return tagged;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (pickups != null)
        {
            i = pickups.hashCode();
        } else
        {
            i = 0;
        }
        if (dropoffs != null)
        {
            j = dropoffs.hashCode();
        } else
        {
            j = 0;
        }
        if (tagged != null)
        {
            k = tagged.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }
}
