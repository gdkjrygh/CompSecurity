// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.google.android.gms.ads.AdListener;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.ad.a:
//            c, i

class d extends AdListener
{

    final com.go.weatherex.ad.a.c a;

    d(com.go.weatherex.ad.a.c c1)
    {
        a = c1;
        super();
    }

    public void onAdClosed()
    {
        if (a.b != null)
        {
            a.b.e(a);
        }
    }

    public void onAdFailedToLoad(int j)
    {
        if (a.b != null)
        {
            a.b.c(a);
        }
    }

    public void onAdLoaded()
    {
        long l = System.currentTimeMillis();
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("Ad show time : ").append(l).toString(), "ad_log.txt");
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("Interval time : ").append(l - com.go.weatherex.ad.a.c.a(a)).append(" \n").toString(), "ad_log.txt");
        c.a("ad_banner", "admob onAdLoaded");
        if (a.b != null)
        {
            a.b.b(a);
            a.b.a(a);
        }
        String s = (new e("f000", a.i(), "1", "", "", "", "")).b();
        com.gau.go.a.e.a(GoWidgetApplication.b()).a(s);
    }
}
