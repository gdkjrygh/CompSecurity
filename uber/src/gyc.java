// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.cash.CashAddPaymentActivity;

public final class gyc
    implements gxv
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hsr d;

    private gyc(gyd gyd1)
    {
        if (!a && gyd1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gyd1);
            return;
        }
    }

    gyc(gyd gyd1, byte byte0)
    {
        this(gyd1);
    }

    public static gyd a()
    {
        return new gyd((byte)0);
    }

    private void a(gyd gyd1)
    {
        b = gsu.a(gyd.a(gyd1));
        c = gsv.a(gyd.a(gyd1));
        d = gxw.a(hsu.a(), b, c);
    }

    public final void a(CashAddPaymentActivity cashaddpaymentactivity)
    {
        d.injectMembers(cashaddpaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gyc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
