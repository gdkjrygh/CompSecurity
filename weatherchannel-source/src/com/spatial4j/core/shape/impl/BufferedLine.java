// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.distance.DistanceUtils;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.SpatialRelation;

// Referenced classes of package com.spatial4j.core.shape.impl:
//            PointImpl, InfBufLine

public class BufferedLine
    implements Shape
{

    private static boolean g;
    private final Point a;
    private final Point b;
    private final double c;
    private final Rectangle d;
    private final InfBufLine e;
    private final InfBufLine f;

    public BufferedLine(Point point, Point point1, double d1, SpatialContext spatialcontext)
    {
        if (!g && d1 < 0.0D)
        {
            throw new AssertionError();
        }
        a = point;
        b = point1;
        c = d1;
        double d2 = point1.getY() - point.getY();
        double d3 = point1.getX() - point.getX();
        PointImpl pointimpl = new PointImpl(point.getX() + d3 / 2D, point.getY() + d2 / 2D, null);
        double d4;
        if (d3 == 0.0D && d2 == 0.0D)
        {
            e = new InfBufLine(0.0D, pointimpl, d1);
            f = new InfBufLine((1.0D / 0.0D), pointimpl, d1);
        } else
        {
            e = new InfBufLine(d2 / d3, pointimpl, d1);
            d4 = Math.sqrt(d3 * d3 + d2 * d2);
            f = new InfBufLine(-d3 / d2, pointimpl, d4 / 2D + d1);
        }
        if (d3 == 0.0D)
        {
            double d5;
            double d8;
            if (point.getY() <= point1.getY())
            {
                d2 = point.getY();
                d3 = point1.getY();
            } else
            {
                d2 = point1.getY();
                d3 = point.getY();
            }
            d8 = point.getX();
            d5 = point.getX();
            d4 = d3 + d1;
            d3 = d5 + d1;
            d5 = d2 - d1;
            d8 -= d1;
            d2 = d4;
            d1 = d5;
            d4 = d8;
        } else
        {
            d3 = (1.0D + Math.abs(e.getSlope())) * d1 * e.getDistDenomInv();
            if (!g && (d3 < d1 || d3 > 1.5D * d1))
            {
                throw new AssertionError();
            }
            if (point.getX() <= point1.getX())
            {
                d1 = point.getX() - d3;
                d2 = point1.getX() + d3;
            } else
            {
                d1 = point1.getX() - d3;
                d2 = point.getX() + d3;
            }
            if (point.getY() <= point1.getY())
            {
                double d6 = point.getY() - d3;
                double d9 = d3 + point1.getY();
                d3 = d2;
                d4 = d1;
                d1 = d6;
                d2 = d9;
            } else
            {
                double d7 = point1.getY() - d3;
                double d10 = d3 + point.getY();
                d3 = d2;
                d4 = d1;
                d1 = d7;
                d2 = d10;
            }
        }
        point = spatialcontext.getWorldBounds();
        d = spatialcontext.makeRectangle(Math.max(point.getMinX(), d4), Math.min(point.getMaxX(), d3), Math.max(point.getMinY(), d1), Math.min(point.getMaxY(), d2));
    }

    public static double expandBufForLongitudeSkew(Point point, Point point1, double d1)
    {
        double d2 = DistanceUtils.calcLonDegreesAtLat(Math.max(Math.abs(point.getY()), Math.abs(point1.getY())), d1);
        if (!g && d2 < d1)
        {
            throw new AssertionError();
        } else
        {
            return d2;
        }
    }

    public boolean contains(Point point)
    {
        return e.a(point) && f.a(point);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BufferedLine)obj;
            if (Double.compare(((BufferedLine) (obj)).c, c) != 0)
            {
                return false;
            }
            if (!a.equals(((BufferedLine) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((BufferedLine) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public Point getA()
    {
        return a;
    }

    public double getArea(SpatialContext spatialcontext)
    {
        return e.getBuf() * f.getBuf() * 4D;
    }

    public Point getB()
    {
        return b;
    }

    public Rectangle getBoundingBox()
    {
        return d;
    }

    public double getBuf()
    {
        return c;
    }

    public Shape getBuffered(double d1, SpatialContext spatialcontext)
    {
        return new BufferedLine(a, b, c + d1, spatialcontext);
    }

    public Point getCenter()
    {
        return getBoundingBox().getCenter();
    }

    public InfBufLine getLinePerp()
    {
        return f;
    }

    public InfBufLine getLinePrimary()
    {
        return e;
    }

    public boolean hasArea()
    {
        return c > 0.0D;
    }

    public int hashCode()
    {
        int i = a.hashCode();
        int j = b.hashCode();
        long l;
        if (c != 0.0D)
        {
            l = Double.doubleToLongBits(c);
        } else
        {
            l = 0L;
        }
        return (int)(l ^ l >>> 32) + (i * 31 + j) * 31;
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public SpatialRelation relate(Rectangle rectangle)
    {
        SpatialRelation spatialrelation = d.relate(rectangle);
        Object obj = spatialrelation;
        if (spatialrelation != SpatialRelation.DISJOINT)
        {
            if (spatialrelation == SpatialRelation.WITHIN)
            {
                obj = spatialrelation;
            } else
            {
                obj = new PointImpl(0.0D, 0.0D, null);
                Point point = rectangle.getCenter();
                SpatialRelation spatialrelation1 = e.a(rectangle, point, ((Point) (obj)));
                if (spatialrelation1 == SpatialRelation.DISJOINT)
                {
                    return SpatialRelation.DISJOINT;
                }
                rectangle = f.a(rectangle, point, ((Point) (obj)));
                if (rectangle == SpatialRelation.DISJOINT)
                {
                    return SpatialRelation.DISJOINT;
                }
                obj = spatialrelation1;
                if (spatialrelation1 != rectangle)
                {
                    return SpatialRelation.INTERSECTS;
                }
            }
        }
        return ((SpatialRelation) (obj));
    }

    public SpatialRelation relate(Shape shape)
    {
        if (shape instanceof Point)
        {
            if (contains((Point)shape))
            {
                return SpatialRelation.CONTAINS;
            } else
            {
                return SpatialRelation.DISJOINT;
            }
        }
        if (shape instanceof Rectangle)
        {
            return relate((Rectangle)shape);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public String toString()
    {
        return (new StringBuilder("BufferedLine(")).append(a).append(", ").append(b).append(" b=").append(c).append(")").toString();
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/impl/BufferedLine.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
    }
}
