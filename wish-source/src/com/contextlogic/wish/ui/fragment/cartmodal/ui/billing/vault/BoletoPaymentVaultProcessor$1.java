// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            BoletoPaymentVaultProcessor, CartPaymentVaultProcessor

class val.paymentVaultProcessor
    implements com.contextlogic.wish.api.service..SuccessCallback
{

    final BoletoPaymentVaultProcessor this$0;
    final CartPaymentVaultProcessor val$paymentVaultProcessor;
    final Listener val$saveListener;

    public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
    {
        cartManager.hideLoadingSpinner();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_BOLETO_SUCCESS);
        cartManager.updatePreferredPaymentMode("PaymentModeBoleto");
        cartManager.updateData(cartManager.getCart(), cartManager.getShippingInfo(), wishuserbillinginfo);
        val$saveListener.onSaveComplete(val$paymentVaultProcessor);
    }

    Listener()
    {
        this$0 = final_boletopaymentvaultprocessor;
        val$saveListener = listener;
        val$paymentVaultProcessor = CartPaymentVaultProcessor.this;
        super();
    }
}
