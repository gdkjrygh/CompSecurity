// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eod
{

    private dfe a;
    private dff b;
    private eqg c;
    private dph d;
    private dfp e;

    private eod()
    {
    }

    eod(byte byte0)
    {
        this();
    }

    static dfp a(eod eod1)
    {
        return eod1.e;
    }

    static dff b(eod eod1)
    {
        return eod1.b;
    }

    static dfe c(eod eod1)
    {
        return eod1.a;
    }

    static dph d(eod eod1)
    {
        return eod1.d;
    }

    static eqg e(eod eod1)
    {
        return eod1.c;
    }

    public final eni a()
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
            return new eoc(this, (byte)0);
        }
    }

    public final eod a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final eod a(dfp dfp)
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

    public final eod a(eqg eqg1)
    {
        c = eqg1;
        return this;
    }
}
