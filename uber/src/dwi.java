// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwi
{

    private dff a;
    private eqg b;
    private dfe c;
    private dph d;
    private dfp e;

    private dwi()
    {
    }

    dwi(byte byte0)
    {
        this();
    }

    static dfp a(dwi dwi1)
    {
        return dwi1.e;
    }

    static dff b(dwi dwi1)
    {
        return dwi1.a;
    }

    static dfe c(dwi dwi1)
    {
        return dwi1.c;
    }

    static dph d(dwi dwi1)
    {
        return dwi1.d;
    }

    static eqg e(dwi dwi1)
    {
        return dwi1.b;
    }

    public final dwi a(dfe dfe)
    {
        c = dfe;
        return this;
    }

    public final dwi a(dfp dfp)
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

    public final dwi a(eqg eqg1)
    {
        b = eqg1;
        return this;
    }

    public final dwn a()
    {
        if (a == null)
        {
            a = new dff();
        }
        if (b == null)
        {
            b = new eqg();
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
            return new dwh(this, (byte)0);
        }
    }
}
