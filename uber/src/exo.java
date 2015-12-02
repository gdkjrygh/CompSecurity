// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exo
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private exo()
    {
    }

    exo(byte byte0)
    {
        this();
    }

    static dfp a(exo exo1)
    {
        return exo1.d;
    }

    static dff b(exo exo1)
    {
        return exo1.a;
    }

    static dfe c(exo exo1)
    {
        return exo1.b;
    }

    static dph d(exo exo1)
    {
        return exo1.c;
    }

    public final exo a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final exo a(dfp dfp)
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

    public final eyg a()
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
            return new exn(this, (byte)0);
        }
    }
}
