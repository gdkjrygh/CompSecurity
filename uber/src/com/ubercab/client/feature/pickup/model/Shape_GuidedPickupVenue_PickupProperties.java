// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


public final class Shape_GuidedPickupVenue_PickupProperties extends GuidedPickupVenue.PickupProperties
{

    private String id;
    private String name;
    private String shortName;

    Shape_GuidedPickupVenue_PickupProperties()
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
            obj = (GuidedPickupVenue.PickupProperties)obj;
            if (((GuidedPickupVenue.PickupProperties) (obj)).getId() == null ? getId() != null : !((GuidedPickupVenue.PickupProperties) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((GuidedPickupVenue.PickupProperties) (obj)).getName() == null ? getName() != null : !((GuidedPickupVenue.PickupProperties) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((GuidedPickupVenue.PickupProperties) (obj)).getShortName() == null ? getShortName() != null : !((GuidedPickupVenue.PickupProperties) (obj)).getShortName().equals(getShortName()))
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

    final GuidedPickupVenue.PickupProperties setId(String s)
    {
        id = s;
        return this;
    }

    final GuidedPickupVenue.PickupProperties setName(String s)
    {
        name = s;
        return this;
    }

    final GuidedPickupVenue.PickupProperties setShortName(String s)
    {
        shortName = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenue.PickupProperties{id=")).append(id).append(", name=").append(name).append(", shortName=").append(shortName).append("}").toString();
    }
}
