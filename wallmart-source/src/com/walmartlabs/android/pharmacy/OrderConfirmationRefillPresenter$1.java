// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationRefillPresenter

class this._cls0
    implements android.view.onRefillPresenter._cls1
{

    final OrderConfirmationRefillPresenter this$0;

    public void onClick(View view)
    {
        OrderConfirmationRefillPresenter.access$000(OrderConfirmationRefillPresenter.this);
        if (OrderConfirmationRefillPresenter.access$100(OrderConfirmationRefillPresenter.this) != null)
        {
            OrderConfirmationRefillPresenter.access$100(OrderConfirmationRefillPresenter.this).refill();
            OrderConfirmationRefillPresenter.access$102(OrderConfirmationRefillPresenter.this, null);
        }
    }

    fillListener()
    {
        this$0 = OrderConfirmationRefillPresenter.this;
        super();
    }
}
