// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            RegionGroupData

public final class Shape_RegionGroupData extends RegionGroupData
{

    private List childrenRegionGroupData;
    private GuidedPickupGeocodeRegion.RegionData regionData;

    Shape_RegionGroupData()
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
            obj = (RegionGroupData)obj;
            if (((RegionGroupData) (obj)).getRegionData() == null ? getRegionData() != null : !((RegionGroupData) (obj)).getRegionData().equals(getRegionData()))
            {
                return false;
            }
            if (((RegionGroupData) (obj)).getChildrenRegionGroupData() == null ? getChildrenRegionGroupData() != null : !((RegionGroupData) (obj)).getChildrenRegionGroupData().equals(getChildrenRegionGroupData()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getChildrenRegionGroupData()
    {
        return childrenRegionGroupData;
    }

    public final GuidedPickupGeocodeRegion.RegionData getRegionData()
    {
        return regionData;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (regionData == null)
        {
            i = 0;
        } else
        {
            i = regionData.hashCode();
        }
        if (childrenRegionGroupData != null)
        {
            j = childrenRegionGroupData.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final RegionGroupData setChildrenRegionGroupData(List list)
    {
        childrenRegionGroupData = list;
        return this;
    }

    final RegionGroupData setRegionData(GuidedPickupGeocodeRegion.RegionData regiondata)
    {
        regionData = regiondata;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("RegionGroupData{regionData=")).append(regionData).append(", childrenRegionGroupData=").append(childrenRegionGroupData).append("}").toString();
    }
}
