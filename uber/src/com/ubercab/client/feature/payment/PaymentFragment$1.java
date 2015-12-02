// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import com.ubercab.rider.realtime.model.Client;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentFragment

public final class b
    implements Runnable
{

    final Client a;
    final String b;
    final PaymentFragment c;

    public final void run()
    {
        PaymentFragment.a(c, a.findPaymentProfileByUuid(b));
    }

    (PaymentFragment paymentfragment, Client client, String s)
    {
        c = paymentfragment;
        a = client;
        b = s;
        super();
    }
}
