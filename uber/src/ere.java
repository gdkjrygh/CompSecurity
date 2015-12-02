// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ere
{

    private djb a;
    private dfp b;

    private ere()
    {
    }

    ere(byte byte0)
    {
        this();
    }

    static dfp a(ere ere1)
    {
        return ere1.b;
    }

    static djb b(ere ere1)
    {
        return ere1.a;
    }

    public final eqy a()
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
            return new erd(this, (byte)0);
        }
    }

    public final ere a(dfp dfp)
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

    public final ere a(djb djb)
    {
        a = djb;
        return this;
    }
}
