// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.globalview.w;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            Setting42Activity

class an
    implements w
{

    final Setting42Activity a;

    an(Setting42Activity setting42activity)
    {
        a = setting42activity;
        super();
    }

    public void a(t t1, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            int i = ((Integer)a1.c).intValue();
            com.gau.go.launcherex.gowidget.weather.view.Setting42Activity.a(a, i);
            Setting42Activity.b(a, Setting42Activity.c(a));
            Setting42Activity.b(a).a(WeatherContentProvider.g, "setting_key", "dateStyle", "setting_value", Setting42Activity.d(a)[Setting42Activity.c(a)]);
            t1.dismiss();
        }
    }
}
