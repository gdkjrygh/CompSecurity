// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google:
//            GoogleWalletPaymentCollector

class val.googleTransactionId
    implements com.contextlogic.wish.googleplus.allback
{

    final GoogleWalletPaymentCollector this$0;
    final String val$googleTransactionId;
    final boolean val$success;

    public void onWalletClientLoadFailed(int i)
    {
    }

    public void onWalletClientLoaded(GoogleApiClient googleapiclient)
    {
        NotifyTransactionStatusRequest notifytransactionstatusrequest;
        if (val$success)
        {
            notifytransactionstatusrequest = NotifyTransactionStatusRequest.newBuilder().setGoogleTransactionId(val$googleTransactionId).setStatus(1).build();
        } else
        {
            notifytransactionstatusrequest = NotifyTransactionStatusRequest.newBuilder().setGoogleTransactionId(val$googleTransactionId).setStatus(2).build();
        }
        Wallet.Payments.notifyTransactionStatus(googleapiclient, notifytransactionstatusrequest);
    }

    ()
    {
        this$0 = final_googlewalletpaymentcollector;
        val$success = flag;
        val$googleTransactionId = String.this;
        super();
    }
}
