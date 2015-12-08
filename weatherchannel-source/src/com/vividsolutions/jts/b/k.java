// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.b:
//            n, d, b, o, 
//            c

public abstract class k
{

    protected b a;
    protected GeometryFactory b;
    private int c;
    private List d;
    private List e;
    private n f;
    private p g;
    private boolean h;
    private k i;
    private ArrayList j;

    public k(b b1, GeometryFactory geometryfactory)
    {
        c = -1;
        d = new ArrayList();
        e = new ArrayList();
        f = new n(-1);
        j = new ArrayList();
        b = geometryfactory;
        b(b1);
        g();
    }

    private void a(d d1, boolean flag, boolean flag1)
    {
        d1 = d1.a;
        if (flag)
        {
            int l = 1;
            if (flag1)
            {
                l = 0;
            }
            for (; l < d1.length; l++)
            {
                e.add(d1[l]);
            }

        } else
        {
            int i1 = d1.length - 2;
            if (flag1)
            {
                i1 = d1.length - 1;
            }
            for (; i1 >= 0; i1--)
            {
                e.add(d1[i1]);
            }

        }
    }

    private void a(n n1, int l)
    {
        int i1;
        for (i1 = n1.a(l, 2); i1 == -1 || f.a(l) != -1;)
        {
            return;
        }

        f.b(l, i1);
    }

    private void b(b b1)
    {
        a = b1;
        boolean flag = true;
        do
        {
            if (b1 == null)
            {
                throw new w("Found null DirectedEdge");
            }
            if (b1.d() == this)
            {
                throw new w((new StringBuilder("Directed Edge visited twice during ring-building at ")).append(b1.m()).toString());
            }
            d.add(b1);
            n n1 = b1.l();
            com.vividsolutions.jts.a.a.a(n1.c(), null);
            a(n1, 0);
            a(n1, 1);
            a(b1.a(), b1.g(), flag);
            a(b1, this);
            b1 = a(b1);
            if (b1 == a)
            {
                return;
            }
            flag = false;
        } while (true);
    }

    private void g()
    {
        if (g != null)
        {
            return;
        }
        Coordinate acoordinate[] = new Coordinate[e.size()];
        for (int l = 0; l < e.size(); l++)
        {
            acoordinate[l] = (Coordinate)e.get(l);
        }

        g = b.createLinearRing(acoordinate);
        h = com.vividsolutions.jts.a.a.a(g.getCoordinates());
    }

    public abstract b a(b b1);

    public final Coordinate a(int l)
    {
        return (Coordinate)e.get(0);
    }

    public final Polygon a(GeometryFactory geometryfactory)
    {
        p ap[] = new p[j.size()];
        for (int l = 0; l < j.size(); l++)
        {
            ap[l] = ((k)j.get(l)).g;
        }

        return geometryfactory.createPolygon(g, ap);
    }

    public abstract void a(b b1, k k1);

    public final void a(k k1)
    {
        i = k1;
        if (k1 != null)
        {
            k1.j.add(this);
        }
    }

    public final boolean a()
    {
        return h;
    }

    public final p b()
    {
        return g;
    }

    public final k c()
    {
        return i;
    }

    public final List d()
    {
        return d;
    }

    public final int e()
    {
        if (c < 0)
        {
            c = 0;
            b b1 = a;
            do
            {
                Iterator iterator = ((c)b1.q().b()).f();
                int l = 0;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (((b)iterator.next()).d() == this)
                    {
                        l++;
                    }
                } while (true);
                if (l > c)
                {
                    c = l;
                }
                b1 = a(b1);
            } while (b1 != a);
            c = c << 1;
        }
        return c;
    }

    public final void f()
    {
        b b1 = a;
        b b2;
        do
        {
            b1.a().b(true);
            b2 = b1.h();
            b1 = b2;
        } while (b2 != a);
    }
}
