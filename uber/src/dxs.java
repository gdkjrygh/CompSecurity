// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dxs
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private dxs()
    {
    }

    dxs(byte byte0)
    {
        this();
    }

    static dfp a(dxs dxs1)
    {
        return dxs1.d;
    }

    static dff b(dxs dxs1)
    {
        return dxs1.a;
    }

    static dfe c(dxs dxs1)
    {
        return dxs1.b;
    }

    static dph d(dxs dxs1)
    {
        return dxs1.c;
    }

    public final dxh a()
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
            return new dxr(this, (byte)0);
        }
    }

    public final dxs a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final dxs a(dfp dfp)
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
