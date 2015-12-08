// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.a.e;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.go.weatherex.h.c;

public class r
{

    private static String a(CityBean citybean)
    {
        if (citybean == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(citybean.b()))
        {
            stringbuilder.append(citybean.b());
        }
        if (!TextUtils.isEmpty(citybean.d()))
        {
            stringbuilder.append(", ").append(citybean.d());
        }
        if (!TextUtils.isEmpty(citybean.d()))
        {
            stringbuilder.append(", ").append(citybean.c());
        }
        if (!TextUtils.isEmpty(citybean.c()))
        {
            stringbuilder.append(", (").append(citybean.a()).append(")");
        }
        return stringbuilder.toString();
    }

    private static String a(WeatherBean weatherbean)
    {
        if (weatherbean == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(weatherbean.d()))
        {
            stringbuilder.append(weatherbean.d());
        }
        if (!TextUtils.isEmpty(weatherbean.a()))
        {
            stringbuilder.append(", ").append(weatherbean.a());
        }
        if (!TextUtils.isEmpty(weatherbean.a()))
        {
            stringbuilder.append(", ").append(weatherbean.b());
        }
        if (!TextUtils.isEmpty(weatherbean.b()))
        {
            stringbuilder.append(", (").append(weatherbean.c()).append(")");
        }
        return stringbuilder.toString();
    }

    public static void a(Context context, CityBean citybean, CityBean citybean1, boolean flag)
    {
        a a1;
        if (flag)
        {
            a1 = new a(93, "sel_dau_city");
        } else
        {
            a1 = new a(93, "sel_oth_city");
        }
        a1.h(a(citybean));
        a1.i(a(citybean1));
        q.a(context.getApplicationContext()).a(a1);
    }

    public static void a(Context context, WeatherBean weatherbean)
    {
        a a1 = new a(93, "cancel_my_flow_my_loc");
        a1.h(a(weatherbean));
        q.a(context.getApplicationContext()).a(a1);
    }

    public static void a(Context context, boolean flag, String s)
    {
        c c1 = new c(context.getApplicationContext());
        String s1;
        if (flag)
        {
            s1 = "local_s";
        } else
        {
            s1 = "local_e";
        }
        c1.b(s1);
        if (!flag && !TextUtils.isEmpty(s))
        {
            c1.j(s);
        }
        s = c1.b();
        e.a(context.getApplicationContext()).a(com.gtp.a.a.b.c.a());
        e.a(context.getApplicationContext()).a(s);
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5F02\u5E38\u4FE1\u606F\u7EDF\u8BA1\u3011\u7EDF\u8BA1\u5B9A\u4F4D\u60C5\u51B5\uFF1A \r\n").append(s).toString(), "statistics_log.txt");
    }
}
