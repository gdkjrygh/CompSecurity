// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            DataEntryCheckoutManager

class this._cls0
    implements CartDataEntryCallback
{

    final DataEntryCheckoutManager this$0;

    public void onCancel()
    {
        cartManager.updateCurrentView(new CartItemsView(cartManager), true);
    }

    public void onComplete()
    {
        checkout();
    }

    ()
    {
        this$0 = DataEntryCheckoutManager.this;
        super();
    }
}
