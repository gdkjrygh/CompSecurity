// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.webclient.app;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import hsp;

// Referenced classes of package com.ubercab.webclient.app:
//            WebClientActivity

final class a extends WebViewClient
{

    final WebClientActivity a;

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!hsp.a(s))
        {
            a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return true;
        } else
        {
            return false;
        }
    }

    (WebClientActivity webclientactivity)
    {
        a = webclientactivity;
        super();
    }
}
