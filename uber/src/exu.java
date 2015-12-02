// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exu
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private exu()
    {
    }

    exu(byte byte0)
    {
        this();
    }

    static dfp a(exu exu1)
    {
        return exu1.d;
    }

    static dff b(exu exu1)
    {
        return exu1.a;
    }

    static dfe c(exu exu1)
    {
        return exu1.b;
    }

    static dph d(exu exu1)
    {
        return exu1.c;
    }

    public final exu a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final exu a(dfp dfp)
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

    public final eyq a()
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
            return new ext(this, (byte)0);
        }
    }
}
