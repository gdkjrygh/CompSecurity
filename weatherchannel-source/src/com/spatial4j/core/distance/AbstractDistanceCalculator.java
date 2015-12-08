// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.distance;

import com.spatial4j.core.shape.Point;

// Referenced classes of package com.spatial4j.core.distance:
//            DistanceCalculator

public abstract class AbstractDistanceCalculator
    implements DistanceCalculator
{

    public AbstractDistanceCalculator()
    {
    }

    public double distance(Point point, Point point1)
    {
        return distance(point, point1.getX(), point1.getY());
    }

    public String toString()
    {
        return getClass().getSimpleName();
    }

    public boolean within(Point point, double d, double d1, double d2)
    {
        return distance(point, d, d1) <= d2;
    }
}
