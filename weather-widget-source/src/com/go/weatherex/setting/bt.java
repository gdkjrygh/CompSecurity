// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.widget.CheckBox;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.c;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.go.weatherex.setting:
//            bo

class bt
    implements c
{

    final bo a;

    bt(bo bo1)
    {
        a = bo1;
        super();
    }

    public void a(boolean flag)
    {
        if (!flag)
        {
            com.go.weatherex.setting.bo.e(a).setChecked(true);
            a.c = 1;
            bo.a(a).p(a.c);
            bo.a(a).a(WeatherContentProvider.g, "setting_key", "weather_warning_switch", "setting_value", a.c);
        }
    }
}
