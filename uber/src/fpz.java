// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fpz
{

    private djb a;
    private frt b;
    private fto c;
    private fqp d;

    private fpz()
    {
    }

    fpz(byte byte0)
    {
        this();
    }

    static fqp a(fpz fpz1)
    {
        return fpz1.d;
    }

    static djb b(fpz fpz1)
    {
        return fpz1.a;
    }

    static frt c(fpz fpz1)
    {
        return fpz1.b;
    }

    static fto d(fpz fpz1)
    {
        return fpz1.c;
    }

    public final fpz a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fpz a(fqp fqp)
    {
        if (fqp == null)
        {
            throw new NullPointerException("tripActivityComponent");
        } else
        {
            d = fqp;
            return this;
        }
    }

    public final frs a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            b = new frt();
        }
        if (c == null)
        {
            c = new fto();
        }
        if (d == null)
        {
            throw new IllegalStateException("tripActivityComponent must be set");
        } else
        {
            return new fpy(this, (byte)0);
        }
    }
}
