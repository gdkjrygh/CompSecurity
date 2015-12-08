// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.PreAuthorizePayPalPaymentService;
import com.contextlogic.wish.paypal.PayPalManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public class FuturePayPalPaymentVaultProcessor extends CartPaymentVaultProcessor
{

    private PreAuthorizePayPalPaymentService preAuthorizePayPalPaymentService;

    public FuturePayPalPaymentVaultProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        preAuthorizePayPalPaymentService = new PreAuthorizePayPalPaymentService();
    }

    private void savePayPalAuthorization(final CartPaymentVaultProcessor.SaveListener saveListener, String s)
    {
        cartManager.showLoadingSpinner();
        preAuthorizePayPalPaymentService.requestService(s, new com.contextlogic.wish.api.service.PreAuthorizePayPalPaymentService.SuccessCallback() {

            final FuturePayPalPaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;
            final CartPaymentVaultProcessor val$vaultProcessor;

            public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
            {
                vaultProcessor.cartManager.hideLoadingSpinner();
                vaultProcessor.cartManager.updateData(vaultProcessor.cartManager.getCart(), vaultProcessor.cartManager.getShippingInfo(), wishuserbillinginfo);
                vaultProcessor.cartManager.updatePreferredPaymentMode("PaymentModePayPal");
                saveListener.onSaveComplete(vaultProcessor);
            }

            
            {
                this$0 = FuturePayPalPaymentVaultProcessor.this;
                vaultProcessor = cartpaymentvaultprocessor;
                saveListener = savelistener;
                super();
            }
        }, new com.contextlogic.wish.api.service.PreAuthorizePayPalPaymentService.FailureCallback() {

            final FuturePayPalPaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;
            final CartPaymentVaultProcessor val$vaultProcessor;

            public void onServiceFailed(String s1)
            {
                vaultProcessor.cartManager.hideLoadingSpinner();
                String s2 = s1;
                if (s1 == null)
                {
                    s2 = WishApplication.getAppInstance().getString(0x7f06032d);
                }
                saveListener.onSaveFailed(vaultProcessor, s2);
            }

            
            {
                this$0 = FuturePayPalPaymentVaultProcessor.this;
                vaultProcessor = cartpaymentvaultprocessor;
                saveListener = savelistener;
                super();
            }
        });
    }

    public void prepareTab(CartPaymentVaultProcessor.PrepareListener preparelistener)
    {
        preparelistener.onTabPrepared(this);
    }

    public void save(final CartPaymentVaultProcessor.SaveListener saveListener, Bundle bundle)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_PAYPAL);
        cartManager.showLoadingSpinner();
        PayPalManager.getInstance().startFuturePayment(cartManager.getActivity(), new com.contextlogic.wish.paypal.PayPalManager.FuturePaymentCallback() {

            final FuturePayPalPaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;
            final CartPaymentVaultProcessor val$vaultProcessor;

            public void onFuturePaymentCancelled()
            {
                vaultProcessor.cartManager.hideLoadingSpinner();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_CANCEL);
                String s = WishApplication.getAppInstance().getString(0x7f06032d);
                saveListener.onSaveFailed(vaultProcessor, s);
            }

            public void onFuturePaymentError()
            {
                vaultProcessor.cartManager.hideLoadingSpinner();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_AUTH_ERROR);
                String s = WishApplication.getAppInstance().getString(0x7f06032d);
                saveListener.onSaveFailed(vaultProcessor, s);
            }

            public void onFuturePaymentSucceeded(String s)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_AUTH_SUCCESS);
                savePayPalAuthorization(saveListener, s);
            }

            public void onHideLoadingSpinner()
            {
                vaultProcessor.cartManager.hideLoadingSpinner();
            }

            public void onShowLoadingSpinner()
            {
                vaultProcessor.cartManager.showLoadingSpinner();
            }

            
            {
                this$0 = FuturePayPalPaymentVaultProcessor.this;
                saveListener = savelistener;
                vaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        });
    }

}
