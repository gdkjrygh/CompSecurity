// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.payment;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.signup.payment:
//            SignupChoosePaymentFragment

final class a
    implements android.widget.ntFragment..ViewInjector._cls1
{

    final SignupChoosePaymentFragment a;
    final ayments b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onListItemClickPayments(i);
    }

    ( , SignupChoosePaymentFragment signupchoosepaymentfragment)
    {
        b = ;
        a = signupchoosepaymentfragment;
        super();
    }
}
