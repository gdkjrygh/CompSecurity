// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.geojson.model;

import com.ubercab.rider.realtime.model.GeoJsonPolygon;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.geojson.model:
//            Geometry

public abstract class BasePolygon extends Geometry
    implements GeoJsonPolygon
{

    public BasePolygon()
    {
    }

    public volatile Object getCoordinates()
    {
        return getCoordinates();
    }

    public abstract List getCoordinates();

    abstract BasePolygon setCoordinates(List list);

    abstract BasePolygon setType(String s);
}
