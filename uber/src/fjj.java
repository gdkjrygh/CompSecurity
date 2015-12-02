// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fjj
{

    private fjr a;
    private dff b;
    private dfe c;
    private dph d;
    private dfp e;

    private fjj()
    {
    }

    fjj(byte byte0)
    {
        this();
    }

    static dfp a(fjj fjj1)
    {
        return fjj1.e;
    }

    static dff b(fjj fjj1)
    {
        return fjj1.b;
    }

    static dfe c(fjj fjj1)
    {
        return fjj1.c;
    }

    static dph d(fjj fjj1)
    {
        return fjj1.d;
    }

    static fjr e(fjj fjj1)
    {
        return fjj1.a;
    }

    public final fjj a(dfe dfe)
    {
        c = dfe;
        return this;
    }

    public final fjj a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            e = dfp;
            return this;
        }
    }

    public final fjj a(fjr fjr)
    {
        a = fjr;
        return this;
    }

    public final fjq a()
    {
        if (a == null)
        {
            throw new IllegalStateException("signinActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
        }
        if (c == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (d == null)
        {
            d = new dph();
        }
        if (e == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fji(this, (byte)0);
        }
    }
}
