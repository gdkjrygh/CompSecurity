// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggw
{

    private ghp a;
    private djb b;
    private fqp c;

    private ggw()
    {
    }

    ggw(byte byte0)
    {
        this();
    }

    static fqp a(ggw ggw1)
    {
        return ggw1.c;
    }

    static djb b(ggw ggw1)
    {
        return ggw1.b;
    }

    static ghp c(ggw ggw1)
    {
        return ggw1.a;
    }

    public final ggw a(djb djb)
    {
        b = djb;
        return this;
    }

    public final ggw a(fqp fqp)
    {
        if (fqp == null)
        {
            throw new NullPointerException("tripActivityComponent");
        } else
        {
            c = fqp;
            return this;
        }
    }

    public final gho a()
    {
        if (a == null)
        {
            a = new ghp();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("tripActivityComponent must be set");
        } else
        {
            return new ggv(this, (byte)0);
        }
    }
}
