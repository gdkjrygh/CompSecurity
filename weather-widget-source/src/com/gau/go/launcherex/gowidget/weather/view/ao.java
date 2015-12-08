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

class ao
    implements w
{

    final int a;
    final Setting42Activity b;

    ao(Setting42Activity setting42activity, int i)
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
                b.a = com.gau.go.launcherex.gowidget.weather.view.Setting42Activity.e(b)[i];
                Setting42Activity.g(b).setText(Setting42Activity.f(b)[i]);
                Setting42Activity.b(b).a(WeatherContentProvider.g, "setting_key", "autpUpdateFreq", "setting_value", b.a);
            }
        }
    }
}
