// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.Polygon;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;

public final class Shape_GuidedPickupGeocodeRegion_RegionData extends GuidedPickupGeocodeRegion.RegionData
{

    private Polygon geometry;
    private GuidedPickupGeocodeRegion.RegionDataProperties properties;

    Shape_GuidedPickupGeocodeRegion_RegionData()
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
            obj = (GuidedPickupGeocodeRegion.RegionData)obj;
            if (((GuidedPickupGeocodeRegion.RegionData) (obj)).getGeometry() == null ? getGeometry() != null : !((GuidedPickupGeocodeRegion.RegionData) (obj)).getGeometry().equals(getGeometry()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.RegionData) (obj)).getProperties() == null ? getProperties() != null : !((GuidedPickupGeocodeRegion.RegionData) (obj)).getProperties().equals(getProperties()))
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

    public final GuidedPickupGeocodeRegion.RegionDataProperties getProperties()
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

    final GuidedPickupGeocodeRegion.RegionData setGeometry(Polygon polygon)
    {
        geometry = polygon;
        return this;
    }

    final GuidedPickupGeocodeRegion.RegionData setProperties(GuidedPickupGeocodeRegion.RegionDataProperties regiondataproperties)
    {
        properties = regiondataproperties;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupGeocodeRegion.RegionData{geometry=")).append(geometry).append(", properties=").append(properties).append("}").toString();
    }
}
