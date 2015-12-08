// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.util.Log;
import com.facebook.ads.AdView;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.i.a.a;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            PayActivity, k

class b
    implements af
{

    final PayActivity a;

    b(PayActivity payactivity)
    {
        a = payactivity;
        super();
    }

    public void a(int i)
    {
        Log.i("wss", "PayActivity_loadFacebookBannerAd_onAdFail");
    }

    public void a(com.jiubang.commerce.ad.a.b b1)
    {
        Log.i("wss", "PayActivity_loadFacebookBannerAd_onAdImageFinish");
    }

    public void a(Object obj)
    {
        Log.i("wss", "PayActivity_loadFacebookBannerAd_onAdShowed");
    }

    public void a(boolean flag, com.jiubang.commerce.ad.a.b b1)
    {
        if (b1 != null)
        {
            PayActivity.b(a, b1);
            if ((b1.b() == 1 || b1.b() == 2) && f.a(b1.g()))
            {
                b1 = ((com.jiubang.commerce.ad.a.b) (((com.jiubang.commerce.ad.i.a.b)b1.d().a().get(0)).a()));
                if (b1 instanceof AdView)
                {
                    com.gtp.go.weather.billing.view.k.a().a((AdView)b1);
                    return;
                }
                if (b1 instanceof com.google.android.gms.ads.AdView)
                {
                    com.gtp.go.weather.billing.view.k.a().a((com.google.android.gms.ads.AdView)b1);
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
        if (PayActivity.p(a) != null && PayActivity.p(a).d() != null && PayActivity.p(a).d().a() != null)
        {
            com.jiubang.commerce.ad.a.a(a, PayActivity.p(a).g(), (com.jiubang.commerce.ad.i.a.b)PayActivity.p(a).d().a().get(0), "682");
        }
    }
}
