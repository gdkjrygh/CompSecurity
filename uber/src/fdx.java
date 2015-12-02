// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fdx
{

    private djb a;
    private dfp b;

    private fdx()
    {
    }

    fdx(byte byte0)
    {
        this();
    }

    static dfp a(fdx fdx1)
    {
        return fdx1.b;
    }

    static djb b(fdx fdx1)
    {
        return fdx1.a;
    }

    public final fdx a(dfp dfp)
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

    public final fdx a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fel a()
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
            return new fdw(this, (byte)0);
        }
    }
}
