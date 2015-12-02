// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fkx
{

    private djb a;
    private dfp b;

    private fkx()
    {
    }

    fkx(byte byte0)
    {
        this();
    }

    static dfp a(fkx fkx1)
    {
        return fkx1.b;
    }

    static djb b(fkx fkx1)
    {
        return fkx1.a;
    }

    public final fkx a(dfp dfp)
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

    public final fkx a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fml a()
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
            return new fkw(this, (byte)0);
        }
    }
}
