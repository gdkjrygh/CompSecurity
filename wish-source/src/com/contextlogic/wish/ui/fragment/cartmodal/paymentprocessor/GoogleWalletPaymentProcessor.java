// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import android.os.Bundle;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.service.UpdateShippingInfoService;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google.GoogleWalletPaymentCollector;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google.TokenizedBraintreeGoogleWalletPaymentCollector;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google.TokenizedStripeGoogleWalletPaymentCollector;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            CartPaymentProcessor

public class GoogleWalletPaymentProcessor extends CartPaymentProcessor
{

    private UpdateShippingInfoService updateShippingInfoService;

    public GoogleWalletPaymentProcessor(CartManager cartmanager)
    {
        super(cartmanager);
        updateShippingInfoService = new UpdateShippingInfoService();
    }

    private void chargeFullWallet(GoogleApiClient googleapiclient, FullWallet fullwallet, String s, String s1, final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        googleapiclient = null;
        if (s1 != null)
        {
            googleapiclient = new TokenizedBraintreeGoogleWalletPaymentCollector(fullwallet, s1, cartManager);
        } else
        if (s != null)
        {
            googleapiclient = new TokenizedStripeGoogleWalletPaymentCollector(fullwallet, s, cartManager);
        }
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_ORDER);
        if (googleapiclient != null)
        {
            googleapiclient.collectPayment(new com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google.GoogleWalletPaymentCollector.SuccessListener() {

                final GoogleWalletPaymentProcessor this$0;
                final CartPaymentProcessor val$paymentProcessor;
                final CartPaymentProcessor.SuccessListener val$successListener;

                public void onSuccess(GoogleWalletPaymentCollector googlewalletpaymentcollector, Bundle bundle)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_ORDER_SUCCESS);
                    successListener.onSuccess(paymentProcessor, bundle);
                }

            
            {
                this$0 = GoogleWalletPaymentProcessor.this;
                successListener = successlistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
            }, new com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.google.GoogleWalletPaymentCollector.FailureListener() {

                final GoogleWalletPaymentProcessor this$0;
                final CartPaymentProcessor.FailureListener val$failureListener;
                final CartPaymentProcessor val$paymentProcessor;

                public void onFailure(GoogleWalletPaymentCollector googlewalletpaymentcollector, Bundle bundle)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_ORDER_FAILURE);
                    failureListener.onFailure(paymentProcessor, bundle);
                }

            
            {
                this$0 = GoogleWalletPaymentProcessor.this;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
            });
            return;
        } else
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_ORDER_FAILURE);
            googleapiclient = new Bundle();
            fullwallet = GooglePlusManager.getGoogleWalletErrorMessage(413, null);
            googleapiclient.putString(DATA_KEY_ERROR_MESSAGE, fullwallet);
            failureListener.onFailure(this, googleapiclient);
            return;
        }
    }

    private void loadFullWallet(final GoogleApiClient client, final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        try
        {
            GooglePlusManager.getInstance().loadFullWallet(client, GooglePlusManager.createFullWalletRequest(cartManager, cartManager.getGoogleWalletMaskedWallet()), new com.contextlogic.wish.googleplus.GooglePlusManager.FullWalletIntentCallback() {

                final GoogleWalletPaymentProcessor this$0;
                final GoogleApiClient val$client;
                final CartPaymentProcessor.FailureListener val$failureListener;
                final CartPaymentProcessor val$paymentProcessor;
                final CartPaymentProcessor.SuccessListener val$successListener;

                public CartManager getCartManager()
                {
                    return cartManager;
                }

                public void onFullWalletCancelled()
                {
                    failureListener.onCancel(paymentProcessor);
                }

                public void onFullWalletError(int i)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_FAILURE);
                    Bundle bundle = new Bundle();
                    String s = GooglePlusManager.getGoogleWalletErrorMessage(i, null);
                    bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
                    failureListener.onFailure(paymentProcessor, bundle);
                }

                public void onFullWalletSuccess(FullWallet fullwallet, String s, String s1)
                {
                    cartManager.markGoogleWalletMaskedWalletNeedsReload();
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_SUCCESS);
                    chargeFullWallet(client, fullwallet, s, s1, successListener, failureListener);
                }

            
            {
                this$0 = GoogleWalletPaymentProcessor.this;
                client = googleapiclient;
                successListener = successlistener;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final GoogleApiClient client)
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_FAILURE);
        }
        client = new Bundle();
        successListener = GooglePlusManager.getGoogleWalletErrorMessage(413, null);
        client.putString(DATA_KEY_ERROR_MESSAGE, successListener);
        failureListener.onFailure(this, client);
    }

    private void reloadMaskedWallet(final GoogleApiClient client, final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        try
        {
            GooglePlusManager.getInstance().loadMaskedWallet(client, GooglePlusManager.createMaskedWalletRequest(cartManager), new com.contextlogic.wish.googleplus.GooglePlusManager.MaskedWalletIntentCallback() {

                final GoogleWalletPaymentProcessor this$0;
                final GoogleApiClient val$client;
                final CartPaymentProcessor.FailureListener val$failureListener;
                final CartPaymentProcessor val$paymentProcessor;
                final CartPaymentProcessor.SuccessListener val$successListener;

                public void onMaskedWalletCancelled()
                {
                    failureListener.onCancel(paymentProcessor);
                }

                public void onMaskedWalletError(int i)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_FAILURE);
                    Bundle bundle = new Bundle();
                    String s = GooglePlusManager.getGoogleWalletErrorMessage(i, null);
                    bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
                    failureListener.onFailure(paymentProcessor, bundle);
                }

                public void onMaskedWalletSuccess(MaskedWallet maskedwallet)
                {
                    cartManager.updateGoogleWalletMaskedWallet(maskedwallet);
                    saveShippingAddress(client, successListener, failureListener);
                }

            
            {
                this$0 = GoogleWalletPaymentProcessor.this;
                client = googleapiclient;
                successListener = successlistener;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final GoogleApiClient client)
        {
            trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_FAILURE);
        }
        client = new Bundle();
        successListener = GooglePlusManager.getGoogleWalletErrorMessage(413, null);
        client.putString(DATA_KEY_ERROR_MESSAGE, successListener);
        failureListener.onFailure(this, client);
    }

    private void saveShippingAddress(final GoogleApiClient client, final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        Object obj = cartManager.getGoogleWalletMaskedWallet();
        String s = ((MaskedWallet) (obj)).getShippingAddress().getName();
        String s1 = ((MaskedWallet) (obj)).getShippingAddress().getAddress1();
        String s2 = ((MaskedWallet) (obj)).getShippingAddress().getAddress2();
        String s3 = ((MaskedWallet) (obj)).getShippingAddress().getCity();
        String s4 = ((MaskedWallet) (obj)).getShippingAddress().getState();
        String s5 = ((MaskedWallet) (obj)).getShippingAddress().getPostalCode();
        String s6 = ((MaskedWallet) (obj)).getShippingAddress().getCountryCode();
        obj = ((MaskedWallet) (obj)).getShippingAddress().getPhoneNumber();
        updateShippingInfoService.requestService(s, s1, s2, s3, s4, s5, s6, ((String) (obj)), null, null, new com.contextlogic.wish.api.service.UpdateShippingInfoService.SuccessCallback() {

            final GoogleWalletPaymentProcessor this$0;
            final GoogleApiClient val$client;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart)
            {
                cartManager.updateData(wishcart, wishshippinginfo, cartManager.getUserBillingInfo());
                loadFullWallet(client, successListener, failureListener);
            }

            
            {
                this$0 = GoogleWalletPaymentProcessor.this;
                client = googleapiclient;
                successListener = successlistener;
                failureListener = failurelistener;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateShippingInfoService.FailureCallback() {

            final GoogleWalletPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;

            public void onServiceFailed(String s7)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_FAILURE);
                Bundle bundle = new Bundle();
                s7 = GooglePlusManager.getGoogleWalletErrorMessage(413, s7);
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s7);
                failureListener.onFailure(paymentProcessor, bundle);
            }

            
            {
                this$0 = GoogleWalletPaymentProcessor.this;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        });
    }

    public void checkout(final CartPaymentProcessor.SuccessListener successListener, final CartPaymentProcessor.FailureListener failureListener)
    {
        GooglePlusManager.getInstance().getWalletClient(cartManager, cartManager.getActivity(), new com.contextlogic.wish.googleplus.GooglePlusManager.WalletClientCallback() {

            final GoogleWalletPaymentProcessor this$0;
            final CartPaymentProcessor.FailureListener val$failureListener;
            final CartPaymentProcessor val$paymentProcessor;
            final CartPaymentProcessor.SuccessListener val$successListener;

            public void onWalletClientLoadFailed(int i)
            {
                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_GWALLET_FULL_FAILURE);
                Bundle bundle = new Bundle();
                String s = GooglePlusManager.getGoogleWalletErrorMessage(i, null);
                bundle.putString(CartPaymentProcessor.DATA_KEY_ERROR_MESSAGE, s);
                failureListener.onFailure(paymentProcessor, bundle);
            }

            public void onWalletClientLoaded(GoogleApiClient googleapiclient)
            {
                if (cartManager.googleWalletMaskedWalletNeedsReload())
                {
                    reloadMaskedWallet(googleapiclient, successListener, failureListener);
                    return;
                } else
                {
                    loadFullWallet(googleapiclient, successListener, failureListener);
                    return;
                }
            }

            
            {
                this$0 = GoogleWalletPaymentProcessor.this;
                successListener = successlistener;
                failureListener = failurelistener;
                paymentProcessor = cartpaymentprocessor;
                super();
            }
        });
    }




}
