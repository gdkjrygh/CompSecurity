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

public abstract class GeodesicSphereDistCalc extends AbstractDistanceCalculator
{
    public static class Haversine extends GeodesicSphereDistCalc
    {

        protected double distanceLatLonRAD(double d, double d1, double d2, double d3)
        {
            return DistanceUtils.distHaversineRAD(d, d1, d2, d3);
        }

        public Haversine()
        {
        }
    }

    public static class LawOfCosines extends GeodesicSphereDistCalc
    {

        protected double distanceLatLonRAD(double d, double d1, double d2, double d3)
        {
            return DistanceUtils.distLawOfCosinesRAD(d, d1, d2, d3);
        }

        public LawOfCosines()
        {
        }
    }

    public static class Vincenty extends GeodesicSphereDistCalc
    {

        protected double distanceLatLonRAD(double d, double d1, double d2, double d3)
        {
            return DistanceUtils.distVincentyRAD(d, d1, d2, d3);
        }

        public Vincenty()
        {
        }
    }


    private static final double a = DistanceUtils.toDegrees(1.0D);

    public GeodesicSphereDistCalc()
    {
    }

    public double area(Circle circle)
    {
        double d = DistanceUtils.toRadians(90D - circle.getRadius());
        double d1 = a;
        double d2 = a;
        return (1.0D - Math.sin(d)) * (6.2831853071795862D * d1 * d2);
    }

    public double area(Rectangle rectangle)
    {
        double d = DistanceUtils.toRadians(rectangle.getMinY());
        double d1 = DistanceUtils.toRadians(rectangle.getMaxY());
        double d2 = a;
        double d3 = a;
        return Math.abs(Math.sin(d) - Math.sin(d1)) * (0.017453292519943295D * d2 * d3) * rectangle.getWidth();
    }

    public Rectangle calcBoxByDistFromPt(Point point, double d, SpatialContext spatialcontext, Rectangle rectangle)
    {
        return DistanceUtils.calcBoxByDistFromPtDEG(point.getY(), point.getX(), d, spatialcontext, rectangle);
    }

    public double calcBoxByDistFromPt_yHorizAxisDEG(Point point, double d, SpatialContext spatialcontext)
    {
        return DistanceUtils.calcBoxByDistFromPt_latHorizAxisDEG(point.getY(), point.getX(), d);
    }

    public final double distance(Point point, double d, double d1)
    {
        return DistanceUtils.toDegrees(distanceLatLonRAD(DistanceUtils.toRadians(point.getY()), DistanceUtils.toRadians(point.getX()), DistanceUtils.toRadians(d1), DistanceUtils.toRadians(d)));
    }

    protected abstract double distanceLatLonRAD(double d, double d1, double d2, double d3);

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            return getClass().equals(obj.getClass());
        }
    }

    public int hashCode()
    {
        return getClass().hashCode();
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
        } else
        {
            point = DistanceUtils.pointOnBearingRAD(DistanceUtils.toRadians(point.getY()), DistanceUtils.toRadians(point.getX()), DistanceUtils.toRadians(d), DistanceUtils.toRadians(d1), spatialcontext, point1);
            point.reset(DistanceUtils.toDegrees(point.getX()), DistanceUtils.toDegrees(point.getY()));
            return point;
        }
    }

}
