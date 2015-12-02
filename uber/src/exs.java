// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exs
{

    private djb a;
    private dfp b;

    private exs()
    {
    }

    exs(byte byte0)
    {
        this();
    }

    static dfp a(exs exs1)
    {
        return exs1.b;
    }

    static djb b(exs exs1)
    {
        return exs1.a;
    }

    public final exs a(dfp dfp)
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

    public final exs a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eyl a()
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
            return new exr(this, (byte)0);
        }
    }
}
