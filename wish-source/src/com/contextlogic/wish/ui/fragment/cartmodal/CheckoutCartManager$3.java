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
    implements com.contextlogic.wish.api.service.essCallback
{

    final CheckoutCartManager this$0;

    public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo, WishUpsellOffer wishupselloffer)
    {
        boolean flag1 = true;
        CheckoutCartManager.access$202(CheckoutCartManager.this, wishupselloffer);
        CheckoutCartManager checkoutcartmanager = CheckoutCartManager.this;
        boolean flag;
        if (wishupselloffer != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CheckoutCartManager.access$302(checkoutcartmanager, flag);
        checkoutcartmanager = CheckoutCartManager.this;
        if (wishcart != null)
        {
            wishupselloffer = wishcart.getCartEducationModalSpec();
        } else
        {
            wishupselloffer = null;
        }
        CheckoutCartManager.access$402(checkoutcartmanager, wishupselloffer);
        wishupselloffer = CheckoutCartManager.this;
        if (CheckoutCartManager.access$400(CheckoutCartManager.this) != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        CheckoutCartManager.access$502(wishupselloffer, flag);
        hideLoadingSpinner();
        CheckoutCartManager.access$000(CheckoutCartManager.this, wishcart, wishshippinginfo, wishuserbillinginfo);
    }

    k()
    {
        this$0 = CheckoutCartManager.this;
        super();
    }
}
