// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.amex;

import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import gka;

// Referenced classes of package com.ubercab.client.feature.payment.amex:
//            AmexRewardInfoActivity

final class 
    implements gka
{

    private static boolean a(PaymentProfile paymentprofile)
    {
        paymentprofile = paymentprofile.getRewardInfo();
        return paymentprofile != null && paymentprofile.eligibleToUsePoints();
    }

    public final boolean apply(Object obj)
    {
        return a((PaymentProfile)obj);
    }

    ()
    {
    }
}
