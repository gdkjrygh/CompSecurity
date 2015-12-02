// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.about;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

// Referenced classes of package com.ubercab.client.feature.about:
//            WebViewFragment

final class a extends WebViewClient
{

    final WebViewFragment a;

    public final void onPageFinished(WebView webview, String s)
    {
        if (a.isResumed())
        {
            a.mProgressBarLoading.setVisibility(8);
        }
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (a.isResumed())
        {
            a.mProgressBarLoading.setVisibility(0);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("https://"))
        {
            a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return true;
        } else
        {
            return false;
        }
    }

    (WebViewFragment webviewfragment)
    {
        a = webviewfragment;
        super();
    }
}
