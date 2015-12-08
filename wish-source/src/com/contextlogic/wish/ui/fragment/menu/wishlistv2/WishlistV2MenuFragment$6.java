// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlistv2;

import com.contextlogic.wish.api.data.WishProduct;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlistv2:
//            WishlistV2MenuFragment

class val.product
    implements com.contextlogic.wish.ui.fragment.product.tabbeddetails.dal.Callback
{

    final WishlistV2MenuFragment this$0;
    final WishProduct val$product;

    public void onAddToCart(String s, String s1, int i)
    {
        clearOverlay();
        WishlistV2MenuFragment.access$402(WishlistV2MenuFragment.this, null);
        WishlistV2MenuFragment.access$500(WishlistV2MenuFragment.this, val$product.getCommerceProductId(), s1, val$product.getAddToCartOfferId(), i);
    }

    public void onAddToCartCancel()
    {
        clearOverlay();
        WishlistV2MenuFragment.access$402(WishlistV2MenuFragment.this, null);
    }

    CartModal.Callback()
    {
        this$0 = final_wishlistv2menufragment;
        val$product = WishProduct.this;
        super();
    }
}
