// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.View;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherDayForecastActivity

class ba
    implements android.view.View.OnClickListener
{

    final WeatherDayForecastActivity a;

    ba(WeatherDayForecastActivity weatherdayforecastactivity)
    {
        a = weatherdayforecastactivity;
        super();
    }

    public void onClick(View view)
    {
        WeatherDayForecastActivity.b(a);
    }
}
