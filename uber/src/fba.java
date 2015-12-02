// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fba
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fba()
    {
    }

    fba(byte byte0)
    {
        this();
    }

    static dfp a(fba fba1)
    {
        return fba1.d;
    }

    static dff b(fba fba1)
    {
        return fba1.a;
    }

    static dfe c(fba fba1)
    {
        return fba1.b;
    }

    static dph d(fba fba1)
    {
        return fba1.c;
    }

    public final fba a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fba a(dfp dfp)
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

    public final fbb a()
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
            return new faz(this, (byte)0);
        }
    }
}
