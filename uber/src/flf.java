// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flf
{

    private djb a;
    private dfp b;

    private flf()
    {
    }

    flf(byte byte0)
    {
        this();
    }

    static dfp a(flf flf1)
    {
        return flf1.b;
    }

    static djb b(flf flf1)
    {
        return flf1.a;
    }

    public final flf a(dfp dfp)
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

    public final flf a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fmw a()
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
            return new fle(this, (byte)0);
        }
    }
}
