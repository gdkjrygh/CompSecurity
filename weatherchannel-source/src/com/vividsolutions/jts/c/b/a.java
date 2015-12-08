// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.b;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.m;

// Referenced classes of package com.vividsolutions.jts.c.b:
//            b, c

public final class a
{

    private Coordinate a[];
    private int b;
    private int c;
    private h d;
    private Object e;
    private int f;

    public a(Coordinate acoordinate[], int i, int j, Object obj)
    {
        d = null;
        e = null;
        a = acoordinate;
        b = i;
        c = j;
        e = obj;
    }

    private void a(int i, int j, a a1, int k, int l, b b1)
    {
_L8:
        Coordinate coordinate;
        Coordinate coordinate1;
        Coordinate coordinate2;
        Coordinate coordinate3;
        coordinate = a[i];
        coordinate1 = a[j];
        coordinate2 = a1.a[k];
        coordinate3 = a1.a[l];
        if (j - i != 1 || l - k != 1) goto _L2; else goto _L1
_L1:
        b1.a(this, i, a1, k);
_L4:
        return;
_L2:
        b1.a.a(coordinate, coordinate1);
        b1.b.a(coordinate2, coordinate3);
        if (!b1.a.c(b1.b)) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        i1 = (i + j) / 2;
        j1 = (k + l) / 2;
        if (i < i1)
        {
            if (k < j1)
            {
                a(i, i1, a1, k, j1, b1);
            }
            if (j1 < l)
            {
                a(i, i1, a1, j1, l, b1);
            }
        }
        if (i1 >= j) goto _L4; else goto _L5
_L5:
        if (k < j1)
        {
            a(i1, j, a1, k, j1, b1);
        }
        if (j1 >= l) goto _L4; else goto _L6
_L6:
        k = j1;
        i = i1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(h h1, int i, int j, c c1)
    {
_L7:
        Coordinate coordinate = a[i];
        Coordinate coordinate1 = a[j];
        c1.a.a(coordinate, coordinate1);
        if (j - i != 1) goto _L2; else goto _L1
_L1:
        c1.a(this, i);
_L4:
        return;
_L2:
        if (!h1.c(c1.a)) goto _L4; else goto _L3
_L3:
        int k;
        k = (i + j) / 2;
        if (i < k)
        {
            a(h1, i, k, c1);
        }
        if (k >= j) goto _L4; else goto _L5
_L5:
        i = k;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int a()
    {
        return f;
    }

    public final void a(int i)
    {
        f = i;
    }

    public final void a(int i, m m1)
    {
        m1.a = a[i];
        m1.b = a[i + 1];
    }

    public final void a(a a1, b b1)
    {
        a(b, c, a1, a1.b, a1.c, b1);
    }

    public final void a(h h1, c c1)
    {
        a(h1, b, c, c1);
    }

    public final Object b()
    {
        return e;
    }

    public final h c()
    {
        if (d == null)
        {
            d = new h(a[b], a[c]);
        }
        return d;
    }
}
