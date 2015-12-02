// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dxy
{

    private djb a;
    private dfp b;

    private dxy()
    {
    }

    dxy(byte byte0)
    {
        this();
    }

    static dfp a(dxy dxy1)
    {
        return dxy1.b;
    }

    static djb b(dxy dxy1)
    {
        return dxy1.a;
    }

    public final dxy a(dfp dfp)
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

    public final dxy a(djb djb)
    {
        a = djb;
        return this;
    }

    public final dyb a()
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
            return new dxx(this, (byte)0);
        }
    }
}
