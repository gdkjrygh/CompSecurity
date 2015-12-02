// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class erx
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private erx()
    {
    }

    erx(byte byte0)
    {
        this();
    }

    static dfp a(erx erx1)
    {
        return erx1.d;
    }

    static dff b(erx erx1)
    {
        return erx1.a;
    }

    static dfe c(erx erx1)
    {
        return erx1.b;
    }

    static dph d(erx erx1)
    {
        return erx1.c;
    }

    public final erx a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final erx a(dfp dfp)
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

    public final esb a()
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
            return new erw(this, (byte)0);
        }
    }
}
