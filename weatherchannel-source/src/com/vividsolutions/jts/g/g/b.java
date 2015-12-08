// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.g;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.r;
import com.vividsolutions.jts.b.a.e;
import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.f;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.g.e.g;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.Iterator;
import java.util.List;

public final class b
{

    private final k a = new r();
    private l b;
    private g c;
    private Coordinate d;

    public b(l l1)
    {
        c = new g();
        b = l1;
    }

    public final Coordinate a()
    {
        return d;
    }

    public final boolean b()
    {
        e e1 = b.a(a, true);
        if (e1.c())
        {
            d = e1.a();
            return false;
        }
        c.a(b);
        for (Iterator iterator = c.a(); iterator.hasNext();)
        {
            com.vividsolutions.jts.g.e.e e2 = (com.vividsolutions.jts.g.e.e)iterator.next();
            if (!e2.b().a(b))
            {
                d = (Coordinate)e2.a().clone();
                return false;
            }
        }

        return true;
    }

    public final boolean c()
    {
        Iterator iterator = c.a();
        com.vividsolutions.jts.g.e.b b1;
label0:
        do
        {
            if (iterator.hasNext())
            {
                Iterator iterator1 = ((com.vividsolutions.jts.g.e.e)iterator.next()).b().f();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    b1 = (com.vividsolutions.jts.g.e.b)iterator1.next();
                } while (b1.b().size() <= 1);
                break;
            } else
            {
                return false;
            }
        } while (true);
        d = b1.a().a(0);
        return true;
    }
}
