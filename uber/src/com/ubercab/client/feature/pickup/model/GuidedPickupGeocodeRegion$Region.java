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
//            Shape_GuidedPickupGeocodeRegion_Region

public abstract class roperties
    implements Feature
{

    public static roperties create(Polygon polygon, roperties roperties)
    {
        return (new Shape_GuidedPickupGeocodeRegion_Region()).setGeometry(polygon).setProperties(roperties);
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

    public abstract String getId();

    public abstract roperties getProperties();

    public volatile Object getProperties()
    {
        return getProperties();
    }

    protected abstract getProperties setGeometry(Polygon polygon);

    protected abstract getProperties setId(String s);

    protected abstract roperties setProperties(roperties roperties);

    public roperties()
    {
    }
}
