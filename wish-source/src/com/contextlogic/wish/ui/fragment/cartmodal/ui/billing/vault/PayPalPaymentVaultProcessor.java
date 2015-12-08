// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            CartPaymentVaultProcessor

public class PayPalPaymentVaultProcessor extends CartPaymentVaultProcessor
{

    public PayPalPaymentVaultProcessor(CartManager cartmanager)
    {
        super(cartmanager);
    }

    public void prepareTab(CartPaymentVaultProcessor.PrepareListener preparelistener)
    {
        preparelistener.onTabPrepared(this);
    }

    public void save(CartPaymentVaultProcessor.SaveListener savelistener, Bundle bundle)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_PAYPAL);
        cartManager.updatePreferredPaymentMode("PaymentModePayPal");
        savelistener.onSaveComplete(this);
    }
}
