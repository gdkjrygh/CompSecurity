// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fcf
{

    private djb a;
    private dfp b;

    private fcf()
    {
    }

    fcf(byte byte0)
    {
        this();
    }

    static dfp a(fcf fcf1)
    {
        return fcf1.b;
    }

    static djb b(fcf fcf1)
    {
        return fcf1.a;
    }

    public final fcf a(dfp dfp)
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

    public final fcf a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fcz a()
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
            return new fce(this, (byte)0);
        }
    }
}
