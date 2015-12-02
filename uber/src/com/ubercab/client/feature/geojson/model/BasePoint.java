// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.geojson.model;

import com.ubercab.rider.realtime.model.GeoJsonPoint;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.geojson.model:
//            Geometry

public abstract class BasePoint extends Geometry
    implements GeoJsonPoint
{

    public BasePoint()
    {
    }

    public volatile Object getCoordinates()
    {
        return getCoordinates();
    }

    public abstract List getCoordinates();

    abstract BasePoint setCoordinates(List list);

    abstract BasePoint setType(String s);
}
