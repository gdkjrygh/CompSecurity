// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etf
{

    private djb a;
    private dfp b;

    private etf()
    {
    }

    etf(byte byte0)
    {
        this();
    }

    static dfp a(etf etf1)
    {
        return etf1.b;
    }

    static djb b(etf etf1)
    {
        return etf1.a;
    }

    public final etf a(dfp dfp)
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

    public final etf a(djb djb)
    {
        a = djb;
        return this;
    }

    public final etx a()
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
            return new ete(this, (byte)0);
        }
    }
}
