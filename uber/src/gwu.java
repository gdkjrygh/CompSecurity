// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.airtel.AirtelLinkPaymentActivity;

public final class gwu
    implements gvn
{

    static final boolean a;
    private hzb b;
    private hsr c;

    private gwu(gwv gwv1)
    {
        if (!a && gwv1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gwv1);
            return;
        }
    }

    gwu(gwv gwv1, byte byte0)
    {
        this(gwv1);
    }

    public static gwv a()
    {
        return new gwv((byte)0);
    }

    private void a(gwv gwv1)
    {
        b = gsu.a(gwv.a(gwv1));
        c = gvo.a(hsu.a(), b);
    }

    public final void a(AirtelLinkPaymentActivity airtellinkpaymentactivity)
    {
        c.injectMembers(airtellinkpaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gwu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
