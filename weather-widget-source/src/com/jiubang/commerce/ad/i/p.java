// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.s;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            c, b

class p
    implements InterstitialAdListener
{

    final Context a;
    final String b;
    final String c;
    final f d;
    final String e[];
    final int f;
    final a g;
    final Handler h;
    final s i;
    final com.jiubang.commerce.ad.i.b j;
    final m k;
    final InterstitialAd l;
    final c m;

    p(c c1, Context context, String s, String s1, f f1, String as[], int i1, 
            a a1, Handler handler, s s2, com.jiubang.commerce.ad.i.b b1, m m1, InterstitialAd interstitialad)
    {
        m = c1;
        a = context;
        b = s;
        c = s1;
        d = f1;
        e = as;
        f = i1;
        g = a1;
        h = handler;
        i = s2;
        j = b1;
        k = m1;
        l = interstitialad;
        super();
    }

    public void onAdClicked(Ad ad)
    {
        com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleFaceBookAdInfo(onAdClicked---InterstitialAd, adId:").append(b).append(", ad:").append(ad).append(")").toString());
        k.b(l);
    }

    public void onAdLoaded(Ad ad)
    {
        com.jiubang.commerce.b.b.a(a, b, c, 1, d);
        int i1;
        ad = new ArrayList();
        ad.add(l);
        g.a(b, ad);
        ad = (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleFaceBookAdInfo(onAdLoaded---InterstitialAd, adId:").append(b).append(", adViewSize:").append(ad.size()).append(", adView:").append(l).append(",");
        if (g.a() == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        i1 = g.a().size();
_L1:
        com.jiubang.commerce.utils.j.b("Ad_SDK", ad.append(i1).append(")").toString());
        com.jiubang.commerce.ad.i.c.a(m, a, e, f, d, g, c, h, i, j, k);
        return;
        i1 = -2;
          goto _L1
        ad;
        ad.printStackTrace();
        com.jiubang.commerce.ad.i.c.a(m, a, e, f, d, g, c, h, i, j, k);
        return;
        ad;
        com.jiubang.commerce.ad.i.c.a(m, a, e, f, d, g, c, h, i, j, k);
        throw ad;
    }

    public void onError(Ad ad, AdError aderror)
    {
        com.jiubang.commerce.b.b.a(a, b, c, -1, d);
        if (j.a)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleFaceBookAdInfo(onError---InterstitialAd, adId:").append(b).append(", ad:").append(ad).append(", aderror:");
            if (aderror != null)
            {
                ad = aderror.getErrorMessage();
            } else
            {
                ad = "null";
            }
            com.jiubang.commerce.utils.j.c("Ad_SDK", stringbuilder.append(ad).append(")").toString());
        }
        com.jiubang.commerce.ad.i.c.a(m, a, e, f, d, g, c, h, i, j, k);
    }

    public void onInterstitialDismissed(Ad ad)
    {
        com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleFaceBookAdInfo(onInterstitialDismissed---InterstitialAd, adId:").append(b).append(", ad:").append(ad).append(")").toString());
        k.c(l);
    }

    public void onInterstitialDisplayed(Ad ad)
    {
        com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleFaceBookAdInfo(onInterstitialDisplayed---InterstitialAd, adId:").append(b).append(", ad:").append(ad).append(")").toString());
        k.a(l);
    }
}
