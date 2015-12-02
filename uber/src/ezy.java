// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ezy
{

    private djb a;
    private dfp b;

    private ezy()
    {
    }

    ezy(byte byte0)
    {
        this();
    }

    static dfp a(ezy ezy1)
    {
        return ezy1.b;
    }

    static djb b(ezy ezy1)
    {
        return ezy1.a;
    }

    public final ezy a(dfp dfp)
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

    public final ezy a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fae a()
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
            return new ezx(this, (byte)0);
        }
    }
}
