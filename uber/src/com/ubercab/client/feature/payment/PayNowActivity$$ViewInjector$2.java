// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PayNowActivity

final class a extends DebouncingOnClickListener
{

    final PayNowActivity a;
    final ment b;

    public final void doClick(View view)
    {
        a.onClickSelectPayment();
    }

    ( , PayNowActivity paynowactivity)
    {
        b = ;
        a = paynowactivity;
        super();
    }
}
