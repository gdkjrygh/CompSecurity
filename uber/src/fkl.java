// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fkl
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fkl()
    {
    }

    fkl(byte byte0)
    {
        this();
    }

    static dfp a(fkl fkl1)
    {
        return fkl1.d;
    }

    static dff b(fkl fkl1)
    {
        return fkl1.a;
    }

    static dfe c(fkl fkl1)
    {
        return fkl1.b;
    }

    static dph d(fkl fkl1)
    {
        return fkl1.c;
    }

    public final fkl a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fkl a(dfp dfp)
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

    public final fli a()
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
            return new fkk(this, (byte)0);
        }
    }
}
