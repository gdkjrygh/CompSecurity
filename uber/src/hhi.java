// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hhi
{

    private hbt a;

    private hhi()
    {
    }

    hhi(byte byte0)
    {
        this();
    }

    static hbt a(hhi hhi1)
    {
        return hhi1.a;
    }

    public final hhi a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hhy a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new hhh(this, (byte)0);
        }
    }
}
