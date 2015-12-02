// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class egu
{

    private djb a;
    private dfp b;

    private egu()
    {
    }

    egu(byte byte0)
    {
        this();
    }

    static dfp a(egu egu1)
    {
        return egu1.b;
    }

    static djb b(egu egu1)
    {
        return egu1.a;
    }

    public final egu a(dfp dfp)
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

    public final egu a(djb djb)
    {
        a = djb;
        return this;
    }

    public final eik a()
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
            return new egt(this, (byte)0);
        }
    }
}
