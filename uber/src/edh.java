// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class edh
{

    private dff a;
    private dfe b;
    private ecz c;
    private dph d;
    private dfp e;

    private edh()
    {
    }

    edh(byte byte0)
    {
        this();
    }

    static dfp a(edh edh1)
    {
        return edh1.e;
    }

    static dff b(edh edh1)
    {
        return edh1.a;
    }

    static dfe c(edh edh1)
    {
        return edh1.b;
    }

    static dph d(edh edh1)
    {
        return edh1.d;
    }

    static ecz e(edh edh1)
    {
        return edh1.c;
    }

    public final ecy a()
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
            throw new IllegalStateException("codingChallengeActivityModule must be set");
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
            return new edg(this, (byte)0);
        }
    }

    public final edh a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final edh a(dfp dfp)
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

    public final edh a(ecz ecz)
    {
        c = ecz;
        return this;
    }
}
