// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class elt
{

    private djb a;
    private dfp b;

    private elt()
    {
    }

    elt(byte byte0)
    {
        this();
    }

    static dfp a(elt elt1)
    {
        return elt1.b;
    }

    static djb b(elt elt1)
    {
        return elt1.a;
    }

    public final elt a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            b = dfp;
            return this;
        }
    }

    public final elt a(djb djb)
    {
        a = djb;
        return this;
    }

    public final elw a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new els(this, (byte)0);
        }
    }
}
