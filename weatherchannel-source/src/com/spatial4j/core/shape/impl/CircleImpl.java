// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.distance.DistanceCalculator;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.SpatialRelation;

public class CircleImpl
    implements Circle
{

    private static boolean a;
    protected final SpatialContext ctx;
    protected Rectangle enclosingBox;
    protected final Point point;
    protected double radiusDEG;

    public CircleImpl(Point point1, double d, SpatialContext spatialcontext)
    {
        ctx = spatialcontext;
        point = point1;
        if (point.isEmpty())
        {
            d = (0.0D / 0.0D);
        }
        radiusDEG = d;
        if (point.isEmpty())
        {
            point1 = spatialcontext.makeRectangle((0.0D / 0.0D), (0.0D / 0.0D), (0.0D / 0.0D), (0.0D / 0.0D));
        } else
        {
            point1 = spatialcontext.getDistCalc().calcBoxByDistFromPt(point, radiusDEG, spatialcontext, null);
        }
        enclosingBox = point1;
    }

    public static boolean equals(Circle circle, Object obj)
    {
        if (!a && circle == null)
        {
            throw new AssertionError();
        }
        if (circle != obj)
        {
            if (!(obj instanceof Circle))
            {
                return false;
            }
            obj = (Circle)obj;
            if (!circle.getCenter().equals(((Circle) (obj)).getCenter()))
            {
                return false;
            }
            if (Double.compare(((Circle) (obj)).getRadius(), circle.getRadius()) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(Circle circle)
    {
        int i = circle.getCenter().hashCode();
        long l;
        if (circle.getRadius() != 0.0D)
        {
            l = Double.doubleToLongBits(circle.getRadius());
        } else
        {
            l = 0L;
        }
        return (int)(l ^ l >>> 32) + i * 31;
    }

    public boolean contains(double d, double d1)
    {
        return ctx.getDistCalc().within(point, d, d1, radiusDEG);
    }

    public boolean equals(Object obj)
    {
        return equals(((Circle) (this)), obj);
    }

    public double getArea(SpatialContext spatialcontext)
    {
        if (spatialcontext == null)
        {
            return 3.1415926535897931D * radiusDEG * radiusDEG;
        } else
        {
            return spatialcontext.getDistCalc().area(this);
        }
    }

    public Rectangle getBoundingBox()
    {
        return enclosingBox;
    }

    public Circle getBuffered(double d, SpatialContext spatialcontext)
    {
        return spatialcontext.makeCircle(point, radiusDEG + d);
    }

    public volatile Shape getBuffered(double d, SpatialContext spatialcontext)
    {
        return getBuffered(d, spatialcontext);
    }

    public Point getCenter()
    {
        return point;
    }

    public double getRadius()
    {
        return radiusDEG;
    }

    protected double getXAxis()
    {
        return point.getX();
    }

    protected double getYAxis()
    {
        return point.getY();
    }

    public boolean hasArea()
    {
        return radiusDEG > 0.0D;
    }

    public int hashCode()
    {
        return hashCode(((Circle) (this)));
    }

    public boolean isEmpty()
    {
        return point.isEmpty();
    }

    public SpatialRelation relate(Circle circle)
    {
        double d = ctx.getDistCalc().distance(point, circle.getCenter());
        double d1 = radiusDEG;
        double d2 = circle.getRadius();
        if (d > d1 + d2)
        {
            return SpatialRelation.DISJOINT;
        }
        if (d < d1 && d + d2 <= d1)
        {
            return SpatialRelation.CONTAINS;
        }
        if (d < d2 && d + d1 <= d2)
        {
            return SpatialRelation.WITHIN;
        } else
        {
            return SpatialRelation.INTERSECTS;
        }
    }

    public SpatialRelation relate(Point point1)
    {
        if (contains(point1.getX(), point1.getY()))
        {
            return SpatialRelation.CONTAINS;
        } else
        {
            return SpatialRelation.DISJOINT;
        }
    }

    public SpatialRelation relate(Rectangle rectangle)
    {
        SpatialRelation spatialrelation = enclosingBox.relate(rectangle);
        if (spatialrelation == SpatialRelation.DISJOINT || spatialrelation == SpatialRelation.WITHIN)
        {
            return spatialrelation;
        }
        if (spatialrelation == SpatialRelation.CONTAINS && enclosingBox.equals(rectangle))
        {
            return SpatialRelation.WITHIN;
        } else
        {
            return relateRectanglePhase2(rectangle, spatialrelation);
        }
    }

    public SpatialRelation relate(Shape shape)
    {
        if (isEmpty() || shape.isEmpty())
        {
            return SpatialRelation.DISJOINT;
        }
        if (shape instanceof Point)
        {
            return relate((Point)shape);
        }
        if (shape instanceof Rectangle)
        {
            return relate((Rectangle)shape);
        }
        if (shape instanceof Circle)
        {
            return relate((Circle)shape);
        } else
        {
            return shape.relate(this).transpose();
        }
    }

    protected SpatialRelation relateRectanglePhase2(Rectangle rectangle, SpatialRelation spatialrelation)
    {
        double d5 = getXAxis();
        if (d5 >= rectangle.getMinX()) goto _L2; else goto _L1
_L1:
        double d;
        double d1;
        d1 = rectangle.getMinX();
        d = rectangle.getMaxX();
_L6:
        double d3;
        double d4;
        double d6;
label0:
        {
            d6 = getYAxis();
            if (d6 < rectangle.getMinY())
            {
                d4 = rectangle.getMinY();
                d3 = rectangle.getMaxY();
                break label0;
            }
        }
          goto _L3
_L2:
        if (d5 <= rectangle.getMaxX()) goto _L5; else goto _L4
_L4:
        d = rectangle.getMaxX();
_L13:
        d3 = rectangle.getMinX();
        d1 = d;
        d = d3;
          goto _L6
_L5:
        if (rectangle.getMaxX() - d5 <= d5 - rectangle.getMinX())
        {
            break MISSING_BLOCK_LABEL_352;
        }
        d = rectangle.getMaxX();
        d1 = d5;
          goto _L6
_L3:
        if (d6 <= rectangle.getMaxY()) goto _L8; else goto _L7
_L7:
        d3 = rectangle.getMaxY();
_L12:
        double d7 = rectangle.getMinY();
        d4 = d3;
        d3 = d7;
          goto _L9
_L8:
        if (rectangle.getMaxY() - d6 <= d6 - rectangle.getMinY()) goto _L11; else goto _L10
_L10:
        d3 = rectangle.getMaxY();
        d4 = d6;
_L9:
        if (d5 != d1 && d6 != d4 && !contains(d1, d4))
        {
            return SpatialRelation.DISJOINT;
        }
        if (spatialrelation != SpatialRelation.CONTAINS)
        {
            return SpatialRelation.INTERSECTS;
        }
        if (!contains(d, d3))
        {
            return SpatialRelation.INTERSECTS;
        }
        if (point.getY() != getYAxis() && d6 == d4)
        {
            double d2;
            if (d3 == rectangle.getMaxY())
            {
                d2 = rectangle.getMinY();
            } else
            {
                d2 = rectangle.getMaxY();
            }
            if (!contains(d, d2))
            {
                return SpatialRelation.INTERSECTS;
            }
        }
        return SpatialRelation.CONTAINS;
_L11:
        d3 = d6;
          goto _L12
        d = d5;
          goto _L13
    }

    public void reset(double d, double d1, double d2)
    {
        if (!a && isEmpty())
        {
            throw new AssertionError();
        } else
        {
            point.reset(d, d1);
            radiusDEG = d2;
            enclosingBox = ctx.getDistCalc().calcBoxByDistFromPt(point, radiusDEG, ctx, enclosingBox);
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("Circle(")).append(point).append(", d=").append(radiusDEG).append("\260)").toString();
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/impl/CircleImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
