// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.payment:
//            ChoosePaymentFragment

final class a
    implements android.widget.ent..ViewInjector._cls1
{

    final ChoosePaymentFragment a;
    final ayments b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onListItemClickPayments(i);
    }

    ( , ChoosePaymentFragment choosepaymentfragment)
    {
        b = ;
        a = choosepaymentfragment;
        super();
    }
}
