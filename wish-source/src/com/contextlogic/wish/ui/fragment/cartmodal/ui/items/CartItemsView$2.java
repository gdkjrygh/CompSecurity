// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.view.View;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartItemsView

class this._cls0
    implements android.view.ener
{

    final CartItemsView this$0;

    public void onClick(View view)
    {
        CartItemsView.access$100(CartItemsView.this).getCartCheckoutActionManager().checkout();
    }

    onManager()
    {
        this$0 = CartItemsView.this;
        super();
    }
}
