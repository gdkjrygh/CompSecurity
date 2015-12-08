// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.b;
import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.o;
import com.vividsolutions.jts.b.a.e;
import com.vividsolutions.jts.b.a.f;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.a;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.r;
import com.vividsolutions.jts.geom.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.vividsolutions.jts.b:
//            r, q, o, n, 
//            d, h, g

public final class l extends com.vividsolutions.jts.b.r
{

    private i c;
    private Map d;
    private b e;
    private boolean f;
    private int g;
    private Collection h;
    private boolean i;
    private Coordinate j;

    public l(int k, i i1)
    {
        this(0, i1, b.b);
    }

    public l(int k, i i1, b b1)
    {
        d = new HashMap();
        e = null;
        f = true;
        i = false;
        j = null;
        new o();
        g = k;
        c = i1;
        e = b1;
        if (i1 != null)
        {
            a(i1);
        }
    }

    public static int a(b b1, int k)
    {
        return !b1.a(k) ? 0 : 1;
    }

    private void a(int k, Coordinate coordinate, int i1)
    {
        coordinate = b.a(coordinate);
        com.vividsolutions.jts.b.n n1 = coordinate.m();
        if (n1 == null)
        {
            coordinate.c = new com.vividsolutions.jts.b.n(k, i1);
            return;
        } else
        {
            n1.b(k, i1);
            return;
        }
    }

    private void a(i k)
    {
        boolean flag = true;
        if (!k.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (k instanceof s)
        {
            f = false;
        }
        if (!(k instanceof Polygon))
        {
            break; /* Loop/switch isn't completed */
        }
        k = (Polygon)k;
        a((p)k.getExteriorRing(), 2, 0);
        int i1 = 0;
        while (i1 < k.getNumInteriorRing()) 
        {
            a((p)k.getInteriorRingN(i1), 0, 2);
            i1++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (k instanceof n)
        {
            k = (n)k;
            Coordinate acoordinate[] = com.vividsolutions.jts.geom.a.b(k.getCoordinates());
            if (acoordinate.length < 2)
            {
                i = true;
                j = acoordinate[0];
                return;
            }
            d d1 = new d(acoordinate, new com.vividsolutions.jts.b.n(g, 0));
            d.put(k, d1);
            a(d1);
            if (acoordinate.length < 2)
            {
                flag = false;
            }
            com.vividsolutions.jts.a.a.a(flag, "found LineString with single point");
            b(g, acoordinate[0]);
            b(g, acoordinate[acoordinate.length - 1]);
            return;
        }
        if (k instanceof Point)
        {
            k = ((Point)k).getCoordinate();
            a(g, ((Coordinate) (k)), 0);
            return;
        }
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

    private void a(j j1)
    {
        for (int k = 0; k < j1.getNumGeometries(); k++)
        {
            a(j1.getGeometryN(k));
        }

    }

    private void a(p p1, int k, int i1)
    {
        if (p1.isEmpty())
        {
            return;
        }
        Coordinate acoordinate[] = com.vividsolutions.jts.geom.a.b(p1.getCoordinates());
        if (acoordinate.length < 4)
        {
            i = true;
            j = acoordinate[0];
            return;
        }
        d d1;
        int j1;
        if (com.vividsolutions.jts.a.a.a(acoordinate))
        {
            j1 = i1;
            i1 = k;
        } else
        {
            j1 = k;
        }
        d1 = new d(acoordinate, new com.vividsolutions.jts.b.n(g, 1, j1, i1));
        d.put(p1, d1);
        a(d1);
        a(g, acoordinate[0], 1);
    }

    private void b(int k, Coordinate coordinate)
    {
        byte byte0 = 1;
        coordinate = b.a(coordinate).m();
        if (coordinate.a(k, 0) == 1)
        {
            byte0 = 2;
        }
        coordinate.b(k, a(e, byte0));
    }

    private Collection j()
    {
        if (h == null)
        {
            Object obj = b;
            int k = g;
            ArrayList arraylist = new ArrayList();
            obj = ((com.vividsolutions.jts.b.q) (obj)).a();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                com.vividsolutions.jts.b.o o1 = (com.vividsolutions.jts.b.o)((Iterator) (obj)).next();
                if (o1.m().a(k) == 1)
                {
                    arraylist.add(o1);
                }
            } while (true);
            h = arraylist;
        }
        return h;
    }

    public final e a(k k, boolean flag)
    {
        k = new e(k, true, false);
        Object obj = new f();
        int i1;
        if (!flag && ((c instanceof p) || (c instanceof Polygon) || (c instanceof s)))
        {
            ((com.vividsolutions.jts.b.a.a) (obj)).a(a, k, false);
        } else
        {
            ((com.vividsolutions.jts.b.a.a) (obj)).a(a, k, true);
        }
        i1 = g;
        for (obj = a.iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj1 = (d)((Iterator) (obj)).next();
            int j1 = ((d) (obj1)).m().a(i1);
            obj1 = ((d) (obj1)).b.a();
            while (((Iterator) (obj1)).hasNext()) 
            {
                Coordinate coordinate = ((g)((Iterator) (obj1)).next()).a;
                if (!a(i1, coordinate))
                {
                    if (j1 == 1 && f)
                    {
                        b(i1, coordinate);
                    } else
                    {
                        a(i1, coordinate, j1);
                    }
                }
            }
        }

        return k;
    }

    public final e a(l l1, k k, boolean flag)
    {
        k = new e(k, flag, true);
        k.a(j(), l1.j());
        (new f()).a(a, l1.a, k);
        return k;
    }

    public final d a(n n1)
    {
        return (d)d.get(n1);
    }

    public final void a(List list)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((d)iterator.next()).b.a(list)) { }
    }

    public final boolean a()
    {
        return i;
    }

    public final Coordinate b()
    {
        return j;
    }

    public final i c()
    {
        return c;
    }

    public final b d()
    {
        return e;
    }
}
