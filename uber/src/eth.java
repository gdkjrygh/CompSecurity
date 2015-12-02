// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eth
{

    private djb a;
    private eni b;

    private eth()
    {
    }

    eth(byte byte0)
    {
        this();
    }

    static eni a(eth eth1)
    {
        return eth1.b;
    }

    static djb b(eth eth1)
    {
        return eth1.a;
    }

    public final eth a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eth a(eni eni)
    {
        if (eni == null)
        {
            throw new NullPointerException("addPaymentActivityComponent");
        } else
        {
            b = eni;
            return this;
        }
    }

    public final eub a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("addPaymentActivityComponent must be set");
        } else
        {
            return new etg(this, (byte)0);
        }
    }
}
