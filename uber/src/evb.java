// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class evb
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private evb()
    {
    }

    evb(byte byte0)
    {
        this();
    }

    static dfp a(evb evb1)
    {
        return evb1.d;
    }

    static dff b(evb evb1)
    {
        return evb1.a;
    }

    static dfe c(evb evb1)
    {
        return evb1.b;
    }

    static dph d(evb evb1)
    {
        return evb1.c;
    }

    public final evb a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final evb a(dfp dfp)
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

    public final evg a()
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
            return new eva(this, (byte)0);
        }
    }
}
