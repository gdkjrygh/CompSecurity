// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exw
{

    private djb a;
    private dfp b;

    private exw()
    {
    }

    exw(byte byte0)
    {
        this();
    }

    static dfp a(exw exw1)
    {
        return exw1.b;
    }

    static djb b(exw exw1)
    {
        return exw1.a;
    }

    public final exw a(dfp dfp)
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

    public final exw a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eyt a()
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
            return new exv(this, (byte)0);
        }
    }
}
