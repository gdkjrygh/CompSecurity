// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.globalview.w;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            Setting42Activity

class ap
    implements w
{

    final int a;
    final Setting42Activity b;

    ap(Setting42Activity setting42activity, int i)
    {
        b = setting42activity;
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
                Setting42Activity.c(b, Setting42Activity.h(b)[i]);
                Setting42Activity.j(b).setText(Setting42Activity.i(b)[i]);
                Setting42Activity.b(b).j(Setting42Activity.k(b));
                Setting42Activity.b(b).a(WeatherContentProvider.g, "setting_key", "festival", "setting_value", Setting42Activity.k(b));
            }
        }
    }
}
