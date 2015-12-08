// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.payment.view.OnSingleClickListener;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PaymentConfirmationFragment

class this._cls0 extends OnSingleClickListener
{

    final PaymentConfirmationFragment this$0;

    public void onSingleClick(View view)
    {
        MessageBus.getBus().post(new com.walmartlabs.anivia.t>("mobileSubmiteReceipt"));
        PaymentConfirmationFragment.access$000(PaymentConfirmationFragment.this);
    }

    ()
    {
        this$0 = PaymentConfirmationFragment.this;
        super();
    }
}
