// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class egq
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private egq()
    {
    }

    egq(byte byte0)
    {
        this();
    }

    static dfp a(egq egq1)
    {
        return egq1.d;
    }

    static dff b(egq egq1)
    {
        return egq1.a;
    }

    static dfe c(egq egq1)
    {
        return egq1.b;
    }

    static dph d(egq egq1)
    {
        return egq1.c;
    }

    public final egq a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final egq a(dfp dfp)
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

    public final eib a()
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
            return new egp(this, (byte)0);
        }
    }
}
