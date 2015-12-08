// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.r;
import com.vividsolutions.jts.geom.s;
import java.util.ArrayList;

public final class d
{
    public static abstract class a
    {

        public abstract com.vividsolutions.jts.geom.d a(com.vividsolutions.jts.geom.d d1);

        public i a(i k, GeometryFactory geometryfactory)
        {
            Object obj;
            if (k instanceof p)
            {
                obj = geometryfactory.createLinearRing(a(((p)k).a()));
            } else
            {
                if (k instanceof n)
                {
                    return geometryfactory.createLineString(a(((n)k).a()));
                }
                obj = k;
                if (k instanceof Point)
                {
                    return geometryfactory.createPoint(a(((Point)k).getCoordinateSequence()));
                }
            }
            return ((i) (obj));
        }

        public a()
        {
        }
    }


    private GeometryFactory a;

    public d()
    {
        a = null;
    }

    public d(GeometryFactory geometryfactory)
    {
        a = null;
        a = geometryfactory;
    }

    private Polygon a(Polygon polygon, a a1)
    {
        polygon = (Polygon)a1.a(polygon, a);
        if (polygon == null)
        {
            polygon = a.createPolygon(null);
        }
        if (polygon.isEmpty())
        {
            return polygon;
        }
        p p1 = (p)a(((i) (polygon.getExteriorRing())), a1);
        if (p1 == null || p1.isEmpty())
        {
            return a.createPolygon(null, null);
        }
        ArrayList arraylist = new ArrayList();
        for (int k = 0; k < polygon.getNumInteriorRing(); k++)
        {
            p p2 = (p)a(((i) (polygon.getInteriorRingN(k))), a1);
            if (p2 != null && !p2.isEmpty())
            {
                arraylist.add(p2);
            }
        }

        return a.createPolygon(p1, (p[])arraylist.toArray(new p[0]));
    }

    public final i a(i k, a a1)
    {
        if (k == null)
        {
            return null;
        }
        if (a == null)
        {
            a = k.getFactory();
        }
        if (k instanceof j)
        {
            k = (j)a1.a((j)k, a);
            ArrayList arraylist = new ArrayList();
            for (int i1 = 0; i1 < k.getNumGeometries(); i1++)
            {
                i l = a(k.getGeometryN(i1), a1);
                if (l != null && !l.isEmpty())
                {
                    arraylist.add(l);
                }
            }

            if (k.getClass() == com/vividsolutions/jts/geom/r)
            {
                return a.createMultiPoint((Point[])arraylist.toArray(new Point[0]));
            }
            if (k.getClass() == com/vividsolutions/jts/geom/q)
            {
                return a.createMultiLineString((n[])arraylist.toArray(new n[0]));
            }
            if (k.getClass() == com/vividsolutions/jts/geom/s)
            {
                return a.createMultiPolygon((Polygon[])arraylist.toArray(new Polygon[0]));
            } else
            {
                return a.createGeometryCollection((i[])arraylist.toArray(new i[0]));
            }
        }
        if (k instanceof Polygon)
        {
            return a((Polygon)k, a1);
        }
        if (k instanceof Point)
        {
            return a1.a(k, a);
        }
        if (k instanceof n)
        {
            return a1.a(k, a);
        } else
        {
            com.vividsolutions.jts.a.a.a((new StringBuilder("Unsupported Geometry class: ")).append(k.getClass().getName()).toString());
            return null;
        }
    }
}
