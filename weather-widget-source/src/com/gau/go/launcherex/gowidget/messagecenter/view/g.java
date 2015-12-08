// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.view;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.gau.go.launcherex.gowidget.messagecenter.view:
//            MessageCenterWebView

class g extends WebViewClient
{

    final MessageCenterWebView a;
    private String b;

    g(MessageCenterWebView messagecenterwebview)
    {
        a = messagecenterwebview;
        super();
        b = "";
    }

    public void a(String s)
    {
        b = s;
    }

    public void onLoadResource(WebView webview, String s)
    {
        super.onLoadResource(webview, s);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        MessageCenterWebView.b(a);
        if (b.equals(s))
        {
            webview.loadUrl((new StringBuilder()).append("javascript:init('").append(MessageCenterWebView.c(a)).append("','").append(MessageCenterWebView.d(a)).append("')").toString());
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        MessageCenterWebView.a(a);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview.loadUrl(s);
        return true;
    }
}
