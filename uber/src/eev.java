// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eev
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private eev()
    {
    }

    eev(byte byte0)
    {
        this();
    }

    static dfp a(eev eev1)
    {
        return eev1.d;
    }

    static dff b(eev eev1)
    {
        return eev1.a;
    }

    static dfe c(eev eev1)
    {
        return eev1.b;
    }

    static dph d(eev eev1)
    {
        return eev1.c;
    }

    public final eev a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final eev a(dfp dfp)
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

    public final efg a()
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
            return new eeu(this, (byte)0);
        }
    }
}
