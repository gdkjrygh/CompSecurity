// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class heq
{

    private hbt a;

    private heq()
    {
    }

    heq(byte byte0)
    {
        this();
    }

    static hbt a(heq heq1)
    {
        return heq1.a;
    }

    public final heq a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hev a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new hep(this, (byte)0);
        }
    }
}
