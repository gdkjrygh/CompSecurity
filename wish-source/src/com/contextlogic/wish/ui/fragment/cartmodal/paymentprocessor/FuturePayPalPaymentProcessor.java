// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishBraintreePayPalInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.CompleteFuturePayPalPaymentService;
import com.contextlogic.wish.api.service.PreAuthorizePayPalPaymentService;
import com.contextlogic.wish.paypal.PayPalManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            CartPaymentProcessor

public class FuturePayPalPaymentProcessor extends CartPaymentProcessor
{

    private CompleteFuturePayPalPaymentService completeFuturePayPalPaymentService;
    private PreAuthorizePayPalPaymentService preAuthorizePayPalPaymentService;

    public FuturePayPalPaymentProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        completeFuturePayPalPaymentService = new CompleteFuturePayPalPaymentService();
        preAuthorizePayPalPaymentService = new PreAuthorizePayPalPaymentService();
    }

    private void handlePayPalAuthorization(final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        PayPalManager.getInstance().startFuturePayment(cartManager.getActivity(), new com.contextlogic.wish.paypal.PayPalManager.FuturePaymentCallback() {

            final FuturePayPalPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onFuturePaymentCancelled()
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_CANCEL);
                Bundle bundle = new Bundle();
                String s = WishApplication.getAppInstance().getString(0x7f06032d);
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
                failureListener.onFailure(FuturePayPalPaymentProcessor.this, bundle);
            }

            public void onFuturePaymentError()
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_AUTH_ERROR);
                Bundle bundle = new Bundle();
                String s = WishApplication.getAppInstance().getString(0x7f06032d);
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
                failureListener.onFailure(FuturePayPalPaymentProcessor.this, bundle);
            }

            public void onFuturePaymentSucceeded(String s)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_AUTH_SUCCESS);
                savePayPalAuthorization(successListener, failureListener, s);
            }

            public void onHideLoadingSpinner()
            {
                cartManager.hideLoadingSpinner();
            }

            public void onShowLoadingSpinner()
            {
                cartManager.showLoadingSpinner();
            }

            
            {
                this$0 = FuturePayPalPaymentProcessor.this;
                successListener = successlistener;
                failureListener = failurelistener;
                super();
            }
        });
    }

    private void savePayPalAuthorization(final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener, String s)
    {
        cartManager.showLoadingSpinner();
        preAuthorizePayPalPaymentService.requestService(s, new com.contextlogic.wish.api.service.PreAuthorizePayPalPaymentService.SuccessCallback() {

            final FuturePayPalPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo)
            {
                paymentProcessor.cartManager.updateData(paymentProcessor.cartManager.getCart(), paymentProcessor.cartManager.getShippingInfo(), wishuserbillinginfo);
                checkout(successListener, failureListener);
            }

            
            {
                this$0 = FuturePayPalPaymentProcessor.this;
                paymentProcessor = cartpaymentprocessor;
                successListener = successlistener;
                failureListener = failurelistener;
                super();
            }
        }, new com.contextlogic.wish.api.service.PreAuthorizePayPalPaymentService.FailureCallback() {

            final FuturePayPalPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;

            public void onServiceFailed(String s1)
            {
                Bundle bundle = new Bundle();
                String s2 = s1;
                if (s1 == null)
                {
                    s2 = WishApplication.getAppInstance().getString(0x7f06032d);
                }
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s2);
                failureListener.onFailure(paymentProcessor, bundle);
            }

            
            {
                this$0 = FuturePayPalPaymentProcessor.this;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        });
    }

    public void checkout(final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        if (cartManager.getUserBillingInfo() == null || cartManager.getUserBillingInfo().getBraintreePayPalInfo() == null || cartManager.getUserBillingInfo().getBraintreePayPalInfo().getPaymentMethodToken() == null)
        {
            handlePayPalAuthorization(successListener, failureListener);
            return;
        }
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_ORDER);
        String s = null;
        if (cartManager.getActivity() != null)
        {
            s = cartManager.getActivity().getDeviceCollectorSessionId();
        }
        completeFuturePayPalPaymentService.requestService(s, cartManager.getCurrencyCode(), cartManager.getCheckoutOfferId(), new com.contextlogic.wish.api.service.CompleteFuturePayPalPaymentService.SuccessCallback() {

            final FuturePayPalPaymentProcessor this$0;
            final CartPaymentProcessor val$paymentProcessor;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onServiceSucceeded(String s1)
            {
                handleSuccessfulPayment();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_FUTURE_PAY_SUCCESS);
                Bundle bundle = new Bundle();
                bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s1);
                successListener.onSuccess(paymentProcessor, bundle);
            }

            
            {
                this$0 = FuturePayPalPaymentProcessor.this;
                successListener = successlistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        }, new com.contextlogic.wish.api.service.CompleteFuturePayPalPaymentService.FailureCallback() {

            final FuturePayPalPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onServiceFailed(String s1, boolean flag)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_FUTURE_PAY_ERROR);
                if (flag)
                {
                    paymentProcessor.cartManager.getUserBillingInfo().getBraintreePayPalInfo().revokePaymentMethodToken();
                    checkout(successListener, failureListener);
                    return;
                }
                Bundle bundle = new Bundle();
                String s2 = s1;
                if (s1 == null)
                {
                    s2 = WishApplication.getAppInstance().getString(0x7f06032d);
                }
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s2);
                failureListener.onFailure(paymentProcessor, bundle);
            }

            
            {
                this$0 = FuturePayPalPaymentProcessor.this;
                paymentProcessor = cartpaymentprocessor;
                successListener = successlistener;
                failureListener = failurelistener;
                super();
            }
        });
    }

}
