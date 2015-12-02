// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggk
{

    private djb a;
    private fqp b;

    private ggk()
    {
    }

    ggk(byte byte0)
    {
        this();
    }

    static fqp a(ggk ggk1)
    {
        return ggk1.b;
    }

    static djb b(ggk ggk1)
    {
        return ggk1.a;
    }

    public final gfv a()
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
            return new ggj(this, (byte)0);
        }
    }

    public final ggk a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ggk a(fqp fqp)
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
}
