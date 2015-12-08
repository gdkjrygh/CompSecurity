// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.hybrid;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.hybrid:
//            WebViewJavascriptBridge

class val.javascriptCommand
    implements Runnable
{

    final WebViewJavascriptBridge this$0;
    final String val$javascriptCommand;

    public void run()
    {
        if (android.os.iptBridge >= 19)
        {
            WebViewJavascriptBridge.access$300(WebViewJavascriptBridge.this).evaluateJavascript(val$javascriptCommand, new ValueCallback() {

                final WebViewJavascriptBridge._cls1 this$1;

                public volatile void onReceiveValue(Object obj)
                {
                    onReceiveValue((String)obj);
                }

                public void onReceiveValue(String s)
                {
                    WLog.d(WebViewJavascriptBridge.access$200(), (new StringBuilder()).append("evaulate.OnReceive(): ").append(s).toString());
                }

            
            {
                this$1 = WebViewJavascriptBridge._cls1.this;
                super();
            }
            });
            return;
        } else
        {
            WebViewJavascriptBridge.access$300(WebViewJavascriptBridge.this).loadUrl((new StringBuilder()).append("javascript:").append(val$javascriptCommand).toString());
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_webviewjavascriptbridge;
        val$javascriptCommand = String.this;
        super();
    }
}
