// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwx
{

    private gst a;

    private gwx()
    {
    }

    gwx(byte byte0)
    {
        this();
    }

    static gst a(gwx gwx1)
    {
        return gwx1.a;
    }

    public final gvu a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gww(this, (byte)0);
        }
    }

    public final gwx a(gst gst)
    {
        if (gst == null)
        {
            throw new NullPointerException("paymentModule");
        } else
        {
            a = gst;
            return this;
        }
    }
}
