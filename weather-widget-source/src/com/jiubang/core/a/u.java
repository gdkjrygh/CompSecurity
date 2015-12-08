// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.graphics.Matrix;

// Referenced classes of package com.jiubang.core.a:
//            f, i, q, a, 
//            t

public class u extends f
{

    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private int r;
    private int s;
    private u t;

    public u(int j, float f1, float f2, int k, float f3, int l, float f4, 
            int i1, int j1, int k1, int l1, long l2, long l3)
    {
        super(j, k1, l1, i1, j1, l2, l3);
        m = f1;
        n = f2;
        q = 0.0F;
        o = f3;
        p = f4;
        r = k;
        s = l;
        this.j = j1;
        if (j1 != 1) goto _L2; else goto _L1
_L1:
        if (h < 1)
        {
            h = 1;
        }
_L4:
        t = new u(j, i1, j1, k1, l1, l2, l3);
        t.m = m;
        t.n = n;
        t.q = q;
        t.o = o;
        t.p = p;
        t.r = r;
        t.s = s;
        t.j = this.j;
        t.h = h;
        return;
_L2:
        if (h < 1)
        {
            h = 300;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public u(int j, int k, int l, int i1, int j1, long l1, 
            long l2)
    {
        super(j, i1, j1, k, l, l1, l2);
    }

    private void a(q q1, i j)
    {
        int k = a();
        float f1 = n;
        float f2 = m;
        float f3 = m;
        q = ((float)k / 100000F) * (f1 - f2) + f3;
        k = j.h();
        int l = j.i();
        if (r == 1)
        {
            f1 = (float)k + o;
        } else
        {
            f1 = o;
        }
        if (s == 1)
        {
            f2 = (float)l + p;
        } else
        {
            f2 = p;
        }
        q1.a().postRotate(q, f1, f2);
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
            m = n;
            n = f1;
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
            m = n;
            n = f1;
        }
        c(l);
    }

    protected boolean a(q q1, i j, long l, t t1)
    {
        if (this.j != 1) goto _L2; else goto _L1
_L1:
        if (k == 0)
        {
            q = m;
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
            q = m;
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
                long l1 = (long)h + f();
                a(l1 * ((l - this.l) / l1) + this.l);
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
                long l2 = (long)h + f();
                l = (l - this.l) / l2;
                a(l2 * l + this.l, l);
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
