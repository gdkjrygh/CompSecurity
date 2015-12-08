// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.goweather.livewallpaper.a.c;
import com.gau.go.launcherex.goweather.livewallpaper.a.e;
import com.gau.go.launcherex.goweather.livewallpaper.b.b;
import com.gau.go.launcherex.goweather.livewallpaper.b.d;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.gau.go.launcherex.gowidget.weather.c.g;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            k

class l extends BroadcastReceiver
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!k.a(a))
        {
            context = intent.getAction();
            if (context.equals("android.intent.action.TIME_TICK"))
            {
                k.a(a, false);
            } else
            {
                if (context.equals("android.intent.action.TIME_SET") || context.equals("android.intent.action.TIMEZONE_CHANGED"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.b(a).a();
                    k.a(a, true);
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA"))
                {
                    k.a(a, 3, com.gau.go.launcherex.goweather.livewallpaper.k.c(a).b());
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.b(a, 5, "tempUnit");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.b(a, 6, "windUnit");
                    return;
                }
                if (context.equals("android.intent.action.USER_PRESENT"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.e(a).a(com.gau.go.launcherex.goweather.livewallpaper.k.d(a).b(), com.gau.go.launcherex.goweather.livewallpaper.k.d(a).c());
                    return;
                }
                if (context.equals("android.intent.action.SCREEN_OFF"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.e(a).b(com.gau.go.launcherex.goweather.livewallpaper.k.d(a).b(), com.gau.go.launcherex.goweather.livewallpaper.k.d(a).c(), h.d(k.f(a)));
                    return;
                }
                if (context.equals("android.intent.action.TIME_SET") || context.equals("android.intent.action.TIMEZONE_CHANGED") || context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.b(a, 7, "world_clock");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_SETTINGS_CHANGE"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.g(a);
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_THEME_CHANGE"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.b(a, 8, "key_live_wallpaper_theme");
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.h(a).a(a);
                    return;
                }
                if (context.equals("android.intent.action.LOCALE_CHANGED"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.h(a).i();
                    k.j(a).c(com.gau.go.launcherex.goweather.livewallpaper.k.c(a), k.i(a), com.gau.go.launcherex.goweather.livewallpaper.k.h(a).a());
                    return;
                }
                if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION"))
                {
                    com.gau.go.launcherex.goweather.livewallpaper.k.b(a, 13, "auto_location");
                    return;
                }
            }
        }
    }
}
