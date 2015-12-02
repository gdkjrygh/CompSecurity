// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gii
{

    private djb a;
    private dfp b;

    private gii()
    {
    }

    gii(byte byte0)
    {
        this();
    }

    static dfp a(gii gii1)
    {
        return gii1.b;
    }

    static djb b(gii gii1)
    {
        return gii1.a;
    }

    public final gii a(dfp dfp)
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

    public final gii a(djb djb)
    {
        a = djb;
        return this;
    }

    public final giv a()
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
            return new gih(this, (byte)0);
        }
    }
}
