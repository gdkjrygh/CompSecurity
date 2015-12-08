// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b.a;

import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;

// Referenced classes of package com.vividsolutions.jts.b.a:
//            d, e

public final class c
{

    Coordinate a[];
    int b[];
    private d c;
    private h d;
    private h e;

    public c(d d1)
    {
        d = new h();
        e = new h();
        c = d1;
        a = d1.b();
        b = (new com.vividsolutions.jts.b.a.d()).a(a);
    }

    private void a(int i, int j, c c1, int k, int l, e e1)
    {
_L8:
        Coordinate coordinate;
        Coordinate coordinate1;
        Coordinate coordinate2;
        Coordinate coordinate3;
        coordinate = a[i];
        coordinate1 = a[j];
        coordinate2 = c1.a[k];
        coordinate3 = c1.a[l];
        if (j - i != 1 || l - k != 1) goto _L2; else goto _L1
_L1:
        e1.a(c, i, c1.c, k);
_L4:
        return;
_L2:
        d.a(coordinate, coordinate1);
        e.a(coordinate2, coordinate3);
        if (!d.c(e)) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        i1 = (i + j) / 2;
        j1 = (k + l) / 2;
        if (i < i1)
        {
            if (k < j1)
            {
                a(i, i1, c1, k, j1, e1);
            }
            if (j1 < l)
            {
                a(i, i1, c1, j1, l, e1);
            }
        }
        if (i1 >= j) goto _L4; else goto _L5
_L5:
        if (k < j1)
        {
            a(i1, j, c1, k, j1, e1);
        }
        if (j1 >= l) goto _L4; else goto _L6
_L6:
        k = j1;
        i = i1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(int i, c c1, int j, e e1)
    {
        a(b[i], b[i + 1], c1, c1.b[j], c1.b[j + 1], e1);
    }
}
