// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.client;

import android.os.Handler;
import com.walmart.android.app.bridge.ResultCallback;
import com.walmartlabs.utils.WLog;
import io.theholygrail.dingo.JsonTransformer;
import io.theholygrail.jsbridge.JSValue;
import io.theholygrail.jsbridge.JSWebView;
import io.theholygrail.jsbridge.JsValueUtil;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.walmart.android.app.bridge.client:
//            SignInOptions, ClientBridgeCallback, SignIn

public class ClientBridge
{

    public static final String NAMESPACE = "client";
    private static final String TAG = com/walmart/android/app/bridge/client/ClientBridge.getSimpleName();
    ClientBridgeCallback mCallback;
    Handler mHandler;
    JsonTransformer mJsonTransformer;
    JSWebView mWebView;

    public ClientBridge(JSWebView jswebview, JsonTransformer jsontransformer, ClientBridgeCallback clientbridgecallback)
    {
        mWebView = jswebview;
        mCallback = clientbridgecallback;
        mJsonTransformer = jsontransformer;
        mHandler = new Handler();
    }

    public void navigateToBrowser(final String browserUrl)
    {
        WLog.d(TAG, (new StringBuilder()).append("navigateToBrowser: ").append(browserUrl).toString());
        browserUrl = JsValueUtil.parseQuotes(browserUrl);
        mHandler.post(new Runnable() {

            final ClientBridge this$0;
            final String val$browserUrl;

            public void run()
            {
                if (mCallback != null)
                {
                    mCallback.openBrowser(browserUrl);
                }
            }

            
            {
                this$0 = ClientBridge.this;
                browserUrl = s;
                super();
            }
        });
    }

    public void navigateToHome()
    {
        WLog.d(TAG, "navigateToHome()");
        mHandler.post(new Runnable() {

            final ClientBridge this$0;

            public void run()
            {
                if (mCallback != null)
                {
                    mCallback.showHome();
                }
            }

            
            {
                this$0 = ClientBridge.this;
                super();
            }
        });
    }

    public void pushToItemPage(final String id)
    {
        WLog.d(TAG, "pushToItemPage()");
        id = JsValueUtil.parseQuotes(id);
        mHandler.post(new Runnable() {

            final ClientBridge this$0;
            final String val$id;

            public void run()
            {
                if (mCallback != null)
                {
                    mCallback.showItemPage(id);
                }
            }

            
            {
                this$0 = ClientBridge.this;
                id = s;
                super();
            }
        });
    }

    public void pushToOrderDetails(final String id)
    {
        WLog.d(TAG, (new StringBuilder()).append("pushToOrderDetails(): ").append(id).toString());
        id = JsValueUtil.parseQuotes(id);
        mHandler.post(new Runnable() {

            final ClientBridge this$0;
            final String val$id;

            public void run()
            {
                if (mCallback != null)
                {
                    mCallback.showOrderDetails(id);
                }
            }

            
            {
                this$0 = ClientBridge.this;
                id = s;
                super();
            }
        });
    }

    public void signIn(final String mergeType, final String successValue, final String cancelValue)
    {
        WLog.d(TAG, (new StringBuilder()).append("signIn(").append(mergeType).append(")").toString());
        mergeType = (SignInOptions)mJsonTransformer.fromJson(mergeType, com/walmart/android/app/bridge/client/SignInOptions);
        if (mergeType != null)
        {
            mergeType = ((SignInOptions) (mergeType)).mergeType;
        } else
        {
            mergeType = null;
        }
        successValue = new JSValue(successValue);
        cancelValue = new JSValue(cancelValue);
        mHandler.post(new Runnable() {

            final ClientBridge this$0;
            final JSValue val$cancelValue;
            final String val$mergeType;
            final JSValue val$successValue;

            public void run()
            {
                mCallback.signin(mergeType, new ResultCallback() {

                    final _cls1 this$1;

                    public void onResult(SignIn signin)
                    {
                        WLog.d(ClientBridge.TAG, "Sign in done");
                        if (signin != null && signin.customer != null)
                        {
                            try
                            {
                                JSONObject jsonobject = new JSONObject(mJsonTransformer.toJson(signin.customer));
                                successValue.callFunction(mWebView, new Object[] {
                                    jsonobject, Boolean.valueOf(signin.accountCreated)
                                }, null);
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (SignIn signin)
                            {
                                return;
                            }
                        } else
                        {
                            cancelValue.callFunction(mWebView, new Object[] {
                                ""
                            }, null);
                            return;
                        }
                    }

                    public volatile void onResult(Object obj)
                    {
                        onResult((SignIn)obj);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = ClientBridge.this;
                mergeType = s;
                successValue = jsvalue;
                cancelValue = jsvalue1;
                super();
            }
        });
    }


}
