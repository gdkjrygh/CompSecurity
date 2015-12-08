// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.facebook.ads:
//            InterstitialAd, InterstitialAdListener

class it> extends WebChromeClient
{

    final InterstitialAd a;

    public void onProgressChanged(WebView webview, int i)
    {
        if (i == 100 && InterstitialAd.access$700(a) != null)
        {
            InterstitialAd.access$700(a).onAdLoaded(a);
        }
    }

    tener(InterstitialAd interstitialad)
    {
        a = interstitialad;
        super();
    }
}
