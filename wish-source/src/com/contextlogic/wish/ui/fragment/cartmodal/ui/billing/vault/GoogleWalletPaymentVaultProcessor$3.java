// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            GoogleWalletPaymentVaultProcessor, CartPaymentVaultProcessor

class val.paymentVaultProcessor
    implements com.contextlogic.wish.api.service.lback
{

    final GoogleWalletPaymentVaultProcessor this$0;
    final CartPaymentVaultProcessor val$paymentVaultProcessor;
    final er val$saveListener;

    public void onServiceFailed(String s)
    {
        cartManager.hideLoadingSpinner();
        val$saveListener.onSaveFailed(val$paymentVaultProcessor, s);
    }

    er()
    {
        this$0 = final_googlewalletpaymentvaultprocessor;
        val$saveListener = er;
        val$paymentVaultProcessor = CartPaymentVaultProcessor.this;
        super();
    }
}
