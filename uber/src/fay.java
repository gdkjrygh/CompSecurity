// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fay
{

    private djb a;
    private dfp b;

    private fay()
    {
    }

    fay(byte byte0)
    {
        this();
    }

    static dfp a(fay fay1)
    {
        return fay1.b;
    }

    static djb b(fay fay1)
    {
        return fay1.a;
    }

    public final fav a()
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
            return new fax(this, (byte)0);
        }
    }

    public final fay a(dfp dfp)
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

    public final fay a(djb djb)
    {
        a = djb;
        return this;
    }
}
