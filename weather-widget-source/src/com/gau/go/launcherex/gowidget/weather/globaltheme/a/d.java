// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import com.gau.go.launcherex.gowidget.weather.service.a.b;
import com.go.weatherex.themestore.ac;
import com.jiubang.core.b.a;
import com.jiubang.playsdk.a.y;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.a:
//            e, f

public class d
{

    private static int a = 0;
    private static int b;

    public static int a()
    {
        return b;
    }

    public static void a(int i)
    {
        b = i;
    }

    public static void a(Context context)
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new e(context));
    }

    public static void a(Context context, boolean flag)
    {
        if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(GoWidgetApplication.a(context)))
        {
            Object obj = GoWidgetApplication.c(context).a().edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("new_theme", flag);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE");
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            ((Intent) (obj)).putExtra("extra_new_theme_flag", i);
            ((Intent) (obj)).putExtra("new_theme_num_flag", a);
            context.sendBroadcast(((Intent) (obj)));
            return;
        } else
        {
            Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/service/NotifyService);
            Bundle bundle = new Bundle();
            bundle.putInt("notify_request", 35);
            bundle.putBoolean("request_extra_show_new_theme_star", flag);
            intent.putExtras(bundle);
            context.startService(intent);
            return;
        }
    }

    static int b()
    {
        return a;
    }

    static int b(int i)
    {
        a = i;
        return i;
    }

    static void b(Context context)
    {
        c(context);
    }

    public static void b(Context context, boolean flag)
    {
        if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(GoWidgetApplication.a(context)))
        {
            Object obj = GoWidgetApplication.c(context).a().edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("new_theme", flag);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE");
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            ((Intent) (obj)).putExtra("extra_new_theme_flag", i);
            ((Intent) (obj)).putExtra("new_theme_num_flag", 0);
            context.sendBroadcast(((Intent) (obj)));
            return;
        } else
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE");
            intent.putExtra("new_theme_num_flag", 0);
            context.sendBroadcast(intent);
            return;
        }
    }

    private static void c(Context context)
    {
        ac.a(context);
        ac.g().a(new f(context));
    }

}
