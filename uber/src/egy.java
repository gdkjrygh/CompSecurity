// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class egy
{

    private djb a;
    private dfp b;

    private egy()
    {
    }

    egy(byte byte0)
    {
        this();
    }

    static dfp a(egy egy1)
    {
        return egy1.b;
    }

    static djb b(egy egy1)
    {
        return egy1.a;
    }

    public final egy a(dfp dfp)
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

    public final egy a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eio a()
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
            return new egx(this, (byte)0);
        }
    }
}
