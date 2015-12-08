// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c;

import com.vividsolutions.jts.b.b;
import com.vividsolutions.jts.b.c;
import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.b.r;
import com.vividsolutions.jts.geom.GeometryFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.c:
//            e

public final class a
{

    private e a;
    private GeometryFactory b;
    private List c;
    private List d;

    public a(e e1, GeometryFactory geometryfactory, com.vividsolutions.jts.a.o o1)
    {
        c = new ArrayList();
        d = new ArrayList();
        a = e1;
        b = geometryfactory;
    }

    public final List a(int i)
    {
        Iterator iterator = a.a().h().iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        Iterator iterator3;
        obj = (c)((o)iterator.next()).b();
        iterator3 = ((c) (obj)).f();
_L5:
        b b5;
        int j;
        b b3;
        do
        {
            if (!iterator3.hasNext())
            {
                break MISSING_BLOCK_LABEL_579;
            }
            b3 = (b)iterator3.next();
            b5 = b3.f();
        } while (b3.j());
        if (!b3.b())
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
_L6:
        if (j != -1)
        {
            obj = ((c) (obj)).f();
            while (((Iterator) (obj)).hasNext()) 
            {
                Object obj1 = (b)((Iterator) (obj)).next();
                b b4 = ((b) (obj1)).f();
                if (((b) (obj1)).j())
                {
                    obj1 = ((b) (obj1)).a();
                    boolean flag;
                    if (j == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ((d) (obj1)).c(flag);
                } else
                {
                    if (((b) (obj1)).b())
                    {
                        j = 2;
                    }
                    if (b4.b())
                    {
                        j = 0;
                    }
                }
            }
        }
          goto _L3
        if (!b5.b()) goto _L5; else goto _L4
_L4:
        j = 2;
          goto _L6
_L2:
        Iterator iterator1 = a.a().f().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            b b1 = (b)iterator1.next();
            d d2 = b1.a();
            if (b1.j() && !d2.p())
            {
                d2.c(a.b(b1.m()));
            }
        } while (true);
        iterator1 = a.a().f().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            b b2 = (b)iterator1.next();
            List list = c;
            com.vividsolutions.jts.b.n n1 = b2.l();
            d d3 = b2.a();
            if (b2.j() && !b2.c() && e.a(n1, i) && !d3.o())
            {
                list.add(d3);
                b2.c(true);
            }
            list = c;
            n1 = b2.l();
            if (!b2.j() && !b2.c() && !b2.k() && !b2.a().n())
            {
                boolean flag1;
                if (!b2.b() && !b2.f().b() || !b2.a().n())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                com.vividsolutions.jts.a.a.a(flag1, null);
                if (e.a(n1, i) && i == 1)
                {
                    list.add(b2.a());
                    b2.c(true);
                }
            }
        } while (true);
        d d1;
        for (Iterator iterator2 = c.iterator(); iterator2.hasNext(); d1.b(true))
        {
            d1 = (d)iterator2.next();
            d1.m();
            com.vividsolutions.jts.geom.n n = b.createLineString(d1.b());
            d.add(n);
        }

        return d;
        j = -1;
          goto _L6
    }
}
