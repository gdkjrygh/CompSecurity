// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class evd
{

    private djb a;
    private dfp b;

    private evd()
    {
    }

    evd(byte byte0)
    {
        this();
    }

    static dfp a(evd evd1)
    {
        return evd1.b;
    }

    static djb b(evd evd1)
    {
        return evd1.a;
    }

    public final evd a(dfp dfp)
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

    public final evd a(djb djb)
    {
        a = djb;
        return this;
    }

    public final evi a()
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
            return new evc(this, (byte)0);
        }
    }
}
