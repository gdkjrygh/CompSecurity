// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c.a;

import com.vividsolutions.jts.g.c.e;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.h.b;

// Referenced classes of package com.vividsolutions.jts.g.c.a:
//            a

public final class d
{

    private i a[];
    private double b;
    private b c;

    public d(i j, i k)
    {
        a = new i[2];
        a[0] = j;
        a[1] = k;
        j = a[0];
        k = a[1];
        b = Math.min(com.vividsolutions.jts.g.c.a.a.a(j), com.vividsolutions.jts.g.c.a.a.a(k));
    }

    public final i a(int j)
    {
        i ai[] = a;
        c = new b();
        c.a(ai[0]);
        c.a(ai[1]);
        i ai1[] = new i[2];
        ai1[0] = c.b((i)ai[0].clone());
        ai1[1] = c.b((i)ai[1].clone());
        ai = com.vividsolutions.jts.g.c.a.a.a(ai1[0], ai1[1], b);
        i k = e.a(ai[0], ai[1], j);
        c.c(k);
        return k;
    }
}
