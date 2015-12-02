// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dya
{

    private djb a;
    private dfp b;

    private dya()
    {
    }

    dya(byte byte0)
    {
        this();
    }

    static dfp a(dya dya1)
    {
        return dya1.b;
    }

    static djb b(dya dya1)
    {
        return dya1.a;
    }

    public final dya a(dfp dfp)
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

    public final dya a(djb djb)
    {
        a = djb;
        return this;
    }

    public final dyd a()
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
            return new dxz(this, (byte)0);
        }
    }
}
