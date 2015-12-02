// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class doh
{

    private doj a;
    private dfp b;

    private doh()
    {
    }

    doh(byte byte0)
    {
        this();
    }

    static dfp a(doh doh1)
    {
        return doh1.b;
    }

    public final doh a(dfp dfp)
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

    public final doh a(doj doj)
    {
        a = doj;
        return this;
    }

    public final doi a()
    {
        if (a == null)
        {
            throw new IllegalStateException("processPushServiceModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new dog(this, (byte)0);
        }
    }
}
