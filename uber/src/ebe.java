// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ebe
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private ebe()
    {
    }

    ebe(byte byte0)
    {
        this();
    }

    static dfp a(ebe ebe1)
    {
        return ebe1.d;
    }

    static dff b(ebe ebe1)
    {
        return ebe1.a;
    }

    static dfe c(ebe ebe1)
    {
        return ebe1.b;
    }

    static dph d(ebe ebe1)
    {
        return ebe1.c;
    }

    public final ebe a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final ebe a(dfp dfp)
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

    public final ebg a()
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
            return new ebd(this, (byte)0);
        }
    }
}
