// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dyl
{

    private dyq a;
    private dfp b;

    private dyl()
    {
    }

    dyl(byte byte0)
    {
        this();
    }

    static dyq a(dyl dyl1)
    {
        return dyl1.a;
    }

    static dfp b(dyl dyl1)
    {
        return dyl1.b;
    }

    public final dyl a(dfp dfp)
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

    public final dyl a(dyq dyq)
    {
        a = dyq;
        return this;
    }

    public final dyp a()
    {
        if (a == null)
        {
            throw new IllegalStateException("uploadContactsIntentServiceModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new dyk(this, (byte)0);
        }
    }
}
