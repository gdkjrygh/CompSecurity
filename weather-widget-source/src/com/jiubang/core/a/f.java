// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;


// Referenced classes of package com.jiubang.core.a:
//            a, q, i, t

public class f
{

    protected a a;
    protected long b;
    protected long c;
    protected boolean d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected boolean i;
    protected int j;
    protected int k;
    protected long l;
    private int m;
    private int n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;
    private boolean t;
    private int u;
    private boolean v;
    private f w;

    public f(int i1)
    {
        v = false;
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("tickCount must > 0");
        } else
        {
            m = i1;
            n = i1;
            u = 0;
            v = true;
            return;
        }
    }

    public f(int i1, int j1, int k1, int l1, int i2, long l2, 
            long l3)
    {
        v = false;
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("tickCount must > 0");
        }
        m = i1;
        n = i1;
        e = k1;
        u = 0;
        v = true;
        j = i2;
        h = l1;
        g = j1;
        f = 0;
        r = l2;
        b = l2;
        q = l3;
        if (b > 0L)
        {
            t = true;
        }
        w = new f(i1);
        w.m = m;
        w.n = n;
        w.e = e;
        w.u = u;
        w.v = v;
        w.j = j;
        w.h = h;
        w.g = g;
        w.f = f;
        w.r = r;
        w.b = b;
        w.q = q;
        w.t = t;
    }

    protected boolean a(q q1, i i1, long l1, t t1)
    {
        return false;
    }

    public void b(long l1)
    {
        o = false;
        if (!v) goto _L2; else goto _L1
_L1:
        b = r;
        if (j != 1 || b <= 0L) goto _L4; else goto _L3
_L3:
        s = 0L;
        t = true;
_L6:
        if (!t && c == 0L)
        {
            c = l1;
            if (a != null)
            {
                a.a(this);
            }
        }
        return;
_L4:
        if (j == 2 && b > 0L)
        {
            p = l1;
            t = true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        b = q;
        if (j == 1 && b > 0L)
        {
            s = 0L;
            t = true;
        } else
        if (j == 2 && b > 0L)
        {
            p = l1;
            t = true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean b()
    {
        return t;
    }

    public boolean b(q q1, i i1, long l1, t t1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = o;
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!b())
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (p == 0L)
        {
            b(l1);
        }
        if (j == 1)
        {
            s = s + 1L;
            if (s >= b)
            {
                t = false;
            }
            break MISSING_BLOCK_LABEL_353;
        }
        long l3;
        if (j != 2)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        l3 = l1 - p;
        if (l3 < b)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        if (l3 <= b + (long)h)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        long l2 = l3;
        if (b == r)
        {
            l2 = l3 - (b + (long)h);
            b = q;
        }
        l2 %= b + (long)h;
        if (l2 >= b)
        {
            t = false;
            c = p + b;
            p = 0L;
            break MISSING_BLOCK_LABEL_353;
        }
        break MISSING_BLOCK_LABEL_220;
        q1;
        throw q1;
        p = l1 - l2;
        break MISSING_BLOCK_LABEL_353;
        t = false;
        c = p + b;
        p = 0L;
        break MISSING_BLOCK_LABEL_353;
        if (c == 0L)
        {
            c = l1;
            if (a != null)
            {
                a.a(this);
            }
        }
        u = u + 1;
        if (u < n)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        u = 0;
        boolean flag2 = c(q1, i1, l1, t1);
        if (v)
        {
            v = false;
            continue; /* Loop/switch isn't completed */
        }
        flag = flag2;
        continue; /* Loop/switch isn't completed */
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void c(long l1)
    {
        u = 0;
        c = 0L;
        b(l1);
    }

    public boolean c()
    {
        return d;
    }

    protected boolean c(q q1, i i1, long l1, t t1)
    {
        boolean flag = false;
        if (a(q1, i1, l1, t1))
        {
            flag = true;
        }
        return flag;
    }

    public boolean d()
    {
        return f != e;
    }

    public boolean e()
    {
        return i;
    }

    public long f()
    {
        return q;
    }
}
