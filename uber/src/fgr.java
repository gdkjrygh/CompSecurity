// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgr
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fgr()
    {
    }

    fgr(byte byte0)
    {
        this();
    }

    static dfp a(fgr fgr1)
    {
        return fgr1.d;
    }

    static dff b(fgr fgr1)
    {
        return fgr1.a;
    }

    static dfe c(fgr fgr1)
    {
        return fgr1.b;
    }

    static dph d(fgr fgr1)
    {
        return fgr1.c;
    }

    public final fgr a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fgr a(dfp dfp)
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

    public final fgz a()
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
            return new fgq(this, (byte)0);
        }
    }
}
