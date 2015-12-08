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

class am
    implements w
{

    final CharSequence a[];
    final Setting42Activity b;

    am(Setting42Activity setting42activity, CharSequence acharsequence[])
    {
        b = setting42activity;
        a = acharsequence;
        super();
    }

    public void a(t t, boolean flag, a a1)
    {
        if (flag && a1 != null)
        {
            int i = ((Integer)a1.c).intValue();
            b.c = i + 1;
            com.gau.go.launcherex.gowidget.weather.view.Setting42Activity.a(b).setText(a[i]);
            Setting42Activity.b(b).a(WeatherContentProvider.g, "setting_key", "tempUnit", "setting_value", b.c);
        }
    }
}
