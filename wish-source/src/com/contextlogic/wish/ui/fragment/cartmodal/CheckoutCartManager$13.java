// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUpsellOffer;
import com.contextlogic.wish.api.data.WishUserBillingInfo;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CheckoutCartManager

class this._cls0
    implements com.contextlogic.wish.api.service.ssCallback
{

    final CheckoutCartManager this$0;

    public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo, WishUpsellOffer wishupselloffer)
    {
        hideLoadingSpinner();
        markGoogleWalletMaskedWalletNeedsReload();
        updateData(wishcart, wishshippinginfo, wishuserbillinginfo);
    }

    ()
    {
        this$0 = CheckoutCartManager.this;
        super();
    }
}
