// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.Point;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;

public final class Shape_GuidedPickupGeocodeRegion_PickupLocation extends GuidedPickupGeocodeRegion.PickupLocation
{

    private Point geometry;
    private GuidedPickupGeocodeRegion.PickupLocationProperties properties;

    Shape_GuidedPickupGeocodeRegion_PickupLocation()
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
            obj = (GuidedPickupGeocodeRegion.PickupLocation)obj;
            if (((GuidedPickupGeocodeRegion.PickupLocation) (obj)).getGeometry() == null ? getGeometry() != null : !((GuidedPickupGeocodeRegion.PickupLocation) (obj)).getGeometry().equals(getGeometry()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.PickupLocation) (obj)).getProperties() == null ? getProperties() != null : !((GuidedPickupGeocodeRegion.PickupLocation) (obj)).getProperties().equals(getProperties()))
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

    public final GuidedPickupGeocodeRegion.PickupLocationProperties getProperties()
    {
        return properties;
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

    final GuidedPickupGeocodeRegion.PickupLocation setGeometry(Point point)
    {
        geometry = point;
        return this;
    }

    final GuidedPickupGeocodeRegion.PickupLocation setProperties(GuidedPickupGeocodeRegion.PickupLocationProperties pickuplocationproperties)
    {
        properties = pickuplocationproperties;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupGeocodeRegion.PickupLocation{geometry=")).append(geometry).append(", properties=").append(properties).append("}").toString();
    }
}
