// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flh
{

    private djb a;
    private dfp b;

    private flh()
    {
    }

    flh(byte byte0)
    {
        this();
    }

    static dfp a(flh flh1)
    {
        return flh1.b;
    }

    static djb b(flh flh1)
    {
        return flh1.a;
    }

    public final flh a(dfp dfp)
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

    public final flh a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fmy a()
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
            return new flg(this, (byte)0);
        }
    }
}
