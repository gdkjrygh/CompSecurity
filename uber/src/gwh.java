// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwh
{

    private gst a;
    private gvp b;

    private gwh()
    {
    }

    gwh(byte byte0)
    {
        this();
    }

    static gst a(gwh gwh1)
    {
        return gwh1.a;
    }

    static gvp b(gwh gwh1)
    {
        return gwh1.b;
    }

    public final guu a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        }
        if (b == null)
        {
            b = new gvp();
        }
        return new gwg(this, (byte)0);
    }

    public final gwh a(gst gst)
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

    public final gwh a(gvp gvp1)
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
