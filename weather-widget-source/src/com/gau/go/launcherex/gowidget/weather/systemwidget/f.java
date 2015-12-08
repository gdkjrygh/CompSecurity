// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            e, g

class f extends BroadcastReceiver
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            if (context != null)
            {
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PACKAGE_REMOVED") || context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APPWIDGET_THEME_CHANGE"))
                {
                    e.a(a, "app_widget_theme");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT"))
                {
                    e.a(a, "tempUnit");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LUNAR"))
                {
                    e.a(a, "calendarType");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FESTIVAL"))
                {
                    e.a(a, "festival");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT"))
                {
                    e.a(a, "dateStyle");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION"))
                {
                    e.a(a, "auto_location");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK"))
                {
                    e.a(a, "world_clock");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE"))
                {
                    e.a(a).startQuery(1, "need_notify_widget", WeatherContentProvider.j, null, null, null, null);
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app"))
                {
                    e.a(a, "widgt_clock");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app"))
                {
                    e.a(a, "widgt_calendar");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT"))
                {
                    e.a(a, "windUnit");
                    return;
                }
            }
        }
    }
}
