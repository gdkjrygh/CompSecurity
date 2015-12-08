// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.util.Log;
import com.facebook.ads.AdView;
import com.gtp.go.weather.billing.view.k;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.i.a.a;
import java.util.List;

// Referenced classes of package com.go.weatherex.themeconfig:
//            GoWidgetThemeConfigHomeActivity

class b
    implements af
{

    final GoWidgetThemeConfigHomeActivity a;

    b(GoWidgetThemeConfigHomeActivity gowidgetthemeconfighomeactivity)
    {
        a = gowidgetthemeconfighomeactivity;
        super();
    }

    public void a(int i)
    {
        Log.i("wss", "GoWidgetThemeConfigHomeAcitivity_Banner_onAdFail");
    }

    public void a(com.jiubang.commerce.ad.a.b b1)
    {
        Log.i("wss", "GoWidgetThemeConfigHomeAcitivity_Banner_onAdImageFinish");
    }

    public void a(Object obj)
    {
        Log.i("wss", "GoWidgetThemeConfigHomeAcitivity_Banner_onAdShowed");
    }

    public void a(boolean flag, com.jiubang.commerce.ad.a.b b1)
    {
        if (b1 != null)
        {
            com.go.weatherex.themeconfig.GoWidgetThemeConfigHomeActivity.a(a, b1);
            if ((b1.b() == 1 || b1.b() == 2) && f.a(b1.g()))
            {
                b1 = ((com.jiubang.commerce.ad.a.b) (((com.jiubang.commerce.ad.i.a.b)b1.d().a().get(0)).a()));
                if (b1 instanceof AdView)
                {
                    k.a().a((AdView)b1);
                    return;
                }
                if (b1 instanceof com.google.android.gms.ads.AdView)
                {
                    k.a().a((com.google.android.gms.ads.AdView)b1);
                    return;
                }
            }
        }
    }

    public void b(Object obj)
    {
        Log.i("wss", "GoWidgetThemeConfigHomeAcitivity_Banner_onAdClosed");
    }

    public void c(Object obj)
    {
        if (com.go.weatherex.themeconfig.GoWidgetThemeConfigHomeActivity.a(a) != null && com.go.weatherex.themeconfig.GoWidgetThemeConfigHomeActivity.a(a).d() != null && com.go.weatherex.themeconfig.GoWidgetThemeConfigHomeActivity.a(a).d().a() != null)
        {
            com.jiubang.commerce.ad.a.a(a, com.go.weatherex.themeconfig.GoWidgetThemeConfigHomeActivity.a(a).g(), (com.jiubang.commerce.ad.i.a.b)com.go.weatherex.themeconfig.GoWidgetThemeConfigHomeActivity.a(a).d().a().get(0), "682");
        }
    }
}
