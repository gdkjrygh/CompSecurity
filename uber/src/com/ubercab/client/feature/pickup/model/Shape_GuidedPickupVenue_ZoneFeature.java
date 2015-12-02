// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.NamedFeatureProperties;
import com.ubercab.client.feature.geojson.model.Polygon;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;
import com.ubercab.rider.realtime.model.GeoJsonNamedFeatureProperties;

public final class Shape_GuidedPickupVenue_ZoneFeature extends GuidedPickupVenue.ZoneFeature
{

    private Polygon geometry;
    private GuidedPickupVenue.ZoneProperties properties;

    Shape_GuidedPickupVenue_ZoneFeature()
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
            obj = (GuidedPickupVenue.ZoneFeature)obj;
            if (((GuidedPickupVenue.ZoneFeature) (obj)).getGeometry() == null ? getGeometry() != null : !((GuidedPickupVenue.ZoneFeature) (obj)).getGeometry().equals(getGeometry()))
            {
                return false;
            }
            if (((GuidedPickupVenue.ZoneFeature) (obj)).getProperties() == null ? getProperties() != null : !((GuidedPickupVenue.ZoneFeature) (obj)).getProperties().equals(getProperties()))
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

    public final Polygon getGeometry()
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

    public final GuidedPickupVenue.ZoneProperties getProperties()
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

    final GuidedPickupVenue.ZoneFeature setGeometry(Polygon polygon)
    {
        geometry = polygon;
        return this;
    }

    final GuidedPickupVenue.ZoneFeature setProperties(GuidedPickupVenue.ZoneProperties zoneproperties)
    {
        properties = zoneproperties;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenue.ZoneFeature{geometry=")).append(geometry).append(", properties=").append(properties).append("}").toString();
    }
}
