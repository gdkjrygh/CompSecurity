// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etd
{

    private djb a;
    private dfp b;

    private etd()
    {
    }

    etd(byte byte0)
    {
        this();
    }

    static dfp a(etd etd1)
    {
        return etd1.b;
    }

    static djb b(etd etd1)
    {
        return etd1.a;
    }

    public final etd a(dfp dfp)
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

    public final etd a(djb djb)
    {
        a = djb;
        return this;
    }

    public final etv a()
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
            return new etc(this, (byte)0);
        }
    }
}
