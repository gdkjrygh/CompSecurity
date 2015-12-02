// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ecu
{

    private djb a;
    private dfp b;

    private ecu()
    {
    }

    ecu(byte byte0)
    {
        this();
    }

    static dfp a(ecu ecu1)
    {
        return ecu1.b;
    }

    static djb b(ecu ecu1)
    {
        return ecu1.a;
    }

    public final ecu a(dfp dfp)
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

    public final ecu a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ecw a()
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
            return new ect(this, (byte)0);
        }
    }
}
