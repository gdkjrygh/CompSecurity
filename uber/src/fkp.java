// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fkp
{

    private flt a;
    private dfe b;
    private dff c;
    private eqg d;
    private dph e;
    private dfp f;

    private fkp()
    {
    }

    fkp(byte byte0)
    {
        this();
    }

    static dfp a(fkp fkp1)
    {
        return fkp1.f;
    }

    static dff b(fkp fkp1)
    {
        return fkp1.c;
    }

    static dfe c(fkp fkp1)
    {
        return fkp1.b;
    }

    static dph d(fkp fkp1)
    {
        return fkp1.e;
    }

    static eqg e(fkp fkp1)
    {
        return fkp1.d;
    }

    static flt f(fkp fkp1)
    {
        return fkp1.a;
    }

    public final fkp a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fkp a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            f = dfp;
            return this;
        }
    }

    public final fkp a(flt flt)
    {
        a = flt;
        return this;
    }

    public final fls a()
    {
        if (a == null)
        {
            throw new IllegalStateException("signupActivityModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (c == null)
        {
            c = new dff();
        }
        if (d == null)
        {
            d = new eqg();
        }
        if (e == null)
        {
            e = new dph();
        }
        if (f == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fko(this, (byte)0);
        }
    }
}
