// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dvu
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private dvu()
    {
    }

    dvu(byte byte0)
    {
        this();
    }

    static dfp a(dvu dvu1)
    {
        return dvu1.d;
    }

    static dff b(dvu dvu1)
    {
        return dvu1.a;
    }

    static dfe c(dvu dvu1)
    {
        return dvu1.b;
    }

    static dph d(dvu dvu1)
    {
        return dvu1.c;
    }

    public final dvp a()
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
            return new dvt(this, (byte)0);
        }
    }

    public final dvu a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final dvu a(dfp dfp)
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
