// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            e, ac, q

final class i
{

    final long a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final int g;
    final int h;
    final int i;
    e j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private ac t;
    private q u;

    i(long l1, String s1, int i1, int j1, int k1, int i2, 
            int j2, String s2, String s3, String s4, String s5, int k2, int l2, 
            int i3)
    {
        a = l1;
        b = s1;
        k = i1;
        m = j1;
        n = k1;
        o = i2;
        p = j2;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = k2;
        i = i3;
        h = l2;
        q = -1;
        s = false;
    }

    i(i i1, String s1)
    {
        this(i1.a, s1, i1.k, i1.m, i1.n, i1.o, i1.p, i1.c, i1.d, i1.e, i1.f, i1.g, i1.h, i1.i);
        l = i1.l;
        q = i1.q;
        r = i1.r;
        s = i1.s;
        j = i1.j;
        t = i1.t;
        u = i1.u;
    }

    i(String s1, String s2, String s3, String s4, String s5, int i1, int j1, 
            int k1)
    {
        this(-1L, s1, -1, -1, -1, -1, -1, s2, s3, s4, s5, i1, j1, k1);
    }

    final int a()
    {
        return k;
    }

    final void a(int i1)
    {
        k = i1;
    }

    public final void a(ac ac)
    {
        if (!d.equals("__##GOOGLETRANSACTION##__"))
        {
            throw new IllegalStateException((new StringBuilder("Attempted to add a transction to an event of type ")).append(d).toString());
        } else
        {
            t = ac;
            return;
        }
    }

    public final void a(q q1)
    {
        if (!d.equals("__##GOOGLEITEM##__"))
        {
            throw new IllegalStateException((new StringBuilder("Attempted to add an item to an event of type ")).append(d).toString());
        } else
        {
            u = q1;
            return;
        }
    }

    final void a(boolean flag)
    {
        r = flag;
    }

    final int b()
    {
        return l;
    }

    final void b(int i1)
    {
        l = i1;
    }

    final void b(boolean flag)
    {
        s = flag;
    }

    final int c()
    {
        return m;
    }

    final void c(int i1)
    {
        m = i1;
    }

    final int d()
    {
        return n;
    }

    final void d(int i1)
    {
        n = i1;
    }

    final int e()
    {
        return o;
    }

    final void e(int i1)
    {
        o = i1;
    }

    final int f()
    {
        return p;
    }

    final void f(int i1)
    {
        p = i1;
    }

    final int g()
    {
        return q;
    }

    final void g(int i1)
    {
        q = i1;
    }

    final boolean h()
    {
        return r;
    }

    final boolean i()
    {
        return s;
    }

    public final ac j()
    {
        return t;
    }

    public final q k()
    {
        return u;
    }

    public final boolean l()
    {
        return m != -1;
    }

    public final String toString()
    {
        return (new StringBuilder("id:")).append(a).append(" random:").append(k).append(" timestampCurrent:").append(o).append(" timestampPrevious:").append(n).append(" timestampFirst:").append(m).append(" visits:").append(p).append(" value:").append(g).append(" category:").append(d).append(" action:").append(e).append(" label:").append(f).append(" width:").append(h).append(" height:").append(i).toString();
    }
}
