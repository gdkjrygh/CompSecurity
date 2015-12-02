// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ebk
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private ebk()
    {
    }

    ebk(byte byte0)
    {
        this();
    }

    static dfp a(ebk ebk1)
    {
        return ebk1.d;
    }

    static dff b(ebk ebk1)
    {
        return ebk1.a;
    }

    static dfe c(ebk ebk1)
    {
        return ebk1.b;
    }

    static dph d(ebk ebk1)
    {
        return ebk1.c;
    }

    public final ebk a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final ebk a(dfp dfp)
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

    public final ebs a()
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
            return new ebj(this, (byte)0);
        }
    }
}
