// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google.GoogleWalletPaymentCollector;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            GoogleWalletPaymentProcessor, CartPaymentProcessor

class val.paymentProcessor
    implements com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google.ccessListener
{

    final GoogleWalletPaymentProcessor this$0;
    final CartPaymentProcessor val$paymentProcessor;
    final tener val$successListener;

    public void onSuccess(GoogleWalletPaymentCollector googlewalletpaymentcollector, Bundle bundle)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_ORDER_SUCCESS);
        val$successListener.onSuccess(val$paymentProcessor, bundle);
    }

    tener()
    {
        this$0 = final_googlewalletpaymentprocessor;
        val$successListener = tener;
        val$paymentProcessor = CartPaymentProcessor.this;
        super();
    }
}
