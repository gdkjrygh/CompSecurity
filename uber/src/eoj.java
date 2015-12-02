// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eoj
{

    private eny a;
    private djb b;
    private dfp c;

    private eoj()
    {
    }

    eoj(byte byte0)
    {
        this();
    }

    static dfp a(eoj eoj1)
    {
        return eoj1.c;
    }

    static djb b(eoj eoj1)
    {
        return eoj1.b;
    }

    static eny c(eoj eoj1)
    {
        return eoj1.a;
    }

    public final enx a()
    {
        if (a == null)
        {
            a = new eny();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (c == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new eoi(this, (byte)0);
        }
    }

    public final eoj a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            c = dfp;
            return this;
        }
    }

    public final eoj a(djb djb)
    {
        b = djb;
        return this;
    }

    public final eoj a(eny eny1)
    {
        a = eny1;
        return this;
    }
}
