// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            GoogleWalletCheckoutManager

class this._cls0
    implements com.contextlogic.wish.googleplus.IntentCallback
{

    final GoogleWalletCheckoutManager this$0;

    public void onMaskedWalletCancelled()
    {
        cartManager.hideLoadingSpinner();
    }

    public void onMaskedWalletError(int i)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
        cartManager.hideLoadingSpinner();
        cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(i, null));
    }

    public void onMaskedWalletSuccess(MaskedWallet maskedwallet)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_SUCCESS);
        GoogleWalletCheckoutManager.access$200(GoogleWalletCheckoutManager.this, maskedwallet);
    }

    ()
    {
        this$0 = GoogleWalletCheckoutManager.this;
        super();
    }
}
