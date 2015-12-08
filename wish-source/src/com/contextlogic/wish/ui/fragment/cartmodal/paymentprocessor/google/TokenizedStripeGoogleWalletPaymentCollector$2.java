// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor;
import com.google.android.gms.wallet.FullWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google:
//            TokenizedStripeGoogleWalletPaymentCollector, GoogleWalletPaymentCollector

class val.paymentCollector
    implements com.contextlogic.wish.api.service.reCallback
{

    final TokenizedStripeGoogleWalletPaymentCollector this$0;
    final val.paymentCollector val$failureListener;
    final GoogleWalletPaymentCollector val$paymentCollector;

    public void onServiceFailed(String s)
    {
        notifyWalletTransaction(fullWallet.getGoogleTransactionId(), false);
        Bundle bundle = new Bundle();
        String s1 = s;
        if (s == null)
        {
            s1 = WishApplication.getAppInstance().getString(0x7f060203);
        }
        bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s1);
        val$failureListener.nFailure(val$paymentCollector, bundle);
    }

    ()
    {
        this$0 = final_tokenizedstripegooglewalletpaymentcollector;
        val$failureListener = ;
        val$paymentCollector = GoogleWalletPaymentCollector.this;
        super();
    }
}
