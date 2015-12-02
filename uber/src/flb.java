// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flb
{

    private djb a;
    private dfp b;

    private flb()
    {
    }

    flb(byte byte0)
    {
        this();
    }

    static dfp a(flb flb1)
    {
        return flb1.b;
    }

    static djb b(flb flb1)
    {
        return flb1.a;
    }

    public final flb a(dfp dfp)
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

    public final flb a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fmp a()
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
            return new fla(this, (byte)0);
        }
    }
}
