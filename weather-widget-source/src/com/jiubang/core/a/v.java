// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.graphics.Matrix;

// Referenced classes of package com.jiubang.core.a:
//            f, i, q, a, 
//            t

public class v extends f
{

    private volatile float m;
    private volatile float n;
    private volatile float o;
    private volatile float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private int u;
    private int v;

    public v(int j, float f1, float f2, float f3, float f4, int k, float f5, 
            int l, float f6, int i1, int j1, int k1, int l1, long l2, long l3)
    {
        super(j, k1, l1, i1, j1, l2, l3);
        m = f1;
        n = f2;
        o = f3;
        p = f4;
        u = k;
        v = l;
        q = f5;
        r = f6;
        s = 0.0F;
        t = 0.0F;
        this.j = j1;
        if (j1 == 1)
        {
            if (h < 1)
            {
                h = 1;
            }
        } else
        if (h < 1)
        {
            h = 300;
            return;
        }
    }

    private void a(q q1, i j)
    {
        int k = a();
        float f1 = n;
        float f2 = m;
        float f3 = m;
        s = (f1 - f2) * ((float)k / 100000F) + f3;
        f1 = p;
        f2 = o;
        f3 = o;
        t = ((float)k / 100000F) * (f1 - f2) + f3;
        k = j.h();
        int l = j.i();
        if (u == 1)
        {
            f1 = (float)k + q;
        } else
        {
            f1 = q;
        }
        if (v == 1)
        {
            f2 = (float)l + r;
        } else
        {
            f2 = r;
        }
        q1.a().postScale(s, t, f1, f2);
    }

    public int a()
    {
        int j = 0x186a0;
        if (this.j == 1)
        {
            j = (this.k * 100) / h;
        } else
        {
            int k = (int)(((l - c) * 0x186a0L) / (long)h);
            if (k <= 0x186a0)
            {
                return k;
            }
        }
        return j;
    }

    protected void a(long l)
    {
        k = 0;
        this.l = 0L;
        if (g == 2)
        {
            float f1 = m;
            float f2 = o;
            m = n;
            o = p;
            n = f1;
            p = f2;
        }
        c(l);
    }

    protected void a(long l, long l1)
    {
        k = 0;
        this.l = 0L;
        if (g == 2 && l1 % 2L == 0L)
        {
            float f1 = m;
            float f2 = o;
            m = n;
            o = p;
            n = f1;
            p = f2;
        }
        c(l);
    }

    protected boolean a(q q1, i j, long l, t t1)
    {
        if (this.j != 1) goto _L2; else goto _L1
_L1:
        if (k == 0)
        {
            s = m;
            t = o;
            d = false;
        }
_L4:
        if (d)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (this.l == 0L)
        {
            s = m;
            t = o;
            d = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (this.j == 1)
        {
            k = k + 1;
        } else
        {
            this.l = l;
        }
        if (this.l - c >= (long)h)
        {
            this.l = c + (long)h;
        }
        a(q1, j);
        if (this.j != 1) goto _L6; else goto _L5
_L5:
        if (k == 1 || k >= h) goto _L8; else goto _L7
_L7:
        if (a != null)
        {
            a.a(this, a());
        }
_L10:
        return true;
_L8:
        if (k == h)
        {
            if (f < e || e == -1)
            {
                a(l);
                f = f + 1;
            } else
            {
                d = true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (this.l - c > 5L && this.l - c < (long)h)
        {
            if (a != null)
            {
                a.a(this, a());
            }
        } else
        if (this.l - c >= (long)h)
        {
            if (f < e || e == -1)
            {
                long l1 = (long)h + f();
                l = (l - this.l) / l1;
                a(l1 * l + this.l, l);
                f = (int)((long)f + l + 1L);
            } else
            {
                d = true;
            }
        }
        if (true) goto _L10; else goto _L9
_L9:
    }
}
