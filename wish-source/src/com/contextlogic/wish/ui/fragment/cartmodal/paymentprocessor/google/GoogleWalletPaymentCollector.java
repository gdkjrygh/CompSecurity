// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google;

import android.os.Bundle;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet;

public abstract class GoogleWalletPaymentCollector
{
    public static interface FailureListener
    {

        public abstract void onFailure(GoogleWalletPaymentCollector googlewalletpaymentcollector, Bundle bundle);
    }

    public static interface SuccessListener
    {

        public abstract void onSuccess(GoogleWalletPaymentCollector googlewalletpaymentcollector, Bundle bundle);
    }


    protected CartManager cartManager;
    protected FullWallet fullWallet;

    public GoogleWalletPaymentCollector(FullWallet fullwallet, CartManager cartmanager)
    {
        fullWallet = fullwallet;
        cartManager = cartmanager;
    }

    public abstract void collectPayment(SuccessListener successlistener, FailureListener failurelistener);

    protected void notifyWalletTransaction(final String googleTransactionId, final boolean success)
    {
        GooglePlusManager.getInstance().getWalletClient(cartManager, cartManager.getActivity(), new com.contextlogic.wish.googleplus.GooglePlusManager.WalletClientCallback() {

            final GoogleWalletPaymentCollector this$0;
            final String val$googleTransactionId;
            final boolean val$success;

            public void onWalletClientLoadFailed(int i)
            {
            }

            public void onWalletClientLoaded(GoogleApiClient googleapiclient)
            {
                NotifyTransactionStatusRequest notifytransactionstatusrequest;
                if (success)
                {
                    notifytransactionstatusrequest = NotifyTransactionStatusRequest.newBuilder().setGoogleTransactionId(googleTransactionId).setStatus(1).build();
                } else
                {
                    notifytransactionstatusrequest = NotifyTransactionStatusRequest.newBuilder().setGoogleTransactionId(googleTransactionId).setStatus(2).build();
                }
                Wallet.Payments.notifyTransactionStatus(googleapiclient, notifytransactionstatusrequest);
            }

            
            {
                this$0 = GoogleWalletPaymentCollector.this;
                success = flag;
                googleTransactionId = s;
                super();
            }
        });
    }
}
