// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import gka;
import gsa;

// Referenced classes of package com.ubercab.client.feature.payment:
//            BaseAddPaymentV2Fragment

final class a
    implements gka
{

    final BaseAddPaymentV2Fragment a;

    private static boolean a(gsa gsa1)
    {
        return "cash".equals(gsa1.a());
    }

    public final boolean apply(Object obj)
    {
        return a((gsa)obj);
    }

    (BaseAddPaymentV2Fragment baseaddpaymentv2fragment)
    {
        a = baseaddpaymentv2fragment;
        super();
    }
}
