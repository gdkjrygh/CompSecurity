// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import com.contextlogic.wish.api.data.WishProduct;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFragment

class val.product
    implements com.contextlogic.wish.ui.fragment.product.tabbeddetails.tModal.Callback
{

    final FilterFeedFragment this$0;
    final WishProduct val$product;

    public void onAddToCart(String s, String s1, int i)
    {
        clearOverlay();
        FilterFeedFragment.access$1502(FilterFeedFragment.this, null);
        FilterFeedFragment.access$1600(FilterFeedFragment.this, val$product.getCommerceProductId(), s1, val$product.getAddToCartOfferId(), i);
    }

    public void onAddToCartCancel()
    {
        clearOverlay();
        FilterFeedFragment.access$1502(FilterFeedFragment.this, null);
    }

    ilsAddToCartModal.Callback()
    {
        this$0 = final_filterfeedfragment;
        val$product = WishProduct.this;
        super();
    }
}
