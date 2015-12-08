// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import com.walmartlabs.payment.controller.methods.DrawerCreditCardAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PaymentDrawerController

class this._cls0
    implements com.walmartlabs.ui.recycler.ickListener
{

    final PaymentDrawerController this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        PaymentDrawerController.access$1500(PaymentDrawerController.this).setSelectedItem(i);
        PaymentDrawerController.access$1600(PaymentDrawerController.this);
    }

    ()
    {
        this$0 = PaymentDrawerController.this;
        super();
    }
}
