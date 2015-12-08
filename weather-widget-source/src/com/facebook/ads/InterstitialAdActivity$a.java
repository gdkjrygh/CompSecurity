// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.a.a.a;
import com.facebook.ads.a.a.b;
import com.facebook.ads.a.p;
import com.facebook.ads.a.z;

// Referenced classes of package com.facebook.ads:
//            InterstitialAdActivity

class <init> extends WebViewClient
{

    final InterstitialAdActivity a;

    public void onLoadResource(WebView webview, String s)
    {
        InterstitialAdActivity.access$200(a).f();
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        if (p.a())
        {
            sslerrorhandler.proceed();
            return;
        } else
        {
            sslerrorhandler.cancel();
            return;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = Uri.parse(s);
        if ("fbad".equals(webview.getScheme()) && "close".equals(webview.getAuthority()))
        {
            a.finish();
        } else
        {
            InterstitialAdActivity.access$100(a, "com.facebook.ads.interstitial.clicked");
            webview = b.a(a, webview);
            if (webview != null)
            {
                try
                {
                    InterstitialAdActivity.access$302(a, webview.a());
                    InterstitialAdActivity.access$402(a, System.currentTimeMillis());
                    webview.a(null);
                }
                // Misplaced declaration of an exception variable
                catch (WebView webview)
                {
                    Log.e(InterstitialAdActivity.access$500(), "Error executing action", webview);
                    return true;
                }
                return true;
            }
        }
        return true;
    }

    private (InterstitialAdActivity interstitialadactivity)
    {
        a = interstitialadactivity;
        super();
    }

    a(InterstitialAdActivity interstitialadactivity, a a1)
    {
        this(interstitialadactivity);
    }
}
