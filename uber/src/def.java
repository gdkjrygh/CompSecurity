// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class def
{

    private ddc a;
    private ddn b;
    private dei c;
    private dpj d;
    private dfq e;
    private djg f;

    private def()
    {
    }

    def(byte byte0)
    {
        this();
    }

    static dfq a(def def1)
    {
        return def1.e;
    }

    static ddn b(def def1)
    {
        return def1.b;
    }

    static dpj c(def def1)
    {
        return def1.d;
    }

    static dei d(def def1)
    {
        return def1.c;
    }

    static djg e(def def1)
    {
        return def1.f;
    }

    static ddc f(def def1)
    {
        return def1.a;
    }

    public final def a(ddc ddc1)
    {
        a = ddc1;
        return this;
    }

    public final def a(ddn ddn)
    {
        b = ddn;
        return this;
    }

    public final def a(dei dei)
    {
        if (dei == null)
        {
            throw new NullPointerException("networkModule");
        } else
        {
            c = dei;
            return this;
        }
    }

    public final def a(dfq dfq)
    {
        e = dfq;
        return this;
    }

    public final def a(djg djg)
    {
        if (djg == null)
        {
            throw new NullPointerException("threadingComponent");
        } else
        {
            f = djg;
            return this;
        }
    }

    public final def a(dpj dpj)
    {
        if (dpj == null)
        {
            throw new NullPointerException("realtimeApplicationModule");
        } else
        {
            d = dpj;
            return this;
        }
    }

    public final div a()
    {
        if (a == null)
        {
            a = new ddc();
        }
        if (b == null)
        {
            throw new IllegalStateException("crashModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("networkModule must be set");
        }
        if (d == null)
        {
            throw new IllegalStateException("realtimeApplicationModule must be set");
        }
        if (e == null)
        {
            throw new IllegalStateException("riderApplicationModule must be set");
        }
        if (f == null)
        {
            throw new IllegalStateException("threadingComponent must be set");
        } else
        {
            return new dee(this, (byte)0);
        }
    }
}
