// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exm
{

    private djb a;
    private dfp b;

    private exm()
    {
    }

    exm(byte byte0)
    {
        this();
    }

    static dfp a(exm exm1)
    {
        return exm1.b;
    }

    static djb b(exm exm1)
    {
        return exm1.a;
    }

    public final exm a(dfp dfp)
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

    public final exm a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eye a()
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
            return new exl(this, (byte)0);
        }
    }
}
