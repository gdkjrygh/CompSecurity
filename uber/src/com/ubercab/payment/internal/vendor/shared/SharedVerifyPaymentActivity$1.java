// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.shared;

import android.text.Editable;
import hpb;

// Referenced classes of package com.ubercab.payment.internal.vendor.shared:
//            SharedVerifyPaymentActivity

final class a extends hpb
{

    final SharedVerifyPaymentActivity a;

    public final void afterTextChanged(Editable editable)
    {
        if (editable.length() == a.j())
        {
            a.a(editable.toString());
        }
    }

    (SharedVerifyPaymentActivity sharedverifypaymentactivity)
    {
        a = sharedverifypaymentactivity;
        super();
    }
}
