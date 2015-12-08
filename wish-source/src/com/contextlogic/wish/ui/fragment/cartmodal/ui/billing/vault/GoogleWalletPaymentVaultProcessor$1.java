// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            GoogleWalletPaymentVaultProcessor, CartPaymentVaultProcessor

class val.paymentVaultProcessor
    implements com.contextlogic.wish.googleplus.ck
{

    final GoogleWalletPaymentVaultProcessor this$0;
    final CartPaymentVaultProcessor val$paymentVaultProcessor;
    final tener val$prepareListener;

    public void onWalletClientLoadFailed(int i)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
        cartManager.hideLoadingSpinner();
        val$prepareListener.onTabPrepareFailed(val$paymentVaultProcessor, GooglePlusManager.getGoogleWalletErrorMessage(i, null));
    }

    public void onWalletClientLoaded(GoogleApiClient googleapiclient)
    {
        try
        {
            GooglePlusManager.getInstance().loadMaskedWallet(googleapiclient, GooglePlusManager.createMaskedWalletRequest(cartManager), new com.contextlogic.wish.googleplus.GooglePlusManager.MaskedWalletIntentCallback() {

                final GoogleWalletPaymentVaultProcessor._cls1 this$1;

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
                this$1 = GoogleWalletPaymentVaultProcessor._cls1.this;
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
        val$prepareListener.onTabPrepareFailed(val$paymentVaultProcessor, GooglePlusManager.getGoogleWalletErrorMessage(413, null));
    }

    tener()
    {
        this$0 = final_googlewalletpaymentvaultprocessor;
        val$prepareListener = tener;
        val$paymentVaultProcessor = CartPaymentVaultProcessor.this;
        super();
    }
}
