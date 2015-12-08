// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.walmart.android.config.SaverServiceSettings;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFAQPresenter

class val.webView extends WebViewClient
{

    final is._cls0 this$1;
    final WebView val$webView;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        SaverFAQPresenter.access$100(_fld0).findViewById(0x7f1001bb).setVisibility(8);
        val$webView.setVisibility(0);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = new Intent("android.intent.action.VIEW");
        webview.setData(Uri.parse(s));
        if (webview.resolveActivity(SaverFAQPresenter.access$000(_fld0).getPackageManager()) != null)
        {
            SaverFAQPresenter.access$000(_fld0).startActivity(webview);
            return true;
        } else
        {
            return false;
        }
    }

    l.parent()
    {
        this$1 = final_parent;
        val$webView = WebView.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/saver/SaverFAQPresenter$1

/* anonymous class */
    class SaverFAQPresenter._cls1
        implements android.widget.TabHost.TabContentFactory
    {

        final SaverFAQPresenter this$0;
        final ViewGroup val$parent;

        public View createTabContent(String s)
        {
            if ("howto".equals(s))
            {
                return SaverFAQPresenter.access$000(SaverFAQPresenter.this).getLayoutInflater().inflate(0x7f040148, parent, false);
            } else
            {
                s = SaverFAQPresenter.access$000(SaverFAQPresenter.this).getLayoutInflater().inflate(0x7f040096, parent, false);
                WebView webview = (WebView)s.findViewById(0x7f100205);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.setWebViewClient(webview. new SaverFAQPresenter._cls1._cls1());
                webview.addJavascriptInterface(new SaverFAQPresenter.FeedbackBridge(SaverFAQPresenter.access$000(SaverFAQPresenter.this), null), "feedback");
                webview.loadUrl(Services.get().getSaverServiceSettings().getFaqUrl(SaverFAQPresenter.access$300(SaverFAQPresenter.this)));
                return s;
            }
        }

            
            {
                this$0 = final_saverfaqpresenter;
                parent = ViewGroup.this;
                super();
            }
    }

}
