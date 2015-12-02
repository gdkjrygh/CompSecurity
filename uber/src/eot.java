// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eot
{

    private dfe a;
    private dff b;
    private dph c;
    private dfp d;

    private eot()
    {
    }

    eot(byte byte0)
    {
        this();
    }

    static dfp a(eot eot1)
    {
        return eot1.d;
    }

    static dff b(eot eot1)
    {
        return eot1.b;
    }

    static dfe c(eot eot1)
    {
        return eot1.a;
    }

    static dph d(eot eot1)
    {
        return eot1.c;
    }

    public final eot a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final eot a(dfp dfp)
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

    public final epp a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
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
            return new eos(this, (byte)0);
        }
    }
}
