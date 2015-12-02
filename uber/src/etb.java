// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etb
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private etb()
    {
    }

    etb(byte byte0)
    {
        this();
    }

    static dfp a(etb etb1)
    {
        return etb1.d;
    }

    static dff b(etb etb1)
    {
        return etb1.a;
    }

    static dfe c(etb etb1)
    {
        return etb1.b;
    }

    static dph d(etb etb1)
    {
        return etb1.c;
    }

    public final etb a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final etb a(dfp dfp)
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

    public final etu a()
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
            return new eta(this, (byte)0);
        }
    }
}
