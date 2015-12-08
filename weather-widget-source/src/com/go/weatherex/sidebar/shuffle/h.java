// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAd;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.weather.service.a.b;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            g, i

class h
    implements AdListener
{

    final String a;
    final g b;

    h(g g1, String s)
    {
        b = g1;
        a = s;
        super();
    }

    public void onAdClicked(Ad ad)
    {
        Object obj = new e(g.a(b), "2");
        ((e) (obj)).b("a000");
        ((e) (obj)).d(a);
        ((e) (obj)).g("5");
        obj = ((e) (obj)).b();
        com.gau.go.a.e.a(g.a(b)).a(((String) (obj)));
        if (ad != null)
        {
            ad.destroy();
        }
    }

    public void onAdLoaded(Ad ad)
    {
        if (ad != null)
        {
            Object obj = new e(g.a(b), "2");
            ((e) (obj)).b("ad_requst_re");
            ((e) (obj)).f("1");
            ((e) (obj)).d(a);
            ((e) (obj)).g("5");
            long l = System.currentTimeMillis();
            long l1 = com.go.weatherex.sidebar.shuffle.g.b(b);
            ((e) (obj)).j((new StringBuilder()).append((double)(l - l1) / 1000D).append("").toString());
            obj = ((e) (obj)).b();
            com.gau.go.a.e.a(g.a(b)).a(((String) (obj)));
            ad = (NativeAd)ad;
            g.a(b, ad);
        }
    }

    public void onError(Ad ad, AdError aderror)
    {
        ad = new e(g.a(b), "2");
        ad.b("ad_requst_re");
        ad.f("-1");
        ad.d(a);
        ad.g("5");
        long l = System.currentTimeMillis();
        long l1 = com.go.weatherex.sidebar.shuffle.g.b(b);
        ad.j((new StringBuilder()).append((double)(l - l1) / 1000D).append("").toString());
        ad = ad.b();
        com.gau.go.a.e.a(g.a(b)).a(ad);
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new i(this));
        Log.i("lky", (new StringBuilder()).append("adError-->").append(aderror).toString());
    }
}
