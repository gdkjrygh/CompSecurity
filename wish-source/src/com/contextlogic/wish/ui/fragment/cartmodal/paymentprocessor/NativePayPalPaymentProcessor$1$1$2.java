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
import com.contextlogic.wish.api.service.VerifyPayPalPaymentService;
import com.contextlogic.wish.paypal.PayPalManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            NativePayPalPaymentProcessor, CartPaymentProcessor

class this._cls2
    implements com.contextlogic.wish.api.service.allback
{

    final paymentProcessor this$2;

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

    r()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/paymentprocessor/NativePayPalPaymentProcessor$1

/* anonymous class */
    class NativePayPalPaymentProcessor._cls1
        implements com.contextlogic.wish.api.service.PreVerifyPayPalPaymentService.SuccessCallback
    {

        final NativePayPalPaymentProcessor this$0;
        final CartPaymentProcessor.FailureListener val$failureListener;
        final CartPaymentProcessor val$paymentProcessor;
        final CartPaymentProcessor.SuccessListener val$successListener;

        public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_PREPAY_SUCCESS);
            cartManager.updateData(wishcart, wishshippinginfo, wishuserbillinginfo);
            PayPalManager.getInstance().startPayment(cartManager.getActivity(), cartManager.getCart(), CartExperimentManager.mustUseUsd(cartManager), new NativePayPalPaymentProcessor._cls1._cls1());
        }

            
            {
                this$0 = final_nativepaypalpaymentprocessor;
                successListener = successlistener;
                paymentProcessor = cartpaymentprocessor;
                failureListener = CartPaymentProcessor.FailureListener.this;
                super();
            }
    }


    // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/paymentprocessor/NativePayPalPaymentProcessor$1$1

/* anonymous class */
    class NativePayPalPaymentProcessor._cls1._cls1
        implements com.contextlogic.wish.paypal.PayPalManager.PaymentCallback
    {

        final NativePayPalPaymentProcessor._cls1 this$1;

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
            NativePayPalPaymentProcessor.access$000(this$0).requestService(s, s1, cartManager.getCurrencyCode(), cartManager.getCheckoutOfferId(), new NativePayPalPaymentProcessor._cls1._cls1._cls1(), new NativePayPalPaymentProcessor._cls1._cls1._cls2());
        }

        public void onShowLoadingSpinner()
        {
            cartManager.showLoadingSpinner();
        }

            
            {
                this$1 = NativePayPalPaymentProcessor._cls1.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/cartmodal/paymentprocessor/NativePayPalPaymentProcessor$1$1$1

/* anonymous class */
        class NativePayPalPaymentProcessor._cls1._cls1._cls1
            implements com.contextlogic.wish.api.service.VerifyPayPalPaymentService.SuccessCallback
        {

            final NativePayPalPaymentProcessor._cls1._cls1 this$2;

            public void onServiceSucceeded(String s)
            {
                handleSuccessfulPayment();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PAYPAL_VERIFY_SUCCESS);
                Bundle bundle = new Bundle();
                bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s);
                successListener.onSuccess(paymentProcessor, bundle);
            }

                    
                    {
                        this$2 = NativePayPalPaymentProcessor._cls1._cls1.this;
                        super();
                    }
        }

    }

}
