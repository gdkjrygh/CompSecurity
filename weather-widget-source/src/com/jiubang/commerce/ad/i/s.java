// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            c, a

class s extends AdListener
{

    final Context a;
    final String b;
    final String c;
    final f d;
    final AdView e;
    final a f;
    final String g[];
    final int h;
    final com.jiubang.commerce.ad.i.a i;
    final m j;
    final c k;
    private boolean l;

    s(c c1, Context context, String s1, String s2, f f1, AdView adview, a a1, 
            String as[], int i1, com.jiubang.commerce.ad.i.a a2, m m1)
    {
        k = c1;
        a = context;
        b = s1;
        c = s2;
        d = f1;
        e = adview;
        f = a1;
        g = as;
        h = i1;
        i = a2;
        j = m1;
        super();
        l = false;
    }

    public void onAdClosed()
    {
        j.c(e);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdClosed---BannerAd, adId:").append(b).append(")").toString());
        }
    }

    public void onAdFailedToLoad(int i1)
    {
        super.onAdFailedToLoad(i1);
        com.jiubang.commerce.b.b.a(a, b, c, -1, d);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.c("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdFailedToLoad---BannerAd, adId:").append(b).append(", i:").append(i1).append(")").toString());
        }
        com.jiubang.commerce.ad.i.c.a(k, a, g, h, d, f, c, i, j);
    }

    public void onAdLoaded()
    {
        super.onAdLoaded();
        if (l)
        {
            return;
        }
        l = true;
        com.jiubang.commerce.b.b.a(a, b, c, 1, d);
        ArrayList arraylist = new ArrayList();
        arraylist.add(e);
        f.a(b, arraylist);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdLoaded---BannerAd, adId:").append(b).append(", adId:").append(b).append(", adViewSize:").append(arraylist.size()).append(", adView:").append(e).append(")").toString());
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
        j.b(e);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdOpened---BannerAd, adId:").append(b).append(")").toString());
        }
    }
}
