// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.scroller:
//            h, i

class b extends h
{

    boolean a;

    public b(i i)
    {
        super(i);
        a = true;
        X = true;
    }

    static final int a(int i, int j)
    {
        int k;
        if (i < 0)
        {
            k = i + j;
        } else
        {
            k = i;
            if (i >= j)
            {
                return i - j;
            }
        }
        return k;
    }

    public int a()
    {
        return a(F, A);
    }

    public void a(float f)
    {
        while (v <= 0 || z == 0.5F) 
        {
            return;
        }
        f();
        z = 0.5F;
        r = -D / 2;
        s = v + r;
        if (s > r)
        {
            f = 1.0F / (float)(s - r);
        } else
        {
            f = 0.0F;
        }
        w = f;
        a(a() * D);
    }

    protected void a(int i)
    {
        int j = i;
        if (A <= 1) goto _L2; else goto _L1
_L1:
        if (i >= r) goto _L4; else goto _L3
_L3:
        j = i + v;
_L2:
        super.a(j);
        return;
_L4:
        j = i;
        if (i >= s)
        {
            j = i - v;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void a(int i, int j, Interpolator interpolator)
    {
        if (i <= E || (i - E) * 2 <= A) goto _L2; else goto _L1
_L1:
        int k = i - A;
_L4:
        super.a(k, j, interpolator);
        return;
_L2:
        k = i;
        if (i < E)
        {
            k = i;
            if ((E - i) * 2 > A)
            {
                k = i + A;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(Drawable drawable)
    {
        super.a(drawable);
        if (aa != null)
        {
            ab = new Paint();
            a = true;
            return;
        } else
        {
            ab = null;
            a = false;
            return;
        }
    }

    public int b()
    {
        int j = E;
        int i = j;
        if (r() > 0)
        {
            i = j - 1;
        }
        j = a(i, A);
        if (A < 2 && j != i)
        {
            return -1;
        } else
        {
            return j;
        }
    }

    protected int b(int i)
    {
        i = super.b(i);
        if (i >= 0 && i < A)
        {
            return i;
        } else
        {
            return 0;
        }
    }

    protected void b(int i, int j)
    {
        a(i, j, q);
    }

    public int c()
    {
        int j = E;
        int k = r();
        if (k == 0)
        {
            return -1;
        }
        int i = j;
        if (k < 0)
        {
            i = j + 1;
        }
        j = a(i, A);
        if (A < 2 && j != i)
        {
            return -1;
        } else
        {
            return j;
        }
    }

    protected int c(int i)
    {
        int j;
        if (A < 2)
        {
            j = super.c(i);
        } else
        {
            int k = e + i;
            if (k < r)
            {
                return i + v;
            }
            j = i;
            if (k >= s)
            {
                return i - v;
            }
        }
        return j;
    }

    protected int d(int i)
    {
        return i;
    }
}
