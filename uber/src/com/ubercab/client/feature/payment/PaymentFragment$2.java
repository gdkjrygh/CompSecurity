// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import cev;
import erm;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentFragment, PaymentProfileAdapter

final class a
    implements android.view.er
{

    final PaymentFragment a;

    public final void onClick(View view)
    {
        view = PaymentFragment.a(a).a();
        if (view != null)
        {
            a.f.c(new erm(view));
        }
    }

    ter(PaymentFragment paymentfragment)
    {
        a = paymentfragment;
        super();
    }
}
