// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fhp
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fhp()
    {
    }

    fhp(byte byte0)
    {
        this();
    }

    static dfp a(fhp fhp1)
    {
        return fhp1.d;
    }

    static dff b(fhp fhp1)
    {
        return fhp1.a;
    }

    static dfe c(fhp fhp1)
    {
        return fhp1.b;
    }

    static dph d(fhp fhp1)
    {
        return fhp1.c;
    }

    public final fhp a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fhp a(dfp dfp)
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

    public final fia a()
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
            return new fho(this, (byte)0);
        }
    }
}
