// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.content.Context;
import android.util.Log;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.walmart.android.wmservice.Util;

public class QRWebViewClient extends WebViewClient
{
    public static interface BusEventListener
    {

        public abstract void onLoadingFinished();

        public abstract void onLoadingStarted();

        public abstract boolean onOverrideUrlLoading(String s);
    }


    public static final String TAG = com/walmart/android/app/qr/QRWebViewClient.getSimpleName();
    private Context mContext;
    private String mURL;
    private WebView mWebView;

    public QRWebViewClient(WebView webview, Context context, String s)
    {
        mContext = context;
        CookieSyncManager.createInstance(mContext);
        mWebView = webview;
        mURL = s;
        webview = mWebView.getSettings();
        context = webview.getUserAgentString();
        webview.setUserAgentString((new StringBuilder()).append(context).append("Walmart").toString());
        mWebView.setScrollBarStyle(0);
        mWebView.setWebViewClient(this);
        mWebView.setWebChromeClient(new WebChromeClient() {

            final QRWebViewClient this$0;

            public void onConsoleMessage(String s1, int i, String s2)
            {
                super.onConsoleMessage(s1, i, s2);
                Log.e(QRWebViewClient.TAG, (new StringBuilder()).append("Console: ").append(s1).append(" ").append(s2).append(" ").append(i).append(' ').append(mWebView.getContentHeight()).append(" ").append(mWebView.getHeight()).toString());
            }

            
            {
                this$0 = QRWebViewClient.this;
                super();
            }
        });
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setDatabasePath("~/foo1");
    }

    public void init()
    {
        Util.clearWebViewCookies();
        mWebView.loadUrl(mURL);
    }

    public void onLoadResource(WebView webview, String s)
    {
        super.onLoadResource(webview, s);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
    }

    public void setBusEventListener(BusEventListener buseventlistener)
    {
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return true;
    }


}
