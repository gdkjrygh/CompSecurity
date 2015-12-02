// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ehm
{

    private djb a;
    private dfp b;

    private ehm()
    {
    }

    ehm(byte byte0)
    {
        this();
    }

    static dfp a(ehm ehm1)
    {
        return ehm1.b;
    }

    static djb b(ehm ehm1)
    {
        return ehm1.a;
    }

    public final ehm a(dfp dfp)
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

    public final ehm a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ejh a()
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
            return new ehl(this, (byte)0);
        }
    }
}
