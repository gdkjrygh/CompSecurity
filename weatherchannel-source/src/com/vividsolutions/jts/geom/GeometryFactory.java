// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.a.b;
import com.vividsolutions.jts.geom.c.d;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.vividsolutions.jts.geom:
//            u, i, n, p, 
//            q, r, s, Point, 
//            Polygon, j, f, d, 
//            Coordinate, h

public class GeometryFactory
    implements Serializable
{

    private static final long serialVersionUID = 0xa158a0dfae114cedL;
    private u a;
    private f b;
    private int c;

    public GeometryFactory()
    {
        this(new u(), 0);
    }

    public GeometryFactory(f f1)
    {
        this(new u(), 0, f1);
    }

    public GeometryFactory(u u1)
    {
        this(u1, 0, ((f) (com.vividsolutions.jts.geom.a.b.a())));
    }

    public GeometryFactory(u u1, int k)
    {
        this(u1, k, ((f) (com.vividsolutions.jts.geom.a.b.a())));
    }

    public GeometryFactory(u u1, int k, f f1)
    {
        a = u1;
        b = f1;
        c = k;
    }

    static f a(GeometryFactory geometryfactory)
    {
        return geometryfactory.b;
    }

    public static Point createPointFromInternalCoord(Coordinate coordinate, i k)
    {
        k.getPrecisionModel().a(coordinate);
        return k.getFactory().createPoint(coordinate);
    }

    public static i[] toGeometryArray(Collection collection)
    {
        if (collection == null)
        {
            return null;
        } else
        {
            return (i[])collection.toArray(new i[collection.size()]);
        }
    }

    public static n[] toLineStringArray(Collection collection)
    {
        return (n[])collection.toArray(new n[collection.size()]);
    }

    public static p[] toLinearRingArray(Collection collection)
    {
        return (p[])collection.toArray(new p[collection.size()]);
    }

    public static q[] toMultiLineStringArray(Collection collection)
    {
        return (q[])collection.toArray(new q[collection.size()]);
    }

    public static r[] toMultiPointArray(Collection collection)
    {
        return (r[])collection.toArray(new r[collection.size()]);
    }

    public static s[] toMultiPolygonArray(Collection collection)
    {
        return (s[])collection.toArray(new s[collection.size()]);
    }

    public static Point[] toPointArray(Collection collection)
    {
        return (Point[])collection.toArray(new Point[collection.size()]);
    }

    public static Polygon[] toPolygonArray(Collection collection)
    {
        return (Polygon[])collection.toArray(new Polygon[collection.size()]);
    }

    public i buildGeometry(Collection collection)
    {
        boolean flag2 = true;
        Iterator iterator = collection.iterator();
        boolean flag = false;
        boolean flag1 = false;
        Object obj;
        Class class1;
        for (obj = null; iterator.hasNext(); obj = class1)
        {
            i l = (i)iterator.next();
            Class class2 = l.getClass();
            class1 = ((Class) (obj));
            if (obj == null)
            {
                class1 = class2;
            }
            if (class2 != class1)
            {
                flag1 = true;
            }
            if (l instanceof j)
            {
                flag = true;
            }
        }

        if (obj == null)
        {
            obj = createGeometryCollection(null);
        } else
        {
            if (flag1 || flag)
            {
                return createGeometryCollection(toGeometryArray(collection));
            }
            i k = (i)collection.iterator().next();
            if (collection.size() > 1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            obj = k;
            if (flag)
            {
                if (k instanceof Polygon)
                {
                    return createMultiPolygon(toPolygonArray(collection));
                }
                if (k instanceof n)
                {
                    return createMultiLineString(toLineStringArray(collection));
                }
                if (k instanceof Point)
                {
                    return createMultiPoint(toPointArray(collection));
                } else
                {
                    com.vividsolutions.jts.a.a.a((new StringBuilder("Unhandled class: ")).append(k.getClass().getName()).toString());
                    return k;
                }
            }
        }
        return ((i) (obj));
    }

    public i createGeometry(i k)
    {
        return (new d(this)).a(k, new com.vividsolutions.jts.geom.c.d.a() {

            private GeometryFactory a;

            public final com.vividsolutions.jts.geom.d a(com.vividsolutions.jts.geom.d d1)
            {
                return com.vividsolutions.jts.geom.GeometryFactory.a(a).a(d1);
            }

            
            {
                a = GeometryFactory.this;
                super();
            }
        });
    }

    public j createGeometryCollection(i ai[])
    {
        return new j(ai, this);
    }

    public n createLineString(com.vividsolutions.jts.geom.d d1)
    {
        return new n(d1, this);
    }

    public n createLineString(Coordinate acoordinate[])
    {
        if (acoordinate != null)
        {
            acoordinate = getCoordinateSequenceFactory().a(acoordinate);
        } else
        {
            acoordinate = null;
        }
        return createLineString(((com.vividsolutions.jts.geom.d) (acoordinate)));
    }

    public p createLinearRing(com.vividsolutions.jts.geom.d d1)
    {
        return new p(d1, this);
    }

    public p createLinearRing(Coordinate acoordinate[])
    {
        if (acoordinate != null)
        {
            acoordinate = getCoordinateSequenceFactory().a(acoordinate);
        } else
        {
            acoordinate = null;
        }
        return createLinearRing(((com.vividsolutions.jts.geom.d) (acoordinate)));
    }

    public q createMultiLineString(n an[])
    {
        return new q(an, this);
    }

    public r createMultiPoint(com.vividsolutions.jts.geom.d d1)
    {
        if (d1 == null)
        {
            return createMultiPoint(new Point[0]);
        }
        Point apoint[] = new Point[d1.b()];
        for (int k = 0; k < d1.b(); k++)
        {
            com.vividsolutions.jts.geom.d d2 = getCoordinateSequenceFactory().a(1, d1.a());
            com.vividsolutions.jts.a.a.a(d1, k, d2, 0, 1);
            apoint[k] = createPoint(d2);
        }

        return createMultiPoint(apoint);
    }

    public r createMultiPoint(Coordinate acoordinate[])
    {
        if (acoordinate != null)
        {
            acoordinate = getCoordinateSequenceFactory().a(acoordinate);
        } else
        {
            acoordinate = null;
        }
        return createMultiPoint(((com.vividsolutions.jts.geom.d) (acoordinate)));
    }

    public r createMultiPoint(Point apoint[])
    {
        return new r(apoint, this);
    }

    public s createMultiPolygon(Polygon apolygon[])
    {
        return new s(apolygon, this);
    }

    public Point createPoint(Coordinate coordinate)
    {
        if (coordinate != null)
        {
            coordinate = getCoordinateSequenceFactory().a(new Coordinate[] {
                coordinate
            });
        } else
        {
            coordinate = null;
        }
        return createPoint(((com.vividsolutions.jts.geom.d) (coordinate)));
    }

    public Point createPoint(com.vividsolutions.jts.geom.d d1)
    {
        return new Point(d1, this);
    }

    public Polygon createPolygon(com.vividsolutions.jts.geom.d d1)
    {
        return createPolygon(createLinearRing(d1));
    }

    public Polygon createPolygon(p p1)
    {
        return createPolygon(p1, null);
    }

    public Polygon createPolygon(p p1, p ap[])
    {
        return new Polygon(p1, ap, this);
    }

    public Polygon createPolygon(Coordinate acoordinate[])
    {
        return createPolygon(createLinearRing(acoordinate));
    }

    public f getCoordinateSequenceFactory()
    {
        return b;
    }

    public u getPrecisionModel()
    {
        return a;
    }

    public int getSRID()
    {
        return c;
    }

    public i toGeometry(h h1)
    {
        if (h1.a())
        {
            return createPoint(((com.vividsolutions.jts.geom.d) (null)));
        }
        if (h1.d() == h1.e() && h1.f() == h1.g())
        {
            return createPoint(new Coordinate(h1.d(), h1.f()));
        }
        if (h1.d() == h1.e() || h1.f() == h1.g())
        {
            return createLineString(new Coordinate[] {
                new Coordinate(h1.d(), h1.f()), new Coordinate(h1.e(), h1.g())
            });
        } else
        {
            return createPolygon(createLinearRing(new Coordinate[] {
                new Coordinate(h1.d(), h1.f()), new Coordinate(h1.d(), h1.g()), new Coordinate(h1.e(), h1.g()), new Coordinate(h1.e(), h1.f()), new Coordinate(h1.d(), h1.f())
            }), null);
        }
    }
}
