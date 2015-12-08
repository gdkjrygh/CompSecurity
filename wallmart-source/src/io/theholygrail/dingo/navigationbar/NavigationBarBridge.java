// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigationbar;

import android.content.Context;
import android.os.Handler;
import io.theholygrail.dingo.JsonTransformer;
import io.theholygrail.dingo.navigation.NavigationBridge;
import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSValue;
import io.theholygrail.jsbridge.JSWebView;
import io.theholygrail.jsbridge.JsValueUtil;

// Referenced classes of package io.theholygrail.dingo.navigationbar:
//            NavigationBarBridgeCallback, Button

public class NavigationBarBridge
{

    public static final String NAMESPACE = "navigationBar";
    private static final String TAG = io/theholygrail/dingo/navigation/NavigationBridge.getSimpleName();
    NavigationBarBridgeCallback mCallback;
    Context mContext;
    Handler mHandler;
    JsonTransformer mTransformer;
    JSWebView mWebView;

    public NavigationBarBridge(JSWebView jswebview, JsonTransformer jsontransformer, NavigationBarBridgeCallback navigationbarbridgecallback)
    {
        mWebView = jswebview;
        mContext = mWebView.getContext();
        mCallback = navigationbarbridgecallback;
        mTransformer = jsontransformer;
        mHandler = new Handler();
    }

    public void setButtons(final String buttons, final String callbackValue)
    {
        JSLog.d(TAG, (new StringBuilder()).append("setButtons: ").append(buttons).toString());
        buttons = (Button[])mTransformer.fromJson(buttons, [Lio/theholygrail/dingo/navigationbar/Button;);
        callbackValue = new JSValue(callbackValue);
        mHandler.post(new Runnable() {

            final NavigationBarBridge this$0;
            final Button val$buttons[];
            final JSValue val$callbackValue;

            public void run()
            {
                if (mCallback != null)
                {
                    NavigationBarBridgeCallback.OnClickListener onclicklistener = null;
                    if (buttons != null)
                    {
                        onclicklistener = new NavigationBarBridgeCallback.OnClickListener() {

                            final _cls2 this$1;

                            public void onClick(String s)
                            {
                                if (callbackValue.isFunction().booleanValue())
                                {
                                    callbackValue.callFunction(mWebView, new Object[] {
                                        s
                                    }, null);
                                }
                            }

            
            {
                this$1 = _cls2.this;
                super();
            }
                        };
                    }
                    mCallback.setButtons(buttons, onclicklistener);
                }
            }

            
            {
                this$0 = NavigationBarBridge.this;
                buttons = abutton;
                callbackValue = jsvalue;
                super();
            }
        });
    }

    public void setTitle(final String titleText)
    {
        JSLog.d(TAG, (new StringBuilder()).append("setTitle(").append(titleText).append(")").toString());
        titleText = JsValueUtil.parseQuotes(titleText);
        mHandler.post(new Runnable() {

            final NavigationBarBridge this$0;
            final String val$titleText;

            public void run()
            {
                mCallback.setTitle(titleText);
            }

            
            {
                this$0 = NavigationBarBridge.this;
                titleText = s;
                super();
            }
        });
    }

}
