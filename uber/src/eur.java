// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eur
{

    private djb a;
    private dfp b;

    private eur()
    {
    }

    eur(byte byte0)
    {
        this();
    }

    static dfp a(eur eur1)
    {
        return eur1.b;
    }

    static djb b(eur eur1)
    {
        return eur1.a;
    }

    public final eur a(dfp dfp)
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

    public final eur a(djb djb)
    {
        a = djb;
        return this;
    }

    public final euw a()
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
            return new euq(this, (byte)0);
        }
    }
}
