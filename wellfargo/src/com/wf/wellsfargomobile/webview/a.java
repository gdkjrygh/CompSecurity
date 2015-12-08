// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.be;
import com.wf.wellsfargomobile.l;
import com.wf.wellsfargomobile.util.v;
import com.wf.wellsfargomobile.webview.b.c;
import com.wf.wellsfargomobile.webview.b.d;
import com.wf.wellsfargomobile.webview.b.g;
import com.wf.wellsfargomobile.webview.b.h;
import com.wf.wellsfargomobile.webview.b.j;
import com.wf.wellsfargomobile.webview.d.b;
import com.wf.wellsfargomobile.webview.javascriptinterface.i;
import java.io.File;
import java.util.Iterator;
import java.util.PriorityQueue;

public class a
{

    public static WebView a(Context context)
    {
        context = b(context);
        context.getSettings().setSaveFormData(false);
        context.getSettings().setAllowFileAccess(false);
        context.addJavascriptInterface(new i(), "pcInterface");
        context.setWebViewClient(new b());
        return context;
    }

    public static WebView a(BaseWebViewActivity basewebviewactivity)
    {
        WebView webview = b(basewebviewactivity);
        Object obj = new PriorityQueue();
        ((PriorityQueue) (obj)).add(new com.wf.wellsfargomobile.webview.b.a());
        ((PriorityQueue) (obj)).add(new g());
        ((PriorityQueue) (obj)).add(new com.wf.wellsfargomobile.webview.b.i());
        ((PriorityQueue) (obj)).add(new h());
        ((PriorityQueue) (obj)).add(new d());
        ((PriorityQueue) (obj)).add(new c());
        for (obj = ((PriorityQueue) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((j)((Iterator) (obj)).next()).a(basewebviewactivity, webview)) { }
        return webview;
    }

    public static WebView a(MainActivity mainactivity)
    {
        WebView webview = b(mainactivity);
        webview.getSettings().setSaveFormData(false);
        webview.getSettings().setAllowFileAccess(false);
        webview.addJavascriptInterface(new com.wf.wellsfargomobile.webview.javascriptinterface.j(mainactivity), "Common");
        webview.setWebViewClient(new com.wf.wellsfargomobile.webview.d.c(mainactivity));
        return webview;
    }

    public static WebView a(MainActivity mainactivity, l l)
    {
        WebView webview = b(mainactivity.getApplicationContext());
        webview.setVerticalScrollBarEnabled(true);
        webview.setWebViewClient(new com.wf.wellsfargomobile.webview.d.a(mainactivity, l));
        webview.setWebChromeClient(new be(null));
        return webview;
    }

    private static WebView b(Context context)
    {
        Context context1 = context.getApplicationContext();
        WebView webview = new WebView(context1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setAppCacheEnabled(true);
        webview.getSettings().setAppCachePath(context1.getFilesDir().getAbsolutePath());
        webview.getSettings().setUserAgentString(com.wf.wellsfargomobile.d.d.a(context));
        webview.getSettings().setGeolocationEnabled(true);
        webview.getSettings().setGeolocationDatabasePath(context1.getFilesDir().getPath());
        v.a(webview, context1);
        return webview;
    }
}
