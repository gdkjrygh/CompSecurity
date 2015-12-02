// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eop
{

    private dfe a;
    private dff b;
    private eqg c;
    private dph d;
    private dfp e;

    private eop()
    {
    }

    eop(byte byte0)
    {
        this();
    }

    static dfp a(eop eop1)
    {
        return eop1.e;
    }

    static dff b(eop eop1)
    {
        return eop1.b;
    }

    static dfe c(eop eop1)
    {
        return eop1.a;
    }

    static dph d(eop eop1)
    {
        return eop1.d;
    }

    static eqg e(eop eop1)
    {
        return eop1.c;
    }

    public final eop a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final eop a(dfp dfp)
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

    public final epi a()
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
            return new eoo(this, (byte)0);
        }
    }
}
