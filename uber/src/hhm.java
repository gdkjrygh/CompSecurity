// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hhm
{

    private hbt a;

    private hhm()
    {
    }

    hhm(byte byte0)
    {
        this();
    }

    static hbt a(hhm hhm1)
    {
        return hhm1.a;
    }

    public final hhm a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hie a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new hhl(this, (byte)0);
        }
    }
}
