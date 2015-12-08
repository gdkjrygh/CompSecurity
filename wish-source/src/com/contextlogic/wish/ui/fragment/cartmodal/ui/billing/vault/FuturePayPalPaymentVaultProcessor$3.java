// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            FuturePayPalPaymentVaultProcessor, CartPaymentVaultProcessor

class er
    implements com.contextlogic.wish.api.service.lureCallback
{

    final FuturePayPalPaymentVaultProcessor this$0;
    final er val$saveListener;
    final CartPaymentVaultProcessor val$vaultProcessor;

    public void onServiceFailed(String s)
    {
        val$vaultProcessor.cartManager.hideLoadingSpinner();
        String s1 = s;
        if (s == null)
        {
            s1 = WishApplication.getAppInstance().getString(0x7f06032d);
        }
        val$saveListener.onSaveFailed(val$vaultProcessor, s1);
    }

    er()
    {
        this$0 = final_futurepaypalpaymentvaultprocessor;
        val$vaultProcessor = cartpaymentvaultprocessor;
        val$saveListener = er.this;
        super();
    }
}
