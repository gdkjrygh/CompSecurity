// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import java.util.List;

public final class Shape_GuidedPickupGeocodeRegion_RegionDataProperties extends GuidedPickupGeocodeRegion.RegionDataProperties
{

    private List children;
    private String id;
    private String name;
    private List pickupLocations;
    private String shortName;
    private String subType;
    private String type;

    Shape_GuidedPickupGeocodeRegion_RegionDataProperties()
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
            obj = (GuidedPickupGeocodeRegion.RegionDataProperties)obj;
            if (((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getId() == null ? getId() != null : !((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getName() == null ? getName() != null : !((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getShortName() == null ? getShortName() != null : !((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getShortName().equals(getShortName()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getSubType() == null ? getSubType() != null : !((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getSubType().equals(getSubType()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getPickupLocations() == null ? getPickupLocations() != null : !((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getPickupLocations().equals(getPickupLocations()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getChildren() == null ? getChildren() != null : !((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getChildren().equals(getChildren()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getType() == null ? getType() != null : !((GuidedPickupGeocodeRegion.RegionDataProperties) (obj)).getType().equals(getType()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getChildren()
    {
        return children;
    }

    public final String getId()
    {
        return id;
    }

    public final String getName()
    {
        return name;
    }

    public final List getPickupLocations()
    {
        return pickupLocations;
    }

    public final String getShortName()
    {
        return shortName;
    }

    public final String getSubType()
    {
        return subType;
    }

    public final String getType()
    {
        return type;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        if (name == null)
        {
            j = 0;
        } else
        {
            j = name.hashCode();
        }
        if (shortName == null)
        {
            k = 0;
        } else
        {
            k = shortName.hashCode();
        }
        if (subType == null)
        {
            l = 0;
        } else
        {
            l = subType.hashCode();
        }
        if (pickupLocations == null)
        {
            i1 = 0;
        } else
        {
            i1 = pickupLocations.hashCode();
        }
        if (children == null)
        {
            j1 = 0;
        } else
        {
            j1 = children.hashCode();
        }
        if (type != null)
        {
            k1 = type.hashCode();
        }
        return (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k1;
    }

    final GuidedPickupGeocodeRegion.RegionDataProperties setChildren(List list)
    {
        children = list;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionDataProperties setId(String s)
    {
        id = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionDataProperties setName(String s)
    {
        name = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionDataProperties setPickupLocations(List list)
    {
        pickupLocations = list;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionDataProperties setShortName(String s)
    {
        shortName = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionDataProperties setSubType(String s)
    {
        subType = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionDataProperties setType(String s)
    {
        type = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupGeocodeRegion.RegionDataProperties{id=")).append(id).append(", name=").append(name).append(", shortName=").append(shortName).append(", subType=").append(subType).append(", pickupLocations=").append(pickupLocations).append(", children=").append(children).append(", type=").append(type).append("}").toString();
    }
}
