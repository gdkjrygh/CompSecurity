// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.distance;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;

public interface DistanceCalculator
{

    public abstract double area(Circle circle);

    public abstract double area(Rectangle rectangle);

    public abstract Rectangle calcBoxByDistFromPt(Point point, double d, SpatialContext spatialcontext, Rectangle rectangle);

    public abstract double calcBoxByDistFromPt_yHorizAxisDEG(Point point, double d, SpatialContext spatialcontext);

    public abstract double distance(Point point, double d, double d1);

    public abstract double distance(Point point, Point point1);

    public abstract Point pointOnBearing(Point point, double d, double d1, SpatialContext spatialcontext, Point point1);

    public abstract boolean within(Point point, double d, double d1, double d2);
}
