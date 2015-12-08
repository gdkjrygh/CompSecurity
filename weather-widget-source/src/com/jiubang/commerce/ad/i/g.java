// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            c, a

class g
    implements com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
{

    final Context a;
    final String b;
    final String c;
    final f d;
    final a e;
    final String f[];
    final int g;
    final com.jiubang.commerce.ad.i.a h;
    final m i;
    final c j;

    g(c c1, Context context, String s, String s1, f f1, a a1, String as[], 
            int k, com.jiubang.commerce.ad.i.a a2, m m)
    {
        j = c1;
        a = context;
        b = s;
        c = s1;
        d = f1;
        e = a1;
        f = as;
        g = k;
        h = a2;
        i = m;
        super();
    }

    public void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
    {
        com.jiubang.commerce.b.b.a(a, b, c, 1, d);
        ArrayList arraylist = new ArrayList();
        arraylist.add(nativeappinstallad);
        e.a(b, arraylist);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(d.a()).append("]loadSingleAdMobAdInfo(NativeAd---NativeAppInstallAd, adId:").append(b).append("NativeAppInstallAd:").append(nativeappinstallad).append(")").toString());
        }
        com.jiubang.commerce.ad.i.c.a(j, a, f, g, d, e, c, h, i);
        return;
        nativeappinstallad;
        nativeappinstallad.printStackTrace();
        com.jiubang.commerce.ad.i.c.a(j, a, f, g, d, e, c, h, i);
        return;
        nativeappinstallad;
        com.jiubang.commerce.ad.i.c.a(j, a, f, g, d, e, c, h, i);
        throw nativeappinstallad;
    }
}
