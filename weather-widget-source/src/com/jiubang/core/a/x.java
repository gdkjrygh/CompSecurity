// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.graphics.Bitmap;

// Referenced classes of package com.jiubang.core.a:
//            w

class x
{

    final w a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;
    private float h;

    public x(w w1)
    {
        a = w1;
        super();
        f = 1.0F;
        h();
    }

    static boolean a(x x1)
    {
        return x1.k();
    }

    private void i()
    {
        if (k())
        {
            return;
        }
        if (b * e > d * c)
        {
            f = (float)e / (float)c;
            return;
        } else
        {
            f = (float)d / (float)b;
            return;
        }
    }

    private void j()
    {
        if (k())
        {
            return;
        } else
        {
            g = ((float)c() - (float)a() * e()) * 0.5F;
            h = ((float)d() - (float)b() * e()) * 0.5F;
            return;
        }
    }

    private boolean k()
    {
        return c() == 0 || d() == 0;
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public int d()
    {
        return e;
    }

    public float e()
    {
        return f * 1.12F;
    }

    public float f()
    {
        return g;
    }

    public float g()
    {
        return h;
    }

    public void h()
    {
        if (a.j == null)
        {
            return;
        } else
        {
            b = a.j.getWidth();
            c = a.j.getHeight();
            d = a.c();
            e = a.d();
            i();
            j();
            return;
        }
    }
}
