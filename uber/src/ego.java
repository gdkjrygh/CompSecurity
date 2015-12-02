// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ego
{

    private djb a;
    private dfp b;

    private ego()
    {
    }

    ego(byte byte0)
    {
        this();
    }

    static dfp a(ego ego1)
    {
        return ego1.b;
    }

    static djb b(ego ego1)
    {
        return ego1.a;
    }

    public final ego a(dfp dfp)
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

    public final ego a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ehz a()
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
            return new egn(this, (byte)0);
        }
    }
}
