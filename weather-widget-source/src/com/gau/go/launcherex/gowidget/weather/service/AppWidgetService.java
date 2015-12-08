// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.gau.go.launcherex.gowidget.weather.systemwidget.c;
import com.go.weatherex.e.a;
import com.go.weatherex.j.b.n;
import com.gtp.go.weather.sharephoto.takephoto.ab;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            a, NotifyService

public class AppWidgetService extends Service
{

    private final Handler a = new Handler();
    private int b;
    private final Runnable c = new com.gau.go.launcherex.gowidget.weather.service.a(this);

    public AppWidgetService()
    {
    }

    static int a(AppWidgetService appwidgetservice)
    {
        return appwidgetservice.b;
    }

    private void a()
    {
        a.removeCallbacks(c);
        a.postDelayed(c, 3000L);
    }

    public static void a(Context context)
    {
        a(context, -1, null);
    }

    public static void a(Context context, int i, Intent intent)
    {
        context.startService(b(context, i, intent));
    }

    public static Intent b(Context context, int i, Intent intent)
    {
        context = new Intent(context, com/gau/go/launcherex/gowidget/weather/service/AppWidgetService);
        if (i != -1)
        {
            context.putExtra("appwidget_service_request", i);
        }
        if (intent != null)
        {
            context.putExtra("extra_intent", intent);
        }
        return context;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT <= 17)
        {
            startForeground(7, new Notification());
        }
        n.b(getApplicationContext());
        com.gau.go.launcherex.gowidget.weather.systemwidget.c.a(getApplicationContext());
        com.gau.go.launcherex.gowidget.weather.systemwidget.c.a().b();
        startService(new Intent(this, com/gau/go/launcherex/gowidget/weather/service/NotifyService));
        if (ab.b("http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip"))
        {
            com.go.weatherex.e.a.a().a("http://goappdl.goforandroid.com/dynamic/Thanksgiving2015/2015.11.25;2015.11.27.zip");
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Intent intent1;
        int k;
        b = j;
        if (intent == null)
        {
            a();
            return super.onStartCommand(intent, i, j);
        }
        k = intent.getIntExtra("appwidget_service_request", -1);
        intent1 = (Intent)intent.getParcelableExtra("extra_intent");
        k;
        JVM INSTR tableswitch 24 28: default 76
    //                   24 84
    //                   25 109
    //                   26 145
    //                   27 174
    //                   28 210;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return super.onStartCommand(intent, i, j);
_L2:
        int l = intent1.getIntExtra("request_extra_appwidget_type", -1);
        com.gau.go.launcherex.gowidget.weather.systemwidget.c.a().a(l, getApplicationContext());
        continue; /* Loop/switch isn't completed */
_L3:
        int i1 = intent1.getIntExtra("request_extra_appwidget_type", -1);
        intent1 = intent1.getIntArrayExtra("extra_appwidget_ids");
        com.gau.go.launcherex.gowidget.weather.systemwidget.c.a().b(i1, getApplicationContext(), intent1);
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = intent1.getIntExtra("request_extra_appwidget_type", -1);
        com.gau.go.launcherex.gowidget.weather.systemwidget.c.a().b(j1, getApplicationContext());
        a();
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = intent1.getIntExtra("request_extra_appwidget_type", -1);
        intent1 = intent1.getIntArrayExtra("extra_appwidget_ids");
        com.gau.go.launcherex.gowidget.weather.systemwidget.c.a().a(k1, getApplicationContext(), intent1);
        continue; /* Loop/switch isn't completed */
_L6:
        n.n().a(intent1);
        if (true) goto _L1; else goto _L7
_L7:
    }
}
