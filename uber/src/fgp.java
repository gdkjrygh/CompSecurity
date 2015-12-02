// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgp
{

    private djb a;
    private dfp b;

    private fgp()
    {
    }

    fgp(byte byte0)
    {
        this();
    }

    static dfp a(fgp fgp1)
    {
        return fgp1.b;
    }

    static djb b(fgp fgp1)
    {
        return fgp1.a;
    }

    public final fgp a(dfp dfp)
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

    public final fgp a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fgw a()
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
            return new fgo(this, (byte)0);
        }
    }
}
