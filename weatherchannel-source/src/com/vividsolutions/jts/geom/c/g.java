// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.r;
import com.vividsolutions.jts.geom.s;
import java.util.ArrayList;
import java.util.List;

public class g
{

    protected GeometryFactory a;
    private boolean b;
    private boolean c;
    private boolean d;

    public g()
    {
        a = null;
        b = true;
        c = true;
        d = false;
    }

    private i a(Point point)
    {
        return a.createPoint(a(point.getCoordinateSequence()));
    }

    private i a(Polygon polygon)
    {
        i k = a((p)polygon.getExteriorRing());
        ArrayList arraylist;
        boolean flag;
        if (k == null || !(k instanceof p) || k.isEmpty())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        arraylist = new ArrayList();
        for (int i1 = 0; i1 < polygon.getNumInteriorRing();)
        {
            i l = a((p)polygon.getInteriorRingN(i1));
            boolean flag1 = flag;
            if (l != null)
            {
                flag1 = flag;
                if (!l.isEmpty())
                {
                    if (!(l instanceof p))
                    {
                        flag = false;
                    }
                    arraylist.add(l);
                    flag1 = flag;
                }
            }
            i1++;
            flag = flag1;
        }

        if (flag)
        {
            return a.createPolygon((p)k, (p[])arraylist.toArray(new p[0]));
        }
        polygon = new ArrayList();
        if (k != null)
        {
            polygon.add(k);
        }
        polygon.addAll(arraylist);
        return a.buildGeometry(polygon);
    }

    private i a(j j1)
    {
        ArrayList arraylist = new ArrayList();
        for (int l = 0; l < j1.getNumGeometries(); l++)
        {
            i k = a(j1.getGeometryN(l));
            if (k != null && (!b || !k.isEmpty()))
            {
                arraylist.add(k);
            }
        }

        if (c)
        {
            return a.createGeometryCollection(GeometryFactory.toGeometryArray(arraylist));
        } else
        {
            return a.buildGeometry(arraylist);
        }
    }

    private i a(n n1)
    {
        return a.createLineString(a(n1.a()));
    }

    private i a(p p1)
    {
        p1 = a(p1.a());
        int k = p1.b();
        if (k > 0 && k < 4)
        {
            return a.createLineString(p1);
        } else
        {
            return a.createLinearRing(p1);
        }
    }

    private i a(q q1)
    {
        ArrayList arraylist = new ArrayList();
        for (int l = 0; l < q1.getNumGeometries(); l++)
        {
            i k = a((n)q1.getGeometryN(l));
            if (k != null && !k.isEmpty())
            {
                arraylist.add(k);
            }
        }

        return a.buildGeometry(arraylist);
    }

    private i a(s s1)
    {
        ArrayList arraylist = new ArrayList();
        for (int l = 0; l < s1.getNumGeometries(); l++)
        {
            i k = a((Polygon)s1.getGeometryN(l));
            if (k != null && !k.isEmpty())
            {
                arraylist.add(k);
            }
        }

        return a.buildGeometry(arraylist);
    }

    protected d a(d d1)
    {
        return (d)d1.clone();
    }

    public final i a(i k)
    {
        a = k.getFactory();
        if (k instanceof Point)
        {
            return a((Point)k);
        }
        if (k instanceof r)
        {
            k = (r)k;
            ArrayList arraylist = new ArrayList();
            for (int i1 = 0; i1 < k.getNumGeometries(); i1++)
            {
                i l = a((Point)k.getGeometryN(i1));
                if (l != null && !l.isEmpty())
                {
                    arraylist.add(l);
                }
            }

            return a.buildGeometry(arraylist);
        }
        if (k instanceof p)
        {
            return a((p)k);
        }
        if (k instanceof n)
        {
            return a((n)k);
        }
        if (k instanceof q)
        {
            return a((q)k);
        }
        if (k instanceof Polygon)
        {
            return a((Polygon)k);
        }
        if (k instanceof s)
        {
            return a((s)k);
        }
        if (k instanceof j)
        {
            return a((j)k);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown Geometry subtype: ")).append(k.getClass().getName()).toString());
        }
    }
}
