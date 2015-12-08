// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import com.facebook.ads.AdView;
import com.gtp.go.weather.billing.view.k;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.af;
import java.util.List;

// Referenced classes of package com.go.weatherex.themeconfig:
//            AppWidgetThemeConfigHomeActivity

class a
    implements af
{

    final AppWidgetThemeConfigHomeActivity a;

    a(AppWidgetThemeConfigHomeActivity appwidgetthemeconfighomeactivity)
    {
        a = appwidgetthemeconfighomeactivity;
        super();
    }

    public void a(int i)
    {
    }

    public void a(b b1)
    {
    }

    public void a(Object obj)
    {
    }

    public void a(boolean flag, b b1)
    {
        if (b1 != null)
        {
            AppWidgetThemeConfigHomeActivity.a(a, b1);
            if ((b1.b() == 1 || b1.b() == 2) && f.a(b1.g()))
            {
                b1 = ((b) (((com.jiubang.commerce.ad.i.a.b)b1.d().a().get(0)).a()));
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
    }

    public void c(Object obj)
    {
        if (AppWidgetThemeConfigHomeActivity.a(a) != null && AppWidgetThemeConfigHomeActivity.a(a).g() != null && AppWidgetThemeConfigHomeActivity.a(a).d().a() != null)
        {
            com.jiubang.commerce.ad.a.a(a, AppWidgetThemeConfigHomeActivity.a(a).g(), (com.jiubang.commerce.ad.i.a.b)AppWidgetThemeConfigHomeActivity.a(a).d().a().get(0), "682");
        }
    }
}
