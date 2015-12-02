// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class giq
{

    private djb a;
    private dfp b;

    private giq()
    {
    }

    giq(byte byte0)
    {
        this();
    }

    static dfp a(giq giq1)
    {
        return giq1.b;
    }

    static djb b(giq giq1)
    {
        return giq1.a;
    }

    public final giq a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            b = dfp;
            return this;
        }
    }

    public final giq a(djb djb)
    {
        a = djb;
        return this;
    }

    public final gji a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new gip(this, (byte)0);
        }
    }
}
