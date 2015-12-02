// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.client.feature.geojson.model.Geometry;
import com.ubercab.client.feature.geojson.model.NamedFeature;
import com.ubercab.client.feature.geojson.model.NamedFeatureProperties;
import com.ubercab.client.feature.geojson.model.Polygon;
import com.ubercab.rider.realtime.model.GeoJsonGeometry;
import com.ubercab.rider.realtime.model.GeoJsonNamedFeatureProperties;
import ecx;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupVenue_VenueFeature

public abstract class es
    implements NamedFeature
{

    public static es create(es es, Polygon polygon)
    {
        return (new Shape_GuidedPickupVenue_VenueFeature()).setGeometry(polygon).setProperties(es);
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

    public volatile NamedFeatureProperties getProperties()
    {
        return getProperties();
    }

    public abstract es getProperties();

    public volatile GeoJsonNamedFeatureProperties getProperties()
    {
        return getProperties();
    }

    public volatile Object getProperties()
    {
        return getProperties();
    }

    public List getZones()
    {
        return getProperties().getZones().getFeatures();
    }

    abstract n.getFeatures setGeometry(Polygon polygon);

    abstract es setProperties(es es);

    public es()
    {
    }
}
