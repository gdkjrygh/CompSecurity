// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelSetupActivity;

public final class gww
    implements gvu
{

    static final boolean a;
    private hzb b;
    private hsr c;

    private gww(gwx gwx1)
    {
        if (!a && gwx1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwx1);
            return;
        }
    }

    gww(gwx gwx1, byte byte0)
    {
        this(gwx1);
    }

    public static gwx a()
    {
        return new gwx((byte)0);
    }

    private void a(gwx gwx1)
    {
        b = new _cls1(gwx1);
        c = gvv.a(hsu.a(), b);
    }

    public final void a(AirtelSetupActivity airtelsetupactivity)
    {
        c.injectMembers(airtelsetupactivity);
    }

    static 
    {
        boolean flag;
        if (!gww.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    /* member class not found */
    class _cls1 {}

}
