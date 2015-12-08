// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.InitiateAdyenPaymentService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            CartPaymentProcessor

public class AdyenCreditCardPaymentProcessor extends CartPaymentProcessor
{

    private InitiateAdyenPaymentService initiateAdyenPaymentService;

    public AdyenCreditCardPaymentProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        initiateAdyenPaymentService = new InitiateAdyenPaymentService();
    }

    public void checkout(final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PLACE_ORDER);
        initiateAdyenPaymentService.requestService(cartManager.getCurrencyCode(), cartManager.getCheckoutOfferId(), null, null, new com.contextlogic.wish.api.service.InitiateAdyenPaymentService.SuccessCallback() {

            final AdyenCreditCardPaymentProcessor this$0;
            final CartPaymentProcessor val$paymentProcessor;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onServiceSucceeded(String s)
            {
                handleSuccessfulPayment();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PLACE_ORDER_SUCCESS);
                Bundle bundle = new Bundle();
                bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s);
                successListener.onSuccess(paymentProcessor, bundle);
            }

            
            {
                this$0 = AdyenCreditCardPaymentProcessor.this;
                successListener = successlistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        }, new com.contextlogic.wish.api.service.InitiateAdyenPaymentService.FailureCallback() {

            final AdyenCreditCardPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;

            public void onServiceFailed(String s)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PLACE_ORDER_FAILURE);
                Bundle bundle = new Bundle();
                String s1 = s;
                if (s == null)
                {
                    s1 = WishApplication.getAppInstance().getString(0x7f060203);
                }
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s1);
                failureListener.onFailure(paymentProcessor, bundle);
            }

            
            {
                this$0 = AdyenCreditCardPaymentProcessor.this;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        });
    }
}
