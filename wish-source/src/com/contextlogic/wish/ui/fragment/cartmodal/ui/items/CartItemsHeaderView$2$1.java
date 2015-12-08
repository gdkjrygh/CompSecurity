// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.view.View;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.KlarnaPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBillingWebView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartItemsHeaderView, CartItemsView

class this._cls1
    implements CartDataEntryCallback
{

    final is._cls0 this$1;

    public void onCancel()
    {
        CartItemsHeaderView.access$000(_fld0).updateCurrentView(new CartItemsView(CartItemsHeaderView.access$000(_fld0)), true);
    }

    public void onComplete()
    {
        CartItemsHeaderView.access$000(_fld0).updateCurrentView(new CartItemsView(CartItemsHeaderView.access$000(_fld0)), true);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/items/CartItemsHeaderView$2

/* anonymous class */
    class CartItemsHeaderView._cls2
        implements android.view.View.OnClickListener
    {

        final CartItemsHeaderView this$0;

        public void onClick(View view)
        {
            if (CartExperimentManager.canCheckoutWithKlarnaHybrid(CartItemsHeaderView.access$000(CartItemsHeaderView.this)))
            {
                view = KlarnaPaymentProcessor.getKlarnaCheckoutUrl(CartItemsHeaderView.access$000(CartItemsHeaderView.this), false);
                view = new CartBillingWebView(CartItemsHeaderView.access$000(CartItemsHeaderView.this), view);
            } else
            {
                view = new CartBillingView(CartItemsHeaderView.access$000(CartItemsHeaderView.this), new CartItemsHeaderView._cls2._cls1(), false);
            }
            CartItemsHeaderView.access$000(CartItemsHeaderView.this).updateCurrentView(view, true);
        }

            
            {
                this$0 = CartItemsHeaderView.this;
                super();
            }
    }

}
