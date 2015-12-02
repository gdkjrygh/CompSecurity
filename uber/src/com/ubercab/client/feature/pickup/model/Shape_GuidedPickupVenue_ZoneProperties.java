// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


public final class Shape_GuidedPickupVenue_ZoneProperties extends GuidedPickupVenue.ZoneProperties
{

    private String id;
    private String name;
    private GuidedPickupVenue.PickupCollection pickupLocations;
    private String shortName;

    Shape_GuidedPickupVenue_ZoneProperties()
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
            obj = (GuidedPickupVenue.ZoneProperties)obj;
            if (((GuidedPickupVenue.ZoneProperties) (obj)).getId() == null ? getId() != null : !((GuidedPickupVenue.ZoneProperties) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((GuidedPickupVenue.ZoneProperties) (obj)).getName() == null ? getName() != null : !((GuidedPickupVenue.ZoneProperties) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((GuidedPickupVenue.ZoneProperties) (obj)).getShortName() == null ? getShortName() != null : !((GuidedPickupVenue.ZoneProperties) (obj)).getShortName().equals(getShortName()))
            {
                return false;
            }
            if (((GuidedPickupVenue.ZoneProperties) (obj)).getPickupLocations() == null ? getPickupLocations() != null : !((GuidedPickupVenue.ZoneProperties) (obj)).getPickupLocations().equals(getPickupLocations()))
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

    public final GuidedPickupVenue.PickupCollection getPickupLocations()
    {
        return pickupLocations;
    }

    public final String getShortName()
    {
        return shortName;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
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
        if (pickupLocations != null)
        {
            l = pickupLocations.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    final GuidedPickupVenue.ZoneProperties setId(String s)
    {
        id = s;
        return this;
    }

    final GuidedPickupVenue.ZoneProperties setName(String s)
    {
        name = s;
        return this;
    }

    final GuidedPickupVenue.ZoneProperties setPickupLocations(GuidedPickupVenue.PickupCollection pickupcollection)
    {
        pickupLocations = pickupcollection;
        return this;
    }

    final GuidedPickupVenue.ZoneProperties setShortName(String s)
    {
        shortName = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenue.ZoneProperties{id=")).append(id).append(", name=").append(name).append(", shortName=").append(shortName).append(", pickupLocations=").append(pickupLocations).append("}").toString();
    }
}
