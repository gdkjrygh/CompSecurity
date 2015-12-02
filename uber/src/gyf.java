// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gyf
{

    private gst a;

    private gyf()
    {
    }

    gyf(byte byte0)
    {
        this();
    }

    static gst a(gyf gyf1)
    {
        return gyf1.a;
    }

    public final gya a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gye(this, (byte)0);
        }
    }

    public final gyf a(gst gst)
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
