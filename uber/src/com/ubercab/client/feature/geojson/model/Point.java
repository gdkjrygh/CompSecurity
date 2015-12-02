// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.geojson.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.geojson.model:
//            BasePoint, Shape_Point

public abstract class Point extends BasePoint
{

    public Point()
    {
    }

    public static Point create(List list)
    {
        return (new Shape_Point()).setCoordinates(list);
    }

    volatile BasePoint setCoordinates(List list)
    {
        return setCoordinates(list);
    }

    abstract Point setCoordinates(List list);

    volatile BasePoint setType(String s)
    {
        return setType(s);
    }

    abstract Point setType(String s);
}
