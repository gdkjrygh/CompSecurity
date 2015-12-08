// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.kochava.android.tracker:
//            WebAdView, Global

class this._cls0 extends WebViewClient
{

    final WebAdView this$0;

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        if (Global.DEBUG)
        {
            Log.i("KochavaAds", (new StringBuilder()).append("onPageStart Url = ").append(s).toString());
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (Global.DEBUG)
        {
            Log.i("KochavaAds", (new StringBuilder()).append("shouldOverrideUrlLoading Url = ").append(s).toString());
        }
        if (s.contains("market://"))
        {
            webview = "";
            s = Pattern.compile("\\?p=(.*)").matcher(s);
            if (s.find())
            {
                webview = s.group(1);
            }
            if (Global.DEBUG)
            {
                Log.i("KochavaAds", (new StringBuilder()).append("LOADING: https://market.android.com/details?id=").append(webview).toString());
            }
            s = new Intent("android.intent.action.VIEW");
            s.setData(Uri.parse((new StringBuilder()).append("https://market.android.com/details?id=").append(webview).toString()));
            activity.startActivity(s);
            activity.finish();
            return true;
        } else
        {
            webview.loadUrl(s);
            return true;
        }
    }

    ()
    {
        this$0 = WebAdView.this;
        super();
    }
}
