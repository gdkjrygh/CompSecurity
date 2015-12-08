// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartItemsAdapter

class this._cls0
    implements ack
{

    final CartItemsAdapter this$0;

    public void onCancel()
    {
    }

    public void onEdit(WishCartItem wishcartitem, int i)
    {
        CartItemsAdapter.access$300(CartItemsAdapter.this).updateCart(wishcartitem.getProductId(), wishcartitem.getVariationId(), i);
    }

    ack()
    {
        this$0 = CartItemsAdapter.this;
        super();
    }
}
