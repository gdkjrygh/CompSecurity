// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eox
{

    private djb a;
    private dfp b;

    private eox()
    {
    }

    eox(byte byte0)
    {
        this();
    }

    static dfp a(eox eox1)
    {
        return eox1.b;
    }

    static djb b(eox eox1)
    {
        return eox1.a;
    }

    public final eox a(dfp dfp)
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

    public final eox a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eqd a()
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
            return new eow(this, (byte)0);
        }
    }
}
