// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gvz
{

    private gst a;

    private gvz()
    {
    }

    gvz(byte byte0)
    {
        this();
    }

    static gst a(gvz gvz1)
    {
        return gvz1.a;
    }

    public final gul a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        } else
        {
            return new gvy(this, (byte)0);
        }
    }

    public final gvz a(gst gst)
    {
        a = gst;
        return this;
    }
}
