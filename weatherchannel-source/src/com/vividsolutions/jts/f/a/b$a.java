// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f.a;

import com.vividsolutions.jts.c.b.a;
import com.vividsolutions.jts.c.b.c;
import com.vividsolutions.jts.f.i;
import com.vividsolutions.jts.f.r;

// Referenced classes of package com.vividsolutions.jts.f.a:
//            b, a

public final class d extends c
{

    private com.vividsolutions.jts.f.a.a b;
    private r c;
    private int d;
    private boolean e;

    public final void a(a a1, int j)
    {
        a1 = (i)a1.b();
        if (c != null && a1 == c && j == d)
        {
            return;
        } else
        {
            e = b.a(a1, j);
            return;
        }
    }

    public final boolean a()
    {
        return e;
    }

    public (b b1, com.vividsolutions.jts.f.a.a a1, r r, int j)
    {
        e = false;
        b = a1;
        c = r;
        d = j;
    }
}
