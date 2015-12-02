// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import java.util.List;

public final class Shape_GuidedPickupVenue_PickupCollection extends GuidedPickupVenue.PickupCollection
{

    private List features;

    Shape_GuidedPickupVenue_PickupCollection()
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
            obj = (GuidedPickupVenue.PickupCollection)obj;
            if (((GuidedPickupVenue.PickupCollection) (obj)).getFeatures() == null ? getFeatures() != null : !((GuidedPickupVenue.PickupCollection) (obj)).getFeatures().equals(getFeatures()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getFeatures()
    {
        return features;
    }

    public final int hashCode()
    {
        int i;
        if (features == null)
        {
            i = 0;
        } else
        {
            i = features.hashCode();
        }
        return i ^ 0xf4243;
    }

    final GuidedPickupVenue.PickupCollection setFeatures(List list)
    {
        features = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenue.PickupCollection{features=")).append(features).append("}").toString();
    }
}
