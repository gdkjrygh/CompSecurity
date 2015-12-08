// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape;


// Referenced classes of package com.spatial4j.core.shape:
//            Shape, SpatialRelation

public interface Rectangle
    extends Shape
{

    public abstract boolean getCrossesDateLine();

    public abstract double getHeight();

    public abstract double getMaxX();

    public abstract double getMaxY();

    public abstract double getMinX();

    public abstract double getMinY();

    public abstract double getWidth();

    public abstract SpatialRelation relateXRange(double d, double d1);

    public abstract SpatialRelation relateYRange(double d, double d1);

    public abstract void reset(double d, double d1, double d2, double d3);
}
