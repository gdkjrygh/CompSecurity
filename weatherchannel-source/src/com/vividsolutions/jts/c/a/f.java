// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.a;

import com.vividsolutions.jts.a.a;

// Referenced classes of package com.vividsolutions.jts.c.a:
//            e, d, b

public final class f extends e
{

    public f()
    {
    }

    public final void a(b b1, Object obj)
    {
        double d1;
        double d2;
        double d3;
        d d4;
        boolean flag;
        flag = true;
        int i = a(b1, 0.0D);
        if (i == -1)
        {
            a(obj);
            return;
        }
        d4 = a[i];
        if (d4 == null || !d4.a().a(b1))
        {
            d4 = com.vividsolutions.jts.c.a.d.a(d4, b1);
            a[i] = d4;
        }
        d4 = a[i];
        com.vividsolutions.jts.a.a.a(d4.a().a(b1), null);
        d1 = b1.a;
        d2 = b1.b;
        d3 = d2 - d1;
        break MISSING_BLOCK_LABEL_104;
        if (d3 != 0.0D && com.vividsolutions.jts.c.d.a.a(d3 / Math.max(Math.abs(d1), Math.abs(d2))) > -50)
        {
            flag = false;
        }
        if (flag)
        {
            b1 = d4.c(b1);
        } else
        {
            b1 = d4.b(b1);
        }
        b1.a(obj);
        return;
    }

    protected final boolean a(b b1)
    {
        return true;
    }
}
