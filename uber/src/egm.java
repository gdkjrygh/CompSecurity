// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class egm
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private egm()
    {
    }

    egm(byte byte0)
    {
        this();
    }

    static dfp a(egm egm1)
    {
        return egm1.d;
    }

    static dff b(egm egm1)
    {
        return egm1.a;
    }

    static dfe c(egm egm1)
    {
        return egm1.b;
    }

    static dph d(egm egm1)
    {
        return egm1.c;
    }

    public final egm a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final egm a(dfp dfp)
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

    public final ehx a()
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
            return new egl(this, (byte)0);
        }
    }
}
