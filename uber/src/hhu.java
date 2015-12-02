// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hhu
{

    private hbt a;

    private hhu()
    {
    }

    hhu(byte byte0)
    {
        this();
    }

    static hbt a(hhu hhu1)
    {
        return hhu1.a;
    }

    public final hhu a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hit a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new hht(this, (byte)0);
        }
    }
}
