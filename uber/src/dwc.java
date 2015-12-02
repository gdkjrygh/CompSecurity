// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwc
{

    private djb a;
    private dfp b;

    private dwc()
    {
    }

    dwc(byte byte0)
    {
        this();
    }

    static dfp a(dwc dwc1)
    {
        return dwc1.b;
    }

    static djb b(dwc dwc1)
    {
        return dwc1.a;
    }

    public final dwc a(dfp dfp)
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

    public final dwc a(djb djb)
    {
        a = djb;
        return this;
    }

    public final dwe a()
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
            return new dwb(this, (byte)0);
        }
    }
}
