// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            StripeCreditCardPaymentProcessor, CartPaymentProcessor

class val.paymentProcessor
    implements com.contextlogic.wish.api.service.sCallback
{

    final StripeCreditCardPaymentProcessor this$0;
    final CartPaymentProcessor val$paymentProcessor;
    final r val$successListener;

    public void onServiceSucceeded(String s)
    {
        handleSuccessfulPayment();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PLACE_ORDER_SUCCESS);
        Bundle bundle = new Bundle();
        bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s);
        val$successListener.onSuccess(val$paymentProcessor, bundle);
    }

    r()
    {
        this$0 = final_stripecreditcardpaymentprocessor;
        val$successListener = r;
        val$paymentProcessor = CartPaymentProcessor.this;
        super();
    }
}
