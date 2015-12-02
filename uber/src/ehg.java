// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ehg
{

    private djb a;
    private dfp b;

    private ehg()
    {
    }

    ehg(byte byte0)
    {
        this();
    }

    static dfp a(ehg ehg1)
    {
        return ehg1.b;
    }

    static djb b(ehg ehg1)
    {
        return ehg1.a;
    }

    public final ehg a(dfp dfp)
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

    public final ehg a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eix a()
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
            return new ehf(this, (byte)0);
        }
    }
}
