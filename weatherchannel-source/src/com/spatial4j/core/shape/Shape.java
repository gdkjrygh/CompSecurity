// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape;

import com.spatial4j.core.context.SpatialContext;

// Referenced classes of package com.spatial4j.core.shape:
//            Rectangle, Point, SpatialRelation

public interface Shape
{

    public abstract boolean equals(Object obj);

    public abstract double getArea(SpatialContext spatialcontext);

    public abstract Rectangle getBoundingBox();

    public abstract Shape getBuffered(double d, SpatialContext spatialcontext);

    public abstract Point getCenter();

    public abstract boolean hasArea();

    public abstract boolean isEmpty();

    public abstract SpatialRelation relate(Shape shape);
}
