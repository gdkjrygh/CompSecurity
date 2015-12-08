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

class bv
    implements w
{

    final CharSequence a[];
    final bo b;

    bv(bo bo1, CharSequence acharsequence[])
    {
        b = bo1;
        a = acharsequence;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            int i = ((Integer)a1.c).intValue();
            bo.c(b, i);
            bo.g(b).setText(a[i]);
            bo.h(b);
            com.go.weatherex.setting.bo.a(b).a(WeatherContentProvider.g, "setting_key", "notification_style", "setting_value", bo.c()[i]);
        }
    }
}
