// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;


// Referenced classes of package com.go.weatherex.home.hourforecast:
//            TrendGraphs, f

class h
{

    final TrendGraphs a;
    private int b;
    private float c;
    private boolean d;
    private boolean e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    private h(TrendGraphs trendgraphs)
    {
        a = trendgraphs;
        super();
        c = 0.0F;
        d = true;
        e = false;
        g = false;
        i = -1;
        j = 0;
    }

    h(TrendGraphs trendgraphs, f f1)
    {
        this(trendgraphs);
    }

    public int a()
    {
        return b;
    }

    public void a(float f1)
    {
        c = f1;
    }

    public void a(int k)
    {
        b = k;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public float b()
    {
        return c;
    }

    public void b(int k)
    {
        f = k;
    }

    public void b(boolean flag)
    {
        e = flag;
    }

    public void c(int k)
    {
        h = k;
    }

    public void c(boolean flag)
    {
        g = flag;
    }

    public boolean c()
    {
        return d;
    }

    public void d(int k)
    {
        i = k;
    }

    public boolean d()
    {
        return e;
    }

    public int e()
    {
        return f;
    }

    public void e(int k)
    {
        j = k;
    }

    public boolean f()
    {
        return g;
    }

    public int g()
    {
        return h;
    }

    public int h()
    {
        return i;
    }

    public int i()
    {
        return j;
    }
}
