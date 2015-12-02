// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etj
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private etj()
    {
    }

    etj(byte byte0)
    {
        this();
    }

    static dfp a(etj etj1)
    {
        return etj1.d;
    }

    static dff b(etj etj1)
    {
        return etj1.a;
    }

    static dfe c(etj etj1)
    {
        return etj1.b;
    }

    static dph d(etj etj1)
    {
        return etj1.c;
    }

    public final etj a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final etj a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            d = dfp;
            return this;
        }
    }

    public final eud a()
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
            c = new dph();
        }
        if (d == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new eti(this, (byte)0);
        }
    }
}
