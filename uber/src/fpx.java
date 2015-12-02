// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fpx
{

    private dff a;
    private dfe b;
    private fqq c;
    private dph d;
    private dfp e;

    private fpx()
    {
    }

    fpx(byte byte0)
    {
        this();
    }

    static dfp a(fpx fpx1)
    {
        return fpx1.e;
    }

    static dff b(fpx fpx1)
    {
        return fpx1.a;
    }

    static dfe c(fpx fpx1)
    {
        return fpx1.b;
    }

    static dph d(fpx fpx1)
    {
        return fpx1.d;
    }

    static fqq e(fpx fpx1)
    {
        return fpx1.c;
    }

    public final fpx a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fpx a(dfp dfp)
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

    public final fpx a(fqq fqq1)
    {
        c = fqq1;
        return this;
    }

    public final fqp a()
    {
        if (a == null)
        {
            a = new dff();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (c == null)
        {
            c = new fqq();
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
            return new fpw(this, (byte)0);
        }
    }
}
