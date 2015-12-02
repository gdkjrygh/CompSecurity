// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.PaytmAddFundsFragment;

public final class etq
    implements ide
{

    final PaytmAddFundsFragment a;

    private etq(PaytmAddFundsFragment paytmaddfundsfragment)
    {
        a = paytmaddfundsfragment;
        super();
    }

    public etq(PaytmAddFundsFragment paytmaddfundsfragment, byte byte0)
    {
        this(paytmaddfundsfragment);
    }

    private void a()
    {
        PaytmAddFundsFragment.a(a, a.d.a(com.ubercab.client.core.config.AppConfigKey.Rider.AddFundsDefaultValues.a));
        PaytmAddFundsFragment.b(a, a.d.a(com.ubercab.client.core.config.AppConfigKey.Rider.AddFundsDefaultValues.b));
        PaytmAddFundsFragment.c(a, a.d.a(com.ubercab.client.core.config.AppConfigKey.Rider.AddFundsDefaultValues.c));
        PaytmAddFundsFragment.a(a);
    }

    public final void call(Object obj)
    {
        a();
    }
}
