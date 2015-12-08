// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            ds, dj, db, do, 
//            ac, cz

public final class eg extends ds
{

    public eg(db db1, boolean flag)
    {
        super(db1, flag);
    }

    private static WebResourceResponse a(Context context, String s, String s1)
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        dj.a(context, s, true, s1);
        s1.connect();
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(dj.a(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
        s1.disconnect();
        return context;
        context;
        s1.disconnect();
        throw context;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        Object obj;
        try
        {
            if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
            {
                return super.shouldInterceptRequest(webview, s);
            }
            if (!(webview instanceof db))
            {
                com.google.android.gms.internal.do.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            obj = (db)webview;
            ((db) (obj)).e().b();
            if (((db) (obj)).d().eK)
            {
                com.google.android.gms.internal.do.c("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return a(((db) (obj)).getContext(), a.g().iM, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            }
            if (((db) (obj)).h())
            {
                com.google.android.gms.internal.do.c("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return a(((db) (obj)).getContext(), a.g().iM, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            }
            com.google.android.gms.internal.do.c("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
            obj = a(((db) (obj)).getContext(), a.g().iM, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        }
        catch (IOException ioexception)
        {
            com.google.android.gms.internal.do.d((new StringBuilder("Could not fetching MRAID JS. ")).append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
        return ((WebResourceResponse) (obj));
    }
}
