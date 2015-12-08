// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.globalview.w;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.go.weatherex.setting:
//            p

class q
    implements w
{

    final int a;
    final p b;

    q(p p1, int i)
    {
        b = p1;
        a = i;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            int i = ((Integer)a1.c).intValue();
            if (a != i)
            {
                com.go.weatherex.setting.p.a(b, com.go.weatherex.setting.p.a(b)[i]);
                p.c(b).setText(p.b(b)[i]);
                com.go.weatherex.setting.p.e(b).a(WeatherContentProvider.g, "setting_key", "festival", "setting_value", p.d(b));
                com.go.weatherex.setting.p.e(b).j(p.d(b));
            }
        }
    }
}
