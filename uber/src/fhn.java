// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fhn
{

    private djb a;
    private dfp b;

    private fhn()
    {
    }

    fhn(byte byte0)
    {
        this();
    }

    static dfp a(fhn fhn1)
    {
        return fhn1.b;
    }

    static djb b(fhn fhn1)
    {
        return fhn1.a;
    }

    public final fhn a(dfp dfp)
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

    public final fhn a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fhy a()
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
            return new fhm(this, (byte)0);
        }
    }
}
