// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.util.Log;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.google.android.gms.ads.formats.NativeContentAd;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            g

class m
    implements com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
{

    final g a;

    m(g g1)
    {
        a = g1;
        super();
    }

    public void onContentAdLoaded(NativeContentAd nativecontentad)
    {
        Log.i("lky", "Admob\u539F\u751F\u5E7F\u544A");
        g.a(a, nativecontentad);
        nativecontentad = new e(g.a(a), "2");
        nativecontentad.f("1");
        nativecontentad.b("ad_requst_re");
        nativecontentad.d("ca-app-pub-6646759830189405/8928439175");
        nativecontentad.g("5");
        long l = System.currentTimeMillis();
        long l1 = g.c(a);
        nativecontentad.j((new StringBuilder()).append((double)(l - l1) / 1000D).append("").toString());
        nativecontentad = nativecontentad.b();
        com.gau.go.a.e.a(g.a(a)).a(nativecontentad);
    }
}
