// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import com.contextlogic.wish.api.data.WishProduct;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.product
    implements com.contextlogic.wish.ui.fragment.product.tabbeddetails.Modal.Callback
{

    final ProductFeedFragment this$0;
    final WishProduct val$product;

    public void onAddToCart(String s, String s1, int i)
    {
        clearOverlay();
        ProductFeedFragment.access$902(ProductFeedFragment.this, null);
        ProductFeedFragment.access$1000(ProductFeedFragment.this, val$product.getCommerceProductId(), s1, val$product.getAddToCartOfferId(), i);
    }

    public void onAddToCartCancel()
    {
        clearOverlay();
        ProductFeedFragment.access$902(ProductFeedFragment.this, null);
    }

    sAddToCartModal.Callback()
    {
        this$0 = final_productfeedfragment;
        val$product = WishProduct.this;
        super();
    }
}
