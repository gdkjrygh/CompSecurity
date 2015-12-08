// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.w;

// Referenced classes of package com.vividsolutions.jts.b:
//            e, d, n, k

public final class b extends e
{

    private boolean c;
    private boolean d;
    private boolean e;
    private b f;
    private b g;
    private b h;
    private k i;
    private k j;
    private int k[] = {
        0, -999, -999
    };

    public b(d d1, boolean flag)
    {
        super(d1);
        d = false;
        e = false;
        c = flag;
        if (flag)
        {
            a(d1.a[0], d1.a[1]);
        } else
        {
            int l = d1.a.length - 1;
            a(d1.a[l], d1.a[l - 1]);
        }
        b = new n(a.m());
        if (!c)
        {
            b.a();
        }
    }

    public final int a(int l)
    {
        return k[l];
    }

    public final d a()
    {
        return a;
    }

    public final void a(int l, int i1)
    {
        if (k[l] != -999 && k[l] != i1)
        {
            throw new w("assigned depths do not match", m());
        } else
        {
            k[l] = i1;
            return;
        }
    }

    public final void a(b b1)
    {
        f = b1;
    }

    public final void a(k k1)
    {
        i = k1;
    }

    public final void a(boolean flag)
    {
        d = flag;
    }

    public final void b(int l, int i1)
    {
        int j1 = a.e();
        l = j1;
        if (!c)
        {
            l = -j1;
        }
        j1 = com.vividsolutions.jts.a.a.b(2);
        a(2, i1);
        a(j1, l + i1);
    }

    public final void b(b b1)
    {
        g = b1;
    }

    public final void b(k k1)
    {
        j = k1;
    }

    public final void b(boolean flag)
    {
        e = flag;
    }

    public final boolean b()
    {
        return d;
    }

    public final void c(b b1)
    {
        h = b1;
    }

    public final void c(boolean flag)
    {
        e = true;
        f.e = true;
    }

    public final boolean c()
    {
        return e;
    }

    public final k d()
    {
        return i;
    }

    public final k e()
    {
        return j;
    }

    public final b f()
    {
        return f;
    }

    public final boolean g()
    {
        return c;
    }

    public final b h()
    {
        return g;
    }

    public final b i()
    {
        return h;
    }

    public final boolean j()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (b.d(0) || b.d(1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!b.c(0) || b.e(0, 2))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!b.c(1) || b.e(1, 2))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return flag && flag1 && flag2;
    }

    public final boolean k()
    {
        int l = 0;
        boolean flag = true;
        for (; l < 2; l++)
        {
            if (!b.c(l) || b.a(l, 1) != 0 || b.a(l, 2) != 0)
            {
                flag = false;
            }
        }

        return flag;
    }
}
