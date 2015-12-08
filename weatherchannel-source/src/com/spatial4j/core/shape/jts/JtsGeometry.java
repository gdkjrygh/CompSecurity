// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.jts;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.context.jts.JtsSpatialContext;
import com.spatial4j.core.exception.InvalidShapeException;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.SpatialRelation;
import com.spatial4j.core.shape.impl.BufferedLineString;
import com.spatial4j.core.shape.impl.PointImpl;
import com.spatial4j.core.shape.impl.Range;
import com.spatial4j.core.shape.impl.RectangleImpl;
import com.vividsolutions.jts.g.f.c;
import com.vividsolutions.jts.g.g.e;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.IntersectionMatrix;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.g;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.l;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.o;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.v;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.spatial4j.core.shape.jts:
//            JtsPoint

public class JtsGeometry
    implements Shape
{

    public static final String SYSPROP_ASSERT_VALIDATE = "spatial4j.JtsGeometry.assertValidate";
    private static boolean d;
    private final i a;
    private final boolean b;
    private final Rectangle c;
    protected final JtsSpatialContext ctx;
    protected com.vividsolutions.jts.geom.b.c preparedGeometry;
    protected boolean validated;

    public JtsGeometry(i k, JtsSpatialContext jtsspatialcontext, boolean flag, boolean flag1)
    {
        validated = false;
        ctx = jtsspatialcontext;
        if (k.getClass().equals(com/vividsolutions/jts/geom/j))
        {
            throw new IllegalArgumentException("JtsGeometry does not support GeometryCollection but does support its subclasses.");
        }
        i l;
        if (jtsspatialcontext.isGeo())
        {
            if (flag && k.getEnvelopeInternal().b() >= 180D)
            {
                jtsspatialcontext = new int[1];
                jtsspatialcontext[0] = 0;
                k.apply$6f9a9d12(new l(jtsspatialcontext) {

                    private int a[];

                    public final void a(i j1)
                    {
                        if (!(j1 instanceof n)) goto _L2; else goto _L1
_L1:
                        if (j1.getEnvelopeInternal().b() >= 180D) goto _L4; else goto _L3
_L3:
                        return;
_L4:
                        int k1 = JtsGeometry.a((n)j1);
_L6:
                        a[0] = Math.max(a[0], k1);
                        return;
_L2:
                        if (!(j1 instanceof Polygon) || j1.getEnvelopeInternal().b() < 180D)
                        {
                            continue; /* Loop/switch isn't completed */
                        }
                        k1 = JtsGeometry.a((Polygon)j1);
                        if (true) goto _L6; else goto _L5
_L5:
                        if (true) goto _L3; else goto _L7
_L7:
                    }

            
            {
                a = ai;
                super();
            }
                });
                int i1 = jtsspatialcontext[0];
            }
            jtsspatialcontext = k;
            if (flag1)
            {
                jtsspatialcontext = a(k);
            }
            l = b(jtsspatialcontext);
            if (!d && l.getEnvelopeInternal().b() > 360D)
            {
                throw new AssertionError();
            }
            if (!d && l.getClass().equals(com/vividsolutions/jts/geom/j))
            {
                throw new AssertionError("GeometryCollection unsupported");
            }
            c = computeGeoBBox(l);
        } else
        {
            l = k;
            if (flag1)
            {
                l = a(k);
            }
            k = l.getEnvelopeInternal();
            c = new RectangleImpl(k.d(), k.e(), k.f(), k.g(), jtsspatialcontext);
        }
        l.getEnvelopeInternal();
        a = l;
        if (!d)
        {
            k = System.getProperty("spatial4j.JtsGeometry.assertValidate");
            if (k == null || Boolean.parseBoolean(k))
            {
                validate();
            }
        }
        if (!(l instanceof o) && !(l instanceof v))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    static int a(Polygon polygon)
    {
        n n1 = polygon.getExteriorRing();
        int i1 = b(n1);
        if (i1 > 0)
        {
            for (int k = 0; k < polygon.getNumInteriorRing(); k++)
            {
                n n2 = polygon.getInteriorRingN(k);
                b(n2);
                for (int l = 0; !n1.contains(n2); l++)
                {
                    if (l > i1)
                    {
                        throw new IllegalArgumentException((new StringBuilder("The inner ring doesn't appear to be within the exterior: ")).append(n1).append(" inner: ").append(n2).toString());
                    }
                    a(((i) (n2)), 360);
                }

            }

            polygon.geometryChanged();
        }
        return i1;
    }

    static int a(n n1)
    {
        return b(n1);
    }

    private static i a(i k)
    {
        i l = k;
        if (k instanceof j)
        {
            l = k.union();
        }
        return l;
    }

    private static void a(i k, int l)
    {
        if (l == 0)
        {
            return;
        } else
        {
            k.apply(new g(l) {

                private int a;

                public final void a(d d1, int i1)
                {
                    d1.a(i1, 0, d1.c(i1) + (double)a);
                }

                public final boolean a()
                {
                    return true;
                }

            
            {
                a = k;
                super();
            }
            });
            return;
        }
    }

    private static int b(n n1)
    {
        d d4 = n1.a();
        int i3 = d4.b();
        int k;
        if (i3 <= 1)
        {
            k = 0;
        } else
        {
            double d2 = d4.c(0);
            int l1 = 0;
            int k1 = 0;
            int i2 = 0;
            int j2 = 0;
            int j1 = 1;
            while (j1 < i3) 
            {
                double d1 = d4.c(j1);
                if (!d && (d1 < -180D || d1 > 180D))
                {
                    throw new AssertionError("X not in geo bounds");
                }
                double d3 = d1 + (double)j2;
                int l;
                int k2;
                int l2;
                if (d2 - d3 > 180D)
                {
                    d1 = d3 + 360D;
                    l = j2 + 360;
                    k = i2 + 1;
                    k2 = Math.max(l1, k);
                    l2 = k1;
                } else
                {
                    d1 = d3;
                    k2 = l1;
                    l2 = k1;
                    k = i2;
                    l = j2;
                    if (d3 - d2 > 180D)
                    {
                        d1 = d3 - 360D;
                        l = j2 - 360;
                        k = i2 - 1;
                        l2 = Math.min(k1, k);
                        k2 = l1;
                    }
                }
                if (k != 0)
                {
                    d4.a(j1, 0, d1);
                }
                j1++;
                l1 = k2;
                k1 = l2;
                i2 = k;
                j2 = l;
                d2 = d1;
            }
            if (n1 instanceof p)
            {
                if (!d && !d4.a(0).equals(d4.a(i3 - 1)))
                {
                    throw new AssertionError();
                }
                if (!d && i2 != 0)
                {
                    throw new AssertionError();
                }
            }
            if (!d && (l1 < 0 || k1 > 0))
            {
                throw new AssertionError();
            }
            a(n1, k1 * -360);
            int i1 = l1 - k1;
            k = i1;
            if (i1 > 0)
            {
                n1.geometryChanged();
                return i1;
            }
        }
        return k;
    }

    private static i b(i k)
    {
        h h1 = k.getEnvelopeInternal();
        if (h1.d() >= -180D && h1.e() <= 180D)
        {
            return k;
        }
        if (!d && !k.isValid())
        {
            throw new AssertionError("geom");
        }
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        do
        {
            double d1 = i1 * 360 - 180;
            if (h1.e() > d1)
            {
                i l = k.getFactory().toGeometry(new h(d1, 360D + d1, -90D, 90D));
                if (!d && !l.isValid())
                {
                    throw new AssertionError("rect");
                }
                l = l.intersection(k);
                if (!d && !l.isValid())
                {
                    throw new AssertionError("pageGeom");
                }
                a(l, i1 * -360);
                arraylist.add(l);
                i1++;
            } else
            {
                return (new c(arraylist)).a();
            }
        } while (true);
    }

    public static SpatialRelation intersectionMatrixToSpatialRelation(IntersectionMatrix intersectionmatrix)
    {
        if (intersectionmatrix.isCovers())
        {
            return SpatialRelation.CONTAINS;
        }
        if (intersectionmatrix.isCoveredBy())
        {
            return SpatialRelation.WITHIN;
        }
        if (intersectionmatrix.isDisjoint())
        {
            return SpatialRelation.DISJOINT;
        } else
        {
            return SpatialRelation.INTERSECTS;
        }
    }

    protected Rectangle computeGeoBBox(i k)
    {
        h h1;
label0:
        {
            Object obj1;
label1:
            {
                if (k.isEmpty())
                {
                    return new RectangleImpl((0.0D / 0.0D), (0.0D / 0.0D), (0.0D / 0.0D), (0.0D / 0.0D), ctx);
                }
                h1 = k.getEnvelopeInternal();
                if (h1.b() <= 180D || k.getNumGeometries() <= 1)
                {
                    break label0;
                }
                Object obj = null;
                int l = 0;
                while (l < k.getNumGeometries()) 
                {
                    obj1 = k.getGeometryN(l).getEnvelopeInternal();
                    obj1 = new com.spatial4j.core.shape.impl.Range.LongitudeRange(((h) (obj1)).d(), ((h) (obj1)).e());
                    if (obj == null)
                    {
                        obj = obj1;
                    } else
                    {
                        obj = ((Range) (obj)).expandTo(((Range) (obj1)));
                    }
                    obj1 = obj;
                    if (obj == com.spatial4j.core.shape.impl.Range.LongitudeRange.WORLD_180E180W)
                    {
                        break label1;
                    }
                    l++;
                }
                obj1 = obj;
            }
            return new RectangleImpl(((Range) (obj1)).getMin(), ((Range) (obj1)).getMax(), h1.f(), h1.g(), ctx);
        }
        return new RectangleImpl(h1.d(), h1.e(), h1.f(), h1.g(), ctx);
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (JtsGeometry)obj;
            return a.equalsExact(((JtsGeometry) (obj)).a);
        }
    }

    public double getArea(SpatialContext spatialcontext)
    {
        double d1 = a.getArea();
        if (spatialcontext == null || d1 == 0.0D)
        {
            return d1;
        }
        double d2 = getBoundingBox().getArea(null);
        if (!d && d2 < d1)
        {
            throw new AssertionError();
        } else
        {
            return (d1 / d2) * getBoundingBox().getArea(spatialcontext);
        }
    }

    public Rectangle getBoundingBox()
    {
        return c;
    }

    public volatile Shape getBuffered(double d1, SpatialContext spatialcontext)
    {
        return getBuffered(d1, spatialcontext);
    }

    public JtsGeometry getBuffered(double d1, SpatialContext spatialcontext)
    {
        return ctx.makeShape(a.buffer(d1), true, true);
    }

    public volatile Point getCenter()
    {
        return getCenter();
    }

    public JtsPoint getCenter()
    {
        if (isEmpty())
        {
            return new JtsPoint(ctx.getGeometryFactory().createPoint(null), ctx);
        } else
        {
            return new JtsPoint(a.getCentroid(), ctx);
        }
    }

    public i getGeom()
    {
        return a;
    }

    public boolean hasArea()
    {
        return b;
    }

    public int hashCode()
    {
        return a.getEnvelopeInternal().hashCode();
    }

    public void index()
    {
        if (preparedGeometry == null)
        {
            i k = a;
            new com.vividsolutions.jts.geom.b.d();
            preparedGeometry = com.vividsolutions.jts.geom.b.d.a(k);
        }
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public SpatialRelation relate(Circle circle)
    {
        int i1 = 0;
        SpatialRelation spatialrelation = c.relate(circle);
        if (spatialrelation == SpatialRelation.WITHIN || spatialrelation == SpatialRelation.DISJOINT)
        {
            return spatialrelation;
        }
        Coordinate acoordinate[] = a.getCoordinates();
        int l1 = acoordinate.length;
        int k = 0;
        int l = 0;
        int k1;
        for (; k < l1; k = k1)
        {
            Coordinate coordinate = acoordinate[k];
            int j1 = i1 + 1;
            i1 = l;
            if (circle.relate(new PointImpl(coordinate.x, coordinate.y, ctx)) == SpatialRelation.DISJOINT)
            {
                i1 = l + 1;
            }
            if (j1 != i1 && i1 != 0)
            {
                return SpatialRelation.INTERSECTS;
            }
            k1 = k + 1;
            k = j1;
            l = i1;
            i1 = k;
        }

        if (i1 == l)
        {
            if (relate(circle.getCenter()) == SpatialRelation.DISJOINT)
            {
                return SpatialRelation.DISJOINT;
            } else
            {
                return SpatialRelation.CONTAINS;
            }
        }
        if (!d && l != 0)
        {
            throw new AssertionError();
        } else
        {
            return SpatialRelation.WITHIN;
        }
    }

    public SpatialRelation relate(Point point)
    {
        if (!getBoundingBox().relate(point).intersects())
        {
            return SpatialRelation.DISJOINT;
        }
        if (point instanceof JtsPoint)
        {
            point = ((JtsPoint)point).getGeom();
        } else
        {
            point = ctx.getGeometryFactory().createPoint(new Coordinate(point.getX(), point.getY()));
        }
        return relate(((i) (point)));
    }

    public SpatialRelation relate(Rectangle rectangle)
    {
        SpatialRelation spatialrelation = c.relate(rectangle);
        if (spatialrelation == SpatialRelation.WITHIN || spatialrelation == SpatialRelation.DISJOINT)
        {
            return spatialrelation;
        } else
        {
            return relate(ctx.getGeometryFrom(rectangle));
        }
    }

    public SpatialRelation relate(Shape shape)
    {
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
        }
        if (shape instanceof JtsGeometry)
        {
            return relate((JtsGeometry)shape);
        }
        if (shape instanceof BufferedLineString)
        {
            throw new UnsupportedOperationException("Can't use BufferedLineString with JtsGeometry");
        } else
        {
            return shape.relate(this).transpose();
        }
    }

    public SpatialRelation relate(JtsGeometry jtsgeometry)
    {
        return relate(jtsgeometry.a);
    }

    protected SpatialRelation relate(i k)
    {
        if (k instanceof com.vividsolutions.jts.geom.Point)
        {
            if (preparedGeometry != null)
            {
                if (preparedGeometry.f(k))
                {
                    return SpatialRelation.DISJOINT;
                } else
                {
                    return SpatialRelation.CONTAINS;
                }
            }
            if (a.disjoint(k))
            {
                return SpatialRelation.DISJOINT;
            } else
            {
                return SpatialRelation.CONTAINS;
            }
        }
        if (preparedGeometry == null)
        {
            return intersectionMatrixToSpatialRelation(a.relate(k));
        }
        if (preparedGeometry.e(k))
        {
            return SpatialRelation.CONTAINS;
        }
        if (preparedGeometry.d(k))
        {
            return SpatialRelation.WITHIN;
        }
        if (preparedGeometry.g(k))
        {
            return SpatialRelation.INTERSECTS;
        } else
        {
            return SpatialRelation.DISJOINT;
        }
    }

    public String toString()
    {
        return a.toString();
    }

    public void validate()
        throws InvalidShapeException
    {
        if (!validated)
        {
            com.vividsolutions.jts.g.g.d d1 = new com.vividsolutions.jts.g.g.d(a);
            if (!d1.a())
            {
                throw new InvalidShapeException(d1.b().toString());
            }
            validated = true;
        }
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/jts/JtsGeometry.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
