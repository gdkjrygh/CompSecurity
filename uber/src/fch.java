// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fch
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fch()
    {
    }

    fch(byte byte0)
    {
        this();
    }

    static dfp a(fch fch1)
    {
        return fch1.d;
    }

    static dff b(fch fch1)
    {
        return fch1.a;
    }

    static dfe c(fch fch1)
    {
        return fch1.b;
    }

    static dph d(fch fch1)
    {
        return fch1.c;
    }

    public final fch a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fch a(dfp dfp)
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

    public final fdd a()
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
            return new fcg(this, (byte)0);
        }
    }
}
