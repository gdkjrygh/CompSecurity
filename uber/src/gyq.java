// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.paypal.PayPalAddPaymentActivity;

public final class gyq
    implements gys
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hsr e;

    private gyq(gyr gyr1)
    {
        if (!a && gyr1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gyr1);
            return;
        }
    }

    gyq(gyr gyr1, byte byte0)
    {
        this(gyr1);
    }

    public static gyr a()
    {
        return new gyr((byte)0);
    }

    private void a(gyr gyr1)
    {
        b = gsu.a(gyr.a(gyr1));
        c = gta.a(gyr.a(gyr1));
        d = gyu.a(gyr.b(gyr1), c);
        e = gyv.a(hsu.a(), b, d, gyy.b());
    }

    public final void a(PayPalAddPaymentActivity paypaladdpaymentactivity)
    {
        e.injectMembers(paypaladdpaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gyq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
