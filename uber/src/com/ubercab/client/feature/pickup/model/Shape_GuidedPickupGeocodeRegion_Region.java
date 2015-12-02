// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.Polygon;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;

public final class Shape_GuidedPickupGeocodeRegion_Region extends GuidedPickupGeocodeRegion.Region
{

    private Polygon geometry;
    private String id;
    private GuidedPickupGeocodeRegion.RegionProperties properties;

    Shape_GuidedPickupGeocodeRegion_Region()
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
            obj = (GuidedPickupGeocodeRegion.Region)obj;
            if (((GuidedPickupGeocodeRegion.Region) (obj)).getGeometry() == null ? getGeometry() != null : !((GuidedPickupGeocodeRegion.Region) (obj)).getGeometry().equals(getGeometry()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.Region) (obj)).getId() == null ? getId() != null : !((GuidedPickupGeocodeRegion.Region) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((GuidedPickupGeocodeRegion.Region) (obj)).getProperties() == null ? getProperties() != null : !((GuidedPickupGeocodeRegion.Region) (obj)).getProperties().equals(getProperties()))
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

    public final String getId()
    {
        return id;
    }

    public final GuidedPickupGeocodeRegion.RegionProperties getProperties()
    {
        return properties;
    }

    public final volatile Object getProperties()
    {
        return getProperties();
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (geometry == null)
        {
            i = 0;
        } else
        {
            i = geometry.hashCode();
        }
        if (id == null)
        {
            j = 0;
        } else
        {
            j = id.hashCode();
        }
        if (properties != null)
        {
            k = properties.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    protected final GuidedPickupGeocodeRegion.Region setGeometry(Polygon polygon)
    {
        geometry = polygon;
        return this;
    }

    protected final GuidedPickupGeocodeRegion.Region setId(String s)
    {
        id = s;
        return this;
    }

    protected final GuidedPickupGeocodeRegion.Region setProperties(GuidedPickupGeocodeRegion.RegionProperties regionproperties)
    {
        properties = regionproperties;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupGeocodeRegion.Region{geometry=")).append(geometry).append(", id=").append(id).append(", properties=").append(properties).append("}").toString();
    }
}
