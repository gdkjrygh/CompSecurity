// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.Feature;
import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.Polygon;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;
import ecx;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupGeocodeRegion_RegionData

public abstract class roperties
    implements Feature
{

    public static roperties create(Polygon polygon, roperties roperties)
    {
        return (new Shape_GuidedPickupGeocodeRegion_RegionData()).setGeometry(polygon).setProperties(roperties);
    }

    public int getChirality()
    {
        return ecx.a(getGeometry());
    }

    public volatile Geometry getGeometry()
    {
        return getGeometry();
    }

    public abstract Polygon getGeometry();

    public volatile GeoJsonGeometry getGeometry()
    {
        return getGeometry();
    }

    public abstract roperties getProperties();

    public volatile Object getProperties()
    {
        return getProperties();
    }

    public String getSubType()
    {
        return getProperties().getSubType();
    }

    public boolean isBlock()
    {
        return "block".equals(getSubType());
    }

    abstract getSubType setGeometry(Polygon polygon);

    abstract roperties setProperties(roperties roperties);

    public roperties()
    {
    }
}
