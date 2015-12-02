// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.geojson.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.geojson.model:
//            BasePolygon, Shape_Polygon

public abstract class Polygon extends BasePolygon
{

    public Polygon()
    {
    }

    public static Polygon create(List list)
    {
        return (new Shape_Polygon()).setCoordinates(list).setType("Polygon");
    }

    volatile BasePolygon setCoordinates(List list)
    {
        return setCoordinates(list);
    }

    abstract Polygon setCoordinates(List list);

    volatile BasePolygon setType(String s)
    {
        return setType(s);
    }

    abstract Polygon setType(String s);
}
