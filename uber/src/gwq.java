// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelHandlePaymentErrorActivity;

public final class gwq
    implements gvj
{

    static final boolean a;
    private hzb b;
    private hsr c;

    private gwq(gwr gwr1)
    {
        if (!a && gwr1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwr1);
            return;
        }
    }

    gwq(gwr gwr1, byte byte0)
    {
        this(gwr1);
    }

    public static gwr a()
    {
        return new gwr((byte)0);
    }

    private void a(gwr gwr1)
    {
        b = gsu.a(gwr.a(gwr1));
        c = gvk.a(hsu.a(), b);
    }

    public final void a(AirtelHandlePaymentErrorActivity airtelhandlepaymenterroractivity)
    {
        c.injectMembers(airtelhandlepaymenterroractivity);
    }

    static 
    {
        boolean flag;
        if (!gwq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
