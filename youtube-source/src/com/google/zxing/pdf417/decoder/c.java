// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.g;

final class c
{

    private b a;
    private g b;
    private g c;
    private g d;
    private g e;
    private int f;
    private int g;
    private int h;
    private int i;

    c(b b1, g g1, g g2, g g3, g g4)
    {
        if (g1 == null && g3 == null || g2 == null && g4 == null || g1 != null && g2 == null || g3 != null && g4 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            a(b1, g1, g2, g3, g4);
            return;
        }
    }

    c(c c1)
    {
        a(c1.a, c1.b, c1.c, c1.d, c1.e);
    }

    static c a(c c1, c c2)
    {
        if (c1 == null)
        {
            return c2;
        }
        if (c2 == null)
        {
            return c1;
        } else
        {
            return new c(c1.a, c1.b, c1.c, c2.d, c2.e);
        }
    }

    private void a(b b1, g g1, g g2, g g3, g g4)
    {
        a = b1;
        b = g1;
        c = g2;
        d = g3;
        e = g4;
        i();
    }

    private void i()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        b = new g(0.0F, d.b());
        c = new g(0.0F, e.b());
_L4:
        f = (int)Math.min(b.a(), c.a());
        g = (int)Math.max(d.a(), e.a());
        h = (int)Math.min(b.b(), d.b());
        i = (int)Math.max(c.b(), e.b());
        return;
_L2:
        if (d == null)
        {
            d = new g(a.d() - 1, b.b());
            e = new g(a.d() - 1, c.b());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final int a()
    {
        return f;
    }

    final c a(int j, int k, boolean flag)
    {
        g g1 = b;
        g g2 = c;
        g g6 = d;
        g g5 = e;
        g g3;
        g g4;
        if (j > 0)
        {
            int l;
            if (flag)
            {
                g3 = b;
            } else
            {
                g3 = d;
            }
            l = (int)g3.b() - j;
            j = l;
            if (l < 0)
            {
                j = 0;
            }
            g4 = new g(g3.a(), j);
            if (flag)
            {
                g3 = g6;
                g1 = g4;
            } else
            {
                g3 = g4;
            }
        } else
        {
            g3 = g6;
        }
        if (k > 0)
        {
            if (flag)
            {
                g4 = c;
            } else
            {
                g4 = e;
            }
            k = (int)g4.b() + k;
            j = k;
            if (k >= a.e())
            {
                j = a.e() - 1;
            }
            g4 = new g(g4.a(), j);
            if (flag)
            {
                g2 = g4;
            } else
            {
                g5 = g4;
            }
        }
        i();
        return new c(a, g1, g2, g3, g5);
    }

    final int b()
    {
        return g;
    }

    final int c()
    {
        return h;
    }

    final int d()
    {
        return i;
    }

    final g e()
    {
        return b;
    }

    final g f()
    {
        return d;
    }

    final g g()
    {
        return c;
    }

    final g h()
    {
        return e;
    }
}
