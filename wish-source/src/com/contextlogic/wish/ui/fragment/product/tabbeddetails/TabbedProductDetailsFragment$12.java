// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import com.contextlogic.wish.api.data.WishProduct;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsFragment

class val.product
    implements lback
{

    final TabbedProductDetailsFragment this$0;
    final WishProduct val$product;

    public void onAddToCart(String s, String s1, int i)
    {
        clearOverlay();
        TabbedProductDetailsFragment.access$1002(TabbedProductDetailsFragment.this, null);
        TabbedProductDetailsFragment.access$1100(TabbedProductDetailsFragment.this, val$product.getCommerceProductId(), s1, val$product.getAddToCartOfferId(), i);
    }

    public void onAddToCartCancel()
    {
        clearOverlay();
        TabbedProductDetailsFragment.access$1002(TabbedProductDetailsFragment.this, null);
    }

    lback()
    {
        this$0 = final_tabbedproductdetailsfragment;
        val$product = WishProduct.this;
        super();
    }
}
