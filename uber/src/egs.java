// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class egs
{

    private eig a;
    private dfp b;

    private egs()
    {
    }

    egs(byte byte0)
    {
        this();
    }

    static dfp a(egs egs1)
    {
        return egs1.b;
    }

    static eig b(egs egs1)
    {
        return egs1.a;
    }

    public final egs a(dfp dfp)
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

    public final egs a(eig eig1)
    {
        if (eig1 == null)
        {
            throw new NullPointerException("musicControlChannelServiceModule");
        } else
        {
            a = eig1;
            return this;
        }
    }

    public final eif a()
    {
        if (a == null)
        {
            a = new eig();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new egr(this, (byte)0);
        }
    }
}
