// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.googleplus.GooglePlusManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            GoogleWalletPaymentProcessor, CartPaymentProcessor

class val.paymentProcessor
    implements com.contextlogic.wish.api.service.reCallback
{

    final GoogleWalletPaymentProcessor this$0;
    final tener val$failureListener;
    final CartPaymentProcessor val$paymentProcessor;

    public void onServiceFailed(String s)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_FAILURE);
        Bundle bundle = new Bundle();
        s = GooglePlusManager.getGoogleWalletErrorMessage(413, s);
        bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
        val$failureListener.onFailure(val$paymentProcessor, bundle);
    }

    tener()
    {
        this$0 = final_googlewalletpaymentprocessor;
        val$failureListener = tener;
        val$paymentProcessor = CartPaymentProcessor.this;
        super();
    }
}
