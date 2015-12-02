// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gig
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private gig()
    {
    }

    gig(byte byte0)
    {
        this();
    }

    static dfp a(gig gig1)
    {
        return gig1.d;
    }

    static dff b(gig gig1)
    {
        return gig1.a;
    }

    static dfe c(gig gig1)
    {
        return gig1.b;
    }

    static dph d(gig gig1)
    {
        return gig1.c;
    }

    public final gig a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final gig a(dfp dfp)
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

    public final gis a()
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
            return new gif(this, (byte)0);
        }
    }
}
