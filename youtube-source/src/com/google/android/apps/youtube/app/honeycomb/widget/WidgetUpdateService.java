// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.widget;

import android.app.AlarmManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.an;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.youtube.app.honeycomb.widget.WidgetProvider;
import com.google.android.youtube.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.widget:
//            b, c, a

public class WidgetUpdateService extends RemoteViewsService
    implements b
{

    private com.google.android.apps.youtube.app.e.b a;
    private GDataRequestFactory b;
    private com.google.android.apps.youtube.app.honeycomb.widget.b c;
    private List d;
    private boolean e;
    private final Semaphore f = new Semaphore(0);

    public WidgetUpdateService()
    {
        c = new com.google.android.apps.youtube.app.honeycomb.widget.b(this, (byte)0);
        d = new ArrayList();
    }

    static List a(WidgetUpdateService widgetupdateservice)
    {
        return widgetupdateservice.d;
    }

    private void a()
    {
        int i = 0;
        a = null;
        e = false;
        f.release();
        if (d.isEmpty())
        {
            ComponentName componentname = new ComponentName(this, com/google/android/youtube/app/honeycomb/widget/WidgetProvider);
            AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(this);
            Intent intent = new Intent(null, null, this, com/google/android/apps/youtube/app/honeycomb/widget/WidgetUpdateService);
            for (int ai[] = appwidgetmanager.getAppWidgetIds(componentname); i < ai.length; i++)
            {
                RemoteViews remoteviews = com.google.android.apps.youtube.app.honeycomb.widget.c.b(this);
                remoteviews.setRemoteAdapter(ai[i], j.gx, intent);
                appwidgetmanager.updateAppWidget(ai[i], remoteviews);
            }

            L.a();
            ((AlarmManager)getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + 0x36ee80L, com.google.android.apps.youtube.app.honeycomb.widget.a.a(this));
        }
    }

    static void b(WidgetUpdateService widgetupdateservice)
    {
        if (!widgetupdateservice.e)
        {
            widgetupdateservice.e = true;
            Object obj = (YouTubeApplication)widgetupdateservice.getApplication();
            ax ax1 = ((YouTubeApplication) (obj)).d();
            l l1 = ax1.aT();
            bc bc1 = ax1.f();
            obj = ((YouTubeApplication) (obj)).s();
            obj = new an(bc1, ax1.aT(), ((String) (obj)));
            widgetupdateservice.a = new com.google.android.apps.youtube.app.e.b(((com.google.android.apps.youtube.core.async.af) (obj)), ax1.aw(), ((an) (obj)).a(), 8, 24, true);
            widgetupdateservice.b = bc1.a();
            if (l1.b())
            {
                widgetupdateservice.a.a(widgetupdateservice.b.e(), widgetupdateservice);
            } else
            {
                widgetupdateservice.a.a(widgetupdateservice.b.d(), widgetupdateservice);
            }
        }
        try
        {
            widgetupdateservice.f.acquire();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WidgetUpdateService widgetupdateservice)
        {
            widgetupdateservice.printStackTrace();
        }
    }

    public final void a(Object obj, Exception exception)
    {
        L.d("Error response", exception);
        synchronized (d)
        {
            d.clear();
        }
        a();
    }

    public final void a(Object obj, Object obj1)
    {
        obj1 = (List)obj1;
        synchronized (d)
        {
            d.clear();
            d.addAll(((java.util.Collection) (obj1)));
        }
        a();
    }

    public android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent)
    {
        return c;
    }
}
