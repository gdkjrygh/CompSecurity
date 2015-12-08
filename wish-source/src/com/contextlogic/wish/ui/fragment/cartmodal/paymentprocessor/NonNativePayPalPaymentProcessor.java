// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.service.InitiatePayPalPaymentService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            CartPaymentProcessor

public class NonNativePayPalPaymentProcessor extends CartPaymentProcessor
{

    private InitiatePayPalPaymentService initiatePayPalPaymentService;

    public NonNativePayPalPaymentProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        initiatePayPalPaymentService = new InitiatePayPalPaymentService();
    }

    public void checkout(final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_ORDER);
        Object obj = cartManager.getShippingInfo();
        String s = ((WishShippingInfo) (obj)).getName();
        String s1 = ((WishShippingInfo) (obj)).getStreetAddressLineOne();
        String s2 = ((WishShippingInfo) (obj)).getStreetAddressLineTwo();
        String s3 = ((WishShippingInfo) (obj)).getCity();
        String s4 = ((WishShippingInfo) (obj)).getState();
        String s5 = ((WishShippingInfo) (obj)).getZipCode();
        String s6 = ((WishShippingInfo) (obj)).getCountryCode();
        obj = ((WishShippingInfo) (obj)).getPhoneNumber();
        initiatePayPalPaymentService.requestService(s, s1, s2, s3, s4, s5, s6, ((String) (obj)), cartManager.getCurrencyCode(), cartManager.getCheckoutOfferId(), new com.contextlogic.wish.api.service.InitiatePayPalPaymentService.SuccessCallback() {

            final NonNativePayPalPaymentProcessor this$0;
            final CartPaymentProcessor val$paymentProcessor;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onServiceSucceeded(String s7)
            {
                handleSuccessfulPayment();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_SUCCESS);
                Bundle bundle = new Bundle();
                bundle.putString(CartPaymentProcessor.DATA_KEY_BUY_URL, s7);
                successListener.onSuccess(paymentProcessor, bundle);
            }

            
            {
                this$0 = NonNativePayPalPaymentProcessor.this;
                successListener = successlistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        }, new com.contextlogic.wish.api.service.InitiatePayPalPaymentService.FailureCallback() {

            final NonNativePayPalPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;

            public void onServiceFailed(String s7)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_FAILURE);
                Bundle bundle = new Bundle();
                String s8 = s7;
                if (s7 == null)
                {
                    s8 = WishApplication.getAppInstance().getString(0x7f06032d);
                }
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s8);
                failureListener.onFailure(paymentProcessor, bundle);
            }

            
            {
                this$0 = NonNativePayPalPaymentProcessor.this;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        });
    }
}
