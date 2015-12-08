// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            NonNativePayPalPaymentProcessor, CartPaymentProcessor

class val.paymentProcessor
    implements com.contextlogic.wish.api.service.ssCallback
{

    final NonNativePayPalPaymentProcessor this$0;
    final CartPaymentProcessor val$paymentProcessor;
    final er val$successListener;

    public void onServiceSucceeded(String s)
    {
        handleSuccessfulPayment();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_SUCCESS);
        Bundle bundle = new Bundle();
        bundle.putString(CartPaymentProcessor.DATA_KEY_BUY_URL, s);
        val$successListener.onSuccess(val$paymentProcessor, bundle);
    }

    er()
    {
        this$0 = final_nonnativepaypalpaymentprocessor;
        val$successListener = er;
        val$paymentProcessor = CartPaymentProcessor.this;
        super();
    }
}
