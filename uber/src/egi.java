// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class egi
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private egi()
    {
    }

    egi(byte byte0)
    {
        this();
    }

    static dfp a(egi egi1)
    {
        return egi1.d;
    }

    static dff b(egi egi1)
    {
        return egi1.a;
    }

    static dfe c(egi egi1)
    {
        return egi1.b;
    }

    static dph d(egi egi1)
    {
        return egi1.c;
    }

    public final egi a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final egi a(dfp dfp)
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

    public final ehr a()
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
            return new egh(this, (byte)0);
        }
    }
}
