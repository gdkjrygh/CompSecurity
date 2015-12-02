// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fcd
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fcd()
    {
    }

    fcd(byte byte0)
    {
        this();
    }

    static dfp a(fcd fcd1)
    {
        return fcd1.d;
    }

    static dff b(fcd fcd1)
    {
        return fcd1.a;
    }

    static dfe c(fcd fcd1)
    {
        return fcd1.b;
    }

    static dph d(fcd fcd1)
    {
        return fcd1.c;
    }

    public final fcd a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fcd a(dfp dfp)
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

    public final fcu a()
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
            return new fcc(this, (byte)0);
        }
    }
}
