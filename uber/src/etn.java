// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etn
{

    private djb a;
    private epi b;

    private etn()
    {
    }

    etn(byte byte0)
    {
        this();
    }

    static epi a(etn etn1)
    {
        return etn1.b;
    }

    static djb b(etn etn1)
    {
        return etn1.a;
    }

    public final etn a(djb djb)
    {
        a = djb;
        return this;
    }

    public final etn a(epi epi)
    {
        if (epi == null)
        {
            throw new NullPointerException("editPaymentProfileActivityComponent");
        } else
        {
            b = epi;
            return this;
        }
    }

    public final euj a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("editPaymentProfileActivityComponent must be set");
        } else
        {
            return new etm(this, (byte)0);
        }
    }
}
