// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.d;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherDetailActivity

class bc
    implements d
{

    final c a;
    final WeatherDetailActivity b;

    bc(WeatherDetailActivity weatherdetailactivity, c c1)
    {
        b = weatherdetailactivity;
        a = c1;
        super();
    }

    public void a()
    {
        WeatherDetailActivity.a(b);
        a.b(this);
    }
}
