// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CheckoutCartManager

class this._cls0
    implements com.contextlogic.wish.ui.fragment.cartmodal.ui.ck
{

    final CheckoutCartManager this$0;

    public void onAddToCartUpsell(WishProduct wishproduct)
    {
        getActivity().clearOverlay();
        if (wishproduct.canShowAddToCartModal())
        {
            CheckoutCartManager.access$900(CheckoutCartManager.this, wishproduct);
            return;
        } else
        {
            addToCart(wishproduct.getCommerceProductId(), wishproduct.getCommerceDefaultVariationId(), wishproduct.getAddToCartOfferId(), 1);
            return;
        }
    }

    lback()
    {
        this$0 = CheckoutCartManager.this;
        super();
    }
}
