// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ehe
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private ehe()
    {
    }

    ehe(byte byte0)
    {
        this();
    }

    static dfp a(ehe ehe1)
    {
        return ehe1.d;
    }

    static dff b(ehe ehe1)
    {
        return ehe1.a;
    }

    static dfe c(ehe ehe1)
    {
        return ehe1.b;
    }

    static dph d(ehe ehe1)
    {
        return ehe1.c;
    }

    public final ehe a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final ehe a(dfp dfp)
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

    public final eiw a()
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
            return new ehd(this, (byte)0);
        }
    }
}
