// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.view.View;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.GoogleWalletHelper;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping.CartShippingView;

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

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/items/CartItemsHeaderView$1

/* anonymous class */
    class CartItemsHeaderView._cls1
        implements android.view.View.OnClickListener
    {

        final CartItemsHeaderView this$0;

        public void onClick(View view)
        {
            if (CartItemsHeaderView.access$000(CartItemsHeaderView.this).getEffectivePaymentMode().equals("PaymentModeGoogle") && CartItemsHeaderView.access$000(CartItemsHeaderView.this).getGoogleWalletMaskedWallet() != null)
            {
                (new GoogleWalletHelper(CartItemsHeaderView.access$000(CartItemsHeaderView.this))).changeMaskedWallet(new CartItemsHeaderView._cls1._cls1());
                return;
            } else
            {
                view = new CartShippingView(CartItemsHeaderView.access$000(CartItemsHeaderView.this), new CartItemsHeaderView._cls1._cls2(), false);
                CartItemsHeaderView.access$000(CartItemsHeaderView.this).updateCurrentView(view, true);
                return;
            }
        }

            
            {
                this$0 = CartItemsHeaderView.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/ui/items/CartItemsHeaderView$1$1

/* anonymous class */
        class CartItemsHeaderView._cls1._cls1
            implements com.contextlogic.wish.ui.fragment.cartmodal.ui.GoogleWalletHelper.ChangeListener
        {

            final CartItemsHeaderView._cls1 this$1;

            public void onChangeCancelled()
            {
            }

            public void onChangeComplete()
            {
                refreshView();
            }

            public void onChangeFailed()
            {
            }

                    
                    {
                        this$1 = CartItemsHeaderView._cls1.this;
                        super();
                    }
        }

    }

}
