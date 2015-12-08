// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.SpatialRelation;

public class InfBufLine
{

    private static final int e[] = {
        -1, 3, 4, 1, 2
    };
    private static boolean f;
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    InfBufLine(double d1, Point point, double d2)
    {
        if (!f && Double.isNaN(d1))
        {
            throw new AssertionError();
        }
        a = d1;
        if (Double.isInfinite(d1))
        {
            b = point.getX();
            d = (0.0D / 0.0D);
        } else
        {
            b = point.getY() - point.getX() * d1;
            d = 1.0D / Math.sqrt(d1 * d1 + 1.0D);
        }
        c = d2;
    }

    public static void cornerByQuadrant(Rectangle rectangle, int i, Point point)
    {
        double d1;
        double d2;
        if (i == 1 || i == 4)
        {
            d1 = rectangle.getMaxX();
        } else
        {
            d1 = rectangle.getMinX();
        }
        if (i == 1 || i == 2)
        {
            d2 = rectangle.getMaxY();
        } else
        {
            d2 = rectangle.getMinY();
        }
        point.reset(d1, d2);
    }

    final SpatialRelation a(Rectangle rectangle, Point point, Point point1)
    {
        if (!f && !rectangle.getCenter().equals(point))
        {
            throw new AssertionError();
        }
        int i = quadrant(point);
        cornerByQuadrant(rectangle, e[i], point1);
        if (a(point1))
        {
            cornerByQuadrant(rectangle, i, point1);
            if (a(point1))
            {
                return SpatialRelation.CONTAINS;
            } else
            {
                return SpatialRelation.INTERSECTS;
            }
        }
        if (quadrant(point1) == i)
        {
            return SpatialRelation.DISJOINT;
        } else
        {
            return SpatialRelation.INTERSECTS;
        }
    }

    final boolean a(Point point)
    {
        return distanceUnbuffered(point) <= c;
    }

    public double distanceUnbuffered(Point point)
    {
        if (Double.isInfinite(a))
        {
            return Math.abs(point.getX() - b);
        } else
        {
            return Math.abs(point.getY() - a * point.getX() - b) * d;
        }
    }

    public double getBuf()
    {
        return c;
    }

    public double getDistDenomInv()
    {
        return d;
    }

    public double getIntercept()
    {
        return b;
    }

    public double getSlope()
    {
        return a;
    }

    public int quadrant(Point point)
    {
        if (!Double.isInfinite(a)) goto _L2; else goto _L1
_L1:
        if (point.getX() <= b) goto _L4; else goto _L3
_L3:
        return 1;
_L4:
        return 2;
_L2:
        double d1 = a;
        double d2 = point.getX();
        double d3 = b;
        boolean flag;
        if (point.getY() >= d1 * d2 + d3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a > 0.0D)
        {
            return !flag ? 4 : 2;
        }
        if (!flag)
        {
            return 3;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String toString()
    {
        return (new StringBuilder("InfBufLine{buf=")).append(c).append(", intercept=").append(b).append(", slope=").append(a).append('}').toString();
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/impl/InfBufLine.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
