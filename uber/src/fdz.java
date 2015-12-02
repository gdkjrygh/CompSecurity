// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fdz
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fdz()
    {
    }

    fdz(byte byte0)
    {
        this();
    }

    static dfp a(fdz fdz1)
    {
        return fdz1.d;
    }

    static dff b(fdz fdz1)
    {
        return fdz1.a;
    }

    static dfe c(fdz fdz1)
    {
        return fdz1.b;
    }

    static dph d(fdz fdz1)
    {
        return fdz1.c;
    }

    public final fdz a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fdz a(dfp dfp)
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

    public final feq a()
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
            return new fdy(this, (byte)0);
        }
    }
}
