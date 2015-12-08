// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.service.WeatherService;
import com.gau.go.launcherex.gowidget.weather.service.e;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherWidget41Style2

class bf extends BroadcastReceiver
{

    final WeatherWidget41Style2 a;

    bf(WeatherWidget41Style2 weatherwidget41style2)
    {
        a = weatherwidget41style2;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context != null && a.mWidgetScrollGroup != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (context.equals("android.intent.action.TIME_TICK"))
        {
            com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.e(a);
            return;
        }
        if (context.equals("android.intent.action.SCREEN_OFF"))
        {
            WeatherWidget41Style2.a(a, false);
            return;
        }
        if (context.equals("android.intent.action.SCREEN_ON"))
        {
            WeatherWidget41Style2.a(a, true);
            com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.e(a);
            return;
        }
        if (context.equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.e(a);
            return;
        }
        if (context.equals("android.intent.action.TIME_SET") || context.equals("android.intent.action.DATE_CHANGED"))
        {
            WeatherWidget41Style2.f(a).a();
            com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.e(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED"))
        {
            WeatherWidget41Style2.b(a, true);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_INITIALIZED_CITY"))
        {
            com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.c(a, false);
            int i = intent.getIntExtra("city_location_state", 3);
            context = intent.getStringExtra("city_location_id");
            if (i == 4 && !TextUtils.isEmpty(context))
            {
                com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.g(a);
                return;
            } else
            {
                com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.g(a);
                return;
            }
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (WeatherWidget41Style2.b(a) == null) goto _L1; else goto _L3
_L3:
        try
        {
            WeatherWidget41Style2.a(a, WeatherWidget41Style2.b(a).b(), WeatherWidget41Style2.b(a).a(), WeatherWidget41Style2.b(a).a(com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.c(a)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (!c.a()) goto _L1; else goto _L4
_L4:
        context.printStackTrace();
        return;
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY")) goto _L1; else goto _L5
_L5:
        if (WeatherWidget41Style2.b(a) == null) goto _L7; else goto _L6
_L6:
        if (WeatherWidget41Style2.h(a))
        {
            try
            {
                WeatherWidget41Style2.a(a, WeatherWidget41Style2.b(a).b(), WeatherWidget41Style2.b(a).a(), WeatherWidget41Style2.b(a).a(com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.c(a)));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (c.a())
                {
                    context.printStackTrace();
                }
                continue; /* Loop/switch isn't completed */
            }
        }
_L9:
        WeatherWidget41Style2.d(a, false);
        return;
_L7:
        if (WeatherWidget41Style2.i(a))
        {
            a.getContext().bindService(new Intent(a.getContext(), com/gau/go/launcherex/gowidget/weather/service/WeatherService), WeatherWidget41Style2.j(a), 1);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }
}
