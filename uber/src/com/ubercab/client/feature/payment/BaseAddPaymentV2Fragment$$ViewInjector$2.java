// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.payment:
//            BaseAddPaymentV2Fragment

final class a
    implements android.widget.ent..ViewInjector._cls2
{

    final BaseAddPaymentV2Fragment a;
    final peListItem b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onClickPaymentTypeListItem(i);
    }

    Q(Q q, BaseAddPaymentV2Fragment baseaddpaymentv2fragment)
    {
        b = q;
        a = baseaddpaymentv2fragment;
        super();
    }
}
