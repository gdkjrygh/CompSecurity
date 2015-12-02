// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ehk
{

    private djb a;
    private dfp b;

    private ehk()
    {
    }

    ehk(byte byte0)
    {
        this();
    }

    static dfp a(ehk ehk1)
    {
        return ehk1.b;
    }

    static djb b(ehk ehk1)
    {
        return ehk1.a;
    }

    public final ehk a(dfp dfp)
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

    public final ehk a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ejc a()
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
            return new ehj(this, (byte)0);
        }
    }
}
