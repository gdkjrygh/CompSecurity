// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class elr
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private elr()
    {
    }

    elr(byte byte0)
    {
        this();
    }

    static dfp a(elr elr1)
    {
        return elr1.d;
    }

    static dff b(elr elr1)
    {
        return elr1.a;
    }

    static dfe c(elr elr1)
    {
        return elr1.b;
    }

    static dph d(elr elr1)
    {
        return elr1.c;
    }

    public final elr a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final elr a(dfp dfp)
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

    public final elv a()
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
            return new elq(this, (byte)0);
        }
    }
}
