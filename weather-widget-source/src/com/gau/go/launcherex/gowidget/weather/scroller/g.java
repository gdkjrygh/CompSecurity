// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.scroller:
//            j

abstract class g
{

    protected static final Interpolator k = new j();
    protected static final Interpolator l = new OvershootInterpolator(0.0F);
    private long a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected float h;
    protected boolean i;
    protected long j;
    private int m;
    private float n;
    private int o;
    private float p;

    g()
    {
        i = false;
    }

    public final int a(long l1)
    {
        if (a == -1L)
        {
            a = l1;
            return 0;
        } else
        {
            return (int)(l1 - a);
        }
    }

    protected void a(int i1, int j1, int k1)
    {
        g = 1;
        p = 0.0F;
        m = k1;
        a = -1L;
        b = i1;
        d = j1;
        c = i1 + j1;
        n = 1.0F / (float)m;
        j = AnimationUtils.currentAnimationTimeMillis() + 100L;
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public boolean a(MotionEvent motionevent, int i1)
    {
        return false;
    }

    protected void b(float f1)
    {
    }

    public final boolean d()
    {
        return g == 0;
    }

    protected void e(int i1)
    {
    }

    protected final boolean e()
    {
        return o >= m;
    }

    public void f()
    {
        if (g == 1)
        {
            g = 0;
        }
    }

    public void f(int i1)
    {
        f = i1;
    }

    public boolean g()
    {
        g;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 32
    //                   1 34
    //                   2 162;
           goto _L1 _L1 _L2 _L3
_L1:
        return false;
_L2:
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        o = a(l1);
        if (o >= m)
        {
            o = m;
            if (!i || h <= 0.0F)
            {
                g = 0;
            }
        }
        if (i && l1 >= j)
        {
            int i1 = (int)(l1 - j);
            j = l1;
            h = Math.max(0.0F, h - (float)i1 / 200F);
            i();
        }
        p = (float)o * n;
        b(p);
        return true;
_L3:
        if (i && h < 1.0F)
        {
            long l2 = AnimationUtils.currentAnimationTimeMillis();
            int j1 = (int)(l2 - j);
            j = l2;
            float f1 = h;
            h = Math.min(1.0F, (float)j1 / 200F + f1);
            i();
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void h()
    {
        if (g == 0)
        {
            j = AnimationUtils.currentAnimationTimeMillis();
        }
        g = 2;
    }

    protected void i()
    {
    }

    public float j()
    {
        if (i)
        {
            float f1 = 1.0F - h;
            return 1.0F - f1 * f1;
        } else
        {
            return 0.0F;
        }
    }

    public final int k()
    {
        return e;
    }

    public final int l()
    {
        return f;
    }

}
