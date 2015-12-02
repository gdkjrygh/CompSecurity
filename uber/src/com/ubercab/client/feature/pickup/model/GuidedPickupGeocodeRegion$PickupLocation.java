// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.feature.geojson.model.Feature;
import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.Point;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;
import ecx;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupGeocodeRegion_PickupLocation

public abstract class roperties
    implements Feature
{

    public static roperties create(Point point, roperties roperties)
    {
        return (new Shape_GuidedPickupGeocodeRegion_PickupLocation()).setGeometry(point).setProperties(roperties);
    }

    public int getChirality()
    {
        return ecx.a(getGeometry());
    }

    public volatile Geometry getGeometry()
    {
        return getGeometry();
    }

    public abstract Point getGeometry();

    public volatile GeoJsonGeometry getGeometry()
    {
        return getGeometry();
    }

    public UberLatLng getLatLng()
    {
        Point point = getGeometry();
        List list = point.getCoordinates();
        return new UberLatLng(((Double)list.get(point.getLatIndex())).doubleValue(), ((Double)list.get(point.getLngIndex())).doubleValue());
    }

    public abstract roperties getProperties();

    public volatile Object getProperties()
    {
        return getProperties();
    }

    public Float getRank()
    {
        return getProperties().getRank();
    }

    abstract roperties.getRank setGeometry(Point point);

    abstract roperties setProperties(roperties roperties);

    public roperties()
    {
    }
}
