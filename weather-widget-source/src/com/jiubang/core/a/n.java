// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.graphics.Bitmap;
import java.util.ArrayList;

// Referenced classes of package com.jiubang.core.a:
//            f, o, i, a, 
//            q, t

public class n extends f
{

    private ArrayList m;
    private boolean n;

    public n(int j, int k, int l, int i1, int j1, long l1, 
            long l2)
    {
        super(j, k, l, i1, j1, l1, l2);
        m = new ArrayList();
        n = true;
    }

    private int a()
    {
        if (this.j == 1)
        {
            return (this.k * 100) / h;
        }
        if (n)
        {
            int l = (int)(this.l - c);
            int j1 = m.size();
            for (int j = 0; j < j1; j++)
            {
                o o1 = (o)m.get(j);
                if (o1.b <= l && l < o1.c)
                {
                    return j;
                }
            }

            return 0;
        }
        int i1 = (int)((long)h - (this.l - c));
        int k1 = m.size();
        for (int k = k1 - 1; k >= 0; k--)
        {
            o o2 = (o)m.get(k);
            if (o2.b <= i1 && i1 < o2.c)
            {
                return k;
            }
        }

        return k1 - 1;
    }

    private o a(int j)
    {
        if (j >= 0 && j < m.size())
        {
            return (o)m.get(j);
        } else
        {
            return null;
        }
    }

    private void a(q q, i j)
    {
        boolean flag = true;
        q = a(a());
        if (q != null)
        {
            j.a(((o) (q)).a);
            if (((o) (q)).d != 1)
            {
                flag = false;
            }
            j.a(flag);
        }
    }

    public o a(Bitmap bitmap, int j, int k, int l)
    {
        o o1 = new o(this);
        o1.a = bitmap;
        o1.b = j;
        o1.c = k;
        o1.d = l;
        m.add(o1);
        return o1;
    }

    protected void a(long l)
    {
        k = 0;
        this.l = 0L;
        if (g == 2)
        {
            n = false;
        } else
        {
            n = true;
        }
        c(l);
    }

    protected void a(long l, long l1)
    {
        k = 0;
        this.l = 0L;
        if (g == 2 && l1 % 2L == 0L)
        {
            n = false;
        } else
        {
            n = true;
        }
        c(l);
    }

    protected boolean a(q q, i j, long l, t t)
    {
        if (this.j != 1) goto _L2; else goto _L1
_L1:
        if (k == 0)
        {
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
        a(q, j);
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
