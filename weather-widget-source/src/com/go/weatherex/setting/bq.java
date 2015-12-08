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

class bq
    implements w
{

    final u a;
    final String b[];
    final bo c;

    bq(bo bo1, u u1, String as[])
    {
        c = bo1;
        a = u1;
        b = as;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (!flag || a1 == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = ((Integer)a1.c).intValue();
        i = 0;
        if (a.g != 2) goto _L4; else goto _L3
_L3:
        i = com.go.weatherex.setting.bo.a(c, j);
_L6:
        if (c.f != i)
        {
            c.f = i;
            com.go.weatherex.setting.bo.a(c).s(c.f);
            com.go.weatherex.setting.bo.a(c).a(WeatherContentProvider.g, "setting_key", "temp_change_high", "setting_value", c.f);
            bo.c(c).setText(b[j]);
        }
_L2:
        return;
_L4:
        if (a.g == 1)
        {
            i = bo.b(c, j);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
