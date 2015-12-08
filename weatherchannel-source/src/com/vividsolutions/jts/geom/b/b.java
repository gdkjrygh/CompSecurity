// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;

import com.vividsolutions.jts.a.o;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.c.a;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.geom.b:
//            c

class b
    implements c
{

    private i a;
    private List b;

    public b(i j)
    {
        a = j;
        b = com.vividsolutions.jts.geom.c.a.b(j);
    }

    public final i a()
    {
        return a;
    }

    public final boolean a(i j)
    {
        o o1 = new o();
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (o1.a((Coordinate)iterator.next(), j))
            {
                return true;
            }
        }

        return false;
    }

    public final List b()
    {
        return b;
    }

    protected final boolean b(i j)
    {
        return a.getEnvelopeInternal().c(j.getEnvelopeInternal());
    }

    protected final boolean c(i j)
    {
        return a.getEnvelopeInternal().e(j.getEnvelopeInternal());
    }

    public final boolean d(i j)
    {
        return a.coveredBy(j);
    }

    public boolean e(i j)
    {
        return a.covers(j);
    }

    public final boolean f(i j)
    {
        return !g(j);
    }

    public boolean g(i j)
    {
        return a.intersects(j);
    }

    public String toString()
    {
        return a.toString();
    }
}
