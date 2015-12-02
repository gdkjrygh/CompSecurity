// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dyz
{

    private dff a;
    private dfe b;
    private ddj c;
    private dph d;
    private dfp e;

    private dyz()
    {
    }

    dyz(byte byte0)
    {
        this();
    }

    static dfp a(dyz dyz1)
    {
        return dyz1.e;
    }

    static dff b(dyz dyz1)
    {
        return dyz1.a;
    }

    static dfe c(dyz dyz1)
    {
        return dyz1.b;
    }

    static dph d(dyz dyz1)
    {
        return dyz1.d;
    }

    static ddj e(dyz dyz1)
    {
        return dyz1.c;
    }

    public final dyw a()
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
            c = new ddj();
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
            return new dyy(this, (byte)0);
        }
    }

    public final dyz a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final dyz a(dfp dfp)
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
}
