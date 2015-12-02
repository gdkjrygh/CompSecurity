// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fcj
{

    private djb a;
    private dfp b;

    private fcj()
    {
    }

    fcj(byte byte0)
    {
        this();
    }

    static dfp a(fcj fcj1)
    {
        return fcj1.b;
    }

    static djb b(fcj fcj1)
    {
        return fcj1.a;
    }

    public final fcj a(dfp dfp)
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

    public final fcj a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fdj a()
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
            return new fci(this, (byte)0);
        }
    }
}
