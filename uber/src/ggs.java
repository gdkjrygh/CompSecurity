// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggs
{

    private djb a;
    private dfp b;

    private ggs()
    {
    }

    ggs(byte byte0)
    {
        this();
    }

    static dfp a(ggs ggs1)
    {
        return ggs1.b;
    }

    static djb b(ggs ggs1)
    {
        return ggs1.a;
    }

    public final ggs a(dfp dfp)
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

    public final ggs a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ghf a()
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
            return new ggr(this, (byte)0);
        }
    }
}
