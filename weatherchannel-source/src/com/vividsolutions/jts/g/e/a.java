// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.e;

import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.e;
import com.vividsolutions.jts.b.g;
import com.vividsolutions.jts.b.h;
import com.vividsolutions.jts.b.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{

    public a()
    {
    }

    private void a(d d1, List list)
    {
        Iterator iterator;
        h h1 = d1.g();
        h1.b();
        iterator = h1.a();
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        g g1;
        Object obj;
        g1 = (g)iterator.next();
        obj = null;
_L4:
label0:
        {
            g g2;
            Object obj1;
            int i;
            int j;
            if (iterator.hasNext())
            {
                g2 = (g)iterator.next();
            } else
            {
                g2 = null;
            }
            if (g1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            j = g1.b;
            i = j;
            if (g1.c == 0.0D)
            {
                if (j == 0)
                {
                    break label0;
                }
                i = j - 1;
            }
            obj1 = d1.a(i);
            if (obj != null && ((g) (obj)).b >= i)
            {
                obj = ((g) (obj)).a;
            } else
            {
                obj = obj1;
            }
            obj1 = new n(d1.m());
            ((n) (obj1)).a();
            list.add(new e(d1, g1.a, ((com.vividsolutions.jts.geom.Coordinate) (obj)), ((n) (obj1))));
        }
        i = g1.b + 1;
        if (i < d1.a() || g2 != null)
        {
            obj1 = d1.a(i);
            obj = obj1;
            if (g2 != null)
            {
                obj = obj1;
                if (g2.b == g1.b)
                {
                    obj = g2.a;
                }
            }
            list.add(new e(d1, g1.a, ((com.vividsolutions.jts.geom.Coordinate) (obj)), new n(d1.m())));
        }
        if (g1 == null) goto _L1; else goto _L3
_L3:
        obj = g1;
        g1 = g2;
          goto _L4
    }

    public final List a(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        for (; iterator.hasNext(); a((d)iterator.next(), ((List) (arraylist)))) { }
        return arraylist;
    }
}
