// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.d;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class b extends WebViewClient
{

    public b()
    {
    }

    public void onLoadResource(WebView webview, String s)
    {
        super.onLoadResource(webview, s);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }

    public void onTooManyRedirects(WebView webview, Message message, Message message1)
    {
        super.onTooManyRedirects(webview, message, message1);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest webresourcerequest)
    {
        return super.shouldInterceptRequest(webview, webresourcerequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        return super.shouldInterceptRequest(webview, s);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return super.shouldOverrideUrlLoading(webview, s);
    }
}
