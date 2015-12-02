// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ear
{

    private djb a;
    private dfp b;

    private ear()
    {
    }

    ear(byte byte0)
    {
        this();
    }

    static dfp a(ear ear1)
    {
        return ear1.b;
    }

    static djb b(ear ear1)
    {
        return ear1.a;
    }

    public final ear a(dfp dfp)
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

    public final ear a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eaw a()
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
            return new eaq(this, (byte)0);
        }
    }
}
