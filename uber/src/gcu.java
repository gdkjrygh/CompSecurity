// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gcu
{

    private djb a;
    private dfp b;

    private gcu()
    {
    }

    gcu(byte byte0)
    {
        this();
    }

    static dfp a(gcu gcu1)
    {
        return gcu1.b;
    }

    static djb b(gcu gcu1)
    {
        return gcu1.a;
    }

    public final gcu a(dfp dfp)
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

    public final gcu a(djb djb)
    {
        a = djb;
        return this;
    }

    public final gcy a()
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
            return new gct(this, (byte)0);
        }
    }
}
