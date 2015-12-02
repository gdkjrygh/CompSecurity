// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class faj
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private faj()
    {
    }

    faj(byte byte0)
    {
        this();
    }

    static dfp a(faj faj1)
    {
        return faj1.d;
    }

    static dff b(faj faj1)
    {
        return faj1.a;
    }

    static dfe c(faj faj1)
    {
        return faj1.b;
    }

    static dph d(faj faj1)
    {
        return faj1.c;
    }

    public final faj a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final faj a(dfp dfp)
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

    public final fam a()
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
            return new fai(this, (byte)0);
        }
    }
}
