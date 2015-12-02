// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eoh
{

    private ens a;
    private djb b;
    private dfp c;

    private eoh()
    {
    }

    eoh(byte byte0)
    {
        this();
    }

    static dfp a(eoh eoh1)
    {
        return eoh1.c;
    }

    static djb b(eoh eoh1)
    {
        return eoh1.b;
    }

    static ens c(eoh eoh1)
    {
        return eoh1.a;
    }

    public final enr a()
    {
        if (a == null)
        {
            a = new ens();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new eog(this, (byte)0);
        }
    }

    public final eoh a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            c = dfp;
            return this;
        }
    }

    public final eoh a(djb djb)
    {
        b = djb;
        return this;
    }

    public final eoh a(ens ens1)
    {
        a = ens1;
        return this;
    }
}
