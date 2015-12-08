// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import com.walmartlabs.payment.controller.PaymentNavigationUtil;
import com.walmartlabs.payment.controller.methods.GiftCardAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            PaymentMethodsController

class this._cls0
    implements com.walmartlabs.ui.recycler.ckListener
{

    final PaymentMethodsController this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        PaymentNavigationUtil.viewGiftCard(PaymentMethodsController.access$000(PaymentMethodsController.this), PaymentMethodsController.access$300(PaymentMethodsController.this).getItem(i));
    }

    ()
    {
        this$0 = PaymentMethodsController.this;
        super();
    }
}
