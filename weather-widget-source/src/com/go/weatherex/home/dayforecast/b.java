// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.dayforecast;


// Referenced classes of package com.go.weatherex.home.dayforecast:
//            ColumnGraphs, a

class b
{

    final ColumnGraphs a;
    private float b;
    private float c;
    private boolean d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;

    private b(ColumnGraphs columngraphs)
    {
        a = columngraphs;
        super();
        d = false;
        f = 1.0F;
        k = 0.0F;
        l = true;
        m = false;
    }

    b(ColumnGraphs columngraphs, a a1)
    {
        this(columngraphs);
    }

    public float a()
    {
        return c;
    }

    public void a(float f1)
    {
        f = f1;
    }

    public void a(float f1, float f2)
    {
        if (f1 >= f2)
        {
            b = f1;
            c = f2;
        } else
        {
            b = f2;
            c = f1;
        }
        e = Math.abs(f1 - f2);
        g = e / 2.0F;
        h = (f1 + f2) / 2.0F;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public float b()
    {
        return b;
    }

    public void b(float f1)
    {
        g = f1;
    }

    public void b(boolean flag)
    {
        l = flag;
    }

    public float c()
    {
        return e;
    }

    public void c(float f1)
    {
        i = f1;
    }

    public void c(boolean flag)
    {
        m = flag;
    }

    public void d(float f1)
    {
        j = f1;
    }

    public boolean d()
    {
        return d;
    }

    public float e()
    {
        return h;
    }

    public void e(float f1)
    {
        k = f1;
    }

    public float f()
    {
        return f;
    }

    public float g()
    {
        return g;
    }

    public float h()
    {
        return i;
    }

    public float i()
    {
        return j;
    }

    public float j()
    {
        return k;
    }

    public boolean k()
    {
        return l;
    }

    public boolean l()
    {
        return m;
    }
}
