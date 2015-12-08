// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.hybrid;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.hybrid:
//            WebViewJavascriptBridge

class this._cls1
    implements ValueCallback
{

    final ss._cls200 this$1;

    public volatile void onReceiveValue(Object obj)
    {
        onReceiveValue((String)obj);
    }

    public void onReceiveValue(String s)
    {
        WLog.d(WebViewJavascriptBridge.access$200(), (new StringBuilder()).append("evaulate.OnReceive(): ").append(s).toString());
    }

    l.javascriptCommand()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/hybrid/WebViewJavascriptBridge$1

/* anonymous class */
    class WebViewJavascriptBridge._cls1
        implements Runnable
    {

        final WebViewJavascriptBridge this$0;
        final String val$javascriptCommand;

        public void run()
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                WebViewJavascriptBridge.access$300(WebViewJavascriptBridge.this).evaluateJavascript(javascriptCommand, new WebViewJavascriptBridge._cls1._cls1());
                return;
            } else
            {
                WebViewJavascriptBridge.access$300(WebViewJavascriptBridge.this).loadUrl((new StringBuilder()).append("javascript:").append(javascriptCommand).toString());
                return;
            }
        }

            
            {
                this$0 = final_webviewjavascriptbridge;
                javascriptCommand = String.this;
                super();
            }
    }

}
