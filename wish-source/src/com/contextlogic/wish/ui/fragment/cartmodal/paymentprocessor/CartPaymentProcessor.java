// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.paypal.PayPalManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.user.LoggedInUser;

public abstract class CartPaymentProcessor
{
    public static interface FailureListener
    {

        public abstract void onCancel(CartPaymentProcessor cartpaymentprocessor);

        public abstract void onFailure(CartPaymentProcessor cartpaymentprocessor, Bundle bundle);
    }

    public static interface SuccessListener
    {

        public abstract void onSuccess(CartPaymentProcessor cartpaymentprocessor, Bundle bundle);
    }


    public static String DATA_KEY_BUY_URL = "DataKeyBuyUrl";
    public static String DATA_KEY_ERROR_MESSAGE = "DataKeyErrorMessage";
    public static String DATA_KEY_SHOW_IN_MODAL = "DataKeyShowInModal";
    public static String DATA_KEY_TRANSACTION_ID = "DataKeyTransactionId";
    protected CartManager cartManager;

    public CartPaymentProcessor(CartManager cartmanager)
    {
        cartManager = cartmanager;
    }

    public abstract void checkout(SuccessListener successlistener, FailureListener failurelistener);

    public void handleSuccessfulPayment()
    {
        if (cartManager.getActivity() != null)
        {
            cartManager.getActivity().resetDeviceCollectorSession();
        }
        GooglePlusManager.getInstance().resetBraintree();
        PayPalManager.getInstance().resetBraintree();
        LoggedInUser.getInstance().setCachedBillingInfo(null);
    }

    protected void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }

}
