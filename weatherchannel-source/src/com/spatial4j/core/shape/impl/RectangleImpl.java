// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.distance.DistanceCalculator;
import com.spatial4j.core.distance.DistanceUtils;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.SpatialRelation;

// Referenced classes of package com.spatial4j.core.shape.impl:
//            PointImpl

public class RectangleImpl
    implements Rectangle
{

    private static boolean f;
    private final SpatialContext a;
    private double b;
    private double c;
    private double d;
    private double e;

    public RectangleImpl(double d1, double d2, double d3, double d4, SpatialContext spatialcontext)
    {
        a = spatialcontext;
        reset(d1, d2, d3, d4);
    }

    public RectangleImpl(Point point, Point point1, SpatialContext spatialcontext)
    {
        this(point.getX(), point1.getX(), point.getY(), point1.getY(), spatialcontext);
    }

    public RectangleImpl(Rectangle rectangle, SpatialContext spatialcontext)
    {
        this(rectangle.getMinX(), rectangle.getMaxX(), rectangle.getMinY(), rectangle.getMaxY(), spatialcontext);
    }

    private static SpatialRelation a(double d1, double d2, double d3, double d4)
    {
        if (d3 > d2 || d4 < d1)
        {
            return SpatialRelation.DISJOINT;
        }
        if (d3 >= d1 && d4 <= d2)
        {
            return SpatialRelation.CONTAINS;
        }
        if (d3 <= d1 && d4 >= d2)
        {
            return SpatialRelation.WITHIN;
        } else
        {
            return SpatialRelation.INTERSECTS;
        }
    }

    public static boolean equals(Rectangle rectangle, Object obj)
    {
        if (!f && rectangle == null)
        {
            throw new AssertionError();
        }
        if (rectangle != obj)
        {
            if (!(obj instanceof Rectangle))
            {
                return false;
            }
            obj = (RectangleImpl)obj;
            if (Double.compare(((RectangleImpl) (obj)).getMaxX(), rectangle.getMaxX()) != 0)
            {
                return false;
            }
            if (Double.compare(((RectangleImpl) (obj)).getMaxY(), rectangle.getMaxY()) != 0)
            {
                return false;
            }
            if (Double.compare(((RectangleImpl) (obj)).getMinX(), rectangle.getMinX()) != 0)
            {
                return false;
            }
            if (Double.compare(((RectangleImpl) (obj)).getMinY(), rectangle.getMinY()) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(Rectangle rectangle)
    {
        long l1 = 0L;
        int i;
        int j;
        int k;
        long l;
        if (rectangle.getMinX() != 0.0D)
        {
            l = Double.doubleToLongBits(rectangle.getMinX());
        } else
        {
            l = 0L;
        }
        i = (int)(l ^ l >>> 32);
        if (rectangle.getMaxX() != 0.0D)
        {
            l = Double.doubleToLongBits(rectangle.getMaxX());
        } else
        {
            l = 0L;
        }
        j = (int)(l ^ l >>> 32);
        if (rectangle.getMinY() != 0.0D)
        {
            l = Double.doubleToLongBits(rectangle.getMinY());
        } else
        {
            l = 0L;
        }
        k = (int)(l ^ l >>> 32);
        l = l1;
        if (rectangle.getMaxY() != 0.0D)
        {
            l = Double.doubleToLongBits(rectangle.getMaxY());
        }
        return (k + (i * 31 + j) * 31) * 31 + (int)(l ^ l >>> 32);
    }

    public boolean equals(Object obj)
    {
        return equals(((Rectangle) (this)), obj);
    }

    public double getArea(SpatialContext spatialcontext)
    {
        if (spatialcontext == null)
        {
            return getWidth() * getHeight();
        } else
        {
            return spatialcontext.getDistCalc().area(this);
        }
    }

    public Rectangle getBoundingBox()
    {
        return this;
    }

    public Rectangle getBuffered(double d1, SpatialContext spatialcontext)
    {
        if (spatialcontext.isGeo())
        {
            if (e + d1 >= 90D)
            {
                return spatialcontext.makeRectangle(-180D, 180D, Math.max(-90D, d - d1), 90D);
            }
            if (d - d1 <= -90D)
            {
                return spatialcontext.makeRectangle(-180D, 180D, -90D, Math.min(90D, e + d1));
            }
            double d2;
            if (e - d > 0.0D)
            {
                d2 = e;
            } else
            {
                d2 = d;
            }
            d2 = DistanceUtils.calcBoxByDistFromPt_deltaLonDEG(d2, b, d1);
            if (2D * d2 + getWidth() >= 360D)
            {
                return spatialcontext.makeRectangle(-180D, 180D, d - d1, e + d1);
            } else
            {
                return spatialcontext.makeRectangle(DistanceUtils.normLonDEG(b - d2), DistanceUtils.normLonDEG(d2 + c), d - d1, e + d1);
            }
        } else
        {
            Rectangle rectangle = spatialcontext.getWorldBounds();
            return spatialcontext.makeRectangle(Math.max(rectangle.getMinX(), b - d1), Math.min(rectangle.getMaxX(), c + d1), Math.max(rectangle.getMinY(), d - d1), Math.min(rectangle.getMaxY(), e + d1));
        }
    }

    public volatile Shape getBuffered(double d1, SpatialContext spatialcontext)
    {
        return getBuffered(d1, spatialcontext);
    }

    public Point getCenter()
    {
        if (Double.isNaN(b))
        {
            return a.makePoint((0.0D / 0.0D), (0.0D / 0.0D));
        }
        double d3 = getHeight() / 2D;
        double d4 = d;
        double d1 = getWidth() / 2D;
        double d2 = b + d1;
        d1 = d2;
        if (b > c)
        {
            d1 = DistanceUtils.normLonDEG(d2);
        }
        return new PointImpl(d1, d3 + d4, a);
    }

    public boolean getCrossesDateLine()
    {
        return b > c;
    }

    public double getHeight()
    {
        return e - d;
    }

    public double getMaxX()
    {
        return c;
    }

    public double getMaxY()
    {
        return e;
    }

    public double getMinX()
    {
        return b;
    }

    public double getMinY()
    {
        return d;
    }

    public double getWidth()
    {
        double d2 = c - b;
        double d1 = d2;
        if (d2 < 0.0D)
        {
            d2 += 360D;
            d1 = d2;
            if (!f)
            {
                d1 = d2;
                if (d2 < 0.0D)
                {
                    throw new AssertionError();
                }
            }
        }
        return d1;
    }

    public boolean hasArea()
    {
        return c != b && e != d;
    }

    public int hashCode()
    {
        return hashCode(((Rectangle) (this)));
    }

    public boolean isEmpty()
    {
        return Double.isNaN(b);
    }

    public SpatialRelation relate(Point point)
    {
        if (point.getY() > getMaxY() || point.getY() < getMinY())
        {
            return SpatialRelation.DISJOINT;
        }
        double d5 = b;
        double d1 = c;
        double d4 = point.getX();
        double d2 = d4;
        double d3 = d1;
        if (a.isGeo())
        {
            d2 = d1 - d5;
            if (d2 < 0.0D)
            {
                d1 = d2 + 360D + d5;
            }
            if (d4 < d5)
            {
                d2 = d4 + 360D;
                d3 = d1;
            } else
            if (d4 > d1)
            {
                d2 = d4 - 360D;
                d3 = d1;
            } else
            {
                return SpatialRelation.CONTAINS;
            }
        }
        if (d2 < d5 || d2 > d3)
        {
            return SpatialRelation.DISJOINT;
        } else
        {
            return SpatialRelation.CONTAINS;
        }
    }

    public SpatialRelation relate(Rectangle rectangle)
    {
        SpatialRelation spatialrelation2 = relateYRange(rectangle.getMinY(), rectangle.getMaxY());
        if (spatialrelation2 != SpatialRelation.DISJOINT) goto _L2; else goto _L1
_L1:
        SpatialRelation spatialrelation = SpatialRelation.DISJOINT;
_L4:
        return spatialrelation;
_L2:
        SpatialRelation spatialrelation1;
        spatialrelation1 = relateXRange(rectangle.getMinX(), rectangle.getMaxX());
        if (spatialrelation1 == SpatialRelation.DISJOINT)
        {
            return SpatialRelation.DISJOINT;
        }
        spatialrelation = spatialrelation1;
        if (spatialrelation1 == spatialrelation2) goto _L4; else goto _L3
_L3:
        if (getMinX() == rectangle.getMinX() && getMaxX() == rectangle.getMaxX())
        {
            return spatialrelation2;
        }
        if (getMinY() != rectangle.getMinY())
        {
            break; /* Loop/switch isn't completed */
        }
        spatialrelation = spatialrelation1;
        if (getMaxY() == rectangle.getMaxY()) goto _L4; else goto _L5
_L5:
        return SpatialRelation.INTERSECTS;
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
        } else
        {
            return shape.relate(this).transpose();
        }
    }

    public SpatialRelation relateXRange(double d1, double d2)
    {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        d8 = b;
        d3 = c;
        d7 = d8;
        d4 = d3;
        d6 = d1;
        d5 = d2;
        if (!a.isGeo()) goto _L2; else goto _L1
_L1:
        d4 = d3 - d8;
        if (d4 == 360D)
        {
            return SpatialRelation.CONTAINS;
        }
        if (d4 < 0.0D)
        {
            d3 = 360D + d4 + d8;
        }
        d4 = d2 - d1;
        if (d4 == 360D)
        {
            return SpatialRelation.WITHIN;
        }
        if (d4 < 0.0D)
        {
            d2 = d1 + (d4 + 360D);
        }
        if (d3 >= d1) goto _L4; else goto _L3
_L3:
        d7 = d8 + 360D;
        d4 = d3 + 360D;
        d5 = d2;
        d6 = d1;
_L2:
        return a(d7, d4, d6, d5);
_L4:
        d7 = d8;
        d4 = d3;
        d6 = d1;
        d5 = d2;
        if (d2 < d8)
        {
            d6 = d1 + 360D;
            d5 = d2 + 360D;
            d7 = d8;
            d4 = d3;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public SpatialRelation relateYRange(double d1, double d2)
    {
        return a(d, e, d1, d2);
    }

    public void reset(double d1, double d2, double d3, double d4)
    {
        if (!f && isEmpty())
        {
            throw new AssertionError();
        }
        b = d1;
        c = d2;
        d = d3;
        e = d4;
        if (!f && d3 > d4 && !Double.isNaN(d3))
        {
            throw new AssertionError((new StringBuilder("minY, maxY: ")).append(d3).append(", ").append(d4).toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("Rect(minX=")).append(b).append(",maxX=").append(c).append(",minY=").append(d).append(",maxY=").append(e).append(")").toString();
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/impl/RectangleImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
