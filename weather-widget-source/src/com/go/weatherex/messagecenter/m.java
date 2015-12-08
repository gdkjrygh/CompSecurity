// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import com.jiubang.core.b.a;

public class m
{

    public static void a(Context context, String s)
    {
        if ("ad_open".equals(s))
        {
            a(context, true);
        } else
        {
            if ("ad_close".equals(s))
            {
                a(context, false);
                return;
            }
            if ("zboost_open".equals(s))
            {
                b(context, true);
                return;
            }
            if ("zboost_close".equals(s))
            {
                b(context, false);
                return;
            }
        }
    }

    private static void a(Context context, boolean flag)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/service/NotifyService);
        intent.putExtra("notify_request", 53);
        intent.putExtra("extra_ad_enable", flag);
        context.startService(intent);
    }

    private static void b(Context context, boolean flag)
    {
        context = GoWidgetApplication.c(context).a().edit();
        context.putBoolean("key_zboost_ad_open", flag);
        context.commit();
    }
}
