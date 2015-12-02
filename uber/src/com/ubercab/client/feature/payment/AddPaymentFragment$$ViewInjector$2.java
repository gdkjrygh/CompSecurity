// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.ubercab.ui.Button;

// Referenced classes of package com.ubercab.client.feature.payment:
//            AddPaymentFragment

final class b extends DebouncingOnClickListener
{

    final AddPaymentFragment a;
    final butterknife.agment b;
    final b c;

    public final void doClick(View view)
    {
        a.onClickButtonAddPayment((Button)b.b(view, "doClick", 0, "onClickButtonAddPayment", 0));
    }

    ( , AddPaymentFragment addpaymentfragment, butterknife.agment agment)
    {
        c = ;
        a = addpaymentfragment;
        b = agment;
        super();
    }
}
