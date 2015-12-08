// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.hybrid;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.codehaus.jackson.map.ObjectMapper;

public class WebViewJavascriptBridge
{
    public static interface JavaCallback
    {

        public abstract void callbackToJava(Object obj);
    }

    public static interface JavaHandler
    {

        public abstract Object handle(String s, JsCallback jscallback);
    }

    public static interface JsCallback
    {

        public abstract void callbackToJs(Object obj);
    }

    private class JsCallbackImpl
        implements JsCallback
    {

        private final String callbackIdJs;
        final WebViewJavascriptBridge this$0;

        public void callbackToJs(Object obj)
        {
            try
            {
                obj = mObjectMapper.writeValueAsString(new JsCallbackMessage(callbackIdJs, obj));
                sendMessageJson(((String) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                WLog.e(WebViewJavascriptBridge.TAG, "Failed to convert JsCallbackMessage object to JSON string", ((Throwable) (obj)));
            }
        }

        public JsCallbackImpl(String s)
        {
            this$0 = WebViewJavascriptBridge.this;
            super();
            callbackIdJs = s;
        }
    }

    public static class JsCallbackMessage
    {

        public Object responseData;
        public String responseId;

        public JsCallbackMessage(String s, Object obj)
        {
            responseId = s;
            responseData = obj;
        }
    }

    public static class JsHandlerMessage
    {

        public String callbackId;
        public Object data;
        public String handlerName;

        public JsHandlerMessage(String s, Object obj, String s1)
        {
            handlerName = s;
            data = obj;
            callbackId = s1;
        }
    }


    private static final boolean DEBUG = false;
    private static final String TAG = com/walmartlabs/hybrid/WebViewJavascriptBridge.getSimpleName();
    private Context mContext;
    private final Handler mHandler = new Handler();
    private final Map mJavaCallbacks = new ConcurrentHashMap();
    private final Map mJavaHandlers = new ConcurrentHashMap();
    private final ObjectMapper mObjectMapper = new ObjectMapper();
    private long mUniqueId;
    private WebView mWebView;

    public WebViewJavascriptBridge(Context context, WebView webview)
    {
        mUniqueId = 0L;
        mContext = context;
        mWebView = webview;
        mObjectMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.addJavascriptInterface(this, "_WebViewJavascriptBridge");
    }

    private void sendMessageJson(final String javascriptCommand)
    {
        WLog.i(TAG, (new StringBuilder()).append("sending: ").append(javascriptCommand).toString());
        javascriptCommand = String.format("WebViewJavascriptBridge._handleMessageFromJava(%s);", new Object[] {
            javascriptCommand
        });
        mHandler.post(new Runnable() {

            final WebViewJavascriptBridge this$0;
            final String val$javascriptCommand;

            public void run()
            {
                if (android.os.Build.VERSION.SDK_INT >= 19)
                {
                    mWebView.evaluateJavascript(javascriptCommand, new ValueCallback() {

                        final _cls1 this$1;

                        public volatile void onReceiveValue(Object obj)
                        {
                            onReceiveValue((String)obj);
                        }

                        public void onReceiveValue(String s)
                        {
                            WLog.d(WebViewJavascriptBridge.TAG, (new StringBuilder()).append("evaulate.OnReceive(): ").append(s).toString());
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return;
                } else
                {
                    mWebView.loadUrl((new StringBuilder()).append("javascript:").append(javascriptCommand).toString());
                    return;
                }
            }

            
            {
                this$0 = WebViewJavascriptBridge.this;
                javascriptCommand = s;
                super();
            }
        });
    }

    public String _handleMessageFromJs(String s, String s1, Object obj, String s2, String s3)
    {
        if (s1 != null)
        {
            s = (JavaCallback)mJavaCallbacks.get(s1);
            if (s != null)
            {
                s.callbackToJava(obj);
                mJavaCallbacks.remove(s1);
                return null;
            } else
            {
                WLog.e(TAG, (new StringBuilder()).append("No responseCallback found for responseId: ").append(s1).toString());
                return null;
            }
        }
        if (s2 != null)
        {
            s1 = new JsCallbackImpl(s2);
        } else
        {
            s1 = null;
        }
        s2 = (JavaHandler)mJavaHandlers.get(s3);
        if (s2 == null)
        {
            WLog.e(TAG, (new StringBuilder()).append("No handler registered for name ").append(s3).toString());
            return null;
        }
        obj = null;
        try
        {
            s1 = ((String) (s2.handle(s, s1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, (new StringBuilder()).append("Caught exception while executing handler: ").append(s3).toString(), s);
            return null;
        }
        s = ((String) (obj));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        s = mObjectMapper.writeValueAsString(s1);
        return s;
    }

    public void callJsHandler(String s)
    {
        callJsHandler(s, null, null);
    }

    public void callJsHandler(String s, String s1)
    {
        callJsHandler(s, s1, null);
    }

    public void callJsHandler(String s, String s1, JavaCallback javacallback)
    {
        Object obj = null;
        if (javacallback != null)
        {
            obj = (new StringBuilder()).append("java_cb_");
            long l = mUniqueId + 1L;
            mUniqueId = l;
            obj = ((StringBuilder) (obj)).append(l).toString();
            mJavaCallbacks.put(obj, javacallback);
        }
        s = new JsHandlerMessage(s, s1, ((String) (obj)));
        try
        {
            sendMessageJson(mObjectMapper.writeValueAsString(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "Failed to convert JsHandlerMessage object to JSON string", s);
        }
    }

    public void registerJavaHandler(String s, JavaHandler javahandler)
    {
        mJavaHandlers.put(s, javahandler);
    }





}
