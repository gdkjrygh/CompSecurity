// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.NamedFeatureProperties;
import com.ubercab.client.feature.geojson.model.Point;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;
import com.ubercab.rider.realtime.model.GeoJsonNamedFeatureProperties;

public final class Shape_GuidedPickupVenue_PickupFeature extends GuidedPickupVenue.PickupFeature
{

    private Point geometry;
    private GuidedPickupVenue.PickupProperties properties;

    Shape_GuidedPickupVenue_PickupFeature()
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
            obj = (GuidedPickupVenue.PickupFeature)obj;
            if (((GuidedPickupVenue.PickupFeature) (obj)).getGeometry() == null ? getGeometry() != null : !((GuidedPickupVenue.PickupFeature) (obj)).getGeometry().equals(getGeometry()))
            {
                return false;
            }
            if (((GuidedPickupVenue.PickupFeature) (obj)).getProperties() == null ? getProperties() != null : !((GuidedPickupVenue.PickupFeature) (obj)).getProperties().equals(getProperties()))
            {
                return false;
            }
        }
        return true;
    }

    public final volatile Geometry getGeometry()
    {
        return getGeometry();
    }

    public final Point getGeometry()
    {
        return geometry;
    }

    public final volatile GeoJsonGeometry getGeometry()
    {
        return getGeometry();
    }

    public final volatile NamedFeatureProperties getProperties()
    {
        return getProperties();
    }

    public final GuidedPickupVenue.PickupProperties getProperties()
    {
        return properties;
    }

    public final volatile GeoJsonNamedFeatureProperties getProperties()
    {
        return getProperties();
    }

    public final volatile Object getProperties()
    {
        return getProperties();
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (geometry == null)
        {
            i = 0;
        } else
        {
            i = geometry.hashCode();
        }
        if (properties != null)
        {
            j = properties.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final GuidedPickupVenue.PickupFeature setGeometry(Point point)
    {
        geometry = point;
        return this;
    }

    final GuidedPickupVenue.PickupFeature setProperties(GuidedPickupVenue.PickupProperties pickupproperties)
    {
        properties = pickupproperties;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenue.PickupFeature{geometry=")).append(geometry).append(", properties=").append(properties).append("}").toString();
    }
}
