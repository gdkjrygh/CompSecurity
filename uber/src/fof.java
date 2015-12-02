// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fof
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fof()
    {
    }

    fof(byte byte0)
    {
        this();
    }

    static dfp a(fof fof1)
    {
        return fof1.d;
    }

    static dff b(fof fof1)
    {
        return fof1.a;
    }

    static dfe c(fof fof1)
    {
        return fof1.b;
    }

    static dph d(fof fof1)
    {
        return fof1.c;
    }

    public final fof a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fof a(dfp dfp)
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

    public final fop a()
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
            return new foe(this, (byte)0);
        }
    }
}
