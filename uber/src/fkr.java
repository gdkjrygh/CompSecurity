// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fkr
{

    private djb a;
    private fls b;

    private fkr()
    {
    }

    fkr(byte byte0)
    {
        this();
    }

    static fls a(fkr fkr1)
    {
        return fkr1.b;
    }

    static djb b(fkr fkr1)
    {
        return fkr1.a;
    }

    public final fkr a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fkr a(fls fls)
    {
        if (fls == null)
        {
            throw new NullPointerException("signupActivityComponent");
        } else
        {
            b = fls;
            return this;
        }
    }

    public final fmb a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("signupActivityComponent must be set");
        } else
        {
            return new fkq(this, (byte)0);
        }
    }
}
