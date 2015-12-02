// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class egw
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private egw()
    {
    }

    egw(byte byte0)
    {
        this();
    }

    static dfp a(egw egw1)
    {
        return egw1.d;
    }

    static dff b(egw egw1)
    {
        return egw1.a;
    }

    static dfe c(egw egw1)
    {
        return egw1.b;
    }

    static dph d(egw egw1)
    {
        return egw1.c;
    }

    public final egw a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final egw a(dfp dfp)
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

    public final eim a()
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
            return new egv(this, (byte)0);
        }
    }
}
