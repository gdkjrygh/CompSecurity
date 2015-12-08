// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;

// Referenced classes of package com.vividsolutions.jts.a:
//            a

public final class p
{

    private Coordinate a;
    private int b;
    private boolean c;

    public p(Coordinate coordinate)
    {
        b = 0;
        c = false;
        a = coordinate;
    }

    public final void a(Coordinate coordinate, Coordinate coordinate1)
    {
        if (coordinate.x >= a.x || coordinate1.x >= a.x) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (a.x == coordinate1.x && a.y == coordinate1.y)
        {
            c = true;
            return;
        }
        if (coordinate.y != a.y || coordinate1.y != a.y)
        {
            continue; /* Loop/switch isn't completed */
        }
        double d4 = coordinate.x;
        double d6 = coordinate1.x;
        double d2 = d6;
        double d = d4;
        if (d4 > d6)
        {
            d = coordinate1.x;
            d2 = coordinate.x;
        }
        if (a.x >= d && a.x <= d2)
        {
            c = true;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if ((coordinate.y <= a.y || coordinate1.y > a.y) && (coordinate1.y <= a.y || coordinate.y > a.y)) goto _L1; else goto _L3
_L3:
        double d1 = coordinate.x;
        double d3 = a.x;
        double d5 = coordinate.y - a.y;
        double d8 = coordinate1.x;
        double d9 = a.x;
        double d7 = coordinate1.y - a.y;
        d3 = com.vividsolutions.jts.a.a.a(d1 - d3, d5, d8 - d9, d7);
        if (d3 == 0.0D)
        {
            c = true;
            return;
        }
        d1 = d3;
        if (d7 < d5)
        {
            d1 = -d3;
        }
        if (d1 > 0.0D)
        {
            b = b + 1;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final boolean a()
    {
        return c;
    }

    public final int b()
    {
        if (c)
        {
            return 1;
        }
        return b % 2 != 1 ? 2 : 0;
    }
}
