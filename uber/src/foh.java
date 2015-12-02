// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class foh
{

    private dff a;
    private dfe b;
    private for c;
    private dph d;
    private dfp e;

    private foh()
    {
    }

    foh(byte byte0)
    {
        this();
    }

    static dfp a(foh foh1)
    {
        return foh1.e;
    }

    static dff b(foh foh1)
    {
        return foh1.a;
    }

    static dfe c(foh foh1)
    {
        return foh1.b;
    }

    static dph d(foh foh1)
    {
        return foh1.d;
    }

    static for e(foh foh1)
    {
        return foh1.c;
    }

    public final foh a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final foh a(dfp dfp)
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

    public final fon a()
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
            c = new for();
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
            return new fog(this, (byte)0);
        }
    }
}
