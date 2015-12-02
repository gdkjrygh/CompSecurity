// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwz
{

    private gst a;
    private gvp b;

    private gwz()
    {
    }

    gwz(byte byte0)
    {
        this();
    }

    static gst a(gwz gwz1)
    {
        return gwz1.a;
    }

    static gvp b(gwz gwz1)
    {
        return gwz1.b;
    }

    public final gvw a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        }
        if (b == null)
        {
            b = new gvp();
        }
        return new gwy(this, (byte)0);
    }

    public final gwz a(gst gst)
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

    public final gwz a(gvp gvp1)
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
