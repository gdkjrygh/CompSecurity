// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dzn
{

    private dff a;
    private dfe b;
    private dzp c;
    private dph d;
    private dfp e;

    private dzn()
    {
    }

    dzn(byte byte0)
    {
        this();
    }

    static dfp a(dzn dzn1)
    {
        return dzn1.e;
    }

    static dff b(dzn dzn1)
    {
        return dzn1.a;
    }

    static dfe c(dzn dzn1)
    {
        return dzn1.b;
    }

    static dph d(dzn dzn1)
    {
        return dzn1.d;
    }

    static dzp e(dzn dzn1)
    {
        return dzn1.c;
    }

    public final dzn a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final dzn a(dfp dfp)
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

    public final dzo a()
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
            c = new dzp();
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
            return new dzm(this, (byte)0);
        }
    }
}
