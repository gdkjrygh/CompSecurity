// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwp
{

    private gst a;

    private gwp()
    {
    }

    gwp(byte byte0)
    {
        this();
    }

    static gst a(gwp gwp1)
    {
        return gwp1.a;
    }

    public final gvg a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gwo(this, (byte)0);
        }
    }

    public final gwp a(gst gst)
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
