// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google;

import android.os.Bundle;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor;
import com.google.android.gms.wallet.FullWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google:
//            TokenizedStripeGoogleWalletPaymentCollector, GoogleWalletPaymentCollector

class val.paymentCollector
    implements com.contextlogic.wish.api.service.ssCallback
{

    final TokenizedStripeGoogleWalletPaymentCollector this$0;
    final GoogleWalletPaymentCollector val$paymentCollector;
    final val.paymentCollector val$successListener;

    public void onServiceSucceeded(String s)
    {
        notifyWalletTransaction(fullWallet.getGoogleTransactionId(), true);
        Bundle bundle = new Bundle();
        bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s);
        val$successListener.nSuccess(val$paymentCollector, bundle);
    }

    ()
    {
        this$0 = final_tokenizedstripegooglewalletpaymentcollector;
        val$successListener = ;
        val$paymentCollector = GoogleWalletPaymentCollector.this;
        super();
    }
}
