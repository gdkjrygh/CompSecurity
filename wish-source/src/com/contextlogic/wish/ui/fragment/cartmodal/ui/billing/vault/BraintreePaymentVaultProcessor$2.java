// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            BraintreePaymentVaultProcessor, CartPaymentVaultProcessor

class val.paymentVaultProcessor
    implements com.contextlogic.wish.api.service.reePaymentVaultProcessor._cls2
{

    final BraintreePaymentVaultProcessor this$0;
    final CartPaymentVaultProcessor val$paymentVaultProcessor;
    final tener val$saveListener;

    public void onServiceFailed()
    {
        HashMap hashmap = new HashMap();
        CommerceLogger.logError(com.contextlogic.wish.analytics.BRAINTREE_CLIENT_TOKEN, com.contextlogic.wish.analytics.BRAINTREE_CLIENT_TOKEN, hashmap);
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
        cartManager.hideLoadingSpinner();
        val$saveListener.onSaveFailed(val$paymentVaultProcessor, null);
    }

    tener()
    {
        this$0 = final_braintreepaymentvaultprocessor;
        val$saveListener = tener;
        val$paymentVaultProcessor = CartPaymentVaultProcessor.this;
        super();
    }
}
