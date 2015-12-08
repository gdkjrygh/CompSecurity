// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.graphics.Bitmap;

// Referenced classes of package com.jiubang.core.a:
//            f, i, t, a, 
//            q

public class j extends f
{

    private int m;
    private int n;
    private int o;
    private int p;
    private int q;

    public j(int k, int l, int i1, int j1, int k1, long l1, 
            long l2)
    {
        super(k, l, i1, j1, k1, l1, l2);
    }

    private int a()
    {
        if (j == 1)
        {
            return (k * 100) / h;
        } else
        {
            return Math.min((int)(((l - c) * 0x186a0L) / (long)h), 0x186a0);
        }
    }

    private void a(t t1, i k)
    {
        if (c() || j == 1)
        {
            return;
        }
        int i2 = a();
        Bitmap bitmap = k.q();
        int l = bitmap.getWidth();
        int i1 = bitmap.getHeight();
        int j2 = k.c();
        int j1 = k.d();
        int k1 = k.h();
        int l1 = k.i();
        switch (o)
        {
        default:
            return;

        case 1: // '\001'
            j2 = k.a();
            float f1 = (float)l / (float)j2;
            int k2 = -j2;
            m = (i2 * k2) / 0x186a0 + (p - k1);
            if (m < k2)
            {
                m = m % k2;
            }
            i2 = (int)((float)m * f1);
            k2 = m + j2;
            t1.a(-i2, 0, l, i1);
            t1.b(k1, l1, k1 + k2, l1 + j1);
            t1.c(0, 0, -i2, i1);
            t1.d(k1 + k2, l1, k1 + j2, l1 + j1);
            return;

        case 2: // '\002'
            j2 = k.a();
            float f2 = (float)l / (float)j2;
            m = (i2 * j2) / 0x186a0 + (p - k1 - j2);
            if (m > j2)
            {
                m = m % j2;
            }
            i2 = (int)((float)m * f2);
            int l2 = m;
            t1.a(0, 0, l - i2, i1);
            t1.b(m + k1, l1, j2, l1 + j1);
            t1.c(l - i2, 0, l, i1);
            t1.d(k1, l1, m + k1, l1 + j1);
            return;

        case 3: // '\003'
            int i3 = -i1;
            n = (i2 * i3) / 0x186a0 + (q - l1);
            if (n < i3)
            {
                n = n % i3;
            }
            i2 = n + i1;
            if (i2 < j1)
            {
                t1.a(0, -n, l, i1);
                t1.b(k1, l1, k1 + j2, l1 + i2);
                t1.c(0, 0, l, j1 - i2);
                t1.d(k1, i2 + l1, k1 + j2, l1 + j1);
                return;
            } else
            {
                t1.a(0, -n, l, -n + j1);
                t1.b(k1, l1, k1 + j2, l1 + j1);
                return;
            }

        case 4: // '\004'
            n = (i2 * i1) / 0x186a0 + (q - l1 - j1);
            break;
        }
        if (n > i1)
        {
            n = n % i1;
        }
        i2 = i1 - n;
        if (i2 < j1)
        {
            t1.a(0, 0, l, i2);
            t1.b(k1, (l1 + j1) - i2, k1 + j2, l1 + j1);
            t1.c(0, (i1 - j1) + i2, l, i1);
            t1.d(k1, l1, k1 + j2, (l1 + j1) - i2);
            return;
        } else
        {
            t1.a(0, i2 - j1, l, i2);
            t1.b(k1, l1, k1 + j2, l1 + j1);
            return;
        }
    }

    public void a(int k, int l, int i1)
    {
        o = i1;
        p = k;
        q = l;
    }

    protected void a(long l)
    {
        k = 0;
        this.l = 0L;
        if (g != 2);
        c(l);
    }

    protected void a(long l, long l1)
    {
        k = 0;
        this.l = 0L;
        if (g == 2)
        {
            if (l1 % 2L != 0L);
        }
        c(l);
    }

    protected boolean a(q q1, i k, long l, t t1)
    {
        if (j != 1) goto _L2; else goto _L1
_L1:
        if (this.k == 0)
        {
            d = false;
        }
_L10:
        if (!d) goto _L4; else goto _L3
_L3:
        return false;
_L2:
        if (this.l == 0L)
        {
            d = false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == 1)
        {
            this.k = this.k + 1;
        } else
        {
            this.l = l;
        }
        if (this.l - c >= (long)h)
        {
            this.l = c + (long)h;
        }
        a(t1, k);
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (this.k == 1 || this.k >= h)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a == null) goto _L3; else goto _L5
_L5:
        a.a(this, a());
        return false;
        if (this.k != h) goto _L3; else goto _L6
_L6:
        if (f < e || e == -1)
        {
            a(l);
            f = f + 1;
            return false;
        } else
        {
            d = true;
            return false;
        }
        if (this.l - c <= 5L || this.l - c >= (long)h)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a == null) goto _L3; else goto _L7
_L7:
        a.a(this, a());
        return false;
        if (this.l - c < (long)h) goto _L3; else goto _L8
_L8:
        if (f < e || e == -1)
        {
            long l1 = h;
            long l2 = f();
            l1 = (l - this.l) / (l1 + l2);
            a(l, l1);
            f = (int)(l1 + (long)f + 1L);
            return false;
        }
        d = true;
        return false;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
