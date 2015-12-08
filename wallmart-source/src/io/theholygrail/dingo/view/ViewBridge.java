// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.view;

import android.os.Handler;
import android.text.TextUtils;
import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSValue;
import io.theholygrail.jsbridge.JSWebView;

// Referenced classes of package io.theholygrail.dingo.view:
//            ViewBridgeCallback

public class ViewBridge
{

    public static final String NAMESPACE = "view";
    private static final String TAG = io/theholygrail/dingo/view/ViewBridge.getSimpleName();
    ViewBridgeCallback mCallback;
    Handler mHandler;
    JSWebView mWebView;

    public ViewBridge(JSWebView jswebview, ViewBridgeCallback viewbridgecallback)
    {
        mWebView = jswebview;
        mHandler = new Handler();
        mCallback = viewbridgecallback;
    }

    public void setOnAppear(String s)
    {
        JSLog.d(TAG, (new StringBuilder()).append("setOnAppear(): ").append(s).toString());
        ViewBridgeCallback.OnAppearListener onappearlistener = null;
        if (!TextUtils.isEmpty(s))
        {
            onappearlistener = new ViewBridgeCallback.OnAppearListener() {

                final ViewBridge this$0;
                final JSValue val$callbackValue;

                public void onAppear()
                {
                    JSLog.d(ViewBridge.TAG, "onAppear");
                    callbackValue.callFunction(mWebView, null, null);
                }

            
            {
                this$0 = ViewBridge.this;
                callbackValue = jsvalue;
                super();
            }
            };
        }
        mCallback.setOnAppear(onappearlistener);
    }

    public void setOnDisappear(String s)
    {
        JSLog.d(TAG, (new StringBuilder()).append("setOnDisappear(): ").append(s).toString());
        ViewBridgeCallback.OnDisappearListener ondisappearlistener = null;
        if (!TextUtils.isEmpty(s))
        {
            ondisappearlistener = new ViewBridgeCallback.OnDisappearListener() {

                final ViewBridge this$0;
                final JSValue val$callbackValue;

                public void onDisappear()
                {
                    JSLog.d(ViewBridge.TAG, "onDisappear()");
                    callbackValue.callFunction(mWebView, null, null);
                }

            
            {
                this$0 = ViewBridge.this;
                callbackValue = jsvalue;
                super();
            }
            };
        }
        mCallback.setOnDisappear(ondisappearlistener);
    }

    public void show()
    {
        JSLog.d(TAG, "show()");
        mHandler.post(new Runnable() {

            final ViewBridge this$0;

            public void run()
            {
                if (mCallback != null)
                {
                    mCallback.show();
                }
            }

            
            {
                this$0 = ViewBridge.this;
                super();
            }
        });
    }


}
