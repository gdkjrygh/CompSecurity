// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.a;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.r;
import com.vividsolutions.jts.geom.s;
import com.vividsolutions.jts.geom.x;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.a:
//            f

public final class g
{

    private i a;
    private double b;
    private f c;
    private List d;

    public g(i k, double d1, f f1)
    {
        d = new ArrayList();
        a = k;
        b = d1;
        c = f1;
    }

    private void a(i k)
    {
        if (!k.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(k instanceof Polygon))
        {
            break; /* Loop/switch isn't completed */
        }
        k = (Polygon)k;
        double d1 = b;
        byte byte0 = 1;
        if (b < 0.0D)
        {
            d1 = -b;
            byte0 = 2;
        }
        p p1 = (p)k.getExteriorRing();
        Coordinate acoordinate[] = com.vividsolutions.jts.geom.a.b(p1.getCoordinates());
        if ((b >= 0.0D || !a(p1, b)) && (b > 0.0D || acoordinate.length >= 3))
        {
            a(acoordinate, d1, byte0, 2, 0);
            int l = 0;
            while (l < k.getNumInteriorRing()) 
            {
                p p2 = (p)k.getInteriorRingN(l);
                Coordinate acoordinate1[] = com.vividsolutions.jts.geom.a.b(p2.getCoordinates());
                if (b <= 0.0D || !a(p2, -b))
                {
                    a(acoordinate1, d1, com.vividsolutions.jts.a.a.b(byte0), 0, 2);
                }
                l++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (k instanceof n)
        {
            k = (n)k;
            if (b <= 0.0D)
            {
                c.a();
                return;
            } else
            {
                k = com.vividsolutions.jts.geom.a.b(k.getCoordinates());
                a(c.a(k, b), 2, 0);
                return;
            }
        }
        if (k instanceof Point)
        {
            k = (Point)k;
            if (b > 0.0D)
            {
                k = k.getCoordinates();
                a(c.a(k, b), 2, 0);
                return;
            }
        } else
        {
            if (k instanceof r)
            {
                a(((j) ((r)k)));
                return;
            }
            if (k instanceof q)
            {
                a(((j) ((q)k)));
                return;
            }
            if (k instanceof s)
            {
                a(((j) ((s)k)));
                return;
            }
            if (k instanceof j)
            {
                a((j)k);
                return;
            } else
            {
                throw new UnsupportedOperationException(k.getClass().getName());
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(j j1)
    {
        for (int k = 0; k < j1.getNumGeometries(); k++)
        {
            a(j1.getGeometryN(k));
        }

    }

    private void a(Coordinate acoordinate[], double d1, int k, int l, int i1)
    {
        if (d1 == 0.0D && acoordinate.length < 4)
        {
            return;
        }
        int l1 = k;
        int k1 = l;
        int j1 = i1;
        if (acoordinate.length >= 4)
        {
            l1 = k;
            k1 = l;
            j1 = i1;
            if (com.vividsolutions.jts.a.a.a(acoordinate))
            {
                l1 = com.vividsolutions.jts.a.a.b(k);
                j1 = l;
                k1 = i1;
            }
        }
        a(c.a(acoordinate, l1, d1), k1, j1);
    }

    private void a(Coordinate acoordinate[], int k, int l)
    {
        if (acoordinate == null || acoordinate.length < 2)
        {
            return;
        } else
        {
            acoordinate = new com.vividsolutions.jts.f.i(acoordinate, new com.vividsolutions.jts.b.n(0, 1, k, l));
            d.add(acoordinate);
            return;
        }
    }

    private boolean a(p p1, double d1)
    {
        Coordinate acoordinate[] = p1.getCoordinates();
        if (acoordinate.length < 4)
        {
            return d1 < 0.0D;
        }
        if (acoordinate.length == 4)
        {
            p1 = new x(acoordinate[0], acoordinate[1], acoordinate[2]);
            Coordinate coordinate = ((x) (p1)).a;
            Coordinate coordinate1 = ((x) (p1)).b;
            Coordinate coordinate2 = ((x) (p1)).c;
            double d2 = coordinate1.distance(coordinate2);
            double d4 = coordinate.distance(coordinate2);
            double d5 = coordinate.distance(coordinate1);
            double d6 = d2 + d4 + d5;
            double d7 = (coordinate.x * d2 + coordinate1.x * d4 + coordinate2.x * d5) / d6;
            double d8 = coordinate.y;
            double d9 = coordinate1.y;
            return com.vividsolutions.jts.a.a.b(new Coordinate(d7, (coordinate2.y * d5 + (d2 * d8 + d4 * d9)) / d6), ((x) (p1)).a, ((x) (p1)).b) < Math.abs(d1);
        }
        p1 = p1.getEnvelopeInternal();
        double d3 = Math.min(p1.c(), p1.b());
        return d1 < 0.0D && 2D * Math.abs(d1) > d3;
    }

    public final List a()
    {
        a(a);
        return d;
    }
}
