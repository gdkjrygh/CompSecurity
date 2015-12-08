// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.distance.DistanceCalculator;
import com.spatial4j.core.distance.DistanceUtils;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.SpatialRelation;
import java.util.Formatter;
import java.util.Locale;

// Referenced classes of package com.spatial4j.core.shape.impl:
//            CircleImpl

public class GeoCircle extends CircleImpl
{

    private static boolean c;
    private GeoCircle a;
    private double b;

    public GeoCircle(Point point, double d, SpatialContext spatialcontext)
    {
        super(point, d, spatialcontext);
        if (!c && !spatialcontext.isGeo())
        {
            throw new AssertionError();
        } else
        {
            a();
            return;
        }
    }

    private int a(Rectangle rectangle)
    {
        boolean flag = contains(rectangle.getMinX(), rectangle.getMinY());
        if (contains(rectangle.getMinX(), rectangle.getMaxY()) ? !flag : flag) goto _L2; else goto _L1
_L2:
        return 1;
_L1:
        if (!contains(rectangle.getMaxX(), rectangle.getMinY())) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L2; else goto _L5
_L5:
        if (!contains(rectangle.getMaxX(), rectangle.getMaxY()))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (!flag) goto _L2; else goto _L6
_L6:
        return !flag ? 0 : 4;
_L4:
        if (flag)
        {
            return 1;
        }
          goto _L5
        if (flag)
        {
            return 1;
        }
          goto _L6
    }

    private void a()
    {
        if (radiusDEG > 90D)
        {
            if (!c && enclosingBox.getWidth() != 360D)
            {
                throw new AssertionError();
            }
            if (180D - radiusDEG > 0.0D)
            {
                double d3 = 180D - radiusDEG;
                double d = DistanceUtils.normLonDEG(getCenter().getX() + 180D);
                double d2 = DistanceUtils.normLatDEG(getCenter().getY() + 180D);
                d3 -= Math.max(Math.ulp(Math.abs(d2) + d3), Math.ulp(Math.abs(d) + d3));
                if (a != null)
                {
                    a.reset(d, d2, d3);
                } else
                {
                    a = new GeoCircle(ctx.makePoint(d, d2), d3, ctx);
                }
            } else
            {
                a = null;
            }
            b = getCenter().getY();
            return;
        }
        a = null;
        double d1 = ctx.getDistCalc().calcBoxByDistFromPt_yHorizAxisDEG(getCenter(), radiusDEG, ctx);
        if (d1 > enclosingBox.getMaxY())
        {
            b = enclosingBox.getMaxY();
            return;
        }
        if (d1 < enclosingBox.getMinY())
        {
            b = enclosingBox.getMinY();
            return;
        } else
        {
            b = d1;
            return;
        }
    }

    protected double getYAxis()
    {
        return b;
    }

    protected SpatialRelation relateRectanglePhase2(Rectangle rectangle, SpatialRelation spatialrelation)
    {
        if (a != null)
        {
            return a.relate(rectangle).inverse();
        }
        if (enclosingBox.getWidth() == 360D)
        {
            spatialrelation = ctx;
            if (radiusDEG == 180D)
            {
                return SpatialRelation.CONTAINS;
            }
            double d = getCenter().getY() + radiusDEG;
            if (d > 90D)
            {
                d -= 90D;
                if (!c && d > 90D)
                {
                    throw new AssertionError();
                }
                if (rectangle.getMinY() >= 90D - d)
                {
                    return SpatialRelation.CONTAINS;
                }
            } else
            {
                double d3 = point.getY() - radiusDEG;
                if (d3 < -90D)
                {
                    d = -90D - d3;
                    if (!c && d > 90D)
                    {
                        throw new AssertionError();
                    }
                    if (rectangle.getMaxY() <= d - 90D)
                    {
                        return SpatialRelation.CONTAINS;
                    }
                } else
                if (!c && d != 90D && d3 != -90D)
                {
                    throw new AssertionError();
                }
            }
            if (rectangle.getWidth() != 360D)
            {
                int i = a(rectangle);
                double d1 = getCenter().getX();
                if (i == 4)
                {
                    if (d1 <= 0.0D)
                    {
                        d1 = 180D + d1;
                    } else
                    {
                        d1 -= 180D;
                    }
                    if (!rectangle.relateXRange(d1, d1).intersects())
                    {
                        return SpatialRelation.CONTAINS;
                    }
                } else
                if (i == 0 && !rectangle.relateXRange(d1, d1).intersects())
                {
                    return SpatialRelation.DISJOINT;
                }
            }
            return SpatialRelation.INTERSECTS;
        }
        if (!enclosingBox.getCrossesDateLine() && !rectangle.getCrossesDateLine())
        {
            return super.relateRectanglePhase2(rectangle, spatialrelation);
        }
        if (rectangle.getWidth() == 360D)
        {
            return SpatialRelation.INTERSECTS;
        }
        int j = a(rectangle);
        if (j == 4)
        {
            if (rectangle.relateXRange(enclosingBox.getMinX(), enclosingBox.getMaxX()) == SpatialRelation.WITHIN)
            {
                return SpatialRelation.CONTAINS;
            } else
            {
                return SpatialRelation.INTERSECTS;
            }
        }
        if (j > 0)
        {
            return SpatialRelation.INTERSECTS;
        }
        if (rectangle.relateYRange(getYAxis(), getYAxis()).intersects() && rectangle.relateXRange(enclosingBox.getMinX(), enclosingBox.getMaxX()).intersects())
        {
            return SpatialRelation.INTERSECTS;
        }
        if (rectangle.relateXRange(getXAxis(), getXAxis()).intersects())
        {
            double d2 = getCenter().getY() + radiusDEG;
            if (!c && d2 > 90D)
            {
                throw new AssertionError();
            }
            double d4 = getCenter().getY() - radiusDEG;
            if (!c && d4 < -90D)
            {
                throw new AssertionError();
            }
            if (rectangle.relateYRange(d4, d2).intersects())
            {
                return SpatialRelation.INTERSECTS;
            }
        }
        return SpatialRelation.DISJOINT;
    }

    public void reset(double d, double d1, double d2)
    {
        super.reset(d, d1, d2);
        a();
    }

    public String toString()
    {
        double d = DistanceUtils.degrees2Dist(radiusDEG, 6371.0087714000001D);
        String s = (new Formatter(Locale.ROOT)).format("%.1f\260 %.2fkm", new Object[] {
            Double.valueOf(radiusDEG), Double.valueOf(d)
        }).toString();
        return (new StringBuilder("Circle(")).append(point).append(", d=").append(s).append(')').toString();
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/impl/GeoCircle.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
