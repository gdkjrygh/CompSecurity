// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fhl
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fhl()
    {
    }

    fhl(byte byte0)
    {
        this();
    }

    static dfp a(fhl fhl1)
    {
        return fhl1.d;
    }

    static dff b(fhl fhl1)
    {
        return fhl1.a;
    }

    static dfe c(fhl fhl1)
    {
        return fhl1.b;
    }

    static dph d(fhl fhl1)
    {
        return fhl1.c;
    }

    public final fhl a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fhl a(dfp dfp)
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

    public final fhw a()
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
            return new fhk(this, (byte)0);
        }
    }
}
