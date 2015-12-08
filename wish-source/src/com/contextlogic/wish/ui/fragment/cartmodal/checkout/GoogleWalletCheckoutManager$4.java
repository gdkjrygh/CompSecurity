// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            GoogleWalletCheckoutManager

class val.maskedWallet
    implements com.contextlogic.wish.api.service.essCallback
{

    final GoogleWalletCheckoutManager this$0;
    final MaskedWallet val$maskedWallet;

    public void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart)
    {
        cartManager.hideLoadingSpinner();
        cartManager.updatePreferredPaymentMode("PaymentModeGoogle");
        cartManager.updateGoogleWalletMaskedWallet(val$maskedWallet);
        cartManager.updateCurrentView(new CartItemsView(cartManager), true);
    }

    ()
    {
        this$0 = final_googlewalletcheckoutmanager;
        val$maskedWallet = MaskedWallet.this;
        super();
    }
}
