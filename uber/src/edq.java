// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class edq
{

    private dff a;
    private dfe b;
    private edv c;
    private dph d;
    private dfp e;

    private edq()
    {
    }

    edq(byte byte0)
    {
        this();
    }

    static dfp a(edq edq1)
    {
        return edq1.e;
    }

    static dff b(edq edq1)
    {
        return edq1.a;
    }

    static dfe c(edq edq1)
    {
        return edq1.b;
    }

    static dph d(edq edq1)
    {
        return edq1.d;
    }

    static edv e(edq edq1)
    {
        return edq1.c;
    }

    public final edq a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final edq a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            e = dfp;
            return this;
        }
    }

    public final edu a()
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
            c = new edv();
        }
        if (d == null)
        {
            d = new dph();
        }
        if (e == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new edp(this, (byte)0);
        }
    }
}
