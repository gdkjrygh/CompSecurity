// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gze
{

    private gst a;

    private gze()
    {
    }

    gze(byte byte0)
    {
        this();
    }

    static gst a(gze gze1)
    {
        return gze1.a;
    }

    public final gze a(gst gst)
    {
        a = gst;
        return this;
    }

    public final gzj a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gzd(this, (byte)0);
        }
    }
}
