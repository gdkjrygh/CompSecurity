// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ded
{

    private ddc a;
    private ddl b;
    private dcb c;
    private evx d;
    private dei e;
    private dxb f;
    private dpj g;
    private dfq h;
    private drn i;
    private drj j;
    private djn k;
    private ddn l;
    private djg m;

    private ded()
    {
    }

    ded(byte byte0)
    {
        this();
    }

    static dfq a(ded ded1)
    {
        return ded1.h;
    }

    static dei b(ded ded1)
    {
        return ded1.e;
    }

    static ddn c(ded ded1)
    {
        return ded1.l;
    }

    static djg d(ded ded1)
    {
        return ded1.m;
    }

    static dpj e(ded ded1)
    {
        return ded1.g;
    }

    static ddc f(ded ded1)
    {
        return ded1.a;
    }

    static drn g(ded ded1)
    {
        return ded1.i;
    }

    static drj h(ded ded1)
    {
        return ded1.j;
    }

    static evx i(ded ded1)
    {
        return ded1.d;
    }

    static djn j(ded ded1)
    {
        return ded1.k;
    }

    static dcb k(ded ded1)
    {
        return ded1.c;
    }

    static dxb l(ded ded1)
    {
        return ded1.f;
    }

    static ddl m(ded ded1)
    {
        return ded1.b;
    }

    public final ded a(dcb dcb1)
    {
        c = dcb1;
        return this;
    }

    public final ded a(ddc ddc1)
    {
        a = ddc1;
        return this;
    }

    public final ded a(ddn ddn)
    {
        l = ddn;
        return this;
    }

    public final ded a(dei dei)
    {
        if (dei == null)
        {
            throw new NullPointerException("networkModule");
        } else
        {
            e = dei;
            return this;
        }
    }

    public final ded a(dfq dfq)
    {
        h = dfq;
        return this;
    }

    public final ded a(djg djg)
    {
        if (djg == null)
        {
            throw new NullPointerException("threadingComponent");
        } else
        {
            m = djg;
            return this;
        }
    }

    public final ded a(dpj dpj)
    {
        if (dpj == null)
        {
            throw new NullPointerException("realtimeApplicationModule");
        } else
        {
            g = dpj;
            return this;
        }
    }

    public final ded a(drj drj)
    {
        j = drj;
        return this;
    }

    public final ded a(dxb dxb1)
    {
        if (dxb1 == null)
        {
            throw new NullPointerException("nowModule");
        } else
        {
            f = dxb1;
            return this;
        }
    }

    public final dfp a()
    {
        if (a == null)
        {
            a = new ddc();
        }
        if (b == null)
        {
            b = new ddl();
        }
        if (c == null)
        {
            c = new dcb();
        }
        if (d == null)
        {
            d = new evx();
        }
        if (e == null)
        {
            throw new IllegalStateException("networkModule must be set");
        }
        if (f == null)
        {
            f = new dxb();
        }
        if (g == null)
        {
            throw new IllegalStateException("realtimeApplicationModule must be set");
        }
        if (h == null)
        {
            throw new IllegalStateException("riderApplicationModule must be set");
        }
        if (i == null)
        {
            i = new drn();
        }
        if (j == null)
        {
            throw new IllegalStateException("smsReceiverModule must be set");
        }
        if (k == null)
        {
            k = new djn();
        }
        if (l == null)
        {
            throw new IllegalStateException("crashModule must be set");
        }
        if (m == null)
        {
            throw new IllegalStateException("threadingComponent must be set");
        } else
        {
            return new dec(this, (byte)0);
        }
    }
}
