// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            FuturePayPalPaymentProcessor, CartPaymentProcessor

class tener
    implements com.contextlogic.wish.api.service.e.SuccessCallback
{

    final FuturePayPalPaymentProcessor this$0;
    final tener val$failureListener;
    final CartPaymentProcessor val$paymentProcessor;
    final tener val$successListener;

    public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
    {
        val$paymentProcessor.cartManager.updateData(val$paymentProcessor.cartManager.getCart(), val$paymentProcessor.cartManager.getShippingInfo(), wishuserbillinginfo);
        checkout(val$successListener, val$failureListener);
    }

    tener()
    {
        this$0 = final_futurepaypalpaymentprocessor;
        val$paymentProcessor = cartpaymentprocessor;
        val$successListener = tener;
        val$failureListener = tener.this;
        super();
    }
}
