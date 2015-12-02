// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gyd
{

    private gst a;

    private gyd()
    {
    }

    gyd(byte byte0)
    {
        this();
    }

    static gst a(gyd gyd1)
    {
        return gyd1.a;
    }

    public final gxv a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gyc(this, (byte)0);
        }
    }

    public final gyd a(gst gst)
    {
        a = gst;
        return this;
    }
}
