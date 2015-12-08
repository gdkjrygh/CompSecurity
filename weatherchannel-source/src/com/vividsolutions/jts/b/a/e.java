// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b.a;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.Collection;
import java.util.Iterator;

public final class e
{

    private boolean a;
    private boolean b;
    private boolean c;
    private Coordinate d;
    private k e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private Collection j[];

    public e(k k1, boolean flag, boolean flag1)
    {
        a = false;
        b = false;
        c = false;
        d = null;
        h = 0;
        i = 0;
        e = k1;
        f = flag;
        g = flag1;
    }

    private static boolean a(k k1, Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (k1.a(((o)collection.next()).a()))
            {
                return true;
            }
        }

        return false;
    }

    public final Coordinate a()
    {
        return d;
    }

    public final void a(d d1, int l, d d2, int i1)
    {
        if (d1 != d2 || l != i1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i = i + 1;
        Coordinate coordinate = d1.b()[l];
        Coordinate coordinate1 = d1.b()[l + 1];
        Coordinate coordinate2 = d2.b()[i1];
        Coordinate coordinate3 = d2.b()[i1 + 1];
        e.a(coordinate, coordinate1, coordinate2, coordinate3);
        if (!e.a()) goto _L1; else goto _L3
_L3:
        if (g)
        {
            d1.a(false);
            d2.a(false);
        }
        h = h + 1;
        if (d1 != d2 || e.b() != 1) goto _L5; else goto _L4
_L4:
        int j1;
        if (Math.abs(l - i1) == 1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0) goto _L7; else goto _L6
_L6:
        j1 = 1;
_L12:
        if (j1 != 0) goto _L1; else goto _L8
_L8:
        a = true;
        if (f || !e.d())
        {
            d1.a(e, l, 0);
            d2.a(e, i1, 1);
        }
        if (!e.d()) goto _L1; else goto _L9
_L9:
        d = (Coordinate)e.a(0).clone();
        b = true;
        d1 = e;
        d2 = j;
        if (d2 == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        if (a(((k) (d1)), d2[0]))
        {
            l = 1;
        } else
        {
            if (!a(((k) (d1)), d2[1]))
            {
                break MISSING_BLOCK_LABEL_337;
            }
            l = 1;
        }
_L13:
        if (l == 0)
        {
            c = true;
            return;
        }
          goto _L1
_L7:
        if (!d1.i()) goto _L5; else goto _L10
_L10:
        j1 = d1.a() - 1;
        if ((l != 0 || i1 != j1) && (i1 != 0 || l != j1)) goto _L5; else goto _L11
_L11:
        j1 = 1;
          goto _L12
_L5:
        j1 = 0;
          goto _L12
        l = 0;
          goto _L13
    }

    public final void a(Collection collection, Collection collection1)
    {
        j = new Collection[2];
        j[0] = collection;
        j[1] = collection1;
    }

    public final boolean b()
    {
        return a;
    }

    public final boolean c()
    {
        return b;
    }

    public final boolean d()
    {
        return c;
    }
}
