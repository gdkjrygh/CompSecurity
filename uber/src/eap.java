// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eap
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private eap()
    {
    }

    eap(byte byte0)
    {
        this();
    }

    static dfp a(eap eap1)
    {
        return eap1.d;
    }

    static dff b(eap eap1)
    {
        return eap1.a;
    }

    static dfe c(eap eap1)
    {
        return eap1.b;
    }

    static dph d(eap eap1)
    {
        return eap1.c;
    }

    public final eap a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final eap a(dfp dfp)
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

    public final eau a()
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
            return new eao(this, (byte)0);
        }
    }
}
