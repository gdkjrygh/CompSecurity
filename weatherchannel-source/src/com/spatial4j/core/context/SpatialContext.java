// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.context;

import com.spatial4j.core.distance.CartesianDistCalc;
import com.spatial4j.core.distance.DistanceCalculator;
import com.spatial4j.core.distance.DistanceUtils;
import com.spatial4j.core.exception.InvalidShapeException;
import com.spatial4j.core.io.BinaryCodec;
import com.spatial4j.core.io.LegacyShapeReadWriterFormat;
import com.spatial4j.core.io.WktShapeParser;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.ShapeCollection;
import com.spatial4j.core.shape.impl.BufferedLineString;
import com.spatial4j.core.shape.impl.CircleImpl;
import com.spatial4j.core.shape.impl.GeoCircle;
import com.spatial4j.core.shape.impl.PointImpl;
import com.spatial4j.core.shape.impl.RectangleImpl;
import java.text.ParseException;
import java.util.List;

// Referenced classes of package com.spatial4j.core.context:
//            SpatialContextFactory

public class SpatialContext
{

    public static final SpatialContext GEO = new SpatialContext(new SpatialContextFactory());
    private final boolean a;
    private final DistanceCalculator b;
    private final Rectangle c;
    private final WktShapeParser d;
    private final BinaryCodec e;
    private final boolean f;

    public SpatialContext(SpatialContextFactory spatialcontextfactory)
    {
        a = spatialcontextfactory.geo;
        Object obj;
        boolean flag;
        if (spatialcontextfactory.distCalc == null)
        {
            if (isGeo())
            {
                obj = new com.spatial4j.core.distance.GeodesicSphereDistCalc.Haversine();
            } else
            {
                obj = new CartesianDistCalc();
            }
            b = ((DistanceCalculator) (obj));
        } else
        {
            b = spatialcontextfactory.distCalc;
        }
        obj = spatialcontextfactory.worldBounds;
        if (obj == null)
        {
            if (isGeo())
            {
                obj = new RectangleImpl(-180D, 180D, -90D, 90D, this);
            } else
            {
                obj = new RectangleImpl(-1.7976931348623157E+308D, 1.7976931348623157E+308D, -1.7976931348623157E+308D, 1.7976931348623157E+308D, this);
            }
            c = ((Rectangle) (obj));
        } else
        {
            if (isGeo() && !obj.equals(new RectangleImpl(-180D, 180D, -90D, 90D, this)))
            {
                throw new IllegalArgumentException((new StringBuilder("for geo (lat/lon), bounds must be ")).append(GEO.getWorldBounds()).toString());
            }
            if (((Rectangle) (obj)).getMinX() > ((Rectangle) (obj)).getMaxX())
            {
                throw new IllegalArgumentException((new StringBuilder("worldBounds minX should be <= maxX: ")).append(obj).toString());
            }
            if (((Rectangle) (obj)).getMinY() > ((Rectangle) (obj)).getMaxY())
            {
                throw new IllegalArgumentException((new StringBuilder("worldBounds minY should be <= maxY: ")).append(obj).toString());
            }
            c = new RectangleImpl(((Rectangle) (obj)), this);
        }
        if (spatialcontextfactory.normWrapLongitude && isGeo())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        d = spatialcontextfactory.makeWktShapeParser(this);
        e = spatialcontextfactory.makeBinaryCodec(this);
    }

    public SpatialContext(boolean flag)
    {
        this(a(flag, null, null));
    }

    public SpatialContext(boolean flag, DistanceCalculator distancecalculator, Rectangle rectangle)
    {
        this(a(flag, distancecalculator, rectangle));
    }

    private static SpatialContextFactory a(boolean flag, DistanceCalculator distancecalculator, Rectangle rectangle)
    {
        SpatialContextFactory spatialcontextfactory = new SpatialContextFactory();
        spatialcontextfactory.geo = flag;
        spatialcontextfactory.distCalc = distancecalculator;
        spatialcontextfactory.worldBounds = rectangle;
        return spatialcontextfactory;
    }

    public double calcDistance(Point point, double d1, double d2)
    {
        return getDistCalc().distance(point, d1, d2);
    }

    public double calcDistance(Point point, Point point1)
    {
        return getDistCalc().distance(point, point1);
    }

    public BinaryCodec getBinaryCodec()
    {
        return e;
    }

    public DistanceCalculator getDistCalc()
    {
        return b;
    }

    public WktShapeParser getWktShapeParser()
    {
        return d;
    }

    public Rectangle getWorldBounds()
    {
        return c;
    }

    public boolean isGeo()
    {
        return a;
    }

    public boolean isNormWrapLongitude()
    {
        return f;
    }

    public Shape makeBufferedLineString(List list, double d1)
    {
        return new BufferedLineString(list, d1, isGeo(), this);
    }

    public Circle makeCircle(double d1, double d2, double d3)
    {
        return makeCircle(makePoint(d1, d2), d3);
    }

    public Circle makeCircle(Point point, double d1)
    {
        if (d1 < 0.0D)
        {
            throw new InvalidShapeException((new StringBuilder("distance must be >= 0; got ")).append(d1).toString());
        }
        if (isGeo())
        {
            double d2 = d1;
            if (d1 > 180D)
            {
                d2 = 180D;
            }
            return new GeoCircle(point, d2, this);
        } else
        {
            return new CircleImpl(point, d1, this);
        }
    }

    public ShapeCollection makeCollection(List list)
    {
        return new ShapeCollection(list, this);
    }

    public Shape makeLineString(List list)
    {
        return new BufferedLineString(list, 0.0D, false, this);
    }

    public Point makePoint(double d1, double d2)
    {
        verifyX(d1);
        verifyY(d2);
        return new PointImpl(d1, d2, this);
    }

    public Rectangle makeRectangle(double d1, double d2, double d3, double d4)
    {
        Rectangle rectangle;
        rectangle = getWorldBounds();
        if (d3 < rectangle.getMinY() || d4 > rectangle.getMaxY())
        {
            throw new InvalidShapeException((new StringBuilder("Y values [")).append(d3).append(" to ").append(d4).append("] not in boundary ").append(rectangle).toString());
        }
        if (d3 > d4)
        {
            throw new InvalidShapeException((new StringBuilder("maxY must be >= minY: ")).append(d3).append(" to ").append(d4).toString());
        }
        if (!isGeo()) goto _L2; else goto _L1
_L1:
        verifyX(d1);
        verifyX(d2);
        if (d1 != 180D || d1 == d2) goto _L4; else goto _L3
_L3:
        double d5;
        double d6;
        d5 = -180D;
        d6 = d2;
_L6:
        return new RectangleImpl(d5, d6, d3, d4, this);
_L4:
        d5 = d1;
        d6 = d2;
        if (d2 == -180D)
        {
            d5 = d1;
            d6 = d2;
            if (d1 != d2)
            {
                d6 = 180D;
                d5 = d1;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (d1 < rectangle.getMinX() || d2 > rectangle.getMaxX())
        {
            throw new InvalidShapeException((new StringBuilder("X values [")).append(d1).append(" to ").append(d2).append("] not in boundary ").append(rectangle).toString());
        }
        d5 = d1;
        d6 = d2;
        if (d1 > d2)
        {
            throw new InvalidShapeException((new StringBuilder("maxX must be >= minX: ")).append(d1).append(" to ").append(d2).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Rectangle makeRectangle(Point point, Point point1)
    {
        return makeRectangle(point.getX(), point1.getX(), point.getY(), point1.getY());
    }

    public double normX(double d1)
    {
        double d2 = d1;
        if (f)
        {
            d2 = DistanceUtils.normLonDEG(d1);
        }
        return d2;
    }

    public double normY(double d1)
    {
        return d1;
    }

    public Shape readShape(String s)
        throws InvalidShapeException
    {
        Shape shape1 = LegacyShapeReadWriterFormat.readShapeOrNull(s, this);
        Shape shape = shape1;
        if (shape1 == null)
        {
            try
            {
                shape = readShapeFromWkt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (s.getCause() instanceof InvalidShapeException)
                {
                    throw (InvalidShapeException)s.getCause();
                } else
                {
                    throw new InvalidShapeException(s.toString(), s);
                }
            }
        }
        return shape;
    }

    public Shape readShapeFromWkt(String s)
        throws ParseException
    {
        return d.parse(s);
    }

    public String toString()
    {
        if (equals(GEO))
        {
            return (new StringBuilder()).append(GEO.getClass().getSimpleName()).append(".GEO").toString();
        } else
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append("{geo=").append(a).append(", calculator=").append(b).append(", worldBounds=").append(c).append('}').toString();
        }
    }

    public String toString(Shape shape)
    {
        return LegacyShapeReadWriterFormat.writeShape(shape);
    }

    public void verifyX(double d1)
    {
        Rectangle rectangle = getWorldBounds();
        if (d1 < rectangle.getMinX() || d1 > rectangle.getMaxX())
        {
            throw new InvalidShapeException((new StringBuilder("Bad X value ")).append(d1).append(" is not in boundary ").append(rectangle).toString());
        } else
        {
            return;
        }
    }

    public void verifyY(double d1)
    {
        Rectangle rectangle = getWorldBounds();
        if (d1 < rectangle.getMinY() || d1 > rectangle.getMaxY())
        {
            throw new InvalidShapeException((new StringBuilder("Bad Y value ")).append(d1).append(" is not in boundary ").append(rectangle).toString());
        } else
        {
            return;
        }
    }

}
