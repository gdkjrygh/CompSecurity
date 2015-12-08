// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            NativePayPalPaymentProcessor, CartPaymentProcessor

class val.paymentProcessor
    implements com.contextlogic.wish.api.service.ailureCallback
{

    final NativePayPalPaymentProcessor this$0;
    final tener val$failureListener;
    final CartPaymentProcessor val$paymentProcessor;

    public void onServiceFailed(String s)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_PREPAY_ERROR);
        Bundle bundle = new Bundle();
        String s1 = s;
        if (s == null)
        {
            s1 = WishApplication.getAppInstance().getString(0x7f06032d);
        }
        bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s1);
        val$failureListener.onFailure(val$paymentProcessor, bundle);
    }

    tener()
    {
        this$0 = final_nativepaypalpaymentprocessor;
        val$failureListener = tener;
        val$paymentProcessor = CartPaymentProcessor.this;
        super();
    }
}
