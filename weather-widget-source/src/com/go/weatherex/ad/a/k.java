// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.ad.a:
//            j, i

class k
    implements AdListener
{

    final j a;

    k(j j1)
    {
        a = j1;
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
        ad = (new e("f000", a.i(), "1", "", "", "", "")).b();
        com.gau.go.a.e.a(GoWidgetApplication.b()).a(ad);
    }

    public void onError(Ad ad, AdError aderror)
    {
        if (a.b != null)
        {
            c.a("ad_banner", (new StringBuilder()).append("Facebook banner onError: [code]=").append(aderror.getErrorCode()).append(" | ").append(aderror.getErrorMessage()).toString());
            a.b.c(a);
        }
    }
}
