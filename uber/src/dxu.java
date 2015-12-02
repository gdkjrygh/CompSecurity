// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dxu
{

    private djb a;
    private dfp b;

    private dxu()
    {
    }

    dxu(byte byte0)
    {
        this();
    }

    static dfp a(dxu dxu1)
    {
        return dxu1.b;
    }

    static djb b(dxu dxu1)
    {
        return dxu1.a;
    }

    public final dxj a()
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
            return new dxt(this, (byte)0);
        }
    }

    public final dxu a(dfp dfp)
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

    public final dxu a(djb djb)
    {
        a = djb;
        return this;
    }
}
