// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.service.AppWidgetService;
import com.gtp.a.a.b.c;

public abstract class BaseAppWidgetProvider extends AppWidgetProvider
{

    public BaseAppWidgetProvider()
    {
    }

    public abstract int a();

    public void onDeleted(Context context, int ai[])
    {
        super.onDeleted(context, ai);
        c.a("BaseAppWidgetProvider", "onDeleted");
        Intent intent = new Intent();
        intent.putExtra("request_extra_appwidget_type", a());
        intent.putExtra("extra_appwidget_ids", ai);
        AppWidgetService.a(context, 27, intent);
    }

    public void onDisabled(Context context)
    {
        super.onDisabled(context);
        c.a("BaseAppWidgetProvider", "onDisabled");
        Intent intent = new Intent();
        intent.putExtra("request_extra_appwidget_type", a());
        AppWidgetService.a(context, 26, intent);
    }

    public void onEnabled(Context context)
    {
        super.onEnabled(context);
        c.a("BaseAppWidgetProvider", "onEnabled");
        Intent intent = new Intent();
        intent.putExtra("request_extra_appwidget_type", a());
        AppWidgetService.a(context, 24, intent);
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        c.a("BaseAppWidgetProvider", (new StringBuilder()).append("onReceive").append(intent).toString());
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        super.onUpdate(context, appwidgetmanager, ai);
        c.a("BaseAppWidgetProvider", "onUpdate");
        appwidgetmanager = new Intent();
        appwidgetmanager.putExtra("request_extra_appwidget_type", a());
        appwidgetmanager.putExtra("extra_appwidget_ids", ai);
        AppWidgetService.a(context, 25, appwidgetmanager);
    }
}
