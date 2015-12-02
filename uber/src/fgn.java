// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgn
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fgn()
    {
    }

    fgn(byte byte0)
    {
        this();
    }

    static dfp a(fgn fgn1)
    {
        return fgn1.d;
    }

    static dff b(fgn fgn1)
    {
        return fgn1.a;
    }

    static dfe c(fgn fgn1)
    {
        return fgn1.b;
    }

    static dph d(fgn fgn1)
    {
        return fgn1.c;
    }

    public final fgj a()
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
            return new fgm(this, (byte)0);
        }
    }

    public final fgn a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fgn a(dfp dfp)
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
