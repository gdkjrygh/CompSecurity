// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class heu
{

    private hbt a;

    private heu()
    {
    }

    heu(byte byte0)
    {
        this();
    }

    static hbt a(heu heu1)
    {
        return heu1.a;
    }

    public final heu a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hfb a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new het(this, (byte)0);
        }
    }
}
