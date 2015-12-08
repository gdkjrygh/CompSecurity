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
//            cc

class cd
    implements w
{

    final int a;
    final cc b;

    cd(cc cc1, int i)
    {
        b = cc1;
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
                com.go.weatherex.setting.cc.a(b, com.go.weatherex.setting.cc.a(b)[i]);
                cc.c(b).setText(cc.b(b)[i]);
                com.go.weatherex.setting.cc.e(b).a(WeatherContentProvider.g, "setting_key", "festival", "setting_value", cc.d(b));
                com.go.weatherex.setting.cc.e(b).j(cc.d(b));
            }
        }
    }
}
