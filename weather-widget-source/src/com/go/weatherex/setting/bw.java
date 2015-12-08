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
//            bo

class bw
    implements w
{

    final int a[];
    final CharSequence b[];
    final bo c;

    bw(bo bo1, int ai[], CharSequence acharsequence[])
    {
        c = bo1;
        a = ai;
        b = acharsequence;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            int i = ((Integer)a1.c).intValue();
            c.j = a[i];
            bo.i(c).setText(b[i]);
            bo.h(c);
            com.go.weatherex.setting.bo.a(c).a(WeatherContentProvider.g, "setting_key", "notify_type", "setting_value", c.j);
        }
    }
}
