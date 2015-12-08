// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.CartPaymentVaultProcessor;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingHeader

class val.withoutCheck
    implements com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.essor.PrepareListener
{

    final CartBillingHeader this$0;
    final r.CartBillingSection val$section;
    final boolean val$withoutCheck;

    public void onTabPrepareCancelled(CartPaymentVaultProcessor cartpaymentvaultprocessor)
    {
    }

    public void onTabPrepareFailed(CartPaymentVaultProcessor cartpaymentvaultprocessor, String s)
    {
        if (s != null)
        {
            cartManager.showErrorMessage(s);
        }
    }

    public void onTabPrepared(CartPaymentVaultProcessor cartpaymentvaultprocessor)
    {
        CartBillingHeader.access$000(CartBillingHeader.this, val$section, val$withoutCheck);
    }

    r.CartBillingSection()
    {
        this$0 = final_cartbillingheader;
        val$section = cartbillingsection;
        val$withoutCheck = Z.this;
        super();
    }
}
