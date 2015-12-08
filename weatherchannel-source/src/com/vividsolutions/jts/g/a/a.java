// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.i;
import com.vividsolutions.jts.b.n;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.f.e;
import com.vividsolutions.jts.f.j;
import com.vividsolutions.jts.f.r;
import com.vividsolutions.jts.g.c.g;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.a:
//            e, k, g, f, 
//            d

public final class a
{

    private com.vividsolutions.jts.g.a.d a;
    private u b;
    private j c;
    private GeometryFactory d;
    private com.vividsolutions.jts.b.r e;
    private i f;

    public a(com.vividsolutions.jts.g.a.d d1)
    {
        f = new i();
        a = d1;
    }

    private static int a(n n1)
    {
        int l = n1.a(0, 1);
        int i1 = n1.a(0, 2);
        if (l == 0 && i1 == 2)
        {
            return 1;
        }
        return l != 2 || i1 != 0 ? 0 : -1;
    }

    private com.vividsolutions.jts.geom.i a()
    {
        return d.createPolygon(null, null);
    }

    private static void a(List list, g g1)
    {
        ArrayList arraylist = new ArrayList();
        com.vividsolutions.jts.g.a.e e1;
        for (list = list.iterator(); list.hasNext(); g1.a(e1.a(), e1.b()))
        {
            e1 = (com.vividsolutions.jts.g.a.e)list.next();
            Coordinate coordinate = e1.d();
            e1.a((new com.vividsolutions.jts.g.a.k(arraylist)).a(coordinate));
            e1.e();
            arraylist.add(e1);
        }

    }

    public final com.vividsolutions.jts.geom.i a(com.vividsolutions.jts.geom.i l, double d1)
    {
        Object obj1 = b;
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = l.getPrecisionModel();
        }
        d = l.getFactory();
        obj1 = (new com.vividsolutions.jts.g.a.g(l, d1, new f(((u) (obj)), a))).a();
        if (((List) (obj1)).size() <= 0)
        {
            return a();
        }
        if (c != null)
        {
            l = c;
        } else
        {
            l = new com.vividsolutions.jts.f.g();
            com.vividsolutions.jts.a.r r1 = new com.vividsolutions.jts.a.r();
            r1.a(((u) (obj)));
            l.a(new e(r1));
        }
        l.a(((Collection) (obj1)));
        obj = l.b().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            l = (r)((Iterator) (obj)).next();
            Coordinate acoordinate[] = l.c();
            if (acoordinate.length != 2 || !acoordinate[0].equals2D(acoordinate[1]))
            {
                Object obj2 = (n)l.a();
                d d2 = new d(l.c(), new n(((n) (obj2))));
                obj2 = f.b(d2);
                if (obj2 != null)
                {
                    n n1 = ((d) (obj2)).m();
                    l = d2.m();
                    if (!((d) (obj2)).a(d2))
                    {
                        l = new n(d2.m());
                        l.a();
                    }
                    n1.b(l);
                    ((d) (obj2)).b(a(((n) (l))) + ((d) (obj2)).e());
                } else
                {
                    f.a(d2);
                    d2.b(a(d2.m()));
                }
            }
        } while (true);
        e = new com.vividsolutions.jts.b.r(new com.vividsolutions.jts.g.c.d());
        e.b(f.a());
        obj = e;
        l = new ArrayList();
        obj = ((com.vividsolutions.jts.b.r) (obj)).h().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            o o1 = (o)((Iterator) (obj)).next();
            if (!o1.q())
            {
                com.vividsolutions.jts.g.a.e e1 = new com.vividsolutions.jts.g.a.e();
                e1.a(o1);
                l.add(e1);
            }
        } while (true);
        Collections.sort(l, Collections.reverseOrder());
        obj = new g(d);
        a(((List) (l)), ((g) (obj)));
        l = ((g) (obj)).a();
        if (l.size() <= 0)
        {
            return a();
        } else
        {
            return d.buildGeometry(l);
        }
    }

    public final void a(j j1)
    {
        c = j1;
    }

    public final void a(u u)
    {
        b = u;
    }
}
