// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwb
{

    private gst a;
    private gvp b;

    private gwb()
    {
    }

    gwb(byte byte0)
    {
        this();
    }

    static gst a(gwb gwb1)
    {
        return gwb1.a;
    }

    static gvp b(gwb gwb1)
    {
        return gwb1.b;
    }

    public final guo a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        }
        if (b == null)
        {
            b = new gvp();
        }
        return new gwa(this, (byte)0);
    }

    public final gwb a(gst gst)
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

    public final gwb a(gvp gvp1)
    {
        if (gvp1 == null)
        {
            throw new NullPointerException("airtelModule");
        } else
        {
            b = gvp1;
            return this;
        }
    }
}
