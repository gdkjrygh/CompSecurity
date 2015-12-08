// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.content.Context;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.CartPaymentVaultProcessor;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingView

class this._cls0
    implements com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.cessor.SaveListener
{

    final CartBillingView this$0;

    public void onSaveComplete(CartPaymentVaultProcessor cartpaymentvaultprocessor)
    {
        callback.onComplete();
    }

    public void onSaveFailed(CartPaymentVaultProcessor cartpaymentvaultprocessor, String s)
    {
        CartBillingView.access$1800(CartBillingView.this).showErrorMessage(s, getContext().getString(0x7f060456));
    }

    ultProcessor()
    {
        this$0 = CartBillingView.this;
        super();
    }
}
