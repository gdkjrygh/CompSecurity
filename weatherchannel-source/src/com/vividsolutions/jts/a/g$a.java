// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import java.util.Comparator;

// Referenced classes of package com.vividsolutions.jts.a:
//            g, a

static final class a
    implements Comparator
{

    private Coordinate a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (Coordinate)obj;
        obj1 = (Coordinate)obj1;
        Coordinate coordinate = a;
        double d2 = ((Coordinate) (obj)).x - coordinate.x;
        double d3 = ((Coordinate) (obj)).y - coordinate.y;
        double d = ((Coordinate) (obj1)).x - coordinate.x;
        double d1 = ((Coordinate) (obj1)).y - coordinate.y;
        int i = com.vividsolutions.jts.a.a.a(coordinate, ((Coordinate) (obj)), ((Coordinate) (obj1)));
        if (i == 1)
        {
            return 1;
        }
        if (i == -1)
        {
            return -1;
        }
        d2 = d2 * d2 + d3 * d3;
        d = d * d + d1 * d1;
        if (d2 < d)
        {
            return -1;
        }
        return d2 <= d ? 0 : 1;
    }

    public oordinate(Coordinate coordinate)
    {
        a = coordinate;
    }
}
