// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.view.View;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.CartPaymentVaultProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.GoogleWalletPaymentVaultProcessor;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingView

class this._cls1
    implements com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.essor.PrepareListener
{

    final leDone this$1;

    public void onTabPrepareCancelled(CartPaymentVaultProcessor cartpaymentvaultprocessor)
    {
    }

    public void onTabPrepareFailed(CartPaymentVaultProcessor cartpaymentvaultprocessor, String s)
    {
        if (s != null)
        {
            CartBillingView.access$1400(_fld0).showErrorMessage(s);
        }
    }

    public void onTabPrepared(CartPaymentVaultProcessor cartpaymentvaultprocessor)
    {
        CartBillingView.access$1300(_fld0);
        handleDone();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/CartBillingView$9

/* anonymous class */
    class CartBillingView._cls9
        implements android.view.View.OnClickListener
    {

        final CartBillingView this$0;

        public void onClick(View view)
        {
            (new GoogleWalletPaymentVaultProcessor(CartBillingView.access$1200(CartBillingView.this))).prepareTab(new CartBillingView._cls9._cls1());
        }

            
            {
                this$0 = CartBillingView.this;
                super();
            }
    }

}
