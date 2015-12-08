// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.app.honeycomb.widget;

import android.app.AlarmManager;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.app.honeycomb.widget.WidgetUpdateService;
import com.google.android.apps.youtube.app.honeycomb.widget.a;
import com.google.android.apps.youtube.app.honeycomb.widget.c;
import com.google.android.apps.youtube.common.L;
import com.google.android.youtube.j;

public class WidgetProvider extends AppWidgetProvider
{

    public WidgetProvider()
    {
    }

    public static void a(Context context)
    {
        L.a();
        ComponentName componentname = new ComponentName(context, com/google/android/youtube/app/honeycomb/widget/WidgetProvider);
        AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(context);
        int ai[] = appwidgetmanager.getAppWidgetIds(componentname);
        if (ai == null || ai.length == 0)
        {
            L.f("No widgets found, ignoring refresh request");
            return;
        }
        b(context);
        Intent intent = new Intent(null, null, context, com/google/android/apps/youtube/app/honeycomb/widget/WidgetUpdateService);
        for (int i = 0; i < ai.length; i++)
        {
            RemoteViews remoteviews = c.a(context);
            remoteviews.setRemoteAdapter(j.gx, intent);
            appwidgetmanager.updateAppWidget(ai[i], remoteviews);
        }

        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(ai, j.gx);
    }

    private static void b(Context context)
    {
        ((AlarmManager)context.getSystemService("alarm")).cancel(com.google.android.apps.youtube.app.honeycomb.widget.a.a(context));
    }

    public void onDisabled(Context context)
    {
        L.a();
        b(context);
        context.stopService(new Intent(context, com/google/android/apps/youtube/app/honeycomb/widget/WidgetUpdateService));
        super.onDisabled(context);
    }

    public void onEnabled(Context context)
    {
        L.a();
        super.onEnabled(context);
    }

    public void onReceive(Context context, Intent intent)
    {
        L.f((new StringBuilder("onReceive ")).append(intent.getAction()).toString());
        if ("com.google.android.youtube.action.widget_update".equals(intent.getAction()))
        {
            L.e("Received our own update action");
            a(context);
            return;
        } else
        {
            super.onReceive(context, intent);
            return;
        }
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        L.a();
        a(context);
        super.onUpdate(context, appwidgetmanager, ai);
    }
}
