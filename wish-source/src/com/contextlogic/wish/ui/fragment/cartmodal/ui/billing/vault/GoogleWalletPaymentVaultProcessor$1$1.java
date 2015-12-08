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

class this._cls1
    implements com.contextlogic.wish.googleplus.llback
{

    final l.paymentVaultProcessor this$1;

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

    l.paymentVaultProcessor()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/vault/GoogleWalletPaymentVaultProcessor$1

/* anonymous class */
    class GoogleWalletPaymentVaultProcessor._cls1
        implements com.contextlogic.wish.googleplus.GooglePlusManager.WalletClientCallback
    {

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
                GooglePlusManager.getInstance().loadMaskedWallet(googleapiclient, GooglePlusManager.createMaskedWalletRequest(cartManager), new GoogleWalletPaymentVaultProcessor._cls1._cls1());
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
                this$0 = final_googlewalletpaymentvaultprocessor;
                prepareListener = preparelistener;
                paymentVaultProcessor = CartPaymentVaultProcessor.this;
                super();
            }
    }

}
