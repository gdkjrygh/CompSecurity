// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.geojson.model;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.geojson.model:
//            BasePoint, Shape_LngLatPoint

public abstract class LngLatPoint extends BasePoint
{

    public LngLatPoint()
    {
    }

    public static LngLatPoint create(double d, double d1)
    {
        return (new Shape_LngLatPoint()).setCoordinates(Arrays.asList(new Double[] {
            Double.valueOf(d), Double.valueOf(d1)
        }));
    }

    public int getLatIndex()
    {
        return 1;
    }

    public int getLngIndex()
    {
        return 0;
    }

    volatile BasePoint setCoordinates(List list)
    {
        return setCoordinates(list);
    }

    abstract LngLatPoint setCoordinates(List list);

    volatile BasePoint setType(String s)
    {
        return setType(s);
    }

    abstract LngLatPoint setType(String s);
}
