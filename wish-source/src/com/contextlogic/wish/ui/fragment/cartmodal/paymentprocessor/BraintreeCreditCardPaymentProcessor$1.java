// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            BraintreeCreditCardPaymentProcessor, CartPaymentProcessor

class val.paymentProcessor
    implements com.contextlogic.wish.api.service.sCallback
{

    final BraintreeCreditCardPaymentProcessor this$0;
    final CartPaymentProcessor val$paymentProcessor;
    final val.paymentProcessor val$successListener;

    public void onServiceSucceeded(String s)
    {
        handleSuccessfulPayment();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PLACE_ORDER_SUCCESS);
        Bundle bundle = new Bundle();
        bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s);
        val$successListener.nSuccess(val$paymentProcessor, bundle);
    }

    ()
    {
        this$0 = final_braintreecreditcardpaymentprocessor;
        val$successListener = ;
        val$paymentProcessor = CartPaymentProcessor.this;
        super();
    }
}
