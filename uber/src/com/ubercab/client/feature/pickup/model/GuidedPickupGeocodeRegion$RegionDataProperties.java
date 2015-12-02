// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupGeocodeRegion_RegionDataProperties

public abstract class rties
{

    public static rties create(String s, String s1, String s2, List list, List list1)
    {
        return (new Shape_GuidedPickupGeocodeRegion_RegionDataProperties()).setId(s).setType(s1).setSubType(s2).setPickupLocations(list).setChildren(list1);
    }

    public static setChildren create(String s, String s1, List list, List list1)
    {
        return (new Shape_GuidedPickupGeocodeRegion_RegionDataProperties()).setType(s).setSubType(s1).setPickupLocations(list).setChildren(list1);
    }

    public abstract List getChildren();

    public abstract String getId();

    public abstract String getName();

    public abstract List getPickupLocations();

    public abstract String getShortName();

    public abstract String getSubType();

    public abstract String getType();

    abstract setChildren setChildren(List list);

    abstract setChildren setId(String s);

    abstract setChildren setName(String s);

    abstract setChildren setPickupLocations(List list);

    abstract setChildren setShortName(String s);

    abstract setChildren setSubType(String s);

    abstract setChildren setType(String s);

    public rties()
    {
    }
}
