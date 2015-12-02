// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dxw
{

    private djb a;
    private dfp b;

    private dxw()
    {
    }

    dxw(byte byte0)
    {
        this();
    }

    static dfp a(dxw dxw1)
    {
        return dxw1.b;
    }

    static djb b(dxw dxw1)
    {
        return dxw1.a;
    }

    public final dxn a()
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
            return new dxv(this, (byte)0);
        }
    }

    public final dxw a(dfp dfp)
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

    public final dxw a(djb djb)
    {
        a = djb;
        return this;
    }
}
