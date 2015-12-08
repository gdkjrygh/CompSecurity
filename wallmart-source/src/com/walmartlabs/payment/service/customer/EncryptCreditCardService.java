// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import android.content.Context;
import android.os.Handler;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;

public class EncryptCreditCardService
{
    public static interface Callback
    {

        public abstract void onError(com.walmartlabs.kangaroo.Result.Error error);

        public abstract void onResult(EncryptedCc encryptedcc);
    }

    private static class ClientCallbacks extends WebViewClient
    {

        private final EncryptCreditCardService mEncryptService;

        public void onPageFinished(WebView webview, String s)
        {
            mEncryptService.onPageLoaded();
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            WLog.e(EncryptCreditCardService.TAG, (new StringBuilder()).append("WebView received error:").append(i).append(", description=").append(s).append(", url=").append(s1).toString());
            mEncryptService.onError(com.walmartlabs.kangaroo.Result.Error.ERROR_UNKNOWN);
        }

        private ClientCallbacks(EncryptCreditCardService encryptcreditcardservice)
        {
            mEncryptService = encryptcreditcardservice;
        }

    }

    private static class EncryptBridge
    {

        private final EncryptCreditCardService mEncryptService;

        public void onError(String s)
        {
            WLog.e(EncryptCreditCardService.TAG, "Encryption algorithm did not return the expected result format");
            mEncryptService.mHandler.post(new Runnable() {

                final EncryptBridge this$0;

                public void run()
                {
                    mEncryptService.onError(com.walmartlabs.kangaroo.Result.Error.ERROR_UNEXPECTED_RESPONSE);
                }

            
            {
                this$0 = EncryptBridge.this;
                super();
            }
            });
        }

        public void onResult(final String encryptedCC, final String encryptedCvv, final String integrityCheck, final String keyId, final String phase, String s)
        {
            mEncryptService.mHandler.post(s. new Runnable() {

                final EncryptBridge this$0;
                final String val$encryptedCC;
                final String val$encryptedCvv;
                final String val$integrityCheck;
                final String val$keyId;
                final String val$phase;
                final String val$uuid;

                public void run()
                {
                    mEncryptService.onResult(encryptedCC, encryptedCvv, integrityCheck, keyId, phase, uuid);
                }

            
            {
                this$0 = final_encryptbridge;
                encryptedCC = s;
                encryptedCvv = s1;
                integrityCheck = s2;
                keyId = s3;
                phase = s4;
                uuid = String.this;
                super();
            }
            });
        }


        private EncryptBridge(EncryptCreditCardService encryptcreditcardservice)
        {
            mEncryptService = encryptcreditcardservice;
        }

    }

    public static class EncryptedCc
    {

        public final String encryptedCc;
        public final String encryptedCvv;
        public final String integrityCheck;
        public final String keyId;
        public final String phase;

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("encryptedCc = ").append(encryptedCc).append(", encryptedCvv = ").append(encryptedCvv).append(", integrityCheck = ").append(integrityCheck).append(", keyId = ").append(keyId).append(", phase = ").append(phase);
            return stringbuilder.toString();
        }

        private EncryptedCc(String s, String s1, String s2, String s3, String s4)
        {
            encryptedCc = s;
            encryptedCvv = s1;
            integrityCheck = s2;
            keyId = s3;
            phase = s4;
        }

    }

    private static class EncryptionRequest
    {

        private final List mCallbacks;
        private final String mCc;
        private final String mCvv;
        private final String mUuid;

        public void addCallback(Callback callback)
        {
            mCallbacks.add(callback);
        }





        private EncryptionRequest(String s, String s1)
        {
            mCallbacks = new ArrayList();
            mCc = s;
            mCvv = s1;
            mUuid = UUID.randomUUID().toString();
        }

    }

    private static class LoadBridge
    {

        private final EncryptCreditCardService mEncryptService;

        public void onAlgorithm()
        {
            mEncryptService.mHandler.post(new Runnable() {

                final LoadBridge this$0;

                public void run()
                {
                    mEncryptService.onAlgorithmLoaded();
                }

            
            {
                this$0 = LoadBridge.this;
                super();
            }
            });
        }

        public void onKeys()
        {
            mEncryptService.mHandler.post(new Runnable() {

                final LoadBridge this$0;

                public void run()
                {
                    mEncryptService.onKeysLoaded();
                }

            
            {
                this$0 = LoadBridge.this;
                super();
            }
            });
        }


        private LoadBridge(EncryptCreditCardService encryptcreditcardservice)
        {
            mEncryptService = encryptcreditcardservice;
        }

    }

    private static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ALGORITHM_LOADED;
        public static final State DONE;
        public static final State ENCRYPTING;
        public static final State IDLE;
        public static final State KEY_LOADED;
        public static final State LOADING_JS;
        public static final State LOADING_PAGE;
        public static final State PAGE_LOADED;
        public static final State READY;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/walmartlabs/payment/service/customer/EncryptCreditCardService$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            IDLE = new State("IDLE", 0);
            LOADING_PAGE = new State("LOADING_PAGE", 1);
            PAGE_LOADED = new State("PAGE_LOADED", 2);
            LOADING_JS = new State("LOADING_JS", 3);
            KEY_LOADED = new State("KEY_LOADED", 4);
            ALGORITHM_LOADED = new State("ALGORITHM_LOADED", 5);
            READY = new State("READY", 6);
            ENCRYPTING = new State("ENCRYPTING", 7);
            DONE = new State("DONE", 8);
            $VALUES = (new State[] {
                IDLE, LOADING_PAGE, PAGE_LOADED, LOADING_JS, KEY_LOADED, ALGORITHM_LOADED, READY, ENCRYPTING, DONE
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = com/walmartlabs/payment/service/customer/EncryptCreditCardService.getSimpleName();
    private static final long TIMEOUT = 30000L;
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private final String mHost;
    private final String mMerchantId;
    private EncryptionRequest mRequest;
    private State mState;
    private final Runnable mTimeout = new Runnable() {

        final EncryptCreditCardService this$0;

        public void run()
        {
            WLog.e(EncryptCreditCardService.TAG, (new StringBuilder()).append("Javascript loading timeout, current state:").append(mState).toString());
            onError(com.walmartlabs.kangaroo.Result.Error.ERROR_TIMEOUT);
            destroy();
            mState = State.IDLE;
            nextStep();
        }

            
            {
                this$0 = EncryptCreditCardService.this;
                super();
            }
    };
    private WebView mWebView;

    public EncryptCreditCardService(Context context, String s, String s1)
    {
        mState = State.IDLE;
        mContext = context.getApplicationContext();
        mHost = s;
        mMerchantId = s1;
    }

    private void encrypt()
    {
        if (mRequest != null)
        {
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                mWebView.loadUrl(String.format(Locale.US, "javascript:encryptWithCallbacks('%s', '%s', '%s');", new Object[] {
                    mRequest.mCc, mRequest.mCvv, mRequest.mUuid
                }));
            } else
            {
                mWebView.evaluateJavascript(String.format(Locale.US, "encryptWithReturn('%s', '%s', '%s');", new Object[] {
                    mRequest.mCc, mRequest.mCvv, mRequest.mUuid
                }), new ValueCallback() {

                    final EncryptCreditCardService this$0;

                    public volatile void onReceiveValue(Object obj)
                    {
                        onReceiveValue((String)obj);
                    }

                    public void onReceiveValue(String s)
                    {
                        s = new JSONArray(s);
                        if (s.length() == 6)
                        {
                            onResult(s.getString(0), s.getString(1), s.getString(2), s.getString(3), s.getString(4), s.getString(5));
                            return;
                        }
                        try
                        {
                            WLog.e(EncryptCreditCardService.TAG, "Encryption algorithm did not return the expected result format");
                            onError(com.walmartlabs.kangaroo.Result.Error.ERROR_UNEXPECTED_RESPONSE);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            WLog.e(EncryptCreditCardService.TAG, "Encryption algorithm did not return the expected result format");
                        }
                        onError(com.walmartlabs.kangaroo.Result.Error.ERROR_UNEXPECTED_RESPONSE);
                        return;
                    }

            
            {
                this$0 = EncryptCreditCardService.this;
                super();
            }
                });
            }
            mState = State.ENCRYPTING;
        }
    }

    private void initWebView()
    {
        destroy();
        WebView webview = new WebView(mContext);
        webview.setWebViewClient(new ClientCallbacks(this));
        webview.getSettings().setJavaScriptEnabled(true);
        webview.addJavascriptInterface(new LoadBridge(this), "loadCallback");
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            webview.addJavascriptInterface(new EncryptBridge(this), "encryptionCallback");
        }
        webview.loadUrl("file:///android_asset/encryptCreditCard.html");
        mWebView = webview;
        mState = State.LOADING_PAGE;
    }

    private void injectJavascript()
    {
        injectJavascript(String.format(Locale.US, "(function() {  var script=document.createElement('script');  script.setAttribute('type','text/javascript');  script.setAttribute('src', 'https://%s/pie/v1/%s/getkey.js');  script.onload = function(){loadCallback.onKeys();};  document.getElementsByTagName('head')[0].appendChild(script); })()", new Object[] {
            mHost, mMerchantId
        }));
        injectJavascript(String.format(Locale.US, "(function() {  var script=document.createElement('script');  script.setAttribute('type','text/javascript');  script.setAttribute('src', 'https://%s/pie/v1/encryption.js');  script.onload = function(){loadCallback.onAlgorithm();};  document.getElementsByTagName('head')[0].appendChild(script); })()", new Object[] {
            mHost
        }));
        mState = State.LOADING_JS;
        mHandler.postDelayed(mTimeout, 30000L);
    }

    private void injectJavascript(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            mWebView.loadUrl((new StringBuilder()).append("javascript:").append(s).toString());
            return;
        } else
        {
            mWebView.evaluateJavascript(s, null);
            return;
        }
    }

    private void nextStep()
    {
        static class _cls3
        {

            static final int $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[];

            static 
            {
                $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State = new int[State.values().length];
                try
                {
                    $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[State.IDLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[State.PAGE_LOADED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[State.READY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[State.DONE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.walmartlabs.payment.service.customer.EncryptCreditCardService.State[mState.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            initWebView();
            return;

        case 2: // '\002'
            injectJavascript();
            return;

        case 3: // '\003'
            encrypt();
            return;

        case 4: // '\004'
            destroy();
            break;
        }
    }

    private void onAlgorithmLoaded()
    {
        if (State.LOADING_JS == mState)
        {
            mState = State.ALGORITHM_LOADED;
        } else
        if (State.KEY_LOADED == mState)
        {
            mHandler.removeCallbacks(mTimeout);
            mState = State.READY;
            nextStep();
            return;
        }
    }

    private void onError(com.walmartlabs.kangaroo.Result.Error error)
    {
        (new com.walmartlabs.kangaroo.Result.Builder()).error(error, new RuntimeException());
        if (mRequest != null)
        {
            for (Iterator iterator = mRequest.mCallbacks.iterator(); iterator.hasNext(); ((Callback)iterator.next()).onError(error)) { }
            mState = State.DONE;
            nextStep();
        }
    }

    private void onKeysLoaded()
    {
        if (State.LOADING_JS == mState)
        {
            mState = State.KEY_LOADED;
        } else
        if (State.ALGORITHM_LOADED == mState)
        {
            mHandler.removeCallbacks(mTimeout);
            mState = State.READY;
            nextStep();
            return;
        }
    }

    private void onPageLoaded()
    {
        mState = State.PAGE_LOADED;
        nextStep();
    }

    private void onResult(String s, String s1, String s2, String s3, String s4, String s5)
    {
        EncryptionRequest encryptionrequest = mRequest;
        if (encryptionrequest != null && encryptionrequest.mUuid.equals(s5))
        {
            s = new EncryptedCc(s, s1, s2, s3, s4);
            for (s1 = encryptionrequest.mCallbacks.iterator(); s1.hasNext(); ((Callback)s1.next()).onResult(s)) { }
        } else
        {
            onError(com.walmartlabs.kangaroo.Result.Error.ERROR_UNKNOWN);
        }
        if (State.ENCRYPTING == mState)
        {
            mState = State.DONE;
            nextStep();
        }
    }

    public boolean canEncrypt()
    {
        return mRequest == null && mState.ordinal() <= State.READY.ordinal();
    }

    public void destroy()
    {
        if (mWebView != null)
        {
            mWebView.destroy();
        }
        mWebView = null;
    }

    public void encrypt(String s, String s1, Callback callback)
    {
        if (canEncrypt())
        {
            s = new EncryptionRequest(s, s1);
            s.addCallback(callback);
            mRequest = s;
            if (State.IDLE == mState || State.READY == mState)
            {
                nextStep();
            }
        }
    }

    public void preLoad()
    {
        if (State.IDLE == mState)
        {
            nextStep();
        }
    }





/*
    static State access$102(EncryptCreditCardService encryptcreditcardservice, State state)
    {
        encryptcreditcardservice.mState = state;
        return state;
    }

*/







}
