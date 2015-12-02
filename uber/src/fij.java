// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fij
{

    private dfe a;
    private dff b;
    private dph c;
    private dfp d;

    private fij()
    {
    }

    fij(byte byte0)
    {
        this();
    }

    static dfp a(fij fij1)
    {
        return fij1.d;
    }

    static dff b(fij fij1)
    {
        return fij1.b;
    }

    static dfe c(fij fij1)
    {
        return fij1.a;
    }

    static dph d(fij fij1)
    {
        return fij1.c;
    }

    public final fij a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final fij a(dfp dfp)
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

    public final fik a()
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
            return new fii(this, (byte)0);
        }
    }
}
