// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.payment:
//            BaseAddPaymentV2Fragment

final class a extends DebouncingOnClickListener
{

    final BaseAddPaymentV2Fragment a;
    final  b;

    public final void doClick(View view)
    {
        a.onClickLegalInfo();
    }

    Q(Q q, BaseAddPaymentV2Fragment baseaddpaymentv2fragment)
    {
        b = q;
        a = baseaddpaymentv2fragment;
        super();
    }
}
