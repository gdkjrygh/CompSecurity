// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.k;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.f:
//            n, r, i

public final class f
    implements n
{

    private k a;
    private final List b = new ArrayList();

    public f(k k1)
    {
        a = k1;
    }

    public final List a()
    {
        return b;
    }

    public final void a(r r1, int j, r r2, int l)
    {
        if (r1 != r2 || j != l)
        {
            com.vividsolutions.jts.geom.Coordinate coordinate = r1.c()[j];
            com.vividsolutions.jts.geom.Coordinate coordinate1 = r1.c()[j + 1];
            com.vividsolutions.jts.geom.Coordinate coordinate2 = r2.c()[l];
            com.vividsolutions.jts.geom.Coordinate coordinate3 = r2.c()[l + 1];
            a.a(coordinate, coordinate1, coordinate2, coordinate3);
            if (a.a() && a.c())
            {
                for (int i1 = 0; i1 < a.b(); i1++)
                {
                    b.add(a.a(i1));
                }

                ((i)r1).a(a, j, 0);
                ((i)r2).a(a, l, 1);
                return;
            }
        }
    }

    public final boolean d()
    {
        return false;
    }
}
