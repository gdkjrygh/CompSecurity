// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.b.a;

import android.util.Log;
import com.facebook.ads.InterstitialAd;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.i.a.a;
import java.util.List;

// Referenced classes of package com.go.weatherex.b.a:
//            a

class d
    implements af
{

    final com.go.weatherex.b.a.a a;

    d(com.go.weatherex.b.a.a a1)
    {
        a = a1;
        super();
    }

    public void a(int i)
    {
        Log.i("wss", "AdController_loadFullAd = onAdFail");
    }

    public void a(b b1)
    {
        if (b1 != null)
        {
            Log.i("wss", (new StringBuilder()).append("adInfoBean.getAdType() = ").append(b1.b()).toString());
            com.go.weatherex.b.a.a.a(a, b1);
            if (b1.b() == 1 || b1.b() == 2)
            {
                b1 = ((b) (((com.jiubang.commerce.ad.i.a.b)b1.d().a().get(0)).a()));
                if (b1 != null && (b1 instanceof InterstitialAd))
                {
                    com.go.weatherex.b.a.a.a(a, (InterstitialAd)b1);
                    return;
                }
                if (b1 != null && (b1 instanceof com.google.android.gms.ads.InterstitialAd))
                {
                    com.go.weatherex.b.a.a.a(a, (com.google.android.gms.ads.InterstitialAd)b1);
                    return;
                }
            }
        }
    }

    public void a(Object obj)
    {
        Log.i("wss", "AdController_onAdShower");
        if (com.go.weatherex.b.a.a.b(a) != null)
        {
            Log.i("wss", "AdController_onAdShower");
            b(com.go.weatherex.b.a.a.b(a), com.go.weatherex.b.a.a.c(a).g(), (com.jiubang.commerce.ad.i.a.b)com.go.weatherex.b.a.a.c(a).d().a().get(0), "1032");
        }
    }

    public void a(boolean flag, b b1)
    {
        if (b1 != null)
        {
            Log.i("wss", (new StringBuilder()).append("adInfoBean.getAdType() = ").append(b1.b()).toString());
            com.go.weatherex.b.a.a.a(a, b1);
            if (b1.b() == 1 || b1.b() == 2)
            {
                b1 = ((b) (((com.jiubang.commerce.ad.i.a.b)b1.d().a().get(0)).a()));
                if (b1 != null && (b1 instanceof InterstitialAd))
                {
                    com.go.weatherex.b.a.a.a(a, (InterstitialAd)b1);
                    return;
                }
                if (b1 != null && (b1 instanceof com.google.android.gms.ads.InterstitialAd))
                {
                    com.go.weatherex.b.a.a.a(a, (com.google.android.gms.ads.InterstitialAd)b1);
                    return;
                }
            }
        }
    }

    public void b(Object obj)
    {
    }

    public void c(Object obj)
    {
        Log.i("wss", "AdContrller_onAdClicked");
        obj = (new StringBuilder()).append("mAtivity != null = ");
        boolean flag;
        if (com.go.weatherex.b.a.a.b(a) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.i("wss", ((StringBuilder) (obj)).append(flag).toString());
        if (com.go.weatherex.b.a.a.b(a) != null && com.go.weatherex.b.a.a.c(a) != null && com.go.weatherex.b.a.a.c(a).d() != null && com.go.weatherex.b.a.a.c(a).d().a() != null)
        {
            Log.i("wss", "AdContrller_onAdClicked");
            com.jiubang.commerce.ad.a.a(com.go.weatherex.b.a.a.b(a), com.go.weatherex.b.a.a.c(a).g(), (com.jiubang.commerce.ad.i.a.b)com.go.weatherex.b.a.a.c(a).d().a().get(0), "1032");
        }
    }
}
