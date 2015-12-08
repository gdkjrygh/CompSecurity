// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b.a;

import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.b.a:
//            a, g, b, c, 
//            e

public final class f extends a
{

    private List a;
    private int b;

    public f()
    {
        a = new ArrayList();
    }

    private void a(e e)
    {
        b = 0;
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++)
        {
            g g1 = (g)a.get(i);
            if (g1.b())
            {
                g1.c().a(i);
            }
        }

        for (int j = 0; j < a.size(); j++)
        {
            g g2 = (g)a.get(j);
            if (!g2.a())
            {
                continue;
            }
            int l = g2.d();
            b b1 = (b)g2.e();
            for (int k = j; k < l; k++)
            {
                g g3 = (g)a.get(k);
                if (!g3.a())
                {
                    continue;
                }
                b b2 = (b)g3.e();
                if (g2.a == null || g2.a != g3.a)
                {
                    b1.a.a(b1.b, b2.a, b2.b, e);
                    b = b + 1;
                }
            }

        }

    }

    private void a(d d1, Object obj)
    {
        d1 = d1.h();
        int ai[] = ((c) (d1)).b;
        int i = 0;
        while (i < ai.length - 1) 
        {
            b b1 = new b(d1, i);
            double d2 = ((c) (d1)).a[((c) (d1)).b[i]].x;
            double d3 = ((c) (d1)).a[((c) (d1)).b[i + 1]].x;
            g g1;
            List list;
            if (d2 >= d3)
            {
                d2 = d3;
            }
            g1 = new g(obj, d2, null, b1);
            a.add(g1);
            list = a;
            d2 = ((c) (d1)).a[((c) (d1)).b[i]].x;
            d3 = ((c) (d1)).a[((c) (d1)).b[i + 1]].x;
            if (d2 <= d3)
            {
                d2 = d3;
            }
            list.add(new g(obj, d2, g1, b1));
            i++;
        }
    }

    private void a(List list, Object obj)
    {
        for (list = list.iterator(); list.hasNext(); a((d)list.next(), obj)) { }
    }

    public final void a(List list, e e, boolean flag)
    {
        if (flag)
        {
            a(list, null);
        } else
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                d d1 = (d)list.next();
                a(d1, d1);
            }
        }
        a(e);
    }

    public final void a(List list, List list1, e e)
    {
        a(list, list);
        a(list1, list1);
        a(e);
    }
}
