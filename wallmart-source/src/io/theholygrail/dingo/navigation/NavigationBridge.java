// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigation;

import android.os.Handler;
import io.theholygrail.dingo.JsonTransformer;
import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSValue;
import io.theholygrail.jsbridge.JSWebView;

// Referenced classes of package io.theholygrail.dingo.navigation:
//            ExternalUrlOptions, NavigationOptions, NavigationBridgeCallback

public class NavigationBridge
{

    public static final String NAMESPACE = "navigation";
    private static final String TAG = io/theholygrail/dingo/navigation/NavigationBridge.getSimpleName();
    NavigationBridgeCallback mCallback;
    Handler mHandler;
    JsonTransformer mJsonTransformer;
    JSWebView mWebView;

    public NavigationBridge(JSWebView jswebview, JsonTransformer jsontransformer, NavigationBridgeCallback navigationbridgecallback)
    {
        mWebView = jswebview;
        mJsonTransformer = jsontransformer;
        mHandler = new Handler();
        mCallback = navigationbridgecallback;
    }

    public void animateBackward()
    {
        JSLog.d(TAG, "animateBackward()");
        mHandler.post(new Runnable() {

            final NavigationBridge this$0;

            public void run()
            {
                mCallback.animateBackwards();
            }

            
            {
                this$0 = NavigationBridge.this;
                super();
            }
        });
    }

    public void animateForward()
    {
        JSLog.d(TAG, "animateForward()");
        animateForward(null);
    }

    public void animateForward(final String options)
    {
        JSLog.d(TAG, (new StringBuilder()).append("animateForward(): ").append(options).toString());
        mHandler.post(new Runnable() {

            final NavigationBridge this$0;
            final String val$options;

            public void run()
            {
                mCallback.animateForward(options);
            }

            
            {
                this$0 = NavigationBridge.this;
                options = s;
                super();
            }
        });
    }

    public void dismissModal()
    {
        JSLog.d(TAG, "dismissModal() called");
        mHandler.post(new Runnable() {

            final NavigationBridge this$0;

            public void run()
            {
                mCallback.dismissModal();
            }

            
            {
                this$0 = NavigationBridge.this;
                super();
            }
        });
    }

    public void popToRoot()
    {
        JSLog.d(TAG, "popToRoot()");
        mHandler.post(new Runnable() {

            final NavigationBridge this$0;

            public void run()
            {
                mCallback.popToRoot();
            }

            
            {
                this$0 = NavigationBridge.this;
                super();
            }
        });
    }

    public void presentExternalURL(final String urlOptions)
    {
        JSLog.d(TAG, (new StringBuilder()).append("presentExternalURL(): ").append(urlOptions).toString());
        urlOptions = (ExternalUrlOptions)mJsonTransformer.fromJson(urlOptions, io/theholygrail/dingo/navigation/ExternalUrlOptions);
        mHandler.post(new Runnable() {

            final NavigationBridge this$0;
            final ExternalUrlOptions val$urlOptions;

            public void run()
            {
                mCallback.presentExternalUrl(urlOptions);
            }

            
            {
                this$0 = NavigationBridge.this;
                urlOptions = externalurloptions;
                super();
            }
        });
    }

    public void presentModal()
    {
        presentModal(null);
    }

    public void presentModal(final String navigationOptions)
    {
        JSLog.d(TAG, (new StringBuilder()).append("presentModal(): ").append(navigationOptions).toString());
        navigationOptions = (NavigationOptions)mJsonTransformer.fromJson(navigationOptions, io/theholygrail/dingo/navigation/NavigationOptions);
        mHandler.post(new Runnable() {

            final NavigationBridge this$0;
            final NavigationOptions val$navigationOptions;

            public void run()
            {
                mCallback.presentModal(navigationOptions);
            }

            
            {
                this$0 = NavigationBridge.this;
                navigationOptions = navigationoptions;
                super();
            }
        });
    }

    public void setOnBack(final String callback)
    {
        JSLog.d(TAG, (new StringBuilder()).append("setOnBack(): ").append(callback).toString());
        mHandler.post(new Runnable() {

            final NavigationBridge this$0;
            final String val$callback;

            public void run()
            {
                JSValue jsvalue = new JSValue(callback);
                mCallback.setOnBackListener(jsvalue. new NavigationBridgeCallback.OnBackListener() {

                    final _cls6 this$1;
                    final JSValue val$callbackValue;

                    public void onBack()
                    {
                        JSLog.d(NavigationBridge.TAG, "onBack()");
                        callbackValue.callFunction(mWebView, null, null);
                    }

            
            {
                this$1 = final__pcls6;
                callbackValue = JSValue.this;
                super();
            }
                });
            }

            
            {
                this$0 = NavigationBridge.this;
                callback = s;
                super();
            }
        });
    }


}
