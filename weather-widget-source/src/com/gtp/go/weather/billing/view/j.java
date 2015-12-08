// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.util.Log;
import com.facebook.ads.InterstitialAd;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.i.a.a;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            PayActivity, k

class j
    implements af
{

    final PayActivity a;

    j(PayActivity payactivity)
    {
        a = payactivity;
        super();
    }

    public void a(int i)
    {
        Log.i("wss", "PayActivity_loadFacebookFullAd_onAdImageFinish");
    }

    public void a(b b1)
    {
        if (b1 != null)
        {
            com.gtp.go.weather.billing.view.PayActivity.a(a, b1);
            if (b1.b() == 1 || b1.b() == 2)
            {
                b1 = ((b) (((com.jiubang.commerce.ad.i.a.b)b1.d().a().get(0)).a()));
                if (b1 instanceof InterstitialAd)
                {
                    com.gtp.go.weather.billing.view.k.a().a((InterstitialAd)b1);
                    return;
                }
                if (b1 instanceof com.google.android.gms.ads.InterstitialAd)
                {
                    b1 = (com.google.android.gms.ads.InterstitialAd)b1;
                    com.gtp.go.weather.billing.view.k.a().a(b1);
                    return;
                }
            }
        }
    }

    public void a(Object obj)
    {
        Log.i("wss", "PayActivity_loadFacebookFullAd_onAdShowed");
    }

    public void a(boolean flag, b b1)
    {
        Log.i("wss", "PayActivity_loadFacebookFullAd_onAdInfoFinish0");
        if (b1 != null)
        {
            Log.i("wss", "PayActivity_loadFacebookFullAd_onAdInfoFinish1");
            com.gtp.go.weather.billing.view.PayActivity.a(a, b1);
            if (b1.b() == 1 || b1.b() == 2)
            {
                b1 = ((b) (((com.jiubang.commerce.ad.i.a.b)b1.d().a().get(0)).a()));
                if (b1 instanceof InterstitialAd)
                {
                    com.gtp.go.weather.billing.view.k.a().a((InterstitialAd)b1);
                    return;
                }
                if (b1 instanceof com.google.android.gms.ads.InterstitialAd)
                {
                    b1 = (com.google.android.gms.ads.InterstitialAd)b1;
                    com.gtp.go.weather.billing.view.k.a().a(b1);
                    return;
                }
            }
        }
    }

    public void b(Object obj)
    {
        a.finish();
    }

    public void c(Object obj)
    {
        if (PayActivity.o(a) != null && PayActivity.o(a).d() != null && PayActivity.o(a).d().a() != null)
        {
            com.jiubang.commerce.ad.a.a(a, PayActivity.o(a).g(), (com.jiubang.commerce.ad.i.a.b)PayActivity.o(a).d().a().get(0), "684");
        }
    }
}
