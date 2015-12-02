// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggu
{

    private djb a;
    private fqp b;

    private ggu()
    {
    }

    ggu(byte byte0)
    {
        this();
    }

    static fqp a(ggu ggu1)
    {
        return ggu1.b;
    }

    static djb b(ggu ggu1)
    {
        return ggu1.a;
    }

    public final ggu a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ggu a(fqp fqp)
    {
        if (fqp == null)
        {
            throw new NullPointerException("tripActivityComponent");
        } else
        {
            b = fqp;
            return this;
        }
    }

    public final ghj a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("tripActivityComponent must be set");
        } else
        {
            return new ggt(this, (byte)0);
        }
    }
}
