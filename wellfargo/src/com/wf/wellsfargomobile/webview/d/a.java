// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.d;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
import com.wf.wellsfargomobile.i;
import com.wf.wellsfargomobile.l;
import java.net.MalformedURLException;
import java.net.URL;

public class a extends WebViewClient
{

    final String a = "text/html";
    final String b = "UTF-8";
    private final MainActivity c;
    private l d;

    public a(MainActivity mainactivity, l l1)
    {
        c = mainactivity;
        d = l1;
    }

    public void onLoadResource(WebView webview, String s)
    {
        super.onLoadResource(webview, s);
    }

    public void onPageFinished(WebView webview, String s)
    {
        if (s.contains(c.getString(0x7f08016c)))
        {
            WFApp.B();
        }
        d.a.setVisibility(8);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        d.a.setVisibility(0);
    }

    public void onReceivedError(WebView webview, int j, String s, String s1)
    {
        switch (j)
        {
        default:
            webview.loadData("", "text/html", "UTF-8");
            return;

        case -8: 
            webview.loadData("", "text/html", "UTF-8");
            break;
        }
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        webview.loadData("", "text/html", "UTF-8");
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest webresourcerequest)
    {
        webresourcerequest.getUrl().toString();
        return super.shouldInterceptRequest(webview, webresourcerequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        return super.shouldInterceptRequest(webview, s);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Object obj1 = null;
        Object obj = new URL(s);
        String as[];
        int k;
        obj1 = ((URL) (obj)).getHost();
        as = com.wf.wellsfargomobile.a.a.l();
        k = as.length;
        boolean flag;
        int j;
        j = 0;
        flag = false;
_L12:
        if (j >= k) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag;
        if (((String) (obj1)).endsWith(as[j]))
        {
            flag1 = true;
        }
          goto _L3
_L2:
        boolean flag2 = "https".equals(((URL) (obj)).getProtocol());
        if (!flag2)
        {
            flag = false;
        }
        obj1 = ((URL) (obj)).getPath();
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        if (((String) (obj1)).equals(webview.getContext().getResources().getString(0x7f08015f)) || ((String) (obj1)).equals(webview.getContext().getResources().getString(0x7f080160))) goto _L7; else goto _L6
_L6:
        flag2 = ((String) (obj1)).equals(webview.getContext().getResources().getString(0x7f08015e));
        if (!flag2) goto _L5; else goto _L7
_L7:
        j = 1;
_L10:
        Object obj2;
        obj2 = obj;
        obj = obj1;
_L8:
        if (s.startsWith("tel:"))
        {
            try
            {
                c.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(s)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (flag && j != 0)
        {
            obj1 = ((URL) (obj2)).getQuery();
            if (obj1 != null && ((String) (obj1)).contains("launchMode=ext"))
            {
                webview = d.c();
                webview.a(s);
                webview.show(c.getSupportFragmentManager(), "MainOpenBrowserDialog");
            } else
            if (((String) (obj)).equals(webview.getContext().getResources().getString(0x7f08015e)))
            {
                if (obj1 != null && ((String) (obj1)).contains("linkId=HomeSignOn"))
                {
                    if (c.b())
                    {
                        c.toggleSlidingMenu(d.getView());
                        return true;
                    }
                } else
                {
                    d.e(s);
                    return true;
                }
            }
            return true;
        } else
        if (flag && obj != null && ((String) (obj)).equals(webview.getContext().getResources().getString(0x7f08015d)))
        {
            WFApp.A();
            d.b(d.a());
            return true;
        } else
        {
            webview.loadData("<html><body></body></html>", "text/html", "UTF-8");
            return true;
        }
        obj;
        flag = false;
        obj = null;
_L9:
        j = 0;
        obj2 = obj1;
          goto _L8
        obj1;
        flag = false;
        Object obj3 = null;
        obj1 = obj;
        obj = obj3;
          goto _L9
        obj1;
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L9
        obj1;
        Object obj5 = null;
        obj1 = obj;
        obj = obj5;
          goto _L9
        MalformedURLException malformedurlexception;
        malformedurlexception;
        Object obj6 = obj;
        obj = obj1;
        obj1 = obj6;
          goto _L9
_L5:
        j = 0;
        if (true) goto _L10; else goto _L3
_L3:
        j++;
        flag = flag1;
        if (true) goto _L12; else goto _L11
_L11:
    }
}
