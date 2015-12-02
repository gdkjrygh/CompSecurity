// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.payment:
//            AddPaymentFragment

final class a extends DebouncingOnClickListener
{

    final AddPaymentFragment a;
    final onAlipay b;

    public final void doClick(View view)
    {
        a.onClickImageButtonAlipay();
    }

    ( , AddPaymentFragment addpaymentfragment)
    {
        b = ;
        a = addpaymentfragment;
        super();
    }
}
