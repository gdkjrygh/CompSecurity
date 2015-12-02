// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ffa
{

    private djb a;
    private dfp b;

    private ffa()
    {
    }

    ffa(byte byte0)
    {
        this();
    }

    static dfp a(ffa ffa1)
    {
        return ffa1.b;
    }

    static djb b(ffa ffa1)
    {
        return ffa1.a;
    }

    public final fex a()
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
            return new fez(this, (byte)0);
        }
    }

    public final ffa a(dfp dfp)
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

    public final ffa a(djb djb)
    {
        a = djb;
        return this;
    }
}
