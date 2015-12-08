// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import android.content.DialogInterface;
import com.contextlogic.wish.api.data.WishCartItem;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CheckoutCartManager

class val.item
    implements android.content.Listener
{

    final CheckoutCartManager this$0;
    final WishCartItem val$item;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        updateCart(val$item.getProductId(), val$item.getVariationId(), 0);
    }

    ()
    {
        this$0 = final_checkoutcartmanager;
        val$item = WishCartItem.this;
        super();
    }
}
