// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            FuturePayPalPaymentVaultProcessor, CartPaymentVaultProcessor

class er
    implements com.contextlogic.wish.api.service.cessCallback
{

    final FuturePayPalPaymentVaultProcessor this$0;
    final er val$saveListener;
    final CartPaymentVaultProcessor val$vaultProcessor;

    public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
    {
        val$vaultProcessor.cartManager.hideLoadingSpinner();
        val$vaultProcessor.cartManager.updateData(val$vaultProcessor.cartManager.getCart(), val$vaultProcessor.cartManager.getShippingInfo(), wishuserbillinginfo);
        val$vaultProcessor.cartManager.updatePreferredPaymentMode("PaymentModePayPal");
        val$saveListener.onSaveComplete(val$vaultProcessor);
    }

    er()
    {
        this$0 = final_futurepaypalpaymentvaultprocessor;
        val$vaultProcessor = cartpaymentvaultprocessor;
        val$saveListener = er.this;
        super();
    }
}
