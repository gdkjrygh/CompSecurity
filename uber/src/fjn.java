// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fjn
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fjn()
    {
    }

    fjn(byte byte0)
    {
        this();
    }

    static dfp a(fjn fjn1)
    {
        return fjn1.d;
    }

    static dff b(fjn fjn1)
    {
        return fjn1.a;
    }

    static dfe c(fjn fjn1)
    {
        return fjn1.b;
    }

    static dph d(fjn fjn1)
    {
        return fjn1.c;
    }

    public final fjn a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fjn a(dfp dfp)
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

    public final fka a()
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
            return new fjm(this, (byte)0);
        }
    }
}
