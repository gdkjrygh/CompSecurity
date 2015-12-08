// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.distance;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;

// Referenced classes of package com.spatial4j.core.distance:
//            AbstractDistanceCalculator, DistanceUtils

public class CartesianDistCalc extends AbstractDistanceCalculator
{

    private final boolean a;

    public CartesianDistCalc()
    {
        a = false;
    }

    public CartesianDistCalc(boolean flag)
    {
        a = flag;
    }

    public double area(Circle circle)
    {
        return circle.getArea(null);
    }

    public double area(Rectangle rectangle)
    {
        return rectangle.getArea(null);
    }

    public Rectangle calcBoxByDistFromPt(Point point, double d, SpatialContext spatialcontext, Rectangle rectangle)
    {
        double d1 = point.getX() - d;
        double d2 = point.getX() + d;
        double d3 = point.getY() - d;
        d = point.getY() + d;
        if (rectangle == null)
        {
            return spatialcontext.makeRectangle(d1, d2, d3, d);
        } else
        {
            rectangle.reset(d1, d2, d3, d);
            return rectangle;
        }
    }

    public double calcBoxByDistFromPt_yHorizAxisDEG(Point point, double d, SpatialContext spatialcontext)
    {
        return point.getY();
    }

    public double distance(Point point, double d, double d1)
    {
        d = point.getX() - d;
        d1 = point.getY() - d1;
        d = d * d + d1 * d1;
        if (a)
        {
            return d;
        } else
        {
            return Math.sqrt(d);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CartesianDistCalc)obj;
            if (a != ((CartesianDistCalc) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return !a ? 0 : 1;
    }

    public Point pointOnBearing(Point point, double d, double d1, SpatialContext spatialcontext, Point point1)
    {
        if (d == 0.0D)
        {
            if (point1 == null)
            {
                return point;
            } else
            {
                point1.reset(point.getX(), point.getY());
                return point1;
            }
        }
        double d2 = DistanceUtils.toRadians(d1);
        d1 = point.getX() + Math.sin(d2) * d;
        double d3 = point.getY();
        d = Math.cos(d2) * d + d3;
        if (point1 == null)
        {
            return spatialcontext.makePoint(d1, d);
        } else
        {
            point1.reset(d1, d);
            return point1;
        }
    }

    public boolean within(Point point, double d, double d1, double d2)
    {
        d = point.getX() - d;
        d1 = point.getY() - d1;
        return d * d + d1 * d1 <= d2 * d2;
    }
}
