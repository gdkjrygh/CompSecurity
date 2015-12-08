// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.e;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.o;
import com.vividsolutions.jts.a.r;
import com.vividsolutions.jts.b.e;
import com.vividsolutions.jts.b.f;
import com.vividsolutions.jts.b.g;
import com.vividsolutions.jts.b.h;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.b.n;
import com.vividsolutions.jts.b.q;
import com.vividsolutions.jts.geom.IntersectionMatrix;
import com.vividsolutions.jts.geom.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.e:
//            f, e, a

public final class d
{

    private k a;
    private o b;
    private l c[];
    private q d;
    private ArrayList e;

    public d(l al[])
    {
        a = new r();
        b = new o();
        d = new q(new com.vividsolutions.jts.g.e.f());
        e = new ArrayList();
        c = al;
    }

    private void a(int j)
    {
        com.vividsolutions.jts.b.o o1;
        for (Iterator iterator = c[j].g(); iterator.hasNext(); d.a(o1.a()).a(j, o1.m().a(j)))
        {
            o1 = (com.vividsolutions.jts.b.o)iterator.next();
        }

    }

    private void a(int j, int k)
    {
        Iterator iterator = c[j].e();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.vividsolutions.jts.b.d d1 = (com.vividsolutions.jts.b.d)iterator.next();
            if (d1.l())
            {
                i i1 = c[k].c();
                if (i1.getDimension() > 0)
                {
                    j = b.b(d1.c(), i1);
                    d1.m().c(k, j);
                } else
                {
                    d1.m().c(k, 2);
                }
                e.add(d1);
            }
        } while (true);
    }

    private void a(com.vividsolutions.jts.b.o o1, int j)
    {
        int k = b.b(o1.a(), c[j].c());
        o1.m().c(j, k);
    }

    private void a(List list)
    {
        e e1;
        for (list = list.iterator(); list.hasNext(); d.a(e1))
        {
            e1 = (e)list.next();
        }

    }

    private void b(int j)
    {
        for (Iterator iterator = c[j].e(); iterator.hasNext();)
        {
            Object obj = (com.vividsolutions.jts.b.d)iterator.next();
            int k = ((com.vividsolutions.jts.b.d) (obj)).m().a(j);
            obj = ((com.vividsolutions.jts.b.d) (obj)).g().a();
            while (((Iterator) (obj)).hasNext()) 
            {
                Object obj1 = (g)((Iterator) (obj)).next();
                obj1 = (com.vividsolutions.jts.g.e.e)d.a(((g) (obj1)).a);
                if (k == 1)
                {
                    ((com.vividsolutions.jts.g.e.e) (obj1)).a(j);
                } else
                if (((com.vividsolutions.jts.g.e.e) (obj1)).m().b(j))
                {
                    ((com.vividsolutions.jts.g.e.e) (obj1)).a(j, 0);
                }
            }
        }

    }

    public final IntersectionMatrix a()
    {
        IntersectionMatrix intersectionmatrix;
        int k;
        int i1;
        boolean flag1;
        boolean flag2;
        intersectionmatrix = new IntersectionMatrix();
        intersectionmatrix.set(2, 2, 2);
        if (!c[0].c().getEnvelopeInternal().c(c[1].c().getEnvelopeInternal()))
        {
            i j = c[0].c();
            if (!j.isEmpty())
            {
                intersectionmatrix.set(0, 2, j.getDimension());
                intersectionmatrix.set(1, 2, j.getBoundaryDimension());
            }
            j = c[1].c();
            if (!j.isEmpty())
            {
                intersectionmatrix.set(2, 0, j.getDimension());
                intersectionmatrix.set(2, 1, j.getBoundaryDimension());
            }
            return intersectionmatrix;
        }
        c[0].a(a, false);
        c[1].a(a, false);
        com.vividsolutions.jts.b.a.e e1 = c[0].a(c[1], a, false);
        b(0);
        b(1);
        a(0);
        a(1);
        Iterator iterator3 = d.a();
        do
        {
            if (!iterator3.hasNext())
            {
                break;
            }
            com.vividsolutions.jts.b.o o1 = (com.vividsolutions.jts.b.o)iterator3.next();
            n n1 = o1.m();
            boolean flag;
            if (n1.b() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.vividsolutions.jts.a.a.a(flag, "node with empty label found");
            if (o1.d())
            {
                if (n1.b(0))
                {
                    a(o1, 0);
                } else
                {
                    a(o1, 1);
                }
            }
        } while (true);
        k = c[0].c().getDimension();
        i1 = c[1].c().getDimension();
        flag1 = e1.c();
        flag2 = e1.d();
        if (k != 2 || i1 != 2) goto _L2; else goto _L1
_L1:
        if (flag1)
        {
            intersectionmatrix.setAtLeast("212101212");
        }
_L4:
        com.vividsolutions.jts.g.e.a a1 = new com.vividsolutions.jts.g.e.a();
        a(a1.a(c[0].e()));
        a(a1.a(c[1].e()));
        for (Iterator iterator = d.a(); iterator.hasNext(); ((com.vividsolutions.jts.g.e.e)iterator.next()).b().a(c)) { }
        break; /* Loop/switch isn't completed */
_L2:
        if (k == 2 && i1 == 1)
        {
            if (flag1)
            {
                intersectionmatrix.setAtLeast("FFF0FFFF2");
            }
            if (flag2)
            {
                intersectionmatrix.setAtLeast("1FFFFF1FF");
            }
        } else
        if (k == 1 && i1 == 2)
        {
            if (flag1)
            {
                intersectionmatrix.setAtLeast("F0FFFFFF2");
            }
            if (flag2)
            {
                intersectionmatrix.setAtLeast("1F1FFFFFF");
            }
        } else
        if (k == 1 && i1 == 1 && flag2)
        {
            intersectionmatrix.setAtLeast("0FFFFFFFF");
        }
        if (true) goto _L4; else goto _L3
_L3:
        a(0, 1);
        a(1, 0);
        for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); ((com.vividsolutions.jts.b.d)iterator1.next()).b(intersectionmatrix)) { }
        com.vividsolutions.jts.g.e.e e2;
        for (Iterator iterator2 = d.a(); iterator2.hasNext(); e2.c(intersectionmatrix))
        {
            e2 = (com.vividsolutions.jts.g.e.e)iterator2.next();
            e2.b(intersectionmatrix);
        }

        return intersectionmatrix;
    }
}
