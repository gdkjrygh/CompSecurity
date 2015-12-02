// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exq
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private exq()
    {
    }

    exq(byte byte0)
    {
        this();
    }

    static dfp a(exq exq1)
    {
        return exq1.d;
    }

    static dff b(exq exq1)
    {
        return exq1.a;
    }

    static dfe c(exq exq1)
    {
        return exq1.b;
    }

    static dph d(exq exq1)
    {
        return exq1.c;
    }

    public final exq a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final exq a(dfp dfp)
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

    public final eyj a()
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
            return new exp(this, (byte)0);
        }
    }
}
