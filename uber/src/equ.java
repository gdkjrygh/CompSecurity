// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class equ
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private equ()
    {
    }

    equ(byte byte0)
    {
        this();
    }

    static dfp a(equ equ1)
    {
        return equ1.d;
    }

    static dff b(equ equ1)
    {
        return equ1.a;
    }

    static dfe c(equ equ1)
    {
        return equ1.b;
    }

    static dph d(equ equ1)
    {
        return equ1.c;
    }

    public final eqn a()
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
            return new eqt(this, (byte)0);
        }
    }

    public final equ a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final equ a(dfp dfp)
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
