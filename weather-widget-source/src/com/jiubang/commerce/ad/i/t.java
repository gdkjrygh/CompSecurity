// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            c, a

class t extends AdListener
{

    final Context a;
    final String b;
    final String c;
    final f d;
    final InterstitialAd e;
    final a f;
    final String g[];
    final int h;
    final com.jiubang.commerce.ad.i.a i;
    final m j;
    final c k;

    t(c c1, Context context, String s, String s1, f f1, InterstitialAd interstitialad, a a1, 
            String as[], int l, com.jiubang.commerce.ad.i.a a2, m m1)
    {
        k = c1;
        a = context;
        b = s;
        c = s1;
        d = f1;
        e = interstitialad;
        f = a1;
        g = as;
        h = l;
        i = a2;
        j = m1;
        super();
    }

    public void onAdClosed()
    {
        j.c(e);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdClosed---InterstitialAd, adId:").append(b).append(")").toString());
        }
    }

    public void onAdFailedToLoad(int l)
    {
        super.onAdFailedToLoad(l);
        com.jiubang.commerce.b.b.a(a, b, c, -1, d);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.c("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdFailedToLoad---InterstitialAd, adId:").append(b).append(", i:").append(l).append(")").toString());
        }
        com.jiubang.commerce.ad.i.c.a(k, a, g, h, d, f, c, i, j);
    }

    public void onAdLeftApplication()
    {
        j.b(e);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdLeftApplication---InterstitialAd, adId:").append(b).append(")").toString());
        }
    }

    public void onAdLoaded()
    {
        super.onAdLoaded();
        com.jiubang.commerce.b.b.a(a, b, c, 1, d);
        ArrayList arraylist = new ArrayList();
        arraylist.add(e);
        f.a(b, arraylist);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdLoaded---InterstitialAd, adId:").append(b).append(", adId:").append(b).append(", adViewSize:").append(arraylist.size()).append(", adView:").append(e).append(")").toString());
        }
        com.jiubang.commerce.ad.i.c.a(k, a, g, h, d, f, c, i, j);
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        com.jiubang.commerce.ad.i.c.a(k, a, g, h, d, f, c, i, j);
        return;
        obj;
        com.jiubang.commerce.ad.i.c.a(k, a, g, h, d, f, c, i, j);
        throw obj;
    }

    public void onAdOpened()
    {
        j.a(e);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdOpened---InterstitialAd, adId:").append(b).append(")").toString());
        }
    }
}
