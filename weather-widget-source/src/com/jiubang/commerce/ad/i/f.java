// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            c, a

class f extends AdListener
{

    final Context a;
    final String b;
    final String c;
    final com.jiubang.commerce.ad.b.a.f d;
    final String e[];
    final int f;
    final a g;
    final com.jiubang.commerce.ad.i.a h;
    final m i;
    final c j;

    f(c c1, Context context, String s, String s1, com.jiubang.commerce.ad.b.a.f f1, String as[], int k, 
            a a1, com.jiubang.commerce.ad.i.a a2, m m1)
    {
        j = c1;
        a = context;
        b = s;
        c = s1;
        d = f1;
        e = as;
        f = k;
        g = a1;
        h = a2;
        i = m1;
        super();
    }

    public void onAdClosed()
    {
        i.c(null);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdClosed---NativeAd, adId:").append(b).append(")").toString());
        }
    }

    public void onAdFailedToLoad(int k)
    {
        com.jiubang.commerce.b.b.a(a, b, c, -1, d);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.c("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(NativeAd---Failed to load NativeAd:, adId:").append(b).append(", errorCode:").append(k).append(")").toString());
        }
        com.jiubang.commerce.ad.i.c.a(j, a, e, f, d, g, c, h, i);
    }

    public void onAdLeftApplication()
    {
        i.b(null);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdLeftApplication---NativeAd, adId:").append(b).append(")").toString());
        }
    }

    public void onAdOpened()
    {
        i.a(null);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(onAdOpened---NativeAd, adId:").append(b).append(")").toString());
        }
    }
}
