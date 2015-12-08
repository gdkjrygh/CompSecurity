// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

// Referenced classes of package com.go.weatherex.j.c:
//            u

public class m
{

    public static PendingIntent a(Context context, int i)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_CALENDAR");
        intent.putExtra("extra_widget_id", i);
        return PendingIntent.getBroadcast(context.a(), 0x80000, intent, 0x8000000);
    }

    public static PendingIntent a(Context context, int i, int j)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        int k = 0x50000;
        if (j == 31)
        {
            k = 22;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_THEME_SETTING");
        intent.putExtra("extra_widget_id", i);
        intent.putExtra("extra_theme_entrance", j);
        return PendingIntent.getBroadcast(context.a(), k + i, intent, 0x8000000);
    }

    public static PendingIntent a(Context context, int i, int j, String s)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DAYS_NEXT_PAGE");
        intent.putExtra("extra_widget_id", i);
        intent.putExtra("extra_widget_type", j);
        if (!TextUtils.isEmpty(s))
        {
            intent.putExtra("extra_city_id", s);
        }
        return PendingIntent.getBroadcast(context.a(), i, intent, 0x8000000);
    }

    public static PendingIntent b(Context context, int i)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_CLOCK");
        intent.putExtra("extra_widget_id", i);
        return PendingIntent.getBroadcast(context.a(), 0x70000, intent, 0x8000000);
    }

    public static PendingIntent b(Context context, int i, int j)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_WIDGET_CONFIG");
        intent.putExtra("extra_widget_id", i);
        intent.putExtra("extra_widget_type", j);
        return PendingIntent.getBroadcast(context.a(), 0x100000 + i, intent, 0x8000000);
    }

    public static PendingIntent b(Context context, int i, int j, String s)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DAYS_PREVIOUS_PAGE");
        intent.putExtra("extra_widget_id", i);
        intent.putExtra("extra_widget_type", j);
        if (!TextUtils.isEmpty(s))
        {
            intent.putExtra("extra_city_id", s);
        }
        return PendingIntent.getBroadcast(context.a(), i, intent, 0x8000000);
    }

    public static PendingIntent c(Context context, int i)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_WEATHER_DETAIL");
        intent.putExtra("extra_widget_id", i);
        return PendingIntent.getBroadcast(context.a(), 0x40000 + i, intent, 0x8000000);
    }

    public static PendingIntent d(Context context, int i)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEXT_CITY");
        intent.putExtra("extra_widget_id", i);
        return PendingIntent.getBroadcast(context.a(), 0x30000 + i, intent, 0x8000000);
    }

    public static PendingIntent e(Context context, int i)
    {
        while (context == null || !com/go/weatherex/j/c/u.isInstance(context)) 
        {
            return null;
        }
        context = (u)context;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_WEATHER");
        intent.putExtra("extra_widget_id", i);
        return PendingIntent.getBroadcast(context.a(), 0x20000, intent, 0x8000000);
    }
}
