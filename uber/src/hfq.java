// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hfq
{

    private hbt a;

    private hfq()
    {
    }

    hfq(byte byte0)
    {
        this();
    }

    static hbt a(hfq hfq1)
    {
        return hfq1.a;
    }

    public final hfq a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hgq a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new hfp(this, (byte)0);
        }
    }
}
