// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exi
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private exi()
    {
    }

    exi(byte byte0)
    {
        this();
    }

    static dfp a(exi exi1)
    {
        return exi1.d;
    }

    static dff b(exi exi1)
    {
        return exi1.a;
    }

    static dfe c(exi exi1)
    {
        return exi1.b;
    }

    static dph d(exi exi1)
    {
        return exi1.c;
    }

    public final exi a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final exi a(dfp dfp)
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

    public final exz a()
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
            return new exh(this, (byte)0);
        }
    }
}
