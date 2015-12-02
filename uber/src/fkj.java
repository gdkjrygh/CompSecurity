// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fkj
{

    private dfe a;
    private dff b;
    private eqg c;
    private dph d;
    private dfp e;

    private fkj()
    {
    }

    fkj(byte byte0)
    {
        this();
    }

    static dfp a(fkj fkj1)
    {
        return fkj1.e;
    }

    static dff b(fkj fkj1)
    {
        return fkj1.b;
    }

    static dfe c(fkj fkj1)
    {
        return fkj1.a;
    }

    static dph d(fkj fkj1)
    {
        return fkj1.d;
    }

    public final fkg a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
        }
        if (c == null)
        {
            c = new eqg();
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
            return new fki(this, (byte)0);
        }
    }

    public final fkj a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final fkj a(dfp dfp)
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
}
