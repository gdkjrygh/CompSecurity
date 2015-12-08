// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.service.InitiateGoogleWalletBraintreePaymentService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.CartPaymentProcessor;
import com.google.android.gms.wallet.FullWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google:
//            GoogleWalletPaymentCollector

public class TokenizedBraintreeGoogleWalletPaymentCollector extends GoogleWalletPaymentCollector
{

    private String braintreeNonce;
    private InitiateGoogleWalletBraintreePaymentService initiateGoogleWalletBraintreePaymentService;

    public TokenizedBraintreeGoogleWalletPaymentCollector(FullWallet fullwallet, String s, CartManager cartmanager)
    {
        super(fullwallet, cartmanager);
        braintreeNonce = s;
        initiateGoogleWalletBraintreePaymentService = new InitiateGoogleWalletBraintreePaymentService();
    }

    public void collectPayment(final GoogleWalletPaymentCollector.SuccessListener successListener, final GoogleWalletPaymentCollector.FailureListener failureListener)
    {
        String s = null;
        if (cartManager.getActivity() != null)
        {
            s = cartManager.getActivity().getDeviceCollectorSessionId();
        }
        initiateGoogleWalletBraintreePaymentService.requestService(cartManager.getCurrencyCode(), fullWallet, braintreeNonce, cartManager.getCheckoutOfferId(), s, true, new com.contextlogic.wish.api.service.InitiateGoogleWalletBraintreePaymentService.SuccessCallback() {

            final TokenizedBraintreeGoogleWalletPaymentCollector this$0;
            final GoogleWalletPaymentCollector val$paymentCollector;
            final GoogleWalletPaymentCollector.SuccessListener val$successListener;

            public void onServiceSucceeded(String s1)
            {
                notifyWalletTransaction(fullWallet.getGoogleTransactionId(), true);
                Bundle bundle = new Bundle();
                bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s1);
                successListener.onSuccess(paymentCollector, bundle);
            }

            
            {
                this$0 = TokenizedBraintreeGoogleWalletPaymentCollector.this;
                successListener = successlistener;
                paymentCollector = googlewalletpaymentcollector;
                super();
            }
        }, new com.contextlogic.wish.api.service.InitiateGoogleWalletBraintreePaymentService.FailureCallback() {

            final TokenizedBraintreeGoogleWalletPaymentCollector this$0;
            final GoogleWalletPaymentCollector.FailureListener val$failureListener;
            final GoogleWalletPaymentCollector val$paymentCollector;

            public void onServiceFailed(String s1)
            {
                notifyWalletTransaction(fullWallet.getGoogleTransactionId(), false);
                Bundle bundle = new Bundle();
                String s2 = s1;
                if (s1 == null)
                {
                    s2 = WishApplication.getAppInstance().getString(0x7f060203);
                }
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s2);
                failureListener.onFailure(paymentCollector, bundle);
            }

            
            {
                this$0 = TokenizedBraintreeGoogleWalletPaymentCollector.this;
                failureListener = failurelistener;
                paymentCollector = googlewalletpaymentcollector;
                super();
            }
        });
    }
}
