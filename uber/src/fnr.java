// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnr
{

    private djb a;
    private dfp b;

    private fnr()
    {
    }

    fnr(byte byte0)
    {
        this();
    }

    static dfp a(fnr fnr1)
    {
        return fnr1.b;
    }

    static djb b(fnr fnr1)
    {
        return fnr1.a;
    }

    public final fnr a(dfp dfp)
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

    public final fnr a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fny a()
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
            return new fnq(this, (byte)0);
        }
    }
}
