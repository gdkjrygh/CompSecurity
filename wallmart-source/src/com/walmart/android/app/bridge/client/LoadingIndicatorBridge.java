// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.client;

import android.os.Handler;
import com.walmartlabs.utils.WLog;
import io.theholygrail.dingo.JsonTransformer;
import io.theholygrail.jsbridge.JSWebView;

// Referenced classes of package com.walmart.android.app.bridge.client:
//            LoadingIndicatorBridgeCallback

public class LoadingIndicatorBridge
{

    public static final String NAMESPACE = "loadingIndicator";
    private static final String TAG = com/walmart/android/app/bridge/client/LoadingIndicatorBridge.getSimpleName();
    LoadingIndicatorBridgeCallback mCallback;
    Handler mHandler;
    JsonTransformer mJsonTransformer;
    JSWebView mWebView;

    public LoadingIndicatorBridge(JSWebView jswebview, JsonTransformer jsontransformer, LoadingIndicatorBridgeCallback loadingindicatorbridgecallback)
    {
        mWebView = jswebview;
        mJsonTransformer = jsontransformer;
        mCallback = loadingindicatorbridgecallback;
        mHandler = new Handler();
    }

    public void hide()
    {
        mHandler.post(new Runnable() {

            final LoadingIndicatorBridge this$0;

            public void run()
            {
                WLog.i(LoadingIndicatorBridge.TAG, "hide()");
                if (mCallback != null)
                {
                    mCallback.hide();
                }
            }

            
            {
                this$0 = LoadingIndicatorBridge.this;
                super();
            }
        });
    }

    public void show()
    {
        mHandler.post(new Runnable() {

            final LoadingIndicatorBridge this$0;

            public void run()
            {
                WLog.i(LoadingIndicatorBridge.TAG, "show()");
                if (mCallback != null)
                {
                    mCallback.show();
                }
            }

            
            {
                this$0 = LoadingIndicatorBridge.this;
                super();
            }
        });
    }

    public void show(String s)
    {
        show();
    }


}
