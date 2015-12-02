// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnj
{

    private fnl a;
    private djb b;
    private dfp c;

    private fnj()
    {
    }

    fnj(byte byte0)
    {
        this();
    }

    static dfp a(fnj fnj1)
    {
        return fnj1.c;
    }

    static djb b(fnj fnj1)
    {
        return fnj1.b;
    }

    static fnl c(fnj fnj1)
    {
        return fnj1.a;
    }

    public final fnj a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            c = dfp;
            return this;
        }
    }

    public final fnj a(djb djb)
    {
        b = djb;
        return this;
    }

    public final fnk a()
    {
        if (a == null)
        {
            a = new fnl();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fni(this, (byte)0);
        }
    }
}
