// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.net.http.SslError;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.devicecollector.collectors:
//            WebCollectorTask

class this._cls1 extends WebChromeClient
{

    final is._cls0 this$1;

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        return WebCollectorTask.access$600(_fld0, consolemessage);
    }

    l.dcStartUrl()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/devicecollector/collectors/WebCollectorTask$1

/* anonymous class */
    class WebCollectorTask._cls1
        implements Runnable
    {

        final WebCollectorTask this$0;
        final String val$dcStartUrl;

        public void run()
        {
            WebCollectorTask webcollectortask = WebCollectorTask.this;
            WebCollectorTask.access$002(webcollectortask, new WebView(activity.getApplicationContext()));
            WebSettings websettings = WebCollectorTask.access$000(webcollectortask).getSettings();
            websettings.setJavaScriptEnabled(true);
            websettings.setDomStorageEnabled(true);
            websettings.setPluginState(android.webkit.WebSettings.PluginState.ON);
            WebCollectorTask.access$000(webcollectortask).setWebViewClient(new WebCollectorTask._cls1._cls1());
            WebCollectorTask.access$000(webcollectortask).setWebChromeClient(new WebCollectorTask._cls1._cls2());
            WebCollectorTask.access$000(webcollectortask).loadUrl(dcStartUrl);
        }

            
            {
                this$0 = final_webcollectortask;
                dcStartUrl = String.this;
                super();
            }

        // Unreferenced inner class com/devicecollector/collectors/WebCollectorTask$1$1

/* anonymous class */
        class WebCollectorTask._cls1._cls1 extends WebViewClient
        {

            WebCollectorTask task;
            final WebCollectorTask._cls1 this$1;

            public void onLoadResource(WebView webview, String s)
            {
                WebCollectorTask.access$100(task, webview, s);
            }

            public void onPageFinished(WebView webview, String s)
            {
                WebCollectorTask.access$200(task, webview, s);
            }

            public void onReceivedError(WebView webview, int i, String s, String s1)
            {
                WebCollectorTask.access$300(task, webview, i, s, s1);
            }

            public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
            {
                WebCollectorTask.access$400(task, webview, sslerrorhandler, sslerror);
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                return WebCollectorTask.access$500(task, webview, s);
            }

                    
                    {
                        this$1 = WebCollectorTask._cls1.this;
                        super();
                        task = this$0;
                    }
        }

    }

}
