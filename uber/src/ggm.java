// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggm
{

    private djb a;
    private dfp b;

    private ggm()
    {
    }

    ggm(byte byte0)
    {
        this();
    }

    static dfp a(ggm ggm1)
    {
        return ggm1.b;
    }

    static djb b(ggm ggm1)
    {
        return ggm1.a;
    }

    public final gfz a()
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
            return new ggl(this, (byte)0);
        }
    }

    public final ggm a(dfp dfp)
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

    public final ggm a(djb djb)
    {
        a = djb;
        return this;
    }
}
