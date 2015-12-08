// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.nativead;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;

// Referenced classes of package com.go.weatherex.ad.nativead:
//            a

class b
    implements AdListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onAdClicked(Ad ad)
    {
    }

    public void onAdLoaded(Ad ad)
    {
        if (ad != com.go.weatherex.ad.nativead.a.b(a))
        {
            return;
        } else
        {
            Log.i("FacebookNativeAd", "facebook onAdLoaded");
            com.go.weatherex.ad.nativead.a.c(a).setVisibility(0);
            com.go.weatherex.ad.nativead.a.d(a).setVisibility(0);
            com.go.weatherex.ad.nativead.a.e(a).setVisibility(8);
            com.go.weatherex.ad.nativead.a.f(a).setVisibility(8);
            ad = com.go.weatherex.ad.nativead.a.b(a).getAdTitle();
            String s = com.go.weatherex.ad.nativead.a.b(a).getAdBody();
            com.facebook.ads.NativeAd.Image image = com.go.weatherex.ad.nativead.a.b(a).getAdCoverImage();
            com.facebook.ads.NativeAd.Image image1 = com.go.weatherex.ad.nativead.a.b(a).getAdIcon();
            String s1 = com.go.weatherex.ad.nativead.a.b(a).getAdCallToAction();
            com.go.weatherex.ad.nativead.a.g(a).setText(ad);
            com.go.weatherex.ad.nativead.a.h(a).setText(s);
            NativeAd.downloadAndDisplayImage(image1, com.go.weatherex.ad.nativead.a.i(a));
            NativeAd.downloadAndDisplayImage(image, com.go.weatherex.ad.nativead.a.j(a));
            com.go.weatherex.ad.nativead.a.k(a).setText(s1);
            com.go.weatherex.ad.nativead.a.b(a).registerViewForInteraction(a);
            return;
        }
    }

    public void onError(Ad ad, AdError aderror)
    {
        Log.i("FacebookNativeAd", "facebook onError");
        com.go.weatherex.ad.nativead.a.a(a);
    }
}
