// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.paypal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.BraintreeBroadcastManager;
import com.braintreepayments.api.PayPalCheckout;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.PayPalConfiguration;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.service.GetBraintreeClientTokenService;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Locale;

public class PayPalManager
{
    public static interface FuturePaymentCallback
    {

        public abstract void onFuturePaymentCancelled();

        public abstract void onFuturePaymentError();

        public abstract void onFuturePaymentSucceeded(String s);

        public abstract void onHideLoadingSpinner();

        public abstract void onShowLoadingSpinner();
    }

    public static interface PaymentCallback
    {

        public abstract void onHideLoadingSpinner();

        public abstract void onPaymentCancelled();

        public abstract void onPaymentError();

        public abstract void onPaymentSucceeded(String s);

        public abstract void onShowLoadingSpinner();
    }


    private static final int FUTURE_PAYMENT_REQUEST_CODE = 457;
    private static final int PAYMENT_REQUEST_CODE = 456;
    private static PayPalManager _instance = new PayPalManager();
    private Braintree braintree;
    private boolean braintreeBroadcastReceived;
    private BroadcastReceiver braintreeBroadcastReceiver;
    private com.braintreepayments.api.Braintree.ErrorListener braintreeErrorListener;
    private com.braintreepayments.api.Braintree.PaymentMethodNonceListener braintreePaymentMethodNonceListener;
    private PayPalConfiguration currentConfiguration;
    private FuturePaymentCallback futurePaymentCallback;
    private GetBraintreeClientTokenService getBraintreeClientTokenService;
    private PaymentCallback paymentCallback;

    private PayPalManager()
    {
        getBraintreeClientTokenService = new GetBraintreeClientTokenService();
    }

    public static PayPalManager getInstance()
    {
        return _instance;
    }

    public void handleBraintreeBroadcastIntent(Activity activity, Intent intent, int i)
    {
        braintreeBroadcastReceived = true;
        if (i == 0)
        {
            if (futurePaymentCallback != null)
            {
                futurePaymentCallback.onFuturePaymentCancelled();
                futurePaymentCallback = null;
            }
            if (paymentCallback != null)
            {
                paymentCallback.onPaymentCancelled();
                paymentCallback = null;
            }
        } else
        {
            if (futurePaymentCallback != null)
            {
                futurePaymentCallback.onHideLoadingSpinner();
            }
            if (paymentCallback != null)
            {
                paymentCallback.onHideLoadingSpinner();
                return;
            }
        }
    }

    public void onActivityResult(Activity activity, int i, int j, Intent intent)
    {
        if (i != 456) goto _L2; else goto _L1
_L1:
        if (braintreeBroadcastReceiver != null)
        {
            BraintreeBroadcastManager.getInstance(activity).unregisterReceiver(braintreeBroadcastReceiver);
            braintreeBroadcastReceiver = null;
        }
        if (j != -1 || braintree == null) goto _L4; else goto _L3
_L3:
        braintree.finishPayWithPayPal(activity, j, intent);
_L6:
        return;
_L4:
        if (!braintreeBroadcastReceived && paymentCallback != null)
        {
            paymentCallback.onPaymentError();
            paymentCallback = null;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i == 457)
        {
            if (braintreeBroadcastReceiver != null)
            {
                BraintreeBroadcastManager.getInstance(activity).unregisterReceiver(braintreeBroadcastReceiver);
                braintreeBroadcastReceiver = null;
            }
            if (j == -1 && braintree != null)
            {
                braintree.finishPayWithPayPal(activity, j, intent);
                return;
            }
            if (!braintreeBroadcastReceived && futurePaymentCallback != null)
            {
                futurePaymentCallback.onFuturePaymentError();
                futurePaymentCallback = null;
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onStop()
    {
        if (futurePaymentCallback != null)
        {
            futurePaymentCallback.onHideLoadingSpinner();
        }
        if (paymentCallback != null)
        {
            paymentCallback.onHideLoadingSpinner();
        }
    }

    public void resetBraintree()
    {
        braintree = null;
    }

    public void startFuturePayment(final Activity activity, final FuturePaymentCallback futurePaymentCallback)
    {
        this.futurePaymentCallback = futurePaymentCallback;
        if (this.futurePaymentCallback != null)
        {
            this.futurePaymentCallback.onShowLoadingSpinner();
        }
        if (braintree == null)
        {
            getBraintreeClientTokenService.requestService(new com.contextlogic.wish.api.service.GetBraintreeClientTokenService.SuccessCallback() {

                final PayPalManager this$0;
                final Activity val$activity;
                final FuturePaymentCallback val$futurePaymentCallback;

                public void onServiceSucceeded(String s)
                {
                    Braintree.setup(activity, s, new com.braintreepayments.api.Braintree.BraintreeSetupFinishedListener() {

                        final _cls6 this$1;

                        public void onBraintreeSetupFinished(boolean flag, Braintree braintree1, String s, Exception exception)
                        {
                            if (flag && braintree1 != null)
                            {
                                braintree = braintree1;
                                startFuturePayment(activity, futurePaymentCallback);
                            } else
                            if (futurePaymentCallback != null)
                            {
                                futurePaymentCallback.onFuturePaymentError();
                                futurePaymentCallback = null;
                                return;
                            }
                        }

            
            {
                this$1 = _cls6.this;
                super();
            }
                    });
                }

            
            {
                this$0 = PayPalManager.this;
                activity = activity1;
                futurePaymentCallback = futurepaymentcallback;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final PayPalManager this$0;

                public void onServiceFailed()
                {
                    if (futurePaymentCallback != null)
                    {
                        futurePaymentCallback.onFuturePaymentError();
                        futurePaymentCallback = null;
                    }
                }

            
            {
                this$0 = PayPalManager.this;
                super();
            }
            });
            return;
        }
        if (braintreePaymentMethodNonceListener != null)
        {
            braintree.removeListener(braintreePaymentMethodNonceListener);
        }
        braintreePaymentMethodNonceListener = new com.braintreepayments.api.Braintree.PaymentMethodNonceListener() {

            final PayPalManager this$0;

            public void onPaymentMethodNonce(String s)
            {
                if (futurePaymentCallback != null)
                {
                    futurePaymentCallback.onFuturePaymentSucceeded(s);
                    futurePaymentCallback = null;
                }
            }

            
            {
                this$0 = PayPalManager.this;
                super();
            }
        };
        braintree.addListener(braintreePaymentMethodNonceListener);
        if (braintreeErrorListener != null)
        {
            braintree.removeListener(braintreeErrorListener);
        }
        braintreeErrorListener = new com.braintreepayments.api.Braintree.ErrorListener() {

            final PayPalManager this$0;

            public void onRecoverableError(ErrorWithResponse errorwithresponse)
            {
                if (futurePaymentCallback != null)
                {
                    futurePaymentCallback.onFuturePaymentError();
                    futurePaymentCallback = null;
                }
            }

            public void onUnrecoverableError(Throwable throwable)
            {
                if (futurePaymentCallback != null)
                {
                    futurePaymentCallback.onFuturePaymentError();
                    futurePaymentCallback = null;
                }
            }

            
            {
                this$0 = PayPalManager.this;
                super();
            }
        };
        braintree.addListener(braintreeErrorListener);
        braintreeBroadcastReceiver = new BroadcastReceiver() {

            final PayPalManager this$0;
            final Activity val$activity;

            public void onReceive(Context context, Intent intent)
            {
                int i = intent.getIntExtra("com.braintreepayments.api.messages.EXTRA_RESULT_CODE", -1);
                context = (Intent)intent.getParcelableExtra("com.braintreepayments.api.BraintreeBrowserSwitchActivity.EXTRA_INTENT");
                handleBraintreeBroadcastIntent(activity, context, i);
            }

            
            {
                this$0 = PayPalManager.this;
                activity = activity1;
                super();
            }
        };
        BraintreeBroadcastManager.getInstance(activity).registerReceiver(braintreeBroadcastReceiver, new IntentFilter("com.braintreepayments.api.messages.LOCAL_BROADCAST_BROWSER_SWITCH_COMPLETED"));
        braintreeBroadcastReceived = false;
        braintree.startPayWithPayPal(activity, 457);
    }

    public void startPayment(final Activity activity, final WishCart cart, final boolean forceUsd, final PaymentCallback callback)
    {
        paymentCallback = callback;
        if (paymentCallback != null)
        {
            paymentCallback.onShowLoadingSpinner();
        }
        if (braintree == null)
        {
            getBraintreeClientTokenService.requestService(new com.contextlogic.wish.api.service.GetBraintreeClientTokenService.SuccessCallback() {

                final PayPalManager this$0;
                final Activity val$activity;
                final PaymentCallback val$callback;
                final WishCart val$cart;
                final boolean val$forceUsd;

                public void onServiceSucceeded(String s)
                {
                    Braintree.setup(activity, s, new com.braintreepayments.api.Braintree.BraintreeSetupFinishedListener() {

                        final _cls1 this$1;

                        public void onBraintreeSetupFinished(boolean flag, Braintree braintree1, String s, Exception exception)
                        {
                            if (flag && braintree1 != null)
                            {
                                braintree = braintree1;
                                startPayment(activity, cart, forceUsd, callback);
                            } else
                            if (paymentCallback != null)
                            {
                                paymentCallback.onPaymentError();
                                paymentCallback = null;
                                return;
                            }
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }

            
            {
                this$0 = PayPalManager.this;
                activity = activity1;
                cart = wishcart;
                forceUsd = flag;
                callback = paymentcallback;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final PayPalManager this$0;

                public void onServiceFailed()
                {
                    if (paymentCallback != null)
                    {
                        paymentCallback.onPaymentError();
                        paymentCallback = null;
                    }
                }

            
            {
                this$0 = PayPalManager.this;
                super();
            }
            });
            return;
        }
        Object obj = new HashSet();
        ((HashSet) (obj)).add("BIF");
        ((HashSet) (obj)).add("CLP");
        ((HashSet) (obj)).add("DJF");
        ((HashSet) (obj)).add("GNF");
        ((HashSet) (obj)).add("JPY");
        ((HashSet) (obj)).add("KMF");
        ((HashSet) (obj)).add("KRW");
        ((HashSet) (obj)).add("MGA");
        ((HashSet) (obj)).add("PYG");
        ((HashSet) (obj)).add("RWF");
        ((HashSet) (obj)).add("VUV");
        ((HashSet) (obj)).add("XAF");
        ((HashSet) (obj)).add("XOF");
        ((HashSet) (obj)).add("XPF");
        if (forceUsd)
        {
            callback = "USD";
        } else
        {
            callback = cart.getTotal().getLocalizedCurrencyCode();
        }
        if (((HashSet) (obj)).contains(callback))
        {
            obj = "%.0f";
        } else
        {
            obj = "%.2f";
        }
        if (forceUsd)
        {
            cart = new PayPalCheckout(new BigDecimal(String.format(Locale.US, ((String) (obj)), new Object[] {
                Double.valueOf(cart.getTotal().getUsdValue())
            })));
        } else
        {
            cart = new PayPalCheckout(new BigDecimal(String.format(Locale.US, ((String) (obj)), new Object[] {
                Double.valueOf(cart.getTotal().getValue())
            })));
        }
        cart.setCurrencyCode(callback);
        cart.setEnableShippingAddress(Boolean.valueOf(false));
        if (braintreePaymentMethodNonceListener != null)
        {
            braintree.removeListener(braintreePaymentMethodNonceListener);
        }
        braintreePaymentMethodNonceListener = new com.braintreepayments.api.Braintree.PaymentMethodNonceListener() {

            final PayPalManager this$0;

            public void onPaymentMethodNonce(String s)
            {
                if (paymentCallback != null)
                {
                    paymentCallback.onPaymentSucceeded(s);
                    paymentCallback = null;
                }
            }

            
            {
                this$0 = PayPalManager.this;
                super();
            }
        };
        braintree.addListener(braintreePaymentMethodNonceListener);
        if (braintreeErrorListener != null)
        {
            braintree.removeListener(braintreeErrorListener);
        }
        braintreeErrorListener = new com.braintreepayments.api.Braintree.ErrorListener() {

            final PayPalManager this$0;

            public void onRecoverableError(ErrorWithResponse errorwithresponse)
            {
                if (paymentCallback != null)
                {
                    paymentCallback.onPaymentError();
                    paymentCallback = null;
                }
            }

            public void onUnrecoverableError(Throwable throwable)
            {
                if (paymentCallback != null)
                {
                    paymentCallback.onPaymentError();
                    paymentCallback = null;
                }
            }

            
            {
                this$0 = PayPalManager.this;
                super();
            }
        };
        braintree.addListener(braintreeErrorListener);
        braintreeBroadcastReceiver = new BroadcastReceiver() {

            final PayPalManager this$0;
            final Activity val$activity;

            public void onReceive(Context context, Intent intent)
            {
                int i = intent.getIntExtra("com.braintreepayments.api.messages.EXTRA_RESULT_CODE", -1);
                context = (Intent)intent.getParcelableExtra("com.braintreepayments.api.BraintreeBrowserSwitchActivity.EXTRA_INTENT");
                handleBraintreeBroadcastIntent(activity, context, i);
            }

            
            {
                this$0 = PayPalManager.this;
                activity = activity1;
                super();
            }
        };
        BraintreeBroadcastManager.getInstance(activity).registerReceiver(braintreeBroadcastReceiver, new IntentFilter("com.braintreepayments.api.messages.LOCAL_BROADCAST_BROWSER_SWITCH_COMPLETED"));
        braintreeBroadcastReceived = false;
        braintree.startCheckoutWithPayPal(activity, 456, cart);
    }



/*
    static Braintree access$002(PayPalManager paypalmanager, Braintree braintree1)
    {
        paypalmanager.braintree = braintree1;
        return braintree1;
    }

*/



/*
    static PaymentCallback access$102(PayPalManager paypalmanager, PaymentCallback paymentcallback)
    {
        paypalmanager.paymentCallback = paymentcallback;
        return paymentcallback;
    }

*/



/*
    static FuturePaymentCallback access$202(PayPalManager paypalmanager, FuturePaymentCallback futurepaymentcallback)
    {
        paypalmanager.futurePaymentCallback = futurepaymentcallback;
        return futurepaymentcallback;
    }

*/
}
