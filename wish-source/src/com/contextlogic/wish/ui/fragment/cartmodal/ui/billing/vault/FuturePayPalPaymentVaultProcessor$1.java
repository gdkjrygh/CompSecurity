// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            FuturePayPalPaymentVaultProcessor, CartPaymentVaultProcessor

class val.vaultProcessor
    implements com.contextlogic.wish.paypal.rePayPalPaymentVaultProcessor._cls1
{

    final FuturePayPalPaymentVaultProcessor this$0;
    final er val$saveListener;
    final CartPaymentVaultProcessor val$vaultProcessor;

    public void onFuturePaymentCancelled()
    {
        val$vaultProcessor.cartManager.hideLoadingSpinner();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_CANCEL);
        String s = WishApplication.getAppInstance().getString(0x7f06032d);
        val$saveListener.onSaveFailed(val$vaultProcessor, s);
    }

    public void onFuturePaymentError()
    {
        val$vaultProcessor.cartManager.hideLoadingSpinner();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_AUTH_ERROR);
        String s = WishApplication.getAppInstance().getString(0x7f06032d);
        val$saveListener.onSaveFailed(val$vaultProcessor, s);
    }

    public void onFuturePaymentSucceeded(String s)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_AUTH_SUCCESS);
        FuturePayPalPaymentVaultProcessor.access$000(FuturePayPalPaymentVaultProcessor.this, val$saveListener, s);
    }

    public void onHideLoadingSpinner()
    {
        val$vaultProcessor.cartManager.hideLoadingSpinner();
    }

    public void onShowLoadingSpinner()
    {
        val$vaultProcessor.cartManager.showLoadingSpinner();
    }

    er()
    {
        this$0 = final_futurepaypalpaymentvaultprocessor;
        val$saveListener = er;
        val$vaultProcessor = CartPaymentVaultProcessor.this;
        super();
    }
}
