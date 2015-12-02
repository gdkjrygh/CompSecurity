// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class erz
{

    private djb a;
    private dfp b;

    private erz()
    {
    }

    erz(byte byte0)
    {
        this();
    }

    static dfp a(erz erz1)
    {
        return erz1.b;
    }

    static djb b(erz erz1)
    {
        return erz1.a;
    }

    public final erz a(dfp dfp)
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

    public final erz a(djb djb)
    {
        a = djb;
        return this;
    }

    public final esd a()
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
            return new ery(this, (byte)0);
        }
    }
}
