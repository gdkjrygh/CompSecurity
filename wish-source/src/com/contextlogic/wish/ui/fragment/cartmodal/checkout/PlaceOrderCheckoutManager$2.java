// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;
import com.contextlogic.wish.ui.fragment.signup.SignupCartBillingView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            PlaceOrderCheckoutManager

class val.cartManager
    implements com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.Listener
{

    final PlaceOrderCheckoutManager this$0;
    final CartManager val$cartManager;

    public void onCancel(CartPaymentProcessor cartpaymentprocessor)
    {
        val$cartManager.hideLoadingSpinner();
        if (!(val$cartManager.getCurrentUiView() instanceof CartItemsView) && !(val$cartManager.getCurrentUiView() instanceof SignupCartBillingView))
        {
            val$cartManager.updateCurrentView(new CartItemsView(val$cartManager), false);
        }
    }

    public void onFailure(CartPaymentProcessor cartpaymentprocessor, Bundle bundle)
    {
        val$cartManager.hideLoadingSpinner();
        cartpaymentprocessor = bundle.getString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE);
        val$cartManager.showErrorMessage(cartpaymentprocessor, WishApplication.getAppInstance().getString(0x7f060456));
    }

    ()
    {
        this$0 = final_placeordercheckoutmanager;
        val$cartManager = CartManager.this;
        super();
    }
}
