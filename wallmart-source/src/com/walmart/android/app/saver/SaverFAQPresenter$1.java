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

class val.parent
    implements android.widget.ctory
{

    final SaverFAQPresenter this$0;
    final ViewGroup val$parent;

    public View createTabContent(String s)
    {
        if ("howto".equals(s))
        {
            return SaverFAQPresenter.access$000(SaverFAQPresenter.this).getLayoutInflater().inflate(0x7f040148, val$parent, false);
        } else
        {
            s = SaverFAQPresenter.access$000(SaverFAQPresenter.this).getLayoutInflater().inflate(0x7f040096, val$parent, false);
            final WebView webView = (WebView)s.findViewById(0x7f100205);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient() {

                final SaverFAQPresenter._cls1 this$1;
                final WebView val$webView;

                public void onPageFinished(WebView webview, String s1)
                {
                    super.onPageFinished(webview, s1);
                    SaverFAQPresenter.access$100(this$0).findViewById(0x7f1001bb).setVisibility(8);
                    webView.setVisibility(0);
                }

                public boolean shouldOverrideUrlLoading(WebView webview, String s1)
                {
                    webview = new Intent("android.intent.action.VIEW");
                    webview.setData(Uri.parse(s1));
                    if (webview.resolveActivity(SaverFAQPresenter.access$000(this$0).getPackageManager()) != null)
                    {
                        SaverFAQPresenter.access$000(this$0).startActivity(webview);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$1 = SaverFAQPresenter._cls1.this;
                webView = webview;
                super();
            }
            });
            webView.addJavascriptInterface(new edbackBridge(SaverFAQPresenter.access$000(SaverFAQPresenter.this), null), "feedback");
            webView.loadUrl(Services.get().getSaverServiceSettings().getFaqUrl(SaverFAQPresenter.access$300(SaverFAQPresenter.this)));
            return s;
        }
    }

    _cls1.val.webView()
    {
        this$0 = final_saverfaqpresenter;
        val$parent = ViewGroup.this;
        super();
    }
}
