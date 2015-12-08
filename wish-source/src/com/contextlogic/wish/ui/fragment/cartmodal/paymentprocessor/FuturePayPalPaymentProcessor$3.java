// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            FuturePayPalPaymentProcessor, CartPaymentProcessor

class tener
    implements com.contextlogic.wish.paypal.back
{

    final FuturePayPalPaymentProcessor this$0;
    final tener val$failureListener;
    final tener val$successListener;

    public void onFuturePaymentCancelled()
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_CANCEL);
        Bundle bundle = new Bundle();
        String s = WishApplication.getAppInstance().getString(0x7f06032d);
        bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
        val$failureListener.onFailure(FuturePayPalPaymentProcessor.this, bundle);
    }

    public void onFuturePaymentError()
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_AUTH_ERROR);
        Bundle bundle = new Bundle();
        String s = WishApplication.getAppInstance().getString(0x7f06032d);
        bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
        val$failureListener.onFailure(FuturePayPalPaymentProcessor.this, bundle);
    }

    public void onFuturePaymentSucceeded(String s)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_AUTH_SUCCESS);
        FuturePayPalPaymentProcessor.access$000(FuturePayPalPaymentProcessor.this, val$successListener, val$failureListener, s);
    }

    public void onHideLoadingSpinner()
    {
        cartManager.hideLoadingSpinner();
    }

    public void onShowLoadingSpinner()
    {
        cartManager.showLoadingSpinner();
    }

    tener()
    {
        this$0 = final_futurepaypalpaymentprocessor;
        val$successListener = tener;
        val$failureListener = tener.this;
        super();
    }
}
