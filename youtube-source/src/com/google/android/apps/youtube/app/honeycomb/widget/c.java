// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.RemoteViews;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.widget:
//            WidgetActivity, a

public final class c
{

    public static RemoteViews a(Context context)
    {
        RemoteViews remoteviews = c(context);
        remoteviews.setViewVisibility(j.gs, 8);
        remoteviews.setViewVisibility(j.gu, 0);
        remoteviews.setPendingIntentTemplate(j.gx, PendingIntent.getActivity(context, 0, (new Intent(context, com/google/android/apps/youtube/app/honeycomb/widget/WidgetActivity)).setFlags(0x4000000), 0));
        return remoteviews;
    }

    public static RemoteViews b(Context context)
    {
        RemoteViews remoteviews = c(context);
        Resources resources = context.getResources();
        remoteviews.setViewVisibility(j.gs, 0);
        remoteviews.setViewVisibility(j.gu, 8);
        remoteviews.setTextViewText(j.gt, resources.getString(p.bs));
        remoteviews.setTextViewText(j.gv, resources.getString(p.fZ));
        remoteviews.setOnClickPendingIntent(j.gs, com.google.android.apps.youtube.app.honeycomb.widget.a.a(context));
        return remoteviews;
    }

    private static RemoteViews c(Context context)
    {
        context = new RemoteViews(context.getPackageName(), l.bN);
        context.setEmptyView(j.gx, j.gy);
        return context;
    }
}
