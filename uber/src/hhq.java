// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hhq
{

    private hbt a;

    private hhq()
    {
    }

    hhq(byte byte0)
    {
        this();
    }

    static hbt a(hhq hhq1)
    {
        return hhq1.a;
    }

    public final hhq a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hin a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new hhp(this, (byte)0);
        }
    }
}
