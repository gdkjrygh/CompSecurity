// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fjp
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fjp()
    {
    }

    fjp(byte byte0)
    {
        this();
    }

    static dfp a(fjp fjp1)
    {
        return fjp1.d;
    }

    static dff b(fjp fjp1)
    {
        return fjp1.a;
    }

    static dfe c(fjp fjp1)
    {
        return fjp1.b;
    }

    static dph d(fjp fjp1)
    {
        return fjp1.c;
    }

    public final fjp a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fjp a(dfp dfp)
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

    public final fkc a()
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
            return new fjo(this, (byte)0);
        }
    }
}
