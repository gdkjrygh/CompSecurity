// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentFragment

final class a
    implements android.widget.ent..ViewInjector._cls1
{

    final PaymentFragment a;
    final a b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onItemClick(i);
    }

    ( , PaymentFragment paymentfragment)
    {
        b = ;
        a = paymentfragment;
        super();
    }
}
