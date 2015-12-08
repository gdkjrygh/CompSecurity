// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import android.os.Bundle;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingWebView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            PlaceOrderCheckoutManager

class val.cartManager
    implements com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.Listener
{

    final PlaceOrderCheckoutManager this$0;
    final CartManager val$cartManager;

    public void onSuccess(CartPaymentProcessor cartpaymentprocessor, Bundle bundle)
    {
        val$cartManager.hideLoadingSpinner();
        if (!bundle.containsKey(CartPaymentProcessor.DATA_KEY_BUY_URL)) goto _L2; else goto _L1
_L1:
        cartpaymentprocessor = bundle.getString(CartPaymentProcessor.DATA_KEY_BUY_URL);
        if (!bundle.containsKey(CartPaymentProcessor.DATA_KEY_SHOW_IN_MODAL)) goto _L4; else goto _L3
_L3:
        val$cartManager.updateCurrentView(new CartBillingWebView(val$cartManager, cartpaymentprocessor), true);
_L6:
        return;
_L4:
        val$cartManager.showBrowser(cartpaymentprocessor, true);
        return;
_L2:
        if (bundle.containsKey(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID))
        {
            val$cartManager.showBrowser(String.format("https://%s/m/purchase-confirmation?tid=%s", new Object[] {
                WishApi.getInstance().getConfig().getApiBaseUrlString(), bundle.getString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID)
            }), true);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ()
    {
        this$0 = final_placeordercheckoutmanager;
        val$cartManager = CartManager.this;
        super();
    }
}
