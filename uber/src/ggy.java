// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggy
{

    private djb a;
    private fqp b;

    private ggy()
    {
    }

    ggy(byte byte0)
    {
        this();
    }

    static fqp a(ggy ggy1)
    {
        return ggy1.b;
    }

    static djb b(ggy ggy1)
    {
        return ggy1.a;
    }

    public final ggy a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ggy a(fqp fqp)
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

    public final ghu a()
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
            return new ggx(this, (byte)0);
        }
    }
}
