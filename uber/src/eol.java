// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eol
{

    private djb a;
    private epi b;

    private eol()
    {
    }

    eol(byte byte0)
    {
        this();
    }

    static epi a(eol eol1)
    {
        return eol1.b;
    }

    static djb b(eol eol1)
    {
        return eol1.a;
    }

    public final eol a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eol a(epi epi)
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

    public final epd a()
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
            return new eok(this, (byte)0);
        }
    }
}
