// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.SpatialRelation;

public class PointImpl
    implements Point
{

    private static boolean d;
    private final SpatialContext a;
    private double b;
    private double c;

    public PointImpl(double d1, double d2, SpatialContext spatialcontext)
    {
        a = spatialcontext;
        reset(d1, d2);
    }

    public static boolean equals(Point point, Object obj)
    {
        if (!d && point == null)
        {
            throw new AssertionError();
        }
        if (point != obj)
        {
            if (!(obj instanceof Point))
            {
                return false;
            }
            obj = (Point)obj;
            if (Double.compare(((Point) (obj)).getX(), point.getX()) != 0)
            {
                return false;
            }
            if (Double.compare(((Point) (obj)).getY(), point.getY()) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(Point point)
    {
        long l1 = 0L;
        int i;
        long l;
        if (point.getX() != 0.0D)
        {
            l = Double.doubleToLongBits(point.getX());
        } else
        {
            l = 0L;
        }
        i = (int)(l ^ l >>> 32);
        l = l1;
        if (point.getY() != 0.0D)
        {
            l = Double.doubleToLongBits(point.getY());
        }
        return i * 31 + (int)(l ^ l >>> 32);
    }

    public boolean equals(Object obj)
    {
        return equals(((Point) (this)), obj);
    }

    public double getArea(SpatialContext spatialcontext)
    {
        return 0.0D;
    }

    public Rectangle getBoundingBox()
    {
        return a.makeRectangle(this, this);
    }

    public Circle getBuffered(double d1, SpatialContext spatialcontext)
    {
        return spatialcontext.makeCircle(this, d1);
    }

    public volatile Shape getBuffered(double d1, SpatialContext spatialcontext)
    {
        return getBuffered(d1, spatialcontext);
    }

    public volatile Point getCenter()
    {
        return getCenter();
    }

    public PointImpl getCenter()
    {
        return this;
    }

    public double getX()
    {
        return b;
    }

    public double getY()
    {
        return c;
    }

    public boolean hasArea()
    {
        return false;
    }

    public int hashCode()
    {
        return hashCode(((Point) (this)));
    }

    public boolean isEmpty()
    {
        return Double.isNaN(b);
    }

    public SpatialRelation relate(Shape shape)
    {
        if (isEmpty() || shape.isEmpty())
        {
            return SpatialRelation.DISJOINT;
        }
        if (shape instanceof Point)
        {
            if (equals(shape))
            {
                return SpatialRelation.INTERSECTS;
            } else
            {
                return SpatialRelation.DISJOINT;
            }
        } else
        {
            return shape.relate(this).transpose();
        }
    }

    public void reset(double d1, double d2)
    {
        if (!d && isEmpty())
        {
            throw new AssertionError();
        } else
        {
            b = d1;
            c = d2;
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("Pt(x=")).append(b).append(",y=").append(c).append(")").toString();
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/impl/PointImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
