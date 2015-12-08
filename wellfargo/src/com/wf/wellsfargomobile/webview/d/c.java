// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.d;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.util.v;

public class c extends WebViewClient
{

    private final MainActivity a;

    public c(MainActivity mainactivity)
    {
        a = mainactivity;
    }

    public void onPageFinished(WebView webview, String s)
    {
        a.b.setVisibility(8);
        webview.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        super.onPageFinished(webview, s);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        a.b.setVisibility(0);
        super.onPageStarted(webview, s, bitmap);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        switch (i)
        {
        default:
            webview = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (webview != null && webview.isConnected())
            {
                a.a(a.getString(0x7f0800b2), (new StringBuilder()).append(a.getString(0x7f0800ae)).append(" [").append(i).append("]").toString(), 0x7f0200fb, "NetworkErrorFastLookDialogFragment");
                return;
            } else
            {
                a.a(a.getString(0x7f0800b2), (new StringBuilder()).append(a.getString(0x7f0800af)).append(" [").append(i).append("]").toString(), 0x7f0200fb, "NetworkErrorFastLookDialogFragment");
                return;
            }

        case -8: 
            a.a(a.getString(0x7f0800b2), a.getString(0x7f0800b1), 0x7f0200fb, "NetworkErrorFastLookDialogFragment");
            return;
        }
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        a.a(a.getString(0x7f080105), a.getString(0x7f0800ff, new Object[] {
            WFApp.ag()
        }), 0x7f0200fb, "NetworkErrorFastLookDialogFragment");
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest webresourcerequest)
    {
        if (v.d(webresourcerequest.getUrl().toString()))
        {
            return super.shouldInterceptRequest(webview, webresourcerequest);
        } else
        {
            return v.c();
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        if (v.d(s))
        {
            return super.shouldInterceptRequest(webview, s);
        } else
        {
            return v.c();
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return !v.d(s);
    }
}
