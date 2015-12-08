// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;

import android.graphics.RectF;

// Referenced classes of package com.go.weatherex.home.rain:
//            ForecastRainProbabilityGraphs, d

class f
{

    final ForecastRainProbabilityGraphs a;
    private RectF b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private int h;
    private float i;
    private boolean j;
    private float k;
    private float l;
    private boolean m;

    private f(ForecastRainProbabilityGraphs forecastrainprobabilitygraphs)
    {
        a = forecastrainprobabilitygraphs;
        super();
        g = 1.0F;
        h = 0;
        i = 0.0F;
        j = true;
        m = false;
    }

    f(ForecastRainProbabilityGraphs forecastrainprobabilitygraphs, d d1)
    {
        this(forecastrainprobabilitygraphs);
    }

    public RectF a()
    {
        if (b == null)
        {
            b = new RectF();
        }
        return b;
    }

    public void a(float f1)
    {
        g = f1;
    }

    public void a(int i1)
    {
        c = i1;
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public int b()
    {
        return c;
    }

    public void b(float f1)
    {
        i = f1;
    }

    public void b(int i1)
    {
        d = i1;
    }

    public void b(boolean flag)
    {
        m = flag;
    }

    public int c()
    {
        return d;
    }

    public void c(float f1)
    {
        k = f1;
    }

    public void c(int i1)
    {
        e = i1;
    }

    public int d()
    {
        return e;
    }

    public void d(float f1)
    {
        l = f1;
    }

    public void d(int i1)
    {
        f = i1;
    }

    public int e()
    {
        return f;
    }

    public void e(int i1)
    {
        h = i1;
    }

    public float f()
    {
        return g;
    }

    public int g()
    {
        return h;
    }

    public float h()
    {
        return i;
    }

    public boolean i()
    {
        return j;
    }

    public float j()
    {
        return k;
    }

    public float k()
    {
        return l;
    }

    public boolean l()
    {
        return m;
    }
}
