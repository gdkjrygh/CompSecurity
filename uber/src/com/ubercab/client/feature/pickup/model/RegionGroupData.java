// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.android.location.UberLatLng;
import ecx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_RegionGroupData

public abstract class RegionGroupData
{

    public RegionGroupData()
    {
    }

    public static RegionGroupData create(GuidedPickupGeocodeRegion.RegionData regiondata, List list)
    {
        return (new Shape_RegionGroupData()).setRegionData(regiondata).setChildrenRegionGroupData(list);
    }

    public boolean containsLatLng(UberLatLng uberlatlng)
    {
        return ecx.a(uberlatlng, getRegionData());
    }

    public Set getAllPickupLocations()
    {
        HashSet hashset = new HashSet();
        Set set = getPickupLocations();
        if (set != null)
        {
            hashset.addAll(set);
        }
        for (Iterator iterator = getChildrenRegionGroupData().iterator(); iterator.hasNext(); hashset.addAll(((RegionGroupData)iterator.next()).getPickupLocations())) { }
        return hashset;
    }

    public Set getAllRegionIds()
    {
        HashSet hashset = new HashSet();
        hashset.add(getRegionData().getProperties().getId());
        for (Iterator iterator = getChildrenRegionGroupData().iterator(); iterator.hasNext(); hashset.add(((RegionGroupData)iterator.next()).getRegionData().getProperties().getId())) { }
        return hashset;
    }

    public abstract List getChildrenRegionGroupData();

    public Set getPickupLocations()
    {
        List list = getRegionData().getProperties().getPickupLocations();
        if (list == null)
        {
            return new HashSet();
        } else
        {
            return new HashSet(list);
        }
    }

    public abstract GuidedPickupGeocodeRegion.RegionData getRegionData();

    public String getSubtype()
    {
        return getRegionData().getSubType();
    }

    abstract RegionGroupData setChildrenRegionGroupData(List list);

    abstract RegionGroupData setRegionData(GuidedPickupGeocodeRegion.RegionData regiondata);
}
