// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class esz
{

    private djb a;
    private dfp b;

    private esz()
    {
    }

    esz(byte byte0)
    {
        this();
    }

    static dfp a(esz esz1)
    {
        return esz1.b;
    }

    static djb b(esz esz1)
    {
        return esz1.a;
    }

    public final esz a(dfp dfp)
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

    public final esz a(djb djb)
    {
        a = djb;
        return this;
    }

    public final ets a()
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
            return new esy(this, (byte)0);
        }
    }
}
