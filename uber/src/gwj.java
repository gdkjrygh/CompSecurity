// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwj
{

    private gst a;
    private gvp b;

    private gwj()
    {
    }

    gwj(byte byte0)
    {
        this();
    }

    static gst a(gwj gwj1)
    {
        return gwj1.a;
    }

    static gvp b(gwj gwj1)
    {
        return gwj1.b;
    }

    public final guw a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        }
        if (b == null)
        {
            b = new gvp();
        }
        return new gwi(this, (byte)0);
    }

    public final gwj a(gst gst)
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

    public final gwj a(gvp gvp1)
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
