// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


public final class Shape_GuidedPickupGeocodeRegion_PickupLocationProperties extends GuidedPickupGeocodeRegion.PickupLocationProperties
{

    private String id;
    private String kind;
    private String name;
    private Float rank;

    Shape_GuidedPickupGeocodeRegion_PickupLocationProperties()
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
            obj = (GuidedPickupGeocodeRegion.PickupLocationProperties)obj;
            if (((GuidedPickupGeocodeRegion.PickupLocationProperties) (obj)).getKind() == null ? getKind() != null : !((GuidedPickupGeocodeRegion.PickupLocationProperties) (obj)).getKind().equals(getKind()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.PickupLocationProperties) (obj)).getId() == null ? getId() != null : !((GuidedPickupGeocodeRegion.PickupLocationProperties) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.PickupLocationProperties) (obj)).getName() == null ? getName() != null : !((GuidedPickupGeocodeRegion.PickupLocationProperties) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.PickupLocationProperties) (obj)).getRank() == null ? getRank() != null : !((GuidedPickupGeocodeRegion.PickupLocationProperties) (obj)).getRank().equals(getRank()))
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

    public final String getKind()
    {
        return kind;
    }

    public final String getName()
    {
        return name;
    }

    public final Float getRank()
    {
        return rank;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (kind == null)
        {
            i = 0;
        } else
        {
            i = kind.hashCode();
        }
        if (id == null)
        {
            j = 0;
        } else
        {
            j = id.hashCode();
        }
        if (name == null)
        {
            k = 0;
        } else
        {
            k = name.hashCode();
        }
        if (rank != null)
        {
            l = rank.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    final GuidedPickupGeocodeRegion.PickupLocationProperties setId(String s)
    {
        id = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.PickupLocationProperties setKind(String s)
    {
        kind = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.PickupLocationProperties setName(String s)
    {
        name = s;
        return this;
    }

    final GuidedPickupGeocodeRegion.PickupLocationProperties setRank(Float float1)
    {
        rank = float1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupGeocodeRegion.PickupLocationProperties{kind=")).append(kind).append(", id=").append(id).append(", name=").append(name).append(", rank=").append(rank).append("}").toString();
    }
}
