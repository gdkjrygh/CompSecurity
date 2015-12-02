// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fdr
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fdr()
    {
    }

    fdr(byte byte0)
    {
        this();
    }

    static dfp a(fdr fdr1)
    {
        return fdr1.d;
    }

    static dff b(fdr fdr1)
    {
        return fdr1.a;
    }

    static dfe c(fdr fdr1)
    {
        return fdr1.b;
    }

    static dph d(fdr fdr1)
    {
        return fdr1.c;
    }

    public final fdr a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fdr a(dfp dfp)
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

    public final fec a()
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
            return new fdq(this, (byte)0);
        }
    }
}
