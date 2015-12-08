// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.i;

import android.text.TextUtils;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.util.Calendar;

public class b
{

    public static Time a(g g1, WeatherBean weatherbean)
    {
        if (weatherbean != null && weatherbean.l != null && g1.d())
        {
            return g1.b(weatherbean.l.n());
        } else
        {
            return g1.b(-10000);
        }
    }

    public static String a(Time time, g g1, u u1, boolean flag)
    {
        int i;
        if (u1 != null)
        {
            i = u1.k;
        } else
        {
            i = 1;
        }
        if (g1 != null)
        {
            g1.d(i);
            if (flag)
            {
                return g1.a(time, true);
            } else
            {
                return g1.a(time, false);
            }
        }
        if (flag)
        {
            return time.format("%m/%d");
        } else
        {
            return time.format("%Y/%m/%d");
        }
    }

    public static boolean a()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(1);
        int j = calendar.get(2);
        int k = calendar.get(5);
        return i == 2015 && j + 1 == 11 && k == 27;
    }

    public static boolean a(Time time)
    {
        return time.hour >= 0 && time.hour <= 11;
    }

    public static boolean a(Time time, WeatherBean weatherbean)
    {
        if (weatherbean == null)
        {
            return true;
        }
        String s = weatherbean.l.j();
        weatherbean = weatherbean.l.k();
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(weatherbean))
        {
            return r.a(s, weatherbean, time);
        } else
        {
            return r.a(s, weatherbean);
        }
    }

    public static boolean b()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(1);
        int j = calendar.get(2);
        int k = calendar.get(5);
        return i == 2015 && j + 1 == 11 && k == 30;
    }
}
