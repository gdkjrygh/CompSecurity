// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gyr
{

    private gst a;
    private gyt b;

    private gyr()
    {
    }

    gyr(byte byte0)
    {
        this();
    }

    static gst a(gyr gyr1)
    {
        return gyr1.a;
    }

    static gyt b(gyr gyr1)
    {
        return gyr1.b;
    }

    public final gyr a(gst gst)
    {
        a = gst;
        return this;
    }

    public final gys a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        }
        if (b == null)
        {
            b = new gyt();
        }
        return new gyq(this, (byte)0);
    }
}
