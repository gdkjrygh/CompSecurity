// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.widget;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.app.e.a;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.widget:
//            WidgetUpdateService, WidgetActivity

final class b
    implements android.widget.RemoteViewsService.RemoteViewsFactory
{

    final WidgetUpdateService a;

    private b(WidgetUpdateService widgetupdateservice)
    {
        a = widgetupdateservice;
        super();
    }

    b(WidgetUpdateService widgetupdateservice, byte byte0)
    {
        this(widgetupdateservice);
    }

    public final int getCount()
    {
        return com.google.android.apps.youtube.app.honeycomb.widget.WidgetUpdateService.a(a).size();
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final RemoteViews getLoadingView()
    {
        return new RemoteViews(a.getPackageName(), l.bP);
    }

    public final RemoteViews getViewAt(int i)
    {
        List list = com.google.android.apps.youtube.app.honeycomb.widget.WidgetUpdateService.a(a);
        list;
        JVM INSTR monitorenter ;
        Object obj;
        RemoteViews remoteviews;
        Object obj1;
        if (i >= com.google.android.apps.youtube.app.honeycomb.widget.WidgetUpdateService.a(a).size())
        {
            break MISSING_BLOCK_LABEL_196;
        }
        obj = a;
        obj1 = (a)com.google.android.apps.youtube.app.honeycomb.widget.WidgetUpdateService.a(a).get(i);
        remoteviews = new RemoteViews(((Context) (obj)).getPackageName(), l.bO);
        remoteviews.setTextViewText(j.fF, ((a) (obj1)).a.title);
        remoteviews.setImageViewBitmap(j.fy, ((a) (obj1)).b);
        if (((a) (obj1)).c != p.cc)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        remoteviews.setTextViewText(j.eQ, ((a) (obj1)).a.ownerDisplayName);
_L1:
        i = j.gw;
        obj1 = ((a) (obj1)).a.id;
        remoteviews.setOnClickFillInIntent(i, (new Intent(((Context) (obj)), com/google/android/apps/youtube/app/honeycomb/widget/WidgetActivity)).setAction("com.google.android.youtube.action.widget_play").putExtra("video_id", ((String) (obj1))));
        return remoteviews;
        remoteviews.setTextViewText(j.eQ, Html.fromHtml(((Context) (obj)).getString(((a) (obj1)).c)));
          goto _L1
        Exception exception;
        exception;
        throw exception;
        exception = getLoadingView();
        list;
        JVM INSTR monitorexit ;
        return exception;
    }

    public final int getViewTypeCount()
    {
        return 2;
    }

    public final boolean hasStableIds()
    {
        return false;
    }

    public final void onCreate()
    {
    }

    public final void onDataSetChanged()
    {
        WidgetUpdateService.b(a);
    }

    public final void onDestroy()
    {
        com.google.android.apps.youtube.app.honeycomb.widget.WidgetUpdateService.a(a).clear();
    }
}
