// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eov
{

    private dfe a;
    private dff b;
    private eqg c;
    private dph d;
    private dfp e;

    private eov()
    {
    }

    eov(byte byte0)
    {
        this();
    }

    static dfp a(eov eov1)
    {
        return eov1.e;
    }

    static dff b(eov eov1)
    {
        return eov1.b;
    }

    static dfe c(eov eov1)
    {
        return eov1.a;
    }

    static dph d(eov eov1)
    {
        return eov1.d;
    }

    static eqg e(eov eov1)
    {
        return eov1.c;
    }

    public final eov a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final eov a(dfp dfp)
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

    public final eov a(eqg eqg1)
    {
        c = eqg1;
        return this;
    }

    public final ept a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
        }
        if (c == null)
        {
            c = new eqg();
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
            return new eou(this, (byte)0);
        }
    }
}
