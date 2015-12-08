// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.walmart.android.app.main.MainActivity;
import com.walmart.android.config.FragmentConfig;

public class SearchWidget extends AppWidgetProvider
{

    public SearchWidget()
    {
    }

    private void addAnalyticsData(Intent intent, String s)
    {
        intent.putExtra("send_analytics_event", true);
        intent.putExtra("analytics_category", "Widget");
        intent.putExtra("analytics_action", s);
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        ai = new RemoteViews(context.getPackageName(), 0x7f040026);
        Intent intent = new Intent(context, com/walmart/android/app/main/MainActivity);
        intent.setAction("android.intent.action.VIEW");
        addAnalyticsData(intent, "Home Click");
        intent.setFlags(0x20000);
        intent.setFlags(0x20000000);
        ai.setOnClickPendingIntent(0x7f10004e, PendingIntent.getActivity(context, 1, intent, 0));
        intent = new Intent(context, com/walmart/android/app/main/MainActivity);
        intent.setAction("android.intent.action.SEARCH");
        addAnalyticsData(intent, "Search Click");
        intent.setFlags(0x20000);
        intent.setFlags(0x20000000);
        ai.setOnClickPendingIntent(0x7f100066, PendingIntent.getActivity(context, 2, intent, 0));
        intent = new Intent(context, com/walmart/android/app/main/MainActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.STORE_FINDER).getName());
        addAnalyticsData(intent, "Store Finder Click");
        intent.setFlags(0x20000);
        intent.setFlags(0x20000000);
        ai.setOnClickPendingIntent(0x7f10008c, PendingIntent.getActivity(context, 3, intent, 0));
        appwidgetmanager.updateAppWidget(new ComponentName(context, com/walmart/android/widget/SearchWidget), ai);
    }
}
