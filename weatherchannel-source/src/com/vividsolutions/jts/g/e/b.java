// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.e;

import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.e;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.b.n;
import com.vividsolutions.jts.geom.IntersectionMatrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends e
{

    private List c;

    private b(e e1)
    {
        super(e1.a(), e1.m(), e1.n(), new n(e1.l()));
        c = new ArrayList();
        a(e1);
    }

    public b(e e1, byte byte0)
    {
        this(e1);
    }

    private void a(int i, int j)
    {
        Iterator iterator = c();
        do
        {
            int k;
label0:
            {
                if (iterator.hasNext())
                {
                    e e1 = (e)iterator.next();
                    if (!e1.l().c())
                    {
                        continue;
                    }
                    k = e1.l().a(i, j);
                    if (k != 0)
                    {
                        break label0;
                    }
                    b.a(i, j, 0);
                }
                return;
            }
            if (k == 2)
            {
                b.a(i, j, 2);
            }
        } while (true);
    }

    private Iterator c()
    {
        return c.iterator();
    }

    public final void a(com.vividsolutions.jts.a.b b1)
    {
        Iterator iterator = c();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((e)iterator.next()).l().c())
            {
                flag = true;
            }
        } while (true);
        int j;
        if (flag)
        {
            b = new n(-1, -1, -1);
        } else
        {
            b = new n(-1);
        }
        j = 0;
        while (j < 2) 
        {
            Iterator iterator1 = c();
            boolean flag1 = false;
            int k;
            int i1;
            for (k = 0; iterator1.hasNext(); k = i1)
            {
                int j1 = ((e)iterator1.next()).l().a(j);
                i1 = k;
                if (j1 == 1)
                {
                    i1 = k + 1;
                }
                if (j1 == 0)
                {
                    flag1 = true;
                }
            }

            int i;
            if (flag1)
            {
                i = 0;
            } else
            {
                i = -1;
            }
            if (k > 0)
            {
                i = com.vividsolutions.jts.b.l.a(b1, k);
            }
            b.b(j, i);
            if (flag)
            {
                a(j, 1);
                a(j, 2);
            }
            j++;
        }
    }

    public final void a(e e1)
    {
        c.add(e1);
    }

    final void a(IntersectionMatrix intersectionmatrix)
    {
        d.a(b, intersectionmatrix);
    }

    public final List b()
    {
        return c;
    }

    public final n l()
    {
        return b;
    }
}
