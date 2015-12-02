// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm.v2;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.payment.paytm.v2:
//            PaytmAddFundsCustomDialogFragment

final class a extends DebouncingOnClickListener
{

    final PaytmAddFundsCustomDialogFragment a;
    final cel b;

    public final void doClick(View view)
    {
        a.onClickButtonCancel();
    }

    ( , PaytmAddFundsCustomDialogFragment paytmaddfundscustomdialogfragment)
    {
        b = ;
        a = paytmaddfundscustomdialogfragment;
        super();
    }
}
