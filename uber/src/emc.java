// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emc
{

    private emq a;
    private dfe b;
    private dff c;
    private dph d;
    private dfp e;

    private emc()
    {
    }

    emc(byte byte0)
    {
        this();
    }

    static dfp a(emc emc1)
    {
        return emc1.e;
    }

    static dff b(emc emc1)
    {
        return emc1.c;
    }

    static dfe c(emc emc1)
    {
        return emc1.b;
    }

    static dph d(emc emc1)
    {
        return emc1.d;
    }

    static emq e(emc emc1)
    {
        return emc1.a;
    }

    public final emc a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final emc a(dfp dfp)
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

    public final emc a(emq emq)
    {
        a = emq;
        return this;
    }

    public final emp a()
    {
        if (a == null)
        {
            throw new IllegalStateException("passwordResetActivityModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (c == null)
        {
            c = new dff();
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
            return new emb(this, (byte)0);
        }
    }
}
