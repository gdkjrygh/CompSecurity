// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.f:
//            n, r

public final class d
    implements n
{

    private boolean a;
    private boolean b;
    private k c;
    private Coordinate d;
    private Coordinate e[];
    private List f;

    public d(k k1)
    {
        a = false;
        b = false;
        d = null;
        e = null;
        f = new ArrayList();
        c = k1;
        d = null;
    }

    public final void a(r r1, int i, r r2, int j)
    {
        if (!a() && (r1 != r2 || i != j))
        {
            Coordinate coordinate = r1.c()[i];
            r1 = r1.c()[i + 1];
            Coordinate coordinate1 = r2.c()[j];
            r2 = r2.c()[j + 1];
            c.a(coordinate, r1, coordinate1, r2);
            if (c.a() && c.c())
            {
                e = new Coordinate[4];
                e[0] = coordinate;
                e[1] = r1;
                e[2] = coordinate1;
                e[3] = r2;
                d = c.a(0);
                f.add(d);
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public final boolean a()
    {
        return d != null;
    }

    public final Coordinate b()
    {
        return d;
    }

    public final Coordinate[] c()
    {
        return e;
    }

    public final boolean d()
    {
        while (a || d == null) 
        {
            return false;
        }
        return true;
    }
}
