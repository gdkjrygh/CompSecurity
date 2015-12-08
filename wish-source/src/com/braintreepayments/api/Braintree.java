// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.braintreepayments.api.data.BraintreeEnvironment;
import com.braintreepayments.api.exceptions.AppSwitchNotAvailableException;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ConfigurationException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.braintreepayments.api.exceptions.UnexpectedException;
import com.braintreepayments.api.models.AndroidPayCard;
import com.braintreepayments.api.models.Card;
import com.braintreepayments.api.models.CardBuilder;
import com.braintreepayments.api.models.ClientToken;
import com.braintreepayments.api.models.PayPalAccountBuilder;
import com.braintreepayments.api.models.PayPalPaymentResource;
import com.braintreepayments.api.models.PaymentMethod;
import com.braintreepayments.api.models.ThreeDSecureAuthenticationResponse;
import com.braintreepayments.api.models.ThreeDSecureLookup;
import com.braintreepayments.api.threedsecure.ThreeDSecureWebViewActivity;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.paypal.android.sdk.onetouch.core.PerformRequestStatus;
import com.paypal.android.sdk.onetouch.core.RequestTarget;
import com.paypal.android.sdk.onetouch.core.Result;
import com.paypal.android.sdk.onetouch.core.ResultType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

// Referenced classes of package com.braintreepayments.api:
//            BraintreeApi, BraintreeBroadcastManager, PayPal, AndroidPay, 
//            VenmoAppSwitch, PayPalCheckout

public class Braintree
{
    public static interface BraintreeSetupFinishedListener
    {

        public abstract void onBraintreeSetupFinished(boolean flag, Braintree braintree, String s, Exception exception);
    }

    public static interface ErrorListener
        extends Listener
    {

        public abstract void onRecoverableError(ErrorWithResponse errorwithresponse);

        public abstract void onUnrecoverableError(Throwable throwable);
    }

    private static interface Listener
    {
    }

    protected static interface ListenerCallback
    {

        public abstract void execute();

        public abstract boolean hasListeners();
    }

    public static interface PaymentMethodCreatedListener
        extends Listener
    {

        public abstract void onPaymentMethodCreated(PaymentMethod paymentmethod);
    }

    public static interface PaymentMethodNonceListener
        extends Listener
    {

        public abstract void onPaymentMethodNonce(String s);
    }

    public static interface PaymentMethodsUpdatedListener
        extends Listener
    {

        public abstract void onPaymentMethodsUpdated(List list);
    }


    protected static final String INTEGRATION_DROPIN = "dropin";
    private static final String KEY_CLIENT_TOKEN = "com.braintreepayments.api.KEY_CLIENT_TOKEN";
    private static final String KEY_CONFIGURATION = "com.braintreepayments.api.KEY_CONFIGURATION";
    protected static final Map sInstances = new HashMap();
    private final BraintreeApi mBraintreeApi;
    private BroadcastReceiver mBraintreeBroadcastReceiver = new BroadcastReceiver() {

        final Braintree this$0;

        public void onReceive(Context context1, Intent intent)
        {
            int i = intent.getIntExtra("com.braintreepayments.api.messages.EXTRA_RESULT_CODE", -1);
            context1 = (Intent)intent.getParcelableExtra("com.braintreepayments.api.BraintreeBrowserSwitchActivity.EXTRA_INTENT");
            finishPayWithPayPal(mCurrentPayPalActivity, i, context1);
        }

            
            {
                this$0 = Braintree.this;
                super();
            }
    };
    private List mCachedPaymentMethods;
    private final List mCallbackQueue;
    private String mClientTokenKey;
    private final Set mCreatedListeners;
    private Activity mCurrentPayPalActivity;
    private final Set mErrorListeners;
    private final ExecutorService mExecutorService;
    private String mIntegrationType;
    private final Handler mListenerHandler;
    private boolean mListenersLocked;
    private final Set mNonceListeners;
    private final Set mUpdatedListeners;

    protected Braintree(Context context, String s)
    {
        mListenerHandler = new Handler(Looper.getMainLooper());
        mCallbackQueue = new LinkedList();
        mListenersLocked = false;
        mUpdatedListeners = new HashSet();
        mCreatedListeners = new HashSet();
        mNonceListeners = new HashSet();
        mErrorListeners = new HashSet();
        mBraintreeApi = new BraintreeApi(context.getApplicationContext(), ClientToken.fromString(s));
        mExecutorService = Executors.newSingleThreadExecutor();
        mIntegrationType = "custom";
        mClientTokenKey = s;
        sInstances.put(mClientTokenKey, this);
    }

    protected Braintree(String s, BraintreeApi braintreeapi)
    {
        mListenerHandler = new Handler(Looper.getMainLooper());
        mCallbackQueue = new LinkedList();
        mListenersLocked = false;
        mUpdatedListeners = new HashSet();
        mCreatedListeners = new HashSet();
        mNonceListeners = new HashSet();
        mErrorListeners = new HashSet();
        mBraintreeApi = braintreeapi;
        mExecutorService = Executors.newSingleThreadExecutor();
        mIntegrationType = "custom";
        mClientTokenKey = s;
        sInstances.put(mClientTokenKey, this);
    }

    private void addPaymentMethodToCache(PaymentMethod paymentmethod)
    {
        if (mCachedPaymentMethods == null)
        {
            mCachedPaymentMethods = new ArrayList();
        }
        mCachedPaymentMethods.add(0, paymentmethod);
    }

    public static Braintree getInstance(Context context, String s)
    {
        if (sInstances.containsKey(s))
        {
            return (Braintree)sInstances.get(s);
        } else
        {
            return new Braintree(s, new BraintreeApi(context.getApplicationContext(), s));
        }
    }

    private boolean isSetup()
    {
        return mBraintreeApi.isSetup();
    }

    private void postCreatedMethodToListeners(final PaymentMethod paymentMethod)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final PaymentMethod val$paymentMethod;

            public void execute()
            {
                PaymentMethodCreatedListener paymentmethodcreatedlistener;
                for (Iterator iterator = mCreatedListeners.iterator(); iterator.hasNext(); mListenerHandler.post(paymentmethodcreatedlistener. new Runnable() {

            final _cls15 this$1;
            final PaymentMethodCreatedListener val$listener;

            public void run()
            {
                listener.onPaymentMethodCreated(paymentMethod);
            }

            
            {
                this$1 = final__pcls15;
                listener = PaymentMethodCreatedListener.this;
                super();
            }
        }))
                {
                    paymentmethodcreatedlistener = (PaymentMethodCreatedListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mCreatedListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                paymentMethod = paymentmethod;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        paymentMethod;
        throw paymentMethod;
    }

    private void postCreatedNonceToListeners(final String nonce)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final String val$nonce;

            public void execute()
            {
                PaymentMethodNonceListener paymentmethodnoncelistener;
                for (Iterator iterator = mNonceListeners.iterator(); iterator.hasNext(); mListenerHandler.post(paymentmethodnoncelistener. new Runnable() {

            final _cls16 this$1;
            final PaymentMethodNonceListener val$listener;

            public void run()
            {
                listener.onPaymentMethodNonce(nonce);
            }

            
            {
                this$1 = final__pcls16;
                listener = PaymentMethodNonceListener.this;
                super();
            }
        }))
                {
                    paymentmethodnoncelistener = (PaymentMethodNonceListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mNonceListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                nonce = s;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        nonce;
        throw nonce;
    }

    private void postPaymentMethodsToListeners(List list)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final List val$paymentMethodsSafe;

            public void execute()
            {
                PaymentMethodsUpdatedListener paymentmethodsupdatedlistener;
                for (Iterator iterator = mUpdatedListeners.iterator(); iterator.hasNext(); mListenerHandler.post(paymentmethodsupdatedlistener. new Runnable() {

            final _cls14 this$1;
            final PaymentMethodsUpdatedListener val$listener;

            public void run()
            {
                listener.onPaymentMethodsUpdated(paymentMethodsSafe);
            }

            
            {
                this$1 = final__pcls14;
                listener = PaymentMethodsUpdatedListener.this;
                super();
            }
        }))
                {
                    paymentmethodsupdatedlistener = (PaymentMethodsUpdatedListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mUpdatedListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                paymentMethodsSafe = list;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    private void postRecoverableErrorToListeners(final ErrorWithResponse error)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final ErrorWithResponse val$error;

            public void execute()
            {
                ErrorListener errorlistener;
                for (Iterator iterator = mErrorListeners.iterator(); iterator.hasNext(); mListenerHandler.post(errorlistener. new Runnable() {

            final _cls18 this$1;
            final ErrorListener val$listener;

            public void run()
            {
                listener.onRecoverableError(error);
            }

            
            {
                this$1 = final__pcls18;
                listener = ErrorListener.this;
                super();
            }
        }))
                {
                    errorlistener = (ErrorListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mErrorListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                error = errorwithresponse;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        error;
        throw error;
    }

    public static void reset()
    {
        sInstances.clear();
    }

    public static Braintree restoreSavedInstanceState(Context context, Bundle bundle)
    {
        if (bundle != null) goto _L2; else goto _L1
_L1:
        bundle = null;
_L4:
        return bundle;
_L2:
        Braintree braintree;
        String s;
        String s1;
        s = bundle.getString("com.braintreepayments.api.KEY_CLIENT_TOKEN");
        s1 = bundle.getString("com.braintreepayments.api.KEY_CONFIGURATION");
        braintree = (Braintree)sInstances.get(s);
        if (braintree == null)
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = braintree;
        if (braintree.isSetup()) goto _L4; else goto _L3
_L3:
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            return new Braintree(s, new BraintreeApi(context.getApplicationContext(), s, s1));
        } else
        {
            return null;
        }
    }

    private void sendAnalyticsForPayPalPerformRequestStatus(PerformRequestStatus performrequeststatus, Boolean boolean1)
    {
        if (!boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
        if (performrequeststatus != null) goto _L4; else goto _L3
_L3:
        sendAnalyticsEvent("paypal-single-payment.none.initiate.failed");
_L6:
        return;
_L4:
        if (performrequeststatus.isSuccess() && performrequeststatus.getTarget() == RequestTarget.browser)
        {
            sendAnalyticsEvent("paypal-single-payment.webswitch.initiate.started");
            return;
        }
        if (!performrequeststatus.isSuccess() && performrequeststatus.getTarget() == RequestTarget.browser)
        {
            sendAnalyticsEvent("paypal-single-payment.webswitch.initiate.failed");
            return;
        }
        if (performrequeststatus.isSuccess() && performrequeststatus.getTarget() == RequestTarget.wallet)
        {
            sendAnalyticsEvent("paypal-single-payment.appswitch.initiate.started");
            return;
        }
        if (!performrequeststatus.isSuccess() && performrequeststatus.getTarget() == RequestTarget.wallet)
        {
            sendAnalyticsEvent("paypal-single-payment.appswitch.initiate.failed");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (performrequeststatus == null)
        {
            sendAnalyticsEvent("paypal-future-payments.none.initiate.failed");
            return;
        }
        if (performrequeststatus.isSuccess() && performrequeststatus.getTarget() == RequestTarget.browser)
        {
            sendAnalyticsEvent("paypal-future-payments.webswitch.initiate.started");
            return;
        }
        if (!performrequeststatus.isSuccess() && performrequeststatus.getTarget() == RequestTarget.browser)
        {
            sendAnalyticsEvent("paypal-future-payments.webswitch.initiate.failed");
            return;
        }
        if (performrequeststatus.isSuccess() && performrequeststatus.getTarget() == RequestTarget.wallet)
        {
            sendAnalyticsEvent("paypal-future-payments.appswitch.initiate.started");
            return;
        }
        if (!performrequeststatus.isSuccess() && performrequeststatus.getTarget() == RequestTarget.wallet)
        {
            sendAnalyticsEvent("paypal-future-payments.appswitch.initiate.failed");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void setup()
        throws ErrorWithResponse, BraintreeException
    {
        mBraintreeApi.setup();
    }

    public static void setup(Context context, String s, BraintreeSetupFinishedListener braintreesetupfinishedlistener)
    {
        setupHelper(context, s, braintreesetupfinishedlistener);
    }

    protected static Future setupHelper(Context context, String s, BraintreeSetupFinishedListener braintreesetupfinishedlistener)
    {
        return Executors.newSingleThreadExecutor().submit(new Runnable(s, context, braintreesetupfinishedlistener) {

            final String val$clientToken;
            final Context val$context;
            final BraintreeSetupFinishedListener val$listener;

            public void run()
            {
                Braintree braintree;
                Braintree braintree1;
                Object obj;
                Object obj1;
                braintree = null;
                obj = null;
                obj1 = null;
                braintree1 = braintree;
                if (!Braintree.sInstances.containsKey(clientToken)) goto _L2; else goto _L1
_L1:
                braintree1 = braintree;
                braintree = (Braintree)Braintree.sInstances.get(clientToken);
_L3:
                final Braintree finalBraintree;
                final String finalErrorMessage;
                Exception exception1;
                finalBraintree = braintree;
                finalErrorMessage = obj1;
                exception1 = obj;
                braintree1 = braintree;
                if (braintree.isSetup())
                {
                    break MISSING_BLOCK_LABEL_78;
                }
                braintree1 = braintree;
                braintree.setup();
                exception1 = obj;
                finalErrorMessage = obj1;
                finalBraintree = braintree;
_L4:
                (new Handler(Looper.getMainLooper())).post(exception1. new Runnable() {

                    final _cls2 this$0;
                    final Braintree val$finalBraintree;
                    final String val$finalErrorMessage;
                    final Exception val$finalException;

                    public void run()
                    {
                        if (finalBraintree != null && finalBraintree.isSetup())
                        {
                            listener.onBraintreeSetupFinished(true, finalBraintree, null, null);
                            return;
                        } else
                        {
                            listener.onBraintreeSetupFinished(false, null, finalErrorMessage, finalException);
                            return;
                        }
                    }

            
            {
                this$0 = final__pcls2;
                finalBraintree = braintree;
                finalErrorMessage = s;
                finalException = Exception.this;
                super();
            }
                });
                return;
_L2:
                braintree1 = braintree;
                braintree = new Braintree(context, clientToken);
                  goto _L3
                Exception exception;
                exception;
                exception1 = exception;
                finalErrorMessage = exception.getMessage();
                finalBraintree = braintree1;
                  goto _L4
            }

            
            {
                clientToken = s;
                context = context1;
                listener = braintreesetupfinishedlistener;
                super();
            }
        });
    }

    public void addListener(Listener listener)
    {
        this;
        JVM INSTR monitorenter ;
        if (listener instanceof PaymentMethodsUpdatedListener)
        {
            mUpdatedListeners.add((PaymentMethodsUpdatedListener)listener);
        }
        if (listener instanceof PaymentMethodCreatedListener)
        {
            mCreatedListeners.add((PaymentMethodCreatedListener)listener);
        }
        if (listener instanceof PaymentMethodNonceListener)
        {
            mNonceListeners.add((PaymentMethodNonceListener)listener);
        }
        if (listener instanceof ErrorListener)
        {
            mErrorListeners.add((ErrorListener)listener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        listener;
        throw listener;
    }

    protected String analyticsPrefix()
    {
        return (new StringBuilder()).append(mIntegrationType).append(".android").toString();
    }

    public String collectDeviceData(Activity activity, BraintreeEnvironment braintreeenvironment)
    {
        return mBraintreeApi.collectDeviceData(activity, braintreeenvironment);
    }

    public String collectDeviceData(Activity activity, String s, String s1)
    {
        return mBraintreeApi.collectDeviceData(activity, s, s1);
    }

    public void create(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        this;
        JVM INSTR monitorenter ;
        createHelper(builder);
        this;
        JVM INSTR monitorexit ;
        return;
        builder;
        throw builder;
    }

    protected Future createHelper(final com.braintreepayments.api.models.PaymentMethod.Builder paymentMethodBuilder)
    {
        this;
        JVM INSTR monitorenter ;
        paymentMethodBuilder = mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final com.braintreepayments.api.models.PaymentMethod.Builder val$paymentMethodBuilder;

            public void run()
            {
                PaymentMethod paymentmethod;
                paymentmethod = mBraintreeApi.create(paymentMethodBuilder);
                addPaymentMethodToCache(paymentmethod);
                if (paymentMethodBuilder instanceof PayPalAccountBuilder)
                {
                    if (!PayPal.isCheckoutRequest().booleanValue())
                    {
                        break MISSING_BLOCK_LABEL_71;
                    }
                    sendAnalyticsEvent("paypal-single-payment.tokenize.succeeded");
                }
_L1:
                postCreatedMethodToListeners(paymentmethod);
                postCreatedNonceToListeners(paymentmethod.getNonce());
                return;
                try
                {
                    sendAnalyticsEvent("paypal-future-payments.tokenize.succeeded");
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    if (paymentMethodBuilder instanceof PayPalAccountBuilder)
                    {
                        if (PayPal.isCheckoutRequest().booleanValue())
                        {
                            sendAnalyticsEvent("paypal-single-payment.tokenize.failed");
                        } else
                        {
                            sendAnalyticsEvent("paypal-future-payments.tokenize.failed");
                        }
                    }
                    postRecoverableErrorToListeners(errorwithresponse);
                    return;
                }
                  goto _L1
            }

            
            {
                this$0 = Braintree.this;
                paymentMethodBuilder = builder;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return paymentMethodBuilder;
        paymentMethodBuilder;
        throw paymentMethodBuilder;
    }

    public void finishPayWithPayPal(int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        intent = mBraintreeApi.handlePayPalResponse(null, i, intent);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        create(intent);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        postUnrecoverableErrorToListeners(intent);
        if (true) goto _L2; else goto _L1
_L1:
        intent;
        throw intent;
    }

    public void finishPayWithPayPal(Activity activity, int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        BraintreeBroadcastManager.getInstance(activity).unregisterReceiver(mBraintreeBroadcastReceiver);
        Result result;
        Boolean boolean1;
        Boolean boolean2;
        int j;
        result = PayPal.getResultFromActivity(activity, i, intent);
        boolean1 = Boolean.valueOf(intent.hasExtra("com.paypal.android.sdk.onetouch.core.EXTRA_ONE_TOUCH_RESULT"));
        boolean2 = PayPal.isCheckoutRequest();
        ResultType resulttype = result.getResultType();
        static class _cls19
        {

            static final int $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[];

            static 
            {
                $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType = new int[ResultType.values().length];
                try
                {
                    $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Error.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Cancel.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Success.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        j = _cls19..SwitchMap.com.paypal.android.sdk.onetouch.core.ResultType[resulttype.ordinal()];
        j;
        JVM INSTR tableswitch 1 3: default 88
    //                   1 91
    //                   2 209
    //                   3 385;
           goto _L1 _L2 _L3 _L4
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!boolean1.booleanValue() || !boolean2.booleanValue()) goto _L6; else goto _L5
_L5:
        sendAnalyticsEvent("paypal-single-payment.appswitch.failed");
          goto _L1
        activity;
        postUnrecoverableErrorToListeners(activity);
          goto _L1
        activity;
        throw activity;
_L6:
        if (!boolean1.booleanValue() || boolean2.booleanValue()) goto _L8; else goto _L7
_L7:
        sendAnalyticsEvent("paypal-future-payments.appswitch.failed");
          goto _L1
_L8:
        if (boolean1.booleanValue() || !boolean2.booleanValue()) goto _L10; else goto _L9
_L9:
        sendAnalyticsEvent("paypal-single-payment.webswitch.failed");
          goto _L1
_L10:
        if (boolean1.booleanValue() || boolean2.booleanValue()) goto _L1; else goto _L11
_L11:
        sendAnalyticsEvent("paypal-future-payments.webswitch.failed");
          goto _L1
_L3:
        if (!boolean1.booleanValue() || !boolean2.booleanValue()) goto _L13; else goto _L12
_L12:
        if (result.getError() != null) goto _L15; else goto _L14
_L14:
        sendAnalyticsEvent("paypal-single-payment.appswitch.canceled");
          goto _L1
_L15:
        sendAnalyticsEvent("paypal-single-payment.appswitch.canceled-with-error");
          goto _L1
_L13:
        if (!boolean1.booleanValue() || boolean2.booleanValue()) goto _L17; else goto _L16
_L16:
        if (result.getError() != null) goto _L19; else goto _L18
_L18:
        sendAnalyticsEvent("paypal-future-payments.appswitch.canceled");
          goto _L1
_L19:
        sendAnalyticsEvent("paypal-future-payments.appswitch.canceled-with-error");
          goto _L1
_L17:
        if (boolean1.booleanValue() || !boolean2.booleanValue()) goto _L21; else goto _L20
_L20:
        if (result.getError() != null) goto _L23; else goto _L22
_L22:
        sendAnalyticsEvent("paypal-single-payment.webswitch.canceled");
          goto _L1
_L23:
        sendAnalyticsEvent("paypal-single-payment.webswitch.canceled-with-error");
          goto _L1
_L21:
        if (boolean1.booleanValue() || boolean2.booleanValue()) goto _L1; else goto _L24
_L24:
        if (result.getError() != null) goto _L26; else goto _L25
_L25:
        sendAnalyticsEvent("paypal-future-payments.webswitch.canceled");
          goto _L1
_L26:
        sendAnalyticsEvent("paypal-future-payments.webswitch.canceled-with-error");
          goto _L1
_L4:
        if (!boolean1.booleanValue() || !boolean2.booleanValue()) goto _L28; else goto _L27
_L27:
        sendAnalyticsEvent("paypal-single-payment.appswitch.succeeded");
_L32:
        activity = mBraintreeApi.handlePayPalResponse(activity, i, intent);
        if (activity == null) goto _L1; else goto _L29
_L29:
        create(activity);
          goto _L1
_L28:
        if (!boolean1.booleanValue() || boolean2.booleanValue()) goto _L31; else goto _L30
_L30:
        sendAnalyticsEvent("paypal-future-payments.appswitch.succeeded");
          goto _L32
_L31:
        if (boolean1.booleanValue() || !boolean2.booleanValue()) goto _L34; else goto _L33
_L33:
        sendAnalyticsEvent("paypal-single-payment.webswitch.succeeded");
          goto _L32
_L34:
        if (boolean1.booleanValue() || boolean2.booleanValue()) goto _L32; else goto _L35
_L35:
        sendAnalyticsEvent("paypal-future-payments.webswitch.succeeded");
          goto _L32
    }

    public void finishPayWithVenmo(int i, final Intent nonce)
    {
        this;
        JVM INSTR monitorenter ;
        nonce = mBraintreeApi.finishPayWithVenmo(i, nonce);
        if (TextUtils.isEmpty(nonce)) goto _L2; else goto _L1
_L1:
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final String val$nonce;

            public void run()
            {
                try
                {
                    PaymentMethod paymentmethod = mBraintreeApi.getPaymentMethod(nonce);
                    paymentmethod.setSource("venmo-app");
                    addPaymentMethodToCache(paymentmethod);
                    postCreatedMethodToListeners(paymentmethod);
                    postCreatedNonceToListeners(nonce);
                    sendAnalyticsEvent("venmo-app.success");
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    postUnrecoverableErrorToListeners(jsonexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
            }

            
            {
                this$0 = Braintree.this;
                nonce = s;
                super();
            }
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        sendAnalyticsEvent("venmo-app.fail");
        if (true) goto _L4; else goto _L3
_L3:
        nonce;
        throw nonce;
    }

    public void finishThreeDSecureVerification(int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (i != -1) goto _L2; else goto _L1
_L1:
        intent = (ThreeDSecureAuthenticationResponse)intent.getParcelableExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_RESULT");
        if (!intent.isSuccess()) goto _L4; else goto _L3
_L3:
        postCreatedMethodToListeners(intent.getCard());
        postCreatedNonceToListeners(intent.getCard().getNonce());
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (intent.getException() == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        postUnrecoverableErrorToListeners(new BraintreeException(intent.getException()));
          goto _L2
        intent;
        throw intent;
        postRecoverableErrorToListeners(new ErrorWithResponse(422, intent.getErrors()));
          goto _L2
    }

    public String getAndroidPayGoogleTransactionId(Intent intent)
    {
        if (AndroidPay.isMaskedWalletResponse(intent))
        {
            return ((MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET")).getGoogleTransactionId();
        }
        if (AndroidPay.isFullWalletResponse(intent))
        {
            return ((FullWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET")).getGoogleTransactionId();
        } else
        {
            return null;
        }
    }

    public PaymentMethodTokenizationParameters getAndroidPayTokenizationParameters()
    {
        return mBraintreeApi.getAndroidPayTokenizationParameters();
    }

    public List getCachedPaymentMethods()
    {
        this;
        JVM INSTR monitorenter ;
        if (mCachedPaymentMethods != null) goto _L2; else goto _L1
_L1:
        List list = Collections.emptyList();
_L4:
        this;
        JVM INSTR monitorexit ;
        return list;
_L2:
        list = Collections.unmodifiableList(mCachedPaymentMethods);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected String getIntegrationType()
    {
        return mIntegrationType;
    }

    public void getNonceFromAndroidPayFullWalletResponse(int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        mBraintreeApi.disconnectGoogleApiClient();
        intent = mBraintreeApi.getNonceFromAndroidPayFullWalletResponse(intent);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        addPaymentMethodToCache(intent);
        postCreatedMethodToListeners(intent);
        postCreatedNonceToListeners(intent.getNonce());
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        postUnrecoverableErrorToListeners(intent);
        if (true) goto _L2; else goto _L1
_L1:
        intent;
        throw intent;
    }

    public void getPaymentMethods()
    {
        this;
        JVM INSTR monitorenter ;
        getPaymentMethodsHelper();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected Future getPaymentMethodsHelper()
    {
        this;
        JVM INSTR monitorenter ;
        Future future = mExecutorService.submit(new Runnable() {

            final Braintree this$0;

            public void run()
            {
                try
                {
                    List list = mBraintreeApi.getPaymentMethods();
                    mCachedPaymentMethods = list;
                    postPaymentMethodsToListeners(list);
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
            }

            
            {
                this$0 = Braintree.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return future;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean hasCachedCards()
    {
        this;
        JVM INSTR monitorenter ;
        List list = mCachedPaymentMethods;
        boolean flag;
        if (list != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isAndroidPayEnabled()
    {
        return mBraintreeApi.isAndroidPayEnabled();
    }

    public boolean isCvvChallenegePresent()
    {
        return mBraintreeApi.isCvvChallengePresent();
    }

    public boolean isPayPalEnabled()
    {
        return mBraintreeApi.isPayPalEnabled();
    }

    public boolean isPostalCodeChallengePresent()
    {
        return mBraintreeApi.isPostalCodeChallengePresent();
    }

    public boolean isThreeDSecureEnabled()
    {
        return mBraintreeApi.isThreeDSecureEnabled();
    }

    public boolean isVenmoEnabled()
    {
        return mBraintreeApi.isVenmoEnabled();
    }

    public void lockListeners()
    {
        this;
        JVM INSTR monitorenter ;
        mListenersLocked = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onActivityResult(Activity activity, int i, int j, Intent intent)
    {
        if (j == -1 && intent != null)
        {
            if (PayPal.isPayPalIntent(intent))
            {
                finishPayWithPayPal(activity, j, intent);
            } else
            {
                if (AndroidPay.isMaskedWalletResponse(intent))
                {
                    performAndroidPayFullWalletRequest(activity, i, null, getAndroidPayGoogleTransactionId(intent));
                    return;
                }
                if (AndroidPay.isFullWalletResponse(intent))
                {
                    getNonceFromAndroidPayFullWalletResponse(j, intent);
                    return;
                }
                if (VenmoAppSwitch.isVenmoAppSwitchResponse(intent))
                {
                    finishPayWithVenmo(j, intent);
                    return;
                }
                if (ThreeDSecureAuthenticationResponse.isThreeDSecureAuthenticationResponse(intent))
                {
                    finishThreeDSecureVerification(j, intent);
                    return;
                }
            }
        }
    }

    public void onPause(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        lockListeners();
        if (activity instanceof Listener)
        {
            removeListener((Listener)activity);
        }
        mBraintreeApi.disconnectGoogleApiClient();
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void onResume(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        if (activity instanceof Listener)
        {
            addListener((Listener)activity);
        }
        unlockListeners();
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("com.braintreepayments.api.KEY_CLIENT_TOKEN", mClientTokenKey);
        bundle.putString("com.braintreepayments.api.KEY_CONFIGURATION", mBraintreeApi.getConfigurationString());
    }

    public void performAndroidPayChangeMaskedWalletRequest(final Activity activity, final int requestCode, final String googleTransactionId)
    {
        this;
        JVM INSTR monitorenter ;
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final Activity val$activity;
            final String val$googleTransactionId;
            final int val$requestCode;

            public void run()
            {
                try
                {
                    mBraintreeApi.performAndroidPayChangeMaskedWalletRequest(activity, requestCode, googleTransactionId);
                    return;
                }
                catch (UnexpectedException unexpectedexception)
                {
                    postUnrecoverableErrorToListeners(unexpectedexception);
                }
            }

            
            {
                this$0 = Braintree.this;
                activity = activity1;
                requestCode = i;
                googleTransactionId = s;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void performAndroidPayFullWalletRequest(final Activity activity, final int requestCode, final Cart cart, final String googleTransactionId)
    {
        this;
        JVM INSTR monitorenter ;
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final Activity val$activity;
            final Cart val$cart;
            final String val$googleTransactionId;
            final int val$requestCode;

            public void run()
            {
                try
                {
                    mBraintreeApi.performAndroidPayFullWalletRequest(activity, requestCode, cart, googleTransactionId);
                    return;
                }
                catch (UnexpectedException unexpectedexception)
                {
                    postUnrecoverableErrorToListeners(unexpectedexception);
                }
            }

            
            {
                this$0 = Braintree.this;
                activity = activity1;
                requestCode = i;
                cart = cart1;
                googleTransactionId = s;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void performAndroidPayMaskedWalletRequest(Activity activity, int i, Cart cart)
    {
        this;
        JVM INSTR monitorenter ;
        performAndroidPayMaskedWalletRequest(activity, i, cart, false, false, false);
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void performAndroidPayMaskedWalletRequest(final Activity activity, final int requestCode, final Cart cart, final boolean isBillingAgreement, final boolean shippingAddressRequired, final boolean phoneNumberRequired)
    {
        this;
        JVM INSTR monitorenter ;
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final Activity val$activity;
            final Cart val$cart;
            final boolean val$isBillingAgreement;
            final boolean val$phoneNumberRequired;
            final int val$requestCode;
            final boolean val$shippingAddressRequired;

            public void run()
            {
                try
                {
                    mBraintreeApi.performAndroidPayMaskedWalletRequest(activity, requestCode, cart, isBillingAgreement, shippingAddressRequired, phoneNumberRequired);
                    return;
                }
                catch (InvalidArgumentException invalidargumentexception)
                {
                    postUnrecoverableErrorToListeners(invalidargumentexception);
                    return;
                }
                catch (UnexpectedException unexpectedexception)
                {
                    postUnrecoverableErrorToListeners(unexpectedexception);
                }
            }

            
            {
                this$0 = Braintree.this;
                activity = activity1;
                requestCode = i;
                cart = cart1;
                isBillingAgreement = flag;
                shippingAddressRequired = flag1;
                phoneNumberRequired = flag2;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    protected void postOrQueueCallback(ListenerCallback listenercallback)
    {
        if (mListenersLocked || !listenercallback.hasListeners())
        {
            mCallbackQueue.add(listenercallback);
            return;
        } else
        {
            listenercallback.execute();
            return;
        }
    }

    protected void postUnrecoverableErrorToListeners(final Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final Throwable val$throwable;

            public void execute()
            {
                ErrorListener errorlistener;
                for (Iterator iterator = mErrorListeners.iterator(); iterator.hasNext(); mListenerHandler.post(errorlistener. new Runnable() {

            final _cls17 this$1;
            final ErrorListener val$listener;

            public void run()
            {
                listener.onUnrecoverableError(throwable);
            }

            
            {
                this$1 = final__pcls17;
                listener = ErrorListener.this;
                super();
            }
        }))
                {
                    errorlistener = (ErrorListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mErrorListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                throwable = throwable1;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        throwable;
        throw throwable;
    }

    public void removeListener(Listener listener)
    {
        this;
        JVM INSTR monitorenter ;
        if (listener instanceof PaymentMethodsUpdatedListener)
        {
            mUpdatedListeners.remove(listener);
        }
        if (listener instanceof PaymentMethodCreatedListener)
        {
            mCreatedListeners.remove(listener);
        }
        if (listener instanceof PaymentMethodNonceListener)
        {
            mNonceListeners.remove(listener);
        }
        if (listener instanceof ErrorListener)
        {
            mErrorListeners.remove(listener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        listener;
        throw listener;
    }

    public void sendAnalyticsEvent(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sendAnalyticsEventHelper((new StringBuilder()).append(analyticsPrefix()).append(".").append(s).toString(), getIntegrationType());
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void sendAnalyticsEvent(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        sendAnalyticsEventHelper(s, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected Future sendAnalyticsEventHelper(final String event, final String integrationType)
    {
        this;
        JVM INSTR monitorenter ;
        event = mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final String val$event;
            final String val$integrationType;

            public void run()
            {
                mBraintreeApi.sendAnalyticsEvent(event, integrationType);
            }

            
            {
                this$0 = Braintree.this;
                event = s;
                integrationType = s1;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return event;
        event;
        throw event;
    }

    public void setIntegrationDropin()
    {
        mIntegrationType = "dropin";
    }

    public void startCheckoutWithPayPal(final Activity activity, final int requestCode, final PayPalCheckout checkout)
    {
        mCurrentPayPalActivity = activity;
        BraintreeBroadcastManager.getInstance(activity).registerReceiver(mBraintreeBroadcastReceiver, new IntentFilter("com.braintreepayments.api.messages.LOCAL_BROADCAST_BROWSER_SWITCH_COMPLETED"));
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final Activity val$activity;
            final PayPalCheckout val$checkout;
            final int val$requestCode;

            public void run()
            {
                PayPalPaymentResource paypalpaymentresource = mBraintreeApi.createPayPalPaymentResource(checkout, activity);
                if (paypalpaymentresource == null)
                {
                    break MISSING_BLOCK_LABEL_39;
                }
                activity.runOnUiThread(paypalpaymentresource. new Runnable() {

                    final _cls4 this$1;
                    final PayPalPaymentResource val$payPalPaymentResource;

                    public void run()
                    {
                        try
                        {
                            PerformRequestStatus performrequeststatus = mBraintreeApi.startCheckoutWithPayPal(activity, requestCode, payPalPaymentResource);
                            sendAnalyticsForPayPalPerformRequestStatus(performrequeststatus, Boolean.valueOf(true));
                            return;
                        }
                        catch (ConfigurationException configurationexception)
                        {
                            sendAnalyticsForPayPalPerformRequestStatus(null, Boolean.valueOf(true));
                            postUnrecoverableErrorToListeners(configurationexception);
                            return;
                        }
                    }

            
            {
                this$1 = final__pcls4;
                payPalPaymentResource = PayPalPaymentResource.this;
                super();
            }
                });
                return;
                Object obj;
                obj;
_L2:
                postUnrecoverableErrorToListeners(((Throwable) (obj)));
                return;
                obj;
                postRecoverableErrorToListeners(((ErrorWithResponse) (obj)));
                return;
                obj;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = Braintree.this;
                checkout = paypalcheckout;
                activity = activity1;
                requestCode = i;
                super();
            }
        });
    }

    public void startPayWithPayPal(Activity activity, int i)
    {
        startPayWithPayPal(activity, i, null);
    }

    public void startPayWithPayPal(Activity activity, int i, List list)
    {
        if (mBraintreeApi.billingAgreementsEnabled())
        {
            list = new PayPalCheckout();
            list.setSingleUse(Boolean.valueOf(false));
            startCheckoutWithPayPal(activity, i, list);
            return;
        }
        mCurrentPayPalActivity = activity;
        if (activity != null)
        {
            BraintreeBroadcastManager.getInstance(activity).registerReceiver(mBraintreeBroadcastReceiver, new IntentFilter("com.braintreepayments.api.messages.LOCAL_BROADCAST_BROWSER_SWITCH_COMPLETED"));
        }
        try
        {
            sendAnalyticsForPayPalPerformRequestStatus(mBraintreeApi.startPayWithPayPal(activity, i, list), Boolean.valueOf(false));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            postUnrecoverableErrorToListeners(activity);
        }
    }

    public void startPayWithVenmo(Activity activity, int i)
    {
        try
        {
            mBraintreeApi.startPayWithVenmo(activity, i);
            sendAnalyticsEvent("add-venmo.start");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            sendAnalyticsEvent("add-venmo.unavailable");
        }
        postUnrecoverableErrorToListeners(activity);
    }

    public void startThreeDSecureVerification(final Activity activity, final int requestCode, final CardBuilder cardBuilder, final String amount)
    {
        this;
        JVM INSTR monitorenter ;
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final Activity val$activity;
            final String val$amount;
            final CardBuilder val$cardBuilder;
            final int val$requestCode;

            public void run()
            {
                try
                {
                    String s = mBraintreeApi.tokenize(cardBuilder);
                    startThreeDSecureVerification(activity, requestCode, s, amount);
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    postUnrecoverableErrorToListeners(jsonexception);
                }
            }

            
            {
                this$0 = Braintree.this;
                cardBuilder = cardbuilder;
                activity = activity1;
                requestCode = i;
                amount = s;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void startThreeDSecureVerification(final Activity activity, final int requestCode, final String nonce, final String amount)
    {
        this;
        JVM INSTR monitorenter ;
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final Activity val$activity;
            final String val$amount;
            final String val$nonce;
            final int val$requestCode;

            public void run()
            {
                Object obj;
                obj = mBraintreeApi.threeDSecureLookup(nonce, amount);
                if (((ThreeDSecureLookup) (obj)).getAcsUrl() != null)
                {
                    obj = (new Intent(activity, com/braintreepayments/api/threedsecure/ThreeDSecureWebViewActivity)).putExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_LOOKUP", ((android.os.Parcelable) (obj)));
                    activity.startActivityForResult(((Intent) (obj)), requestCode);
                    return;
                }
                try
                {
                    postCreatedMethodToListeners(((ThreeDSecureLookup) (obj)).getCard());
                    postCreatedNonceToListeners(((ThreeDSecureLookup) (obj)).getCard().getNonce());
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    postUnrecoverableErrorToListeners(jsonexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
                return;
            }

            
            {
                this$0 = Braintree.this;
                nonce = s;
                amount = s1;
                activity = activity1;
                requestCode = i;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void tokenize(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        this;
        JVM INSTR monitorenter ;
        tokenizeHelper(builder);
        this;
        JVM INSTR monitorexit ;
        return;
        builder;
        throw builder;
    }

    protected Future tokenizeHelper(final com.braintreepayments.api.models.PaymentMethod.Builder paymentMethodBuilder)
    {
        this;
        JVM INSTR monitorenter ;
        paymentMethodBuilder = mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final com.braintreepayments.api.models.PaymentMethod.Builder val$paymentMethodBuilder;

            public void run()
            {
                try
                {
                    String s = mBraintreeApi.tokenize(paymentMethodBuilder);
                    postCreatedNonceToListeners(s);
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    postUnrecoverableErrorToListeners(jsonexception);
                }
            }

            
            {
                this$0 = Braintree.this;
                paymentMethodBuilder = builder;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return paymentMethodBuilder;
        paymentMethodBuilder;
        throw paymentMethodBuilder;
    }

    public void unlockListeners()
    {
        this;
        JVM INSTR monitorenter ;
        mListenersLocked = false;
        Object obj = new ArrayList();
        ((List) (obj)).addAll(mCallbackQueue);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ListenerCallback listenercallback = (ListenerCallback)((Iterator) (obj)).next();
            if (listenercallback.hasListeners())
            {
                listenercallback.execute();
                mCallbackQueue.remove(listenercallback);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_86;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }













/*
    static List access$402(Braintree braintree, List list)
    {
        braintree.mCachedPaymentMethods = list;
        return list;
    }

*/





}
