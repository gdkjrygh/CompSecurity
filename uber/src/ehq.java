// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ehq
{

    private djb a;
    private dfp b;

    private ehq()
    {
    }

    ehq(byte byte0)
    {
        this();
    }

    static dfp a(ehq ehq1)
    {
        return ehq1.b;
    }

    static djb b(ehq ehq1)
    {
        return ehq1.a;
    }

    public final ehq a(dfp dfp)
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

    public final ehq a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ejn a()
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
            return new ehp(this, (byte)0);
        }
    }
}
