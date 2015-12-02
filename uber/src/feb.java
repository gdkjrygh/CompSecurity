// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class feb
{

    private djb a;
    private dfp b;

    private feb()
    {
    }

    feb(byte byte0)
    {
        this();
    }

    static dfp a(feb feb1)
    {
        return feb1.b;
    }

    static djb b(feb feb1)
    {
        return feb1.a;
    }

    public final feb a(dfp dfp)
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

    public final feb a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fet a()
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
            return new fea(this, (byte)0);
        }
    }
}
