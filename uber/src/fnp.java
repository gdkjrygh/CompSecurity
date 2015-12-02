// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnp
{

    private dfe a;
    private dff b;
    private eqg c;
    private dph d;
    private dfp e;

    private fnp()
    {
    }

    fnp(byte byte0)
    {
        this();
    }

    static dfp a(fnp fnp1)
    {
        return fnp1.e;
    }

    static dff b(fnp fnp1)
    {
        return fnp1.b;
    }

    static dfe c(fnp fnp1)
    {
        return fnp1.a;
    }

    static dph d(fnp fnp1)
    {
        return fnp1.d;
    }

    public final fnp a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final fnp a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            e = dfp;
            return this;
        }
    }

    public final fnp a(eqg eqg1)
    {
        c = eqg1;
        return this;
    }

    public final fnw a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
        }
        if (c == null)
        {
            c = new eqg();
        }
        if (d == null)
        {
            d = new dph();
        }
        if (e == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fno(this, (byte)0);
        }
    }
}
