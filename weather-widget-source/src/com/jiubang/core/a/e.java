// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;


// Referenced classes of package com.jiubang.core.a:
//            f, q, a, i, 
//            t

public class e extends f
{

    private float m;
    private float n;
    private float o;
    private e p;

    public e(int i, float f1, float f2, int j, int k, int l, int i1, 
            long l1, long l2)
    {
        super(i, l, i1, j, k, l1, l2);
        m = f1;
        n = f2;
        o = 0.0F;
        if (k != 1) goto _L2; else goto _L1
_L1:
        if (h < 1)
        {
            h = 1;
        }
_L4:
        p = new e(i, l, i1, j, k, l1, l2);
        p.m = f1;
        p.n = n;
        p.o = 0.0F;
        p.h = h;
        return;
_L2:
        if (h < 1)
        {
            h = 300;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public e(int i, int j, int k, int l, int i1, long l1, 
            long l2)
    {
        super(i, j, k, l, i1, l1, l2);
    }

    private void a(q q1, i i)
    {
        int j = a();
        float f1 = n;
        float f2 = m;
        float f3 = m;
        o = ((float)j / 100000F) * (f1 - f2) + f3;
        q1.a(o);
    }

    public int a()
    {
        int i = 0x186a0;
        if (this.j == 1)
        {
            i = (k * 100) / h;
        } else
        {
            int j = (int)(((l - c) * 0x186a0L) / (long)h);
            if (j <= 0x186a0)
            {
                return j;
            }
        }
        return i;
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

    protected boolean a(q q1, i i, long l, t t)
    {
        if (j != 1) goto _L2; else goto _L1
_L1:
        if (k == 0)
        {
            o = m;
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
            o = m;
            d = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (j == 1)
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
        a(q1, i);
        if (j != 1) goto _L6; else goto _L5
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
