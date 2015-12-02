// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class erc
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private erc()
    {
    }

    erc(byte byte0)
    {
        this();
    }

    static dfp a(erc erc1)
    {
        return erc1.d;
    }

    static dff b(erc erc1)
    {
        return erc1.a;
    }

    static dfe c(erc erc1)
    {
        return erc1.b;
    }

    static dph d(erc erc1)
    {
        return erc1.c;
    }

    public final eqw a()
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
            return new erb(this, (byte)0);
        }
    }

    public final erc a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final erc a(dfp dfp)
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
}
