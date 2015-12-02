// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hfe
{

    private hbt a;

    private hfe()
    {
    }

    hfe(byte byte0)
    {
        this();
    }

    static hbt a(hfe hfe1)
    {
        return hfe1.a;
    }

    public final hfe a(hbt hbt)
    {
        a = hbt;
        return this;
    }

    public final hfr a()
    {
        if (a == null)
        {
            throw new IllegalStateException("rdsModule must be set");
        } else
        {
            return new hfd(this, (byte)0);
        }
    }
}
