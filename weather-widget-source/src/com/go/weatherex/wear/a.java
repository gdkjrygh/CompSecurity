// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.GoLifeBean;
import com.gau.go.launcherex.gowidget.weather.model.HourlyBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.j;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.home.c.e;
import com.go.weatherex.wear.a.a.b;
import com.go.weatherex.wear.a.a.c;
import com.go.weatherex.wear.a.a.d;

public class a
{

    public static com.go.weatherex.wear.a.a.a a(WeatherBean weatherbean)
    {
        com.go.weatherex.wear.a.a.a a1 = new com.go.weatherex.wear.a.a.a();
        a1.a(weatherbean.c());
        a1.b(weatherbean.d());
        a1.c(weatherbean.a());
        a1.d(weatherbean.b());
        a1.a(System.currentTimeMillis());
        return a1;
    }

    public static b a(u u1, ForecastBean forecastbean)
    {
        int i = u1.g;
        u1 = new b();
        u1.a(forecastbean.e());
        u1.b(forecastbean.f());
        u1.c(forecastbean.g());
        u1.d(forecastbean.i());
        u1.a(forecastbean.d());
        u1.e(q.a(forecastbean.b(i)));
        u1.f(q.a(forecastbean.a(i)));
        u1.g(forecastbean.m());
        return u1;
    }

    public static c a(u u1, NowBean nowbean, HourlyBean hourlybean)
    {
        c c1 = new c();
        c1.a(hourlybean.d());
        c1.b(q.a(hourlybean.b(u1.g)));
        c1.c(hourlybean.e());
        c1.a(hourlybean.g());
        int i = r.a(true, nowbean.j());
        int k = r.a(false, nowbean.k());
        c1.a(r.a(c1.a(), i, k));
        return c1;
    }

    public static d a(Context context, GoLifeBean golifebean)
    {
        d d1 = new d();
        d1.a(golifebean.c().a());
        d1.b(e.a(golifebean.c(), context).replace("[", "").replace("]", ""));
        d1.c(e.a(golifebean.c(), golifebean.b(), context));
        return d1;
    }

    public static com.go.weatherex.wear.a.a.e a(u u1, NowBean nowbean)
    {
        int i = u1.g;
        u1 = new com.go.weatherex.wear.a.a.e();
        u1.a(q.a(nowbean.a(i)));
        u1.b(q.a(nowbean.b(i)));
        u1.c(q.a(nowbean.c(i)));
        u1.d(nowbean.c());
        u1.e(nowbean.d());
        u1.a(nowbean.e());
        u1.b(nowbean.b());
        u1.f(nowbean.o());
        u1.a(r.a(nowbean.j(), nowbean.k()));
        return u1;
    }
}
