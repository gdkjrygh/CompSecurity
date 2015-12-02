// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ffp
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private ffp()
    {
    }

    ffp(byte byte0)
    {
        this();
    }

    static dfp a(ffp ffp1)
    {
        return ffp1.d;
    }

    static dff b(ffp ffp1)
    {
        return ffp1.a;
    }

    static dfe c(ffp ffp1)
    {
        return ffp1.b;
    }

    static dph d(ffp ffp1)
    {
        return ffp1.c;
    }

    public final ffp a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final ffp a(dfp dfp)
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

    public final ffs a()
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
            return new ffo(this, (byte)0);
        }
    }
}
