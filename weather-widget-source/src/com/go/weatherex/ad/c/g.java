// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.c;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;

// Referenced classes of package com.go.weatherex.ad.c:
//            f, d

class g
    implements InterstitialAdListener
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public void onAdClicked(Ad ad)
    {
    }

    public void onAdLoaded(Ad ad)
    {
        if (a.b != null)
        {
            a.b.b(a);
        }
    }

    public void onError(Ad ad, AdError aderror)
    {
        if (a.b != null)
        {
            a.b.a(a);
        }
    }

    public void onInterstitialDismissed(Ad ad)
    {
        if (a.b != null)
        {
            a.b.d(a);
        }
    }

    public void onInterstitialDisplayed(Ad ad)
    {
        if (a.b != null)
        {
            a.b.c(a);
        }
    }
}
