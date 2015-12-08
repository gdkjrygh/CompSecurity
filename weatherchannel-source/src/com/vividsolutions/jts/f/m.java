// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.geom.Coordinate;

// Referenced classes of package com.vividsolutions.jts.f:
//            n, r

public final class m
    implements n
{

    private k a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private Coordinate g;
    private Coordinate h[];

    public m(k k1)
    {
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = null;
        h = null;
        a = k1;
    }

    public final void a(r r1, int i, r r2, int j)
    {
        if (r1 != r2 || i != j)
        {
            Coordinate coordinate = r1.c()[i];
            r1 = r1.c()[i + 1];
            Coordinate coordinate1 = r2.c()[j];
            r2 = r2.c()[j + 1];
            a.a(coordinate, r1, coordinate1, r2);
            if (a.a())
            {
                d = true;
                boolean flag = a.d();
                if (flag)
                {
                    e = true;
                }
                if (!flag)
                {
                    f = true;
                }
                Coordinate coordinate2 = g;
                g = a.a(0);
                h = new Coordinate[4];
                h[0] = coordinate;
                h[1] = r1;
                h[2] = coordinate1;
                h[3] = r2;
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        c = true;
    }

    public final boolean a()
    {
        return d;
    }

    public final boolean b()
    {
        return e;
    }

    public final boolean c()
    {
        return f;
    }

    public final boolean d()
    {
        if (c)
        {
            return e && f;
        } else
        {
            return d;
        }
    }
}
