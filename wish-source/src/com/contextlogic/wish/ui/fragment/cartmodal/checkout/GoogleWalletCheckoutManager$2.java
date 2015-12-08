// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            GoogleWalletCheckoutManager, CartCheckoutActionManager

class val.client
    implements com.contextlogic.wish.googleplus.horizationIntentCallback
{

    final GoogleWalletCheckoutManager this$0;
    final GoogleApiClient val$client;

    public void onWalletPreauthorizationCancelled()
    {
        cartManager.hideLoadingSpinner();
    }

    public void onWalletPreauthorizationError(int i)
    {
        if (cartManager.getEffectivePaymentMode().equals("PaymentModeGoogle"))
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
            cartManager.hideLoadingSpinner();
            cartManager.updatePreferredPaymentMode("PaymentModeCC");
            if (!cartManager.hasValidBillingInfo() || !cartManager.hasValidShippingInfo())
            {
                cartManager.getCartCheckoutActionManager().checkout();
            }
            return;
        } else
        {
            GoogleWalletCheckoutManager.access$100(GoogleWalletCheckoutManager.this, val$client);
            return;
        }
    }

    public void onWalletPreauthorizationResult(boolean flag)
    {
        if (flag)
        {
            GoogleWalletCheckoutManager.access$100(GoogleWalletCheckoutManager.this, val$client);
        } else
        if (cartManager.getEffectivePaymentMode().equals("PaymentModeGoogle"))
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FETCH_FAILURE);
            cartManager.hideLoadingSpinner();
            cartManager.updatePreferredPaymentMode("PaymentModeCC");
            if (!cartManager.hasValidBillingInfo() || !cartManager.hasValidShippingInfo())
            {
                cartManager.getCartCheckoutActionManager().checkout();
                return;
            }
        } else
        {
            GoogleWalletCheckoutManager.access$100(GoogleWalletCheckoutManager.this, val$client);
            return;
        }
    }

    back()
    {
        this$0 = final_googlewalletcheckoutmanager;
        val$client = GoogleApiClient.this;
        super();
    }
}
