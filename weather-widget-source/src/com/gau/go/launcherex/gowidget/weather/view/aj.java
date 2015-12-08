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
//            Setting41Activity

class aj
    implements w
{

    final Setting41Activity a;

    aj(Setting41Activity setting41activity)
    {
        a = setting41activity;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            int i = ((Integer)a1.c).intValue();
            com.gau.go.launcherex.gowidget.weather.view.Setting41Activity.a(a, i);
            Setting41Activity.b(a, Setting41Activity.c(a));
            Setting41Activity.b(a).a(WeatherContentProvider.g, "setting_key", "dateStyle", "setting_value", Setting41Activity.d(a)[Setting41Activity.c(a)]);
        }
    }
}
