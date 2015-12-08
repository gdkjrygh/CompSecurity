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
//            Setting41Activity

class ak
    implements w
{

    final int a;
    final Setting41Activity b;

    ak(Setting41Activity setting41activity, int i)
    {
        b = setting41activity;
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
                b.b = com.gau.go.launcherex.gowidget.weather.view.Setting41Activity.e(b)[i];
                Setting41Activity.g(b).setText(Setting41Activity.f(b)[i]);
                Setting41Activity.b(b).a(WeatherContentProvider.g, "setting_key", "autpUpdateFreq", "setting_value", b.b);
            }
        }
    }
}
