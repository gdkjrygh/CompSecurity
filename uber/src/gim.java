// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gim
{

    private djb a;
    private dfp b;

    private gim()
    {
    }

    gim(byte byte0)
    {
        this();
    }

    static dfp a(gim gim1)
    {
        return gim1.b;
    }

    static djb b(gim gim1)
    {
        return gim1.a;
    }

    public final gim a(dfp dfp)
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

    public final gim a(djb djb)
    {
        a = djb;
        return this;
    }

    public final gjb a()
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
            return new gil(this, (byte)0);
        }
    }
}
