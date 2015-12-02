// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gxt
{

    private gst a;
    private gxo b;

    private gxt()
    {
    }

    gxt(byte byte0)
    {
        this();
    }

    static gst a(gxt gxt1)
    {
        return gxt1.a;
    }

    static gxo b(gxt gxt1)
    {
        return gxt1.b;
    }

    public final gxm a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("bankCardModule must be set");
        } else
        {
            return new gxs(this, (byte)0);
        }
    }

    public final gxt a(gst gst)
    {
        a = gst;
        return this;
    }

    public final gxt a(gxo gxo)
    {
        b = gxo;
        return this;
    }
}
