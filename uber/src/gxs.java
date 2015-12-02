// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.bankcard.BankCardAddPaymentActivity;

public final class gxs
    implements gxm
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;

    private gxs(gxt gxt1)
    {
        if (!a && gxt1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gxt1);
            return;
        }
    }

    gxs(gxt gxt1, byte byte0)
    {
        this(gxt1);
    }

    public static gxt a()
    {
        return new gxt((byte)0);
    }

    private void a(gxt gxt1)
    {
        b = gsu.a(gxt.a(gxt1));
        c = gta.a(gxt.a(gxt1));
        d = gxq.a(gxt.b(gxt1), c);
        e = gxp.a(gxt.b(gxt1));
        f = gxr.a(gxt.b(gxt1));
        g = gxn.a(hsu.a(), b, d, e, f);
    }

    public final void a(BankCardAddPaymentActivity bankcardaddpaymentactivity)
    {
        g.injectMembers(bankcardaddpaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gxs.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
