// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CheckoutCartManager

class this._cls0
    implements com.contextlogic.wish.api.service.Callback
{

    final CheckoutCartManager this$0;

    public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
    {
        hideLoadingSpinner();
        CheckoutCartManager.access$000(CheckoutCartManager.this, wishcart, wishshippinginfo, wishuserbillinginfo);
    }

    ()
    {
        this$0 = CheckoutCartManager.this;
        super();
    }
}
