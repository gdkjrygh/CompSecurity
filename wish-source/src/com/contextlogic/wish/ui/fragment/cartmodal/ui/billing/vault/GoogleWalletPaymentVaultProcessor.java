// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.service.UpdateShippingInfoService;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public class GoogleWalletPaymentVaultProcessor extends CartPaymentVaultProcessor
{

    private UpdateShippingInfoService updateShippingInfoService;

    public GoogleWalletPaymentVaultProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        updateShippingInfoService = new UpdateShippingInfoService();
    }

    public void prepareTab(final CartPaymentVaultProcessor.PrepareListener prepareListener)
    {
        if (cartManager.getGoogleWalletMaskedWallet() == null)
        {
            cartManager.showLoadingSpinner();
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH);
            GooglePlusManager.getInstance().getWalletClient(cartManager, cartManager.getActivity(), new com.contextlogic.wish.googleplus.GooglePlusManager.WalletClientCallback() {

                final GoogleWalletPaymentVaultProcessor this$0;
                final CartPaymentVaultProcessor val$paymentVaultProcessor;
                final CartPaymentVaultProcessor.PrepareListener val$prepareListener;

                public void onWalletClientLoadFailed(int i)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
                    cartManager.hideLoadingSpinner();
                    prepareListener.onTabPrepareFailed(paymentVaultProcessor, GooglePlusManager.getGoogleWalletErrorMessage(i, null));
                }

                public void onWalletClientLoaded(GoogleApiClient googleapiclient)
                {
                    try
                    {
                        GooglePlusManager.getInstance().loadMaskedWallet(googleapiclient, GooglePlusManager.createMaskedWalletRequest(cartManager), new com.contextlogic.wish.googleplus.GooglePlusManager.MaskedWalletIntentCallback() {

                            final _cls1 this$1;

                            public void onMaskedWalletCancelled()
                            {
                                cartManager.hideLoadingSpinner();
                                prepareListener.onTabPrepareCancelled(paymentVaultProcessor);
                            }

                            public void onMaskedWalletError(int i)
                            {
                                cartManager.hideLoadingSpinner();
                                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
                                prepareListener.onTabPrepareFailed(paymentVaultProcessor, GooglePlusManager.getGoogleWalletErrorMessage(i, null));
                            }

                            public void onMaskedWalletSuccess(MaskedWallet maskedwallet)
                            {
                                cartManager.hideLoadingSpinner();
                                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_SUCCESS);
                                cartManager.updateGoogleWalletMaskedWallet(maskedwallet);
                                prepareListener.onTabPrepared(paymentVaultProcessor);
                            }

            
            {
                this$1 = _cls1.this;
                super();
            }
                        });
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (GoogleApiClient googleapiclient)
                    {
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
                    }
                    cartManager.hideLoadingSpinner();
                    prepareListener.onTabPrepareFailed(paymentVaultProcessor, GooglePlusManager.getGoogleWalletErrorMessage(413, null));
                }

            
            {
                this$0 = GoogleWalletPaymentVaultProcessor.this;
                prepareListener = preparelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
            });
            return;
        } else
        {
            prepareListener.onTabPrepared(this);
            return;
        }
    }

    public void save(final CartPaymentVaultProcessor.SaveListener saveListener, Bundle bundle)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_GWALLET);
        Object obj = cartManager.getGoogleWalletMaskedWallet();
        bundle = ((MaskedWallet) (obj)).getShippingAddress().getName();
        String s = ((MaskedWallet) (obj)).getShippingAddress().getAddress1();
        String s1 = ((MaskedWallet) (obj)).getShippingAddress().getAddress2();
        String s2 = ((MaskedWallet) (obj)).getShippingAddress().getCity();
        String s3 = ((MaskedWallet) (obj)).getShippingAddress().getState();
        String s4 = ((MaskedWallet) (obj)).getShippingAddress().getPostalCode();
        String s5 = ((MaskedWallet) (obj)).getShippingAddress().getCountryCode();
        obj = ((MaskedWallet) (obj)).getShippingAddress().getPhoneNumber();
        cartManager.showLoadingSpinner();
        updateShippingInfoService.requestService(bundle, s, s1, s2, s3, s4, s5, ((String) (obj)), null, null, new com.contextlogic.wish.api.service.UpdateShippingInfoService.SuccessCallback() {

            final GoogleWalletPaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor val$paymentVaultProcessor;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;

            public void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart)
            {
                cartManager.hideLoadingSpinner();
                cartManager.updateData(wishcart, wishshippinginfo, cartManager.getUserBillingInfo());
                cartManager.updatePreferredPaymentMode("PaymentModeGoogle");
                saveListener.onSaveComplete(paymentVaultProcessor);
            }

            
            {
                this$0 = GoogleWalletPaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateShippingInfoService.FailureCallback() {

            final GoogleWalletPaymentVaultProcessor this$0;
            final CartPaymentVaultProcessor val$paymentVaultProcessor;
            final CartPaymentVaultProcessor.SaveListener val$saveListener;

            public void onServiceFailed(String s6)
            {
                cartManager.hideLoadingSpinner();
                saveListener.onSaveFailed(paymentVaultProcessor, s6);
            }

            
            {
                this$0 = GoogleWalletPaymentVaultProcessor.this;
                saveListener = savelistener;
                paymentVaultProcessor = cartpaymentvaultprocessor;
                super();
            }
        });
    }
}
