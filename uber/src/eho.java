// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eho
{

    private djb a;
    private dfp b;

    private eho()
    {
    }

    eho(byte byte0)
    {
        this();
    }

    static dfp a(eho eho1)
    {
        return eho1.b;
    }

    static djb b(eho eho1)
    {
        return eho1.a;
    }

    public final eho a(dfp dfp)
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

    public final eho a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ejj a()
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
            return new ehn(this, (byte)0);
        }
    }
}
