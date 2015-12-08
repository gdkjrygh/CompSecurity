// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.jts;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.SpatialRelation;
import com.spatial4j.core.shape.impl.PointImpl;
import com.vividsolutions.jts.geom.d;

public class JtsPoint
    implements Point
{

    private static boolean d;
    private final SpatialContext a;
    private com.vividsolutions.jts.geom.Point b;
    private final boolean c;

    public JtsPoint(com.vividsolutions.jts.geom.Point point, SpatialContext spatialcontext)
    {
        a = spatialcontext;
        b = point;
        c = point.isEmpty();
    }

    public boolean equals(Object obj)
    {
        return PointImpl.equals(this, obj);
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

    public Point getCenter()
    {
        return this;
    }

    public com.vividsolutions.jts.geom.Point getGeom()
    {
        return b;
    }

    public double getX()
    {
        if (isEmpty())
        {
            return (0.0D / 0.0D);
        } else
        {
            return b.getX();
        }
    }

    public double getY()
    {
        if (isEmpty())
        {
            return (0.0D / 0.0D);
        } else
        {
            return b.getY();
        }
    }

    public boolean hasArea()
    {
        return false;
    }

    public int hashCode()
    {
        return PointImpl.hashCode(this);
    }

    public boolean isEmpty()
    {
        return c;
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
            d d3 = b.getCoordinateSequence();
            d3.a(0, 0, d1);
            d3.a(0, 1, d2);
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("Pt(x=")).append(getX()).append(",y=").append(getY()).append(")").toString();
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/jts/JtsPoint.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
