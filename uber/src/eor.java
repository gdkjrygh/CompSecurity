// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eor
{

    private djb a;
    private epi b;

    private eor()
    {
    }

    eor(byte byte0)
    {
        this();
    }

    static epi a(eor eor1)
    {
        return eor1.b;
    }

    static djb b(eor eor1)
    {
        return eor1.a;
    }

    public final eor a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eor a(epi epi)
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

    public final epm a()
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
            return new eoq(this, (byte)0);
        }
    }
}
