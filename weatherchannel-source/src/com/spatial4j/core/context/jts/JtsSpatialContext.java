// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.context.jts;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.exception.InvalidShapeException;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.jts.JtsGeometry;
import com.spatial4j.core.shape.jts.JtsPoint;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.u;
import com.vividsolutions.jts.i.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.spatial4j.core.context.jts:
//            JtsSpatialContextFactory

public class JtsSpatialContext extends SpatialContext
{

    public static final JtsSpatialContext GEO;
    protected final boolean allowMultiOverlap;
    protected final GeometryFactory geometryFactory;
    protected final boolean useJtsLineString;
    protected final boolean useJtsPoint;

    public JtsSpatialContext(JtsSpatialContextFactory jtsspatialcontextfactory)
    {
        super(jtsspatialcontextfactory);
        geometryFactory = jtsspatialcontextfactory.getGeometryFactory();
        allowMultiOverlap = jtsspatialcontextfactory.allowMultiOverlap;
        useJtsPoint = jtsspatialcontextfactory.useJtsPoint;
        useJtsLineString = jtsspatialcontextfactory.useJtsLineString;
    }

    public GeometryFactory getGeometryFactory()
    {
        return geometryFactory;
    }

    public i getGeometryFrom(Shape shape)
    {
        if (shape instanceof JtsGeometry)
        {
            return ((JtsGeometry)shape).getGeom();
        }
        if (shape instanceof JtsPoint)
        {
            return ((JtsPoint)shape).getGeom();
        }
        if (shape instanceof Point)
        {
            shape = (Point)shape;
            return geometryFactory.createPoint(new Coordinate(shape.getX(), shape.getY()));
        }
        if (shape instanceof Rectangle)
        {
            shape = (Rectangle)shape;
            if (shape.getCrossesDateLine())
            {
                ArrayList arraylist = new ArrayList(2);
                arraylist.add(geometryFactory.toGeometry(new h(shape.getMinX(), getWorldBounds().getMaxX(), shape.getMinY(), shape.getMaxY())));
                arraylist.add(geometryFactory.toGeometry(new h(getWorldBounds().getMinX(), shape.getMaxX(), shape.getMinY(), shape.getMaxY())));
                return geometryFactory.buildGeometry(arraylist);
            } else
            {
                return geometryFactory.toGeometry(new h(shape.getMinX(), shape.getMaxX(), shape.getMinY(), shape.getMaxY()));
            }
        }
        if (shape instanceof Circle)
        {
            shape = (Circle)shape;
            if (shape.getBoundingBox().getCrossesDateLine())
            {
                throw new IllegalArgumentException((new StringBuilder("Doesn't support dateline cross yet: ")).append(shape).toString());
            } else
            {
                c c1 = new c(geometryFactory);
                c1.a(shape.getBoundingBox().getWidth());
                c1.a(100);
                c1.a(new Coordinate(shape.getCenter().getX(), shape.getCenter().getY()));
                return c1.a();
            }
        } else
        {
            throw new InvalidShapeException((new StringBuilder("can't make Geometry from: ")).append(shape).toString());
        }
    }

    public boolean isAllowMultiOverlap()
    {
        return allowMultiOverlap;
    }

    public Shape makeLineString(List list)
    {
        if (!useJtsLineString())
        {
            return super.makeLineString(list);
        }
        Coordinate acoordinate[] = new Coordinate[list.size()];
        int j = 0;
        while (j < acoordinate.length) 
        {
            Point point = (Point)list.get(j);
            if (point instanceof JtsPoint)
            {
                acoordinate[j] = ((JtsPoint)point).getGeom().getCoordinate();
            } else
            {
                acoordinate[j] = new Coordinate(point.getX(), point.getY());
            }
            j++;
        }
        return makeShape(geometryFactory.createLineString(acoordinate));
    }

    public Point makePoint(double d, double d1)
    {
        if (!useJtsPoint())
        {
            return super.makePoint(d, d1);
        }
        verifyX(d);
        verifyY(d1);
        Coordinate coordinate;
        if (Double.isNaN(d))
        {
            coordinate = null;
        } else
        {
            coordinate = new Coordinate(d, d1);
        }
        return new JtsPoint(geometryFactory.createPoint(coordinate), this);
    }

    public JtsGeometry makeShape(i j)
    {
        return makeShape(j, true, allowMultiOverlap);
    }

    public JtsGeometry makeShape(i j, boolean flag, boolean flag1)
    {
        return new JtsGeometry(j, this, flag, flag1);
    }

    public double normX(double d)
    {
        d = super.normX(d);
        return geometryFactory.getPrecisionModel().a(d);
    }

    public double normY(double d)
    {
        d = super.normY(d);
        return geometryFactory.getPrecisionModel().a(d);
    }

    public String toString()
    {
        if (equals(GEO))
        {
            return (new StringBuilder()).append(GEO.getClass().getSimpleName()).append(".GEO").toString();
        } else
        {
            return super.toString();
        }
    }

    public String toString(Shape shape)
    {
        if (shape instanceof JtsGeometry)
        {
            return ((JtsGeometry)shape).getGeom().toText();
        } else
        {
            return super.toString(shape);
        }
    }

    public boolean useJtsLineString()
    {
        return useJtsLineString;
    }

    public boolean useJtsPoint()
    {
        return useJtsPoint;
    }

    static 
    {
        JtsSpatialContextFactory jtsspatialcontextfactory = new JtsSpatialContextFactory();
        jtsspatialcontextfactory.geo = true;
        GEO = new JtsSpatialContext(jtsspatialcontextfactory);
    }
}
