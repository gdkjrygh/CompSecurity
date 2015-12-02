// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exy
{

    private djb a;
    private dfp b;

    private exy()
    {
    }

    exy(byte byte0)
    {
        this();
    }

    static dfp a(exy exy1)
    {
        return exy1.b;
    }

    static djb b(exy exy1)
    {
        return exy1.a;
    }

    public final exy a(dfp dfp)
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

    public final exy a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eyw a()
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
            return new exx(this, (byte)0);
        }
    }
}
