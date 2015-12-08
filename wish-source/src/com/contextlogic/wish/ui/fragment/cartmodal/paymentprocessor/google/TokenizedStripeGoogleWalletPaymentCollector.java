// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.service.InitiateGoogleWalletStripePaymentService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor;
import com.google.android.gms.wallet.FullWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google:
//            GoogleWalletPaymentCollector

public class TokenizedStripeGoogleWalletPaymentCollector extends GoogleWalletPaymentCollector
{

    private InitiateGoogleWalletStripePaymentService initiateGoogleWalletStripePaymentService;
    private String stripeToken;

    public TokenizedStripeGoogleWalletPaymentCollector(FullWallet fullwallet, String s, CartManager cartmanager)
    {
        super(fullwallet, cartmanager);
        stripeToken = s;
        initiateGoogleWalletStripePaymentService = new InitiateGoogleWalletStripePaymentService();
    }

    public void collectPayment(final GoogleWalletPaymentCollector.SuccessListener successListener, final GoogleWalletPaymentCollector.FailureListener failureListener)
    {
        initiateGoogleWalletStripePaymentService.requestService(cartManager.getCurrencyCode(), stripeToken, fullWallet, cartManager.getCheckoutOfferId(), new com.contextlogic.wish.api.service.InitiateGoogleWalletStripePaymentService.SuccessCallback() {

            final TokenizedStripeGoogleWalletPaymentCollector this$0;
            final GoogleWalletPaymentCollector val$paymentCollector;
            final GoogleWalletPaymentCollector.SuccessListener val$successListener;

            public void onServiceSucceeded(String s)
            {
                notifyWalletTransaction(fullWallet.getGoogleTransactionId(), true);
                Bundle bundle = new Bundle();
                bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s);
                successListener.onSuccess(paymentCollector, bundle);
            }

            
            {
                this$0 = TokenizedStripeGoogleWalletPaymentCollector.this;
                successListener = successlistener;
                paymentCollector = googlewalletpaymentcollector;
                super();
            }
        }, new com.contextlogic.wish.api.service.InitiateGoogleWalletStripePaymentService.FailureCallback() {

            final TokenizedStripeGoogleWalletPaymentCollector this$0;
            final GoogleWalletPaymentCollector.FailureListener val$failureListener;
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
                failureListener.onFailure(paymentCollector, bundle);
            }

            
            {
                this$0 = TokenizedStripeGoogleWalletPaymentCollector.this;
                failureListener = failurelistener;
                paymentCollector = googlewalletpaymentcollector;
                super();
            }
        });
    }
}
