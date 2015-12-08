// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping:
//            CartShippingView

class this._cls0
    implements com.contextlogic.wish.api.service.ervice.SuccessCallback
{

    final CartShippingView this$0;

    public void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart)
    {
        CartShippingView.access$700(CartShippingView.this, WishAnalyticsEvent.CLICK_MOBILE_NATIVE_SHIPPING_NEXT_SUCCESS);
        CartShippingView.access$800(CartShippingView.this).hideLoadingSpinner();
        CartShippingView.access$1000(CartShippingView.this).updateData(wishcart, wishshippinginfo, CartShippingView.access$900(CartShippingView.this).getUserBillingInfo());
        callback.onComplete();
    }

    ()
    {
        this$0 = CartShippingView.this;
        super();
    }
}
