// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;


// Referenced classes of package com.jiubang.core.a:
//            f, a, q, i, 
//            t

public abstract class r extends f
{

    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected boolean s;
    protected boolean t;

    public r(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, boolean flag, boolean flag1, long l2, long l3)
    {
        super(i, l1, i2, j1, k1, l2, l3);
        this.i = false;
        m = j;
        o = k;
        n = l;
        p = i1;
        q = j;
        r = k;
        s = flag;
        t = flag1;
        if (k1 == 1)
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

    public float a()
    {
        float f1 = 1.0F;
        if (j == 1)
        {
            f1 = ((float)k * 1.0F) / (1.0F * (float)h);
        } else
        {
            float f2 = ((float)(l - c) * 1.0F) / ((float)h * 1.0F);
            if (f2 <= 1.0F)
            {
                return f2;
            }
        }
        return f1;
    }

    protected void a(long l)
    {
        k = 0;
        this.l = 0L;
        if (g == 2)
        {
            int i = m;
            int j = o;
            m = n;
            o = p;
            n = i;
            p = j;
        }
        c(l);
    }

    protected void a(long l, long l1)
    {
        k = 0;
        this.l = 0L;
        if (g == 2 && l1 % 2L == 0L)
        {
            int i = m;
            int j = o;
            m = n;
            o = p;
            n = i;
            p = j;
        }
        c(l);
    }

    protected abstract void a(q q1, i i);

    protected final boolean a(q q1, i i, long l, t t1)
    {
        if (j != 1) goto _L2; else goto _L1
_L1:
        if (k == 0)
        {
            q = m;
            r = o;
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
            r = o;
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
            a.a(this, (int)(a() * 100F));
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
                a.a(this, (int)(a() * 100F));
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
