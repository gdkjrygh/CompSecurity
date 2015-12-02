// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.payment;

import gka;
import gsa;
import gxz;

// Referenced classes of package com.ubercab.client.feature.signup.payment:
//            SignupChoosePaymentFragment

final class a
    implements gka
{

    final SignupChoosePaymentFragment a;

    private static boolean a(gsa gsa1)
    {
        return !(gsa1 instanceof gxz);
    }

    public final boolean apply(Object obj)
    {
        return a((gsa)obj);
    }

    (SignupChoosePaymentFragment signupchoosepaymentfragment)
    {
        a = signupchoosepaymentfragment;
        super();
    }
}
