// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CheckoutCartManager

class val.addToCartOfferId
    implements com.contextlogic.wish.ui.fragment.product.tabbeddetails.Modal.Callback
{

    final CheckoutCartManager this$0;
    final String val$addToCartOfferId;
    final String val$commerceProductId;

    public void onAddToCart(String s, String s1, int i)
    {
        getActivity().clearOverlay();
        CheckoutCartManager.access$1002(CheckoutCartManager.this, null);
        if (val$commerceProductId != null && s1 != null && i > 0)
        {
            addToCart(val$commerceProductId, s1, val$addToCartOfferId, i);
            return;
        } else
        {
            showCart();
            return;
        }
    }

    public void onAddToCartCancel()
    {
        getActivity().clearOverlay();
        CheckoutCartManager.access$1002(CheckoutCartManager.this, null);
    }

    ilsAddToCartModal.Callback()
    {
        this$0 = final_checkoutcartmanager;
        val$commerceProductId = s;
        val$addToCartOfferId = String.this;
        super();
    }
}
