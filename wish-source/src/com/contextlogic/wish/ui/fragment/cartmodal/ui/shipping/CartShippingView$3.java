// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping;

import android.widget.CompoundButton;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCreditCardInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping:
//            CartShippingView

class this._cls0
    implements android.widget.eckedChangeListener
{

    final CartShippingView this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = CartShippingView.access$200(CartShippingView.this).getUserBillingInfo().getCreditCardInfo(CartShippingView.access$100(CartShippingView.this).getCart().getPaymentProcessor()).getBillingAddress();
        if (flag && compoundbutton != null)
        {
            CartShippingView.access$300(CartShippingView.this, compoundbutton);
        }
    }

    ()
    {
        this$0 = CartShippingView.this;
        super();
    }
}
