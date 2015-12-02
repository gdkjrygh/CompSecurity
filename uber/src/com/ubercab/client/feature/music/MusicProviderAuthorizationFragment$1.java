// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicProviderAuthorizationFragment

final class a extends WebViewClient
{

    final MusicProviderAuthorizationFragment a;

    public final void onPageFinished(WebView webview, String s)
    {
        if (a.isAdded())
        {
            a.mWebView.setVisibility(0);
            a.e();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return a.a(s);
    }

    (MusicProviderAuthorizationFragment musicproviderauthorizationfragment)
    {
        a = musicproviderauthorizationfragment;
        super();
    }
}
