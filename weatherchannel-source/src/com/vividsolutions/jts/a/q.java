// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;

// Referenced classes of package com.vividsolutions.jts.a:
//            r, k

public final class q
{

    private k a;
    private h b;
    private Coordinate c;
    private Coordinate d;
    private Coordinate e;
    private Coordinate f;

    public q(h h1)
    {
        a = new r();
        b = h1;
        c = new Coordinate(h1.d(), h1.f());
        d = new Coordinate(h1.e(), h1.g());
        e = new Coordinate(h1.d(), h1.g());
        f = new Coordinate(h1.e(), h1.f());
    }

    public final boolean a(Coordinate coordinate, Coordinate coordinate1)
    {
        h h1 = new h(coordinate, coordinate1);
        if (b.c(h1))
        {
            if (b.b(coordinate))
            {
                return true;
            }
            if (b.b(coordinate1))
            {
                return true;
            }
            Coordinate coordinate2;
            boolean flag;
            if (coordinate.compareTo(coordinate1) > 0)
            {
                coordinate2 = coordinate1;
                coordinate1 = coordinate;
            } else
            {
                coordinate2 = coordinate;
            }
            if (coordinate1.y > coordinate2.y)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a.a(coordinate2, coordinate1, e, f);
            } else
            {
                a.a(coordinate2, coordinate1, c, d);
            }
            if (a.a())
            {
                return true;
            }
        }
        return false;
    }
}
