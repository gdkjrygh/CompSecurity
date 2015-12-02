// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.NamedFeatureProperties;
import com.ubercab.client.feature.geojson.model.Polygon;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;
import com.ubercab.rider.realtime.model.GeoJsonNamedFeatureProperties;

public final class Shape_GuidedPickupVenue_VenueFeature extends GuidedPickupVenue.VenueFeature
{

    private Polygon geometry;
    private GuidedPickupVenue.VenueProperties properties;

    Shape_GuidedPickupVenue_VenueFeature()
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
            obj = (GuidedPickupVenue.VenueFeature)obj;
            if (((GuidedPickupVenue.VenueFeature) (obj)).getGeometry() == null ? getGeometry() != null : !((GuidedPickupVenue.VenueFeature) (obj)).getGeometry().equals(getGeometry()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueFeature) (obj)).getProperties() == null ? getProperties() != null : !((GuidedPickupVenue.VenueFeature) (obj)).getProperties().equals(getProperties()))
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

    public final GuidedPickupVenue.VenueProperties getProperties()
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

    final GuidedPickupVenue.VenueFeature setGeometry(Polygon polygon)
    {
        geometry = polygon;
        return this;
    }

    final GuidedPickupVenue.VenueFeature setProperties(GuidedPickupVenue.VenueProperties venueproperties)
    {
        properties = venueproperties;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenue.VenueFeature{geometry=")).append(geometry).append(", properties=").append(properties).append("}").toString();
    }
}
