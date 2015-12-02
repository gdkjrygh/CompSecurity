// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fkn
{

    private djb a;
    private dfp b;

    private fkn()
    {
    }

    fkn(byte byte0)
    {
        this();
    }

    static dfp a(fkn fkn1)
    {
        return fkn1.b;
    }

    static djb b(fkn fkn1)
    {
        return fkn1.a;
    }

    public final fkn a(dfp dfp)
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

    public final fkn a(djb djb)
    {
        a = djb;
        return this;
    }

    public final flo a()
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
            return new fkm(this, (byte)0);
        }
    }
}
