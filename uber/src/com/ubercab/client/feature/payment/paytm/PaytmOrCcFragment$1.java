// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import com.ubercab.rider.realtime.model.PaymentProfile;
import dui;
import gka;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmOrCcFragment

public final class a
    implements gka
{

    final PaytmOrCcFragment a;

    private static boolean a(PaymentProfile paymentprofile)
    {
        return dui.b(paymentprofile);
    }

    public final boolean apply(Object obj)
    {
        return a((PaymentProfile)obj);
    }

    (PaytmOrCcFragment paytmorccfragment)
    {
        a = paytmorccfragment;
        super();
    }
}
