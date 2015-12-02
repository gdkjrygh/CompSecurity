// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


public final class Shape_GuidedPickupGeocodeRegion_RegionProperties extends GuidedPickupGeocodeRegion.RegionProperties
{

    private String id;
    private String name;
    private String shortName;

    Shape_GuidedPickupGeocodeRegion_RegionProperties()
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
            obj = (GuidedPickupGeocodeRegion.RegionProperties)obj;
            if (((GuidedPickupGeocodeRegion.RegionProperties) (obj)).getId() == null ? getId() != null : !((GuidedPickupGeocodeRegion.RegionProperties) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionProperties) (obj)).getName() == null ? getName() != null : !((GuidedPickupGeocodeRegion.RegionProperties) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionProperties) (obj)).getShortName() == null ? getShortName() != null : !((GuidedPickupGeocodeRegion.RegionProperties) (obj)).getShortName().equals(getShortName()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getId()
    {
        return id;
    }

    public final String getName()
    {
        return name;
    }

    public final String getShortName()
    {
        return shortName;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
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
        if (shortName != null)
        {
            k = shortName.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final GuidedPickupGeocodeRegion.RegionProperties setId(String s)
    {
        id = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionProperties setName(String s)
    {
        name = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionProperties setShortName(String s)
    {
        shortName = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupGeocodeRegion.RegionProperties{id=")).append(id).append(", name=").append(name).append(", shortName=").append(shortName).append("}").toString();
    }
}
