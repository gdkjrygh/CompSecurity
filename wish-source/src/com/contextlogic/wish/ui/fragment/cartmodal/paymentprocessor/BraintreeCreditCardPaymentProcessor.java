// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCachedBillingInfo;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCreditCardInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.InitiateBraintreePaymentService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            CartPaymentProcessor

public class BraintreeCreditCardPaymentProcessor extends CartPaymentProcessor
{

    private InitiateBraintreePaymentService initiateBraintreePaymentService;

    public BraintreeCreditCardPaymentProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        initiateBraintreePaymentService = new InitiateBraintreePaymentService();
    }

    public void checkout(final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PLACE_ORDER);
        String s1 = null;
        Object obj = null;
        Object obj1 = cartManager.getUserBillingInfo();
        Object obj2 = cartManager.getCart();
        String s = s1;
        com.contextlogic.wish.api.data.WishShippingInfo wishshippinginfo = obj;
        if (obj1 != null)
        {
            s = s1;
            wishshippinginfo = obj;
            if (obj2 != null)
            {
                s = s1;
                wishshippinginfo = obj;
                if (((WishUserBillingInfo) (obj1)).getCreditCardInfo(((WishCart) (obj2)).getPaymentProcessor()) != null)
                {
                    s = s1;
                    wishshippinginfo = obj;
                    if (LoggedInUser.getInstance().getCachedBillingInfo() != null)
                    {
                        obj2 = ((WishUserBillingInfo) (obj1)).getCreditCardInfo(((WishCart) (obj2)).getPaymentProcessor());
                        obj1 = LoggedInUser.getInstance().getCachedBillingInfo();
                        s = s1;
                        wishshippinginfo = obj;
                        if (((WishCreditCardInfo) (obj2)).getLastFourDigits() != null)
                        {
                            s = s1;
                            wishshippinginfo = obj;
                            if (((WishCachedBillingInfo) (obj1)).getLastFourDigits() != null)
                            {
                                s = s1;
                                wishshippinginfo = obj;
                                if (((WishCreditCardInfo) (obj2)).getLastFourDigits().equals(((WishCachedBillingInfo) (obj1)).getLastFourDigits()))
                                {
                                    s = ((WishCachedBillingInfo) (obj1)).getCardNonce();
                                    ((WishCachedBillingInfo) (obj1)).clearNonce();
                                    wishshippinginfo = ((WishCachedBillingInfo) (obj1)).getBillingAddress();
                                }
                            }
                        }
                    }
                }
            }
        }
        s1 = null;
        if (cartManager.getActivity() != null)
        {
            s1 = cartManager.getActivity().getDeviceCollectorSessionId();
        }
        initiateBraintreePaymentService.requestService(cartManager.getCurrencyCode(), s, wishshippinginfo, cartManager.getCheckoutOfferId(), null, null, s1, new com.contextlogic.wish.api.service.InitiateBraintreePaymentService.SuccessCallback() {

            final BraintreeCreditCardPaymentProcessor this$0;
            final CartPaymentProcessor val$paymentProcessor;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onServiceSucceeded(String s2)
            {
                handleSuccessfulPayment();
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PLACE_ORDER_SUCCESS);
                Bundle bundle = new Bundle();
                bundle.putString(CartPaymentProcessor.DATA_KEY_TRANSACTION_ID, s2);
                successListener.onSuccess(paymentProcessor, bundle);
            }

            
            {
                this$0 = BraintreeCreditCardPaymentProcessor.this;
                successListener = successlistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        }, new com.contextlogic.wish.api.service.InitiateBraintreePaymentService.FailureCallback() {

            final BraintreeCreditCardPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;

            public void onServiceFailed(String s2)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_PLACE_ORDER_FAILURE);
                Bundle bundle = new Bundle();
                String s3 = s2;
                if (s2 == null)
                {
                    s3 = WishApplication.getAppInstance().getString(0x7f060203);
                }
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s3);
                failureListener.onFailure(paymentProcessor, bundle);
            }

            
            {
                this$0 = BraintreeCreditCardPaymentProcessor.this;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        });
    }
}
