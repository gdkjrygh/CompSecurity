// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class exk
{

    private djb a;
    private dfp b;

    private exk()
    {
    }

    exk(byte byte0)
    {
        this();
    }

    static dfp a(exk exk1)
    {
        return exk1.b;
    }

    static djb b(exk exk1)
    {
        return exk1.a;
    }

    public final exk a(dfp dfp)
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

    public final exk a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eyb a()
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
            return new exj(this, (byte)0);
        }
    }
}
