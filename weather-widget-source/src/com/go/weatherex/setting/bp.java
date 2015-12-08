// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.globalview.w;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.go.weatherex.setting:
//            bo

class bp
    implements w
{

    final u a;
    final String b[];
    final bo c;

    bp(bo bo1, u u1, String as[])
    {
        c = bo1;
        a = u1;
        b = as;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            int j = ((Integer)a1.c).intValue();
            int i;
            if (a.g == 2)
            {
                i = com.go.weatherex.setting.bo.a(c, j);
            } else
            {
                i = bo.b(c, j);
            }
            if (c.e != i)
            {
                c.e = i;
                com.go.weatherex.setting.bo.a(c).r(c.e);
                com.go.weatherex.setting.bo.a(c).a(WeatherContentProvider.g, "setting_key", "temp_change_low", "setting_value", c.e);
                bo.b(c).setText(b[j]);
            }
        }
    }
}
