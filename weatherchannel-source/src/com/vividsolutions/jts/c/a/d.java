// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.a;

import com.vividsolutions.jts.a.a;

// Referenced classes of package com.vividsolutions.jts.c.a:
//            e, b, c

public final class d extends e
{

    private b b;
    private double c;
    private int d;

    private d(b b1, int i)
    {
        b = b1;
        d = i;
        c = (b1.a + b1.b) / 2D;
    }

    private d a(int i)
    {
        double d1 = 0.0D;
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 51
    //                   1 68;
           goto _L1 _L2 _L3
_L1:
        double d2 = 0.0D;
_L5:
        return new d(new b(d2, d1), d - 1);
_L2:
        d2 = b.a;
        d1 = c;
        continue; /* Loop/switch isn't completed */
_L3:
        d2 = c;
        d1 = b.b;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static d a(d d1, b b1)
    {
        b1 = new b(b1);
        if (d1 != null)
        {
            b b2 = d1.b;
            if (b2.b > b1.b)
            {
                b1.b = b2.b;
            }
            if (b2.a < b1.a)
            {
                b1.a = b2.a;
            }
        }
        b1 = new c(b1);
        b1 = new d(b1.b(), b1.a());
        if (d1 != null)
        {
            b1.a(d1);
        }
        return b1;
    }

    private void a(d d1)
    {
        int i;
        boolean flag;
        if (b == null || b.a(d1.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, null);
        i = a(d1.b, c);
        if (d1.d == d - 1)
        {
            a[i] = d1;
            return;
        } else
        {
            d d2 = a(i);
            d2.a(d1);
            a[i] = d2;
            return;
        }
    }

    public final b a()
    {
        return b;
    }

    protected final boolean a(b b1)
    {
        b b2 = b;
        double d1 = b2.a;
        double d2 = b2.b;
        return b1.a <= d2 && b1.b >= d1;
    }

    public final d b(b b1)
    {
        d d1 = this;
        do
        {
            int i = a(b1, d1.c);
            if (i != -1)
            {
                if (d1.a[i] == null)
                {
                    d1.a[i] = d1.a(i);
                }
                d1 = d1.a[i];
            } else
            {
                return d1;
            }
        } while (true);
    }

    public final e c(b b1)
    {
        d d1 = this;
        do
        {
            int i;
            for (i = a(b1, d1.c); i == -1 || d1.a[i] == null;)
            {
                return d1;
            }

            d1 = d1.a[i];
        } while (true);
    }
}
