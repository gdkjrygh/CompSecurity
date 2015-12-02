// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emi
{

    private djb a;
    private enb b;
    private emp c;

    private emi()
    {
    }

    emi(byte byte0)
    {
        this();
    }

    static emp a(emi emi1)
    {
        return emi1.c;
    }

    static djb b(emi emi1)
    {
        return emi1.a;
    }

    static enb c(emi emi1)
    {
        return emi1.b;
    }

    public final emi a(djb djb)
    {
        a = djb;
        return this;
    }

    public final emi a(emp emp)
    {
        if (emp == null)
        {
            throw new NullPointerException("passwordResetActivityComponent");
        } else
        {
            c = emp;
            return this;
        }
    }

    public final emi a(enb enb)
    {
        b = enb;
        return this;
    }

    public final ena a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("confirmTripsFragmentModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("passwordResetActivityComponent must be set");
        } else
        {
            return new emh(this, (byte)0);
        }
    }
}
