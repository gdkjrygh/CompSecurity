// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.res.Configuration;
import android.os.Process;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import com.go.weatherex.sidebar.shuffle.b;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.MapsInitializer;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.a.g;
import com.jiubang.core.b.a;
import com.jiubang.core.util.CrashReport;
import io.wecloud.message.k;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            o, n

public class GoWidgetApplication extends Application
{

    public static boolean a = true;
    public static boolean b;
    private static com.gau.go.launcherex.gowidget.weather.c.c c;
    private static a d;
    private static GoWidgetApplication e;

    public GoWidgetApplication()
    {
    }

    public static String a(Context context)
    {
label0:
        {
            int j = Process.myPid();
            if (context == null)
            {
                break label0;
            }
            Object obj = context.getApplicationContext();
            if (obj != null)
            {
                context = ((Context) (obj));
            }
            context = (ActivityManager)context.getSystemService("activity");
            if (context == null)
            {
                break label0;
            }
            context = context.getRunningAppProcesses().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                obj = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            } while (obj == null || ((android.app.ActivityManager.RunningAppProcessInfo) (obj)).pid != j);
            com.gtp.a.a.b.c.a("LJL", ((android.app.ActivityManager.RunningAppProcessInfo) (obj)).processName);
            return ((android.app.ActivityManager.RunningAppProcessInfo) (obj)).processName;
        }
        return null;
    }

    public static GoWidgetApplication b()
    {
        return e;
    }

    public static f b(Context context)
    {
label0:
        {
            if (c != null)
            {
                f f1 = c.e();
                context = f1;
                if (f1 != null)
                {
                    break label0;
                }
            }
            context = com.gau.go.launcherex.gowidget.weather.d.f.a(e);
        }
        return context;
    }

    public static a c(Context context)
    {
        if (d == null)
        {
            d = new a(context);
        }
        return d;
    }

    public static i d()
    {
        return c.d();
    }

    static GoWidgetApplication e()
    {
        return e;
    }

    private void f()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PAYINFO_SAVE_FINISH");
        registerReceiver(new o(this), intentfilter);
    }

    private void g()
    {
        if (d.a().getBoolean("new_theme", false))
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE");
            intent.putExtra("extra_new_theme_flag", 1);
            sendBroadcast(intent);
        }
    }

    private void h()
    {
        Intent intent = new Intent(getApplicationContext(), com/gau/go/launcherex/gowidget/weather/service/NotifyService);
        intent.putExtra("notify_request", 31);
        startService(intent);
    }

    private void i()
    {
        AlarmManager alarmmanager = (AlarmManager)getSystemService("alarm");
        Object obj = new Intent(getApplicationContext(), com/gau/go/launcherex/gowidget/weather/service/NotifyService);
        ((Intent) (obj)).putExtra("notify_request", 12);
        obj = PendingIntent.getService(getApplicationContext(), 1, ((Intent) (obj)), 0x8000000);
        alarmmanager.set(0, System.currentTimeMillis() + 30000L, ((PendingIntent) (obj)));
    }

    public void a()
    {
        if (((ActivityManager)getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion < 0x20000)
        {
            a = false;
        }
        if (a && GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext()) != 0)
        {
            a = false;
        }
        try
        {
            if (a)
            {
                MapsInitializer.initialize(getApplicationContext());
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        a = false;
    }

    public void c()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", -1);
        startService(intent);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(a(getApplicationContext())) && c != null)
        {
            c.c().i();
        }
    }

    public void onCreate()
    {
        Object obj;
        String s;
        int j;
        super.onCreate();
        e = this;
        (new CrashReport()).start(this);
        obj = a(this);
        if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(obj))
        {
            b = true;
            removeStickyBroadcast(new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY"));
            removeStickyBroadcast(new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED"));
            c = com.gau.go.launcherex.gowidget.weather.c.c.a(this);
            c.a();
            c();
            h();
            d = new a(this);
            i();
            g();
            a();
            com.gtp.go.weather.sharephoto.a.g.a(this);
            if (com.go.weatherex.wear.f.a(e))
            {
                com.go.weatherex.wear.f.a("--------------------------------------------------------------------");
                com.go.weatherex.wear.f.a("\u6253\u5F00\u5E94\u7528\uFF1A\u8FDB\u5165\u53D1\u9001\u5929\u6C14\u5361\u7247\u5224\u65AD\u903B\u8F91");
                com.go.weatherex.wear.c.a(e).a();
            }
            k.a(getApplicationContext());
        } else
        if ("com.gau.go.launcherex.gowidget.weatherwidget:Activity".equals(obj))
        {
            c = com.gau.go.launcherex.gowidget.weather.c.c.a(this);
            f();
        }
        s = "";
        j = Integer.valueOf(w.f(this)).intValue();
        obj = w.d(this);
_L2:
        com.gau.go.a.e.a(this, "com.gau.go.launcherex.gowidget.weatherwidget", String.valueOf(j), ((String) (obj)), null);
        (new Thread(new n(this))).start();
        com.go.weatherex.sidebar.shuffle.b.a(this);
        return;
        Exception exception;
        exception;
        j = 0;
_L3:
        exception.printStackTrace();
        exception = s;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
          goto _L3
    }

}
