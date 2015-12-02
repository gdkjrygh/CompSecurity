// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.geojson.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.geojson.model:
//            BasePolygon, Shape_LngLatPolygon

public abstract class LngLatPolygon extends BasePolygon
{

    public LngLatPolygon()
    {
    }

    public static LngLatPolygon create(List list)
    {
        return (new Shape_LngLatPolygon()).setCoordinates(list);
    }

    public int getLatIndex()
    {
        return 1;
    }

    public int getLngIndex()
    {
        return 0;
    }

    volatile BasePolygon setCoordinates(List list)
    {
        return setCoordinates(list);
    }

    abstract LngLatPolygon setCoordinates(List list);

    volatile BasePolygon setType(String s)
    {
        return setType(s);
    }

    abstract LngLatPolygon setType(String s);
}
