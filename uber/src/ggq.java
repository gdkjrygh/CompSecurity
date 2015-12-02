// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggq
{

    private djb a;
    private dfp b;

    private ggq()
    {
    }

    ggq(byte byte0)
    {
        this();
    }

    static dfp a(ggq ggq1)
    {
        return ggq1.b;
    }

    static djb b(ggq ggq1)
    {
        return ggq1.a;
    }

    public final ggq a(dfp dfp)
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

    public final ggq a(djb djb)
    {
        a = djb;
        return this;
    }

    public final gha a()
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
            return new ggp(this, (byte)0);
        }
    }
}
