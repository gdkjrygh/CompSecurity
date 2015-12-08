// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            PlaceOrderCheckoutManager

public class KlarnaCheckoutManager extends PlaceOrderCheckoutManager
{

    public KlarnaCheckoutManager(CartManager cartmanager)
    {
        super(cartmanager, "PaymentModeKlarna");
    }

    public String getCheckoutButtonText()
    {
        if (!CartExperimentManager.canUseImproveKlarnaCheckout())
        {
            return WishApplication.getAppInstance().getString(0x7f0600d8);
        }
        if (!cartManager.hasValidBillingInfo())
        {
            return WishApplication.getAppInstance().getString(0x7f0600d8);
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f060341);
        }
    }

    public boolean shouldShowPaymentCredentials()
    {
        while (!CartExperimentManager.canUseImproveKlarnaCheckout() || !cartManager.hasValidBillingInfo()) 
        {
            return false;
        }
        return true;
    }
}
