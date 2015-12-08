// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.k;

// Referenced classes of package com.vividsolutions.jts.f:
//            n, r, i

public final class e
    implements n
{

    private k a;
    private int b;
    private int c;
    private int d;
    private int e;

    public e(k k1)
    {
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        a = k1;
    }

    public final void a(r r1, int j, r r2, int l)
    {
        if (r1 != r2 || j != l) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        e = e + 1;
        com.vividsolutions.jts.geom.Coordinate coordinate = r1.c()[j];
        com.vividsolutions.jts.geom.Coordinate coordinate1 = r1.c()[j + 1];
        com.vividsolutions.jts.geom.Coordinate coordinate2 = r2.c()[l];
        com.vividsolutions.jts.geom.Coordinate coordinate3 = r2.c()[l + 1];
        a.a(coordinate, coordinate1, coordinate2, coordinate3);
        if (!a.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        b = b + 1;
        if (a.c())
        {
            c = c + 1;
        }
        if (r1 != r2 || a.b() != 1)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        if (Math.abs(j - l) == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 1;
_L4:
        if (i1 == 0)
        {
            ((i)r1).a(a, j, 0);
            ((i)r2).a(a, l, 1);
            if (a.d())
            {
                d = d + 1;
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!r1.d())
        {
            break MISSING_BLOCK_LABEL_267;
        }
        i1 = r1.b() - 1;
        if ((j != 0 || l != i1) && (l != 0 || j != i1))
        {
            break MISSING_BLOCK_LABEL_267;
        }
        i1 = 1;
          goto _L4
        i1 = 0;
          goto _L4
    }

    public final boolean d()
    {
        return false;
    }
}
