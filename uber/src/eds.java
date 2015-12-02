// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eds
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private eds()
    {
    }

    eds(byte byte0)
    {
        this();
    }

    static dfp a(eds eds1)
    {
        return eds1.d;
    }

    static dff b(eds eds1)
    {
        return eds1.a;
    }

    static dfe c(eds eds1)
    {
        return eds1.b;
    }

    static dph d(eds eds1)
    {
        return eds1.c;
    }

    public final eds a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final eds a(dfp dfp)
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

    public final eec a()
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
            return new edr(this, (byte)0);
        }
    }
}
