// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault;

import com.contextlogic.wish.analytics.CommerceLogger;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault:
//            AdyenPaymentVaultProcessor, CartPaymentVaultProcessor

class val.paymentVaultProcessor
    implements com.contextlogic.wish.api.service..FailureCallback
{

    final AdyenPaymentVaultProcessor this$0;
    final CartPaymentVaultProcessor val$paymentVaultProcessor;
    final eListener val$saveListener;

    public void onServiceFailed(String s)
    {
        HashMap hashmap = new HashMap();
        if (s != null)
        {
            hashmap.put("error_message", s);
        }
        CommerceLogger.logError(com.contextlogic.wish.analytics.SAVE_TABBED_BILLING_INFO, com.contextlogic.wish.analytics.OR, hashmap);
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_CC_FAILURE);
        cartManager.hideLoadingSpinner();
        val$saveListener.onSaveFailed(val$paymentVaultProcessor, s);
    }

    eListener()
    {
        this$0 = final_adyenpaymentvaultprocessor;
        val$saveListener = elistener;
        val$paymentVaultProcessor = CartPaymentVaultProcessor.this;
        super();
    }
}
