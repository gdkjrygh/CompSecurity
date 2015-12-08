// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            WeatherService, k

class n extends BroadcastReceiver
{

    final WeatherService a;

    private n(WeatherService weatherservice)
    {
        a = weatherservice;
        super();
    }

    n(WeatherService weatherservice, k k)
    {
        this(weatherservice);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            if (context != null)
            {
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA"))
                {
                    a.a(intent);
                } else
                {
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT"))
                    {
                        WeatherService.a(a, "tempUnit");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK"))
                    {
                        WeatherService.a(a, "world_clock");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_CYCLE_MODE"))
                    {
                        WeatherService.a(a, "isCycle");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app"))
                    {
                        WeatherService.a(a, "widgt_calendar");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app"))
                    {
                        WeatherService.a(a, "widgt_clock");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_GOWIDGET_DYNAMIC_ICON_CHANGE"))
                    {
                        WeatherService.a(a, "dynamic_icon_gowidget");
                        return;
                    }
                    if (context.equalsIgnoreCase("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT"))
                    {
                        WeatherService.a(a, "dateStyle");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GOWIDGET_THEME_CHANGE"))
                    {
                        WeatherService.a(a, "go_widget_theme");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION"))
                    {
                        WeatherService.a(a, "auto_location");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CONVERT_INDEX_STATE"))
                    {
                        WeatherService.a(a, intent);
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY"))
                    {
                        WeatherService.b(a, intent);
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY"))
                    {
                        WeatherService.c(a, intent);
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION"))
                    {
                        WeatherService.d(a, intent);
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE"))
                    {
                        WeatherService.b(a);
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE"))
                    {
                        WeatherService.e(a, intent);
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_THEME_SWITCHER_CHANGE"))
                    {
                        WeatherService.a(a, "widget_theme_switcher");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LUNAR"))
                    {
                        WeatherService.a(a, "calendarType");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FESTIVAL"))
                    {
                        WeatherService.a(a, "festival");
                        return;
                    }
                    if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT"))
                    {
                        WeatherService.a(a, "windUnit");
                        return;
                    }
                }
            }
        }
    }
}
