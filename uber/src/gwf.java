// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwf
{

    private gst a;

    private gwf()
    {
    }

    gwf(byte byte0)
    {
        this();
    }

    static gst a(gwf gwf1)
    {
        return gwf1.a;
    }

    public final gus a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gwe(this, (byte)0);
        }
    }

    public final gwf a(gst gst)
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
