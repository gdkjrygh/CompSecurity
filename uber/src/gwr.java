// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwr
{

    private gst a;

    private gwr()
    {
    }

    gwr(byte byte0)
    {
        this();
    }

    static gst a(gwr gwr1)
    {
        return gwr1.a;
    }

    public final gvj a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gwq(this, (byte)0);
        }
    }

    public final gwr a(gst gst)
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
