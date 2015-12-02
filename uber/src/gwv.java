// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwv
{

    private gst a;

    private gwv()
    {
    }

    gwv(byte byte0)
    {
        this();
    }

    static gst a(gwv gwv1)
    {
        return gwv1.a;
    }

    public final gvn a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gwu(this, (byte)0);
        }
    }

    public final gwv a(gst gst)
    {
        a = gst;
        return this;
    }
}
