// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ezw
{

    private dff a;
    private dfe b;
    private fag c;
    private dph d;
    private dfp e;

    private ezw()
    {
    }

    ezw(byte byte0)
    {
        this();
    }

    static dfp a(ezw ezw1)
    {
        return ezw1.e;
    }

    static dff b(ezw ezw1)
    {
        return ezw1.a;
    }

    static dfe c(ezw ezw1)
    {
        return ezw1.b;
    }

    static dph d(ezw ezw1)
    {
        return ezw1.d;
    }

    static fag e(ezw ezw1)
    {
        return ezw1.c;
    }

    public final ezw a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final ezw a(dfp dfp)
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

    public final fab a()
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
            c = new fag();
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
            return new ezv(this, (byte)0);
        }
    }
}
