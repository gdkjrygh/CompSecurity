// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.PreVerifyPayPalPaymentService;
import com.contextlogic.wish.api.service.VerifyPayPalPaymentService;
import com.contextlogic.wish.paypal.PayPalManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            CartPaymentProcessor

public class NativePayPalPaymentProcessor extends CartPaymentProcessor
{

    private PreVerifyPayPalPaymentService preVerifyPayPalPaymentService;
    private VerifyPayPalPaymentService verifyPayPalPaymentService;

    public NativePayPalPaymentProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        preVerifyPayPalPaymentService = new PreVerifyPayPalPaymentService();
        verifyPayPalPaymentService = new VerifyPayPalPaymentService();
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
        preVerifyPayPalPaymentService.requestService(s, s1, s2, s3, s4, s5, s6, ((String) (obj)), cartManager.getCurrencyCode(), new com.contextlogic.wish.api.service.PreVerifyPayPalPaymentService.SuccessCallback() {

            final NativePayPalPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_PREPAY_SUCCESS);
                cartManager.updateData(wishcart, wishshippinginfo, wishuserbillinginfo);
                PayPalManager.getInstance().startPayment(cartManager.getActivity(), cartManager.getCart(), CartExperimentManager.mustUseUsd(cartManager), new com.contextlogic.wish.paypal.PayPalManager.PaymentCallback() {

                    final _cls1 this$1;

                    public void onHideLoadingSpinner()
                    {
                        cartManager.hideLoadingSpinner();
                    }

                    public void onPaymentCancelled()
                    {
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_CANCEL);
                        failureListener.onCancel(paymentProcessor);
                    }

                    public void onPaymentError()
                    {
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_PAY_ERROR);
                        Bundle bundle = new Bundle();
                        String s = WishApplication.getAppInstance().getString(0x7f06032d);
                        bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
                        failureListener.onFailure(paymentProcessor, bundle);
                    }

                    public void onPaymentSucceeded(String s)
                    {
                        cartManager.showLoadingSpinner();
                        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_PAY_SUCCESS);
                        String s1 = null;
                        if (cartManager.getActivity() != null)
                        {
                            s1 = cartManager.getActivity().getDeviceCollectorSessionId();
                        }
                        verifyPayPalPaymentService.requestService(s, s1, cartManager.getCurrencyCode(), cartManager.getCheckoutOfferId(), new com.contextlogic.wish.api.service.VerifyPayPalPaymentService.SuccessCallback() {

                            final _cls1 this$2;

                            public void onServiceSucceeded(String s)
                            {
                                handleSuccessfulPayment();
                                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_VERIFY_SUCCESS);
                                Bundle bundle = new Bundle();
                                bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s);
                                successListener.onSuccess(paymentProcessor, bundle);
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        }, new com.contextlogic.wish.api.service.VerifyPayPalPaymentService.FailureCallback() {

                            final _cls1 this$2;

                            public void onServiceFailed(String s)
                            {
                                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_VERIFY_ERROR);
                                Bundle bundle = new Bundle();
                                String s1 = s;
                                if (s == null)
                                {
                                    s1 = WishApplication.getAppInstance().getString(0x7f06032d);
                                }
                                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s1);
                                failureListener.onFailure(paymentProcessor, bundle);
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                    }

                    public void onShowLoadingSpinner()
                    {
                        cartManager.showLoadingSpinner();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = NativePayPalPaymentProcessor.this;
                successListener = successlistener;
                paymentProcessor = cartpaymentprocessor;
                failureListener = failurelistener;
                super();
            }
        }, new com.contextlogic.wish.api.service.PreVerifyPayPalPaymentService.FailureCallback() {

            final NativePayPalPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;

            public void onServiceFailed(String s7)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_PREPAY_ERROR);
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
                this$0 = NativePayPalPaymentProcessor.this;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        });
    }

}
