// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget21Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget42Provider;

public class AppUpdateReceiver extends BroadcastReceiver
{

    public AppUpdateReceiver()
    {
    }

    private void a(Context context)
    {
        context.sendBroadcast(new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APPWIDGET_THEME_CHANGE"));
    }

    private void b(Context context)
    {
        context.startService(new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService"));
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", -1);
        context.startService(intent);
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (s.equals("android.intent.action.PACKAGE_REPLACED"))
        {
            s = intent.getDataString().replace("package:", "");
            boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (s.equals(context.getPackageName()) && flag)
            {
                a(context);
                intent = context.getSharedPreferences("bill_recommend", 0);
                int i = intent.getInt("enter_times", 10) / 10;
                intent = intent.edit();
                intent.putInt("enter_times", i * 10);
                intent.commit();
                b(context);
            }
        } else
        if (s.equals("android.intent.action.MEDIA_MOUNTED") || s.equals("android.intent.action.MEDIA_SCANNER_FINISHED"))
        {
            GoWidgetApplication.b(context.getApplicationContext());
            if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider)).length > 0 || AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider)).length > 0 || AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider)).length > 0)
            {
                a(context);
                return;
            }
        }
    }
}
