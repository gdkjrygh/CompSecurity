// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gie
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private gie()
    {
    }

    gie(byte byte0)
    {
        this();
    }

    static dfp a(gie gie1)
    {
        return gie1.d;
    }

    static dff b(gie gie1)
    {
        return gie1.a;
    }

    static dfe c(gie gie1)
    {
        return gie1.b;
    }

    static dph d(gie gie1)
    {
        return gie1.c;
    }

    public final gic a()
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
            return new gid(this, (byte)0);
        }
    }

    public final gie a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final gie a(dfp dfp)
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
