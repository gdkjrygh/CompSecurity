// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


public final class Shape_GuidedPickupSnap_Data extends GuidedPickupSnap.Data
{

    private String id;
    private String kind;
    private GuidedPickupSnap.Location location;

    Shape_GuidedPickupSnap_Data()
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
            obj = (GuidedPickupSnap.Data)obj;
            if (((GuidedPickupSnap.Data) (obj)).getId() == null ? getId() != null : !((GuidedPickupSnap.Data) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((GuidedPickupSnap.Data) (obj)).getKind() == null ? getKind() != null : !((GuidedPickupSnap.Data) (obj)).getKind().equals(getKind()))
            {
                return false;
            }
            if (((GuidedPickupSnap.Data) (obj)).getLocation() == null ? getLocation() != null : !((GuidedPickupSnap.Data) (obj)).getLocation().equals(getLocation()))
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

    public final GuidedPickupSnap.Location getLocation()
    {
        return location;
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
        if (kind == null)
        {
            j = 0;
        } else
        {
            j = kind.hashCode();
        }
        if (location != null)
        {
            k = location.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final GuidedPickupSnap.Data setId(String s)
    {
        id = s;
        return this;
    }

    final GuidedPickupSnap.Data setKind(String s)
    {
        kind = s;
        return this;
    }

    final GuidedPickupSnap.Data setLocation(GuidedPickupSnap.Location location1)
    {
        location = location1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupSnap.Data{id=")).append(id).append(", kind=").append(kind).append(", location=").append(location).append("}").toString();
    }
}
