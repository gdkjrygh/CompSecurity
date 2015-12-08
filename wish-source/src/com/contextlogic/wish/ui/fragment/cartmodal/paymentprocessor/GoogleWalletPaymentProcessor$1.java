// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            GoogleWalletPaymentProcessor, CartPaymentProcessor

class val.paymentProcessor
    implements com.contextlogic.wish.googleplus.allback
{

    final GoogleWalletPaymentProcessor this$0;
    final tener val$failureListener;
    final CartPaymentProcessor val$paymentProcessor;
    final tener val$successListener;

    public void onWalletClientLoadFailed(int i)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_FAILURE);
        Bundle bundle = new Bundle();
        String s = GooglePlusManager.getGoogleWalletErrorMessage(i, null);
        bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
        val$failureListener.onFailure(val$paymentProcessor, bundle);
    }

    public void onWalletClientLoaded(GoogleApiClient googleapiclient)
    {
        if (cartManager.googleWalletMaskedWalletNeedsReload())
        {
            GoogleWalletPaymentProcessor.access$000(GoogleWalletPaymentProcessor.this, googleapiclient, val$successListener, val$failureListener);
            return;
        } else
        {
            GoogleWalletPaymentProcessor.access$100(GoogleWalletPaymentProcessor.this, googleapiclient, val$successListener, val$failureListener);
            return;
        }
    }

    tener()
    {
        this$0 = final_googlewalletpaymentprocessor;
        val$successListener = tener;
        val$failureListener = tener1;
        val$paymentProcessor = CartPaymentProcessor.this;
        super();
    }
}
