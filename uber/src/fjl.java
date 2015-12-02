// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fjl
{

    private djb a;
    private fjq b;

    private fjl()
    {
    }

    fjl(byte byte0)
    {
        this();
    }

    static fjq a(fjl fjl1)
    {
        return fjl1.b;
    }

    static djb b(fjl fjl1)
    {
        return fjl1.a;
    }

    public final fjl a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fjl a(fjq fjq)
    {
        if (fjq == null)
        {
            throw new NullPointerException("signInActivityComponent");
        } else
        {
            b = fjq;
            return this;
        }
    }

    public final fjx a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("signInActivityComponent must be set");
        } else
        {
            return new fjk(this, (byte)0);
        }
    }
}
