// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwt
{

    private gst a;
    private gvp b;

    private gwt()
    {
    }

    gwt(byte byte0)
    {
        this();
    }

    static gst a(gwt gwt1)
    {
        return gwt1.a;
    }

    static gvp b(gwt gwt1)
    {
        return gwt1.b;
    }

    public final gvl a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        }
        if (b == null)
        {
            b = new gvp();
        }
        return new gws(this, (byte)0);
    }

    public final gwt a(gst gst)
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

    public final gwt a(gvp gvp1)
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
