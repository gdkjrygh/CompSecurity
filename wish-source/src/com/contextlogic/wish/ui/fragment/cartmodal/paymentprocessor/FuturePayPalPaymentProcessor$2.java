// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishBraintreePayPalInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            FuturePayPalPaymentProcessor, CartPaymentProcessor

class tener
    implements com.contextlogic.wish.api.service.ice.FailureCallback
{

    final FuturePayPalPaymentProcessor this$0;
    final tener val$failureListener;
    final CartPaymentProcessor val$paymentProcessor;
    final tener val$successListener;

    public void onServiceFailed(String s, boolean flag)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_FUTURE_PAY_ERROR);
        if (flag)
        {
            val$paymentProcessor.cartManager.getUserBillingInfo().getBraintreePayPalInfo().revokePaymentMethodToken();
            checkout(val$successListener, val$failureListener);
            return;
        }
        Bundle bundle = new Bundle();
        String s1 = s;
        if (s == null)
        {
            s1 = WishApplication.getAppInstance().getString(0x7f06032d);
        }
        bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s1);
        val$failureListener.onFailure(val$paymentProcessor, bundle);
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
