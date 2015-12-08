// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            FuturePayPalPaymentProcessor, CartPaymentProcessor

class val.paymentProcessor
    implements com.contextlogic.wish.api.service.ice.SuccessCallback
{

    final FuturePayPalPaymentProcessor this$0;
    final CartPaymentProcessor val$paymentProcessor;
    final tener val$successListener;

    public void onServiceSucceeded(String s)
    {
        handleSuccessfulPayment();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_FUTURE_PAY_SUCCESS);
        Bundle bundle = new Bundle();
        bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s);
        val$successListener.onSuccess(val$paymentProcessor, bundle);
    }

    tener()
    {
        this$0 = final_futurepaypalpaymentprocessor;
        val$successListener = tener;
        val$paymentProcessor = CartPaymentProcessor.this;
        super();
    }
}
