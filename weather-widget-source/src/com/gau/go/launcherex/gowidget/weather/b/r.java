// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gtp.a.a.a.a;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            s, f, ak

public class r
{

    private static r h;
    private Context a;
    private f b;
    private ak c;
    private AlarmManager d;
    private PendingIntent e;
    private int f;
    private int g;
    private e i;
    private boolean j;
    private final BroadcastReceiver k = new s(this);

    private r(Context context)
    {
        a = context;
        b = new f(context);
        c = new ak(context);
        i = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext()).f();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WEATHER_UPDATE_TIME");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_UPDATE");
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentfilter.addAction("android.intent.action.TIME_SET");
        intentfilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        a.registerReceiver(k, intentfilter);
        d = (AlarmManager)context.getSystemService("alarm");
        e = PendingIntent.getBroadcast(context, 0, new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_UPDATE"), 0x8000000);
        com.gtp.a.a.a.a.a().a("ScheduleUpdateManager create!");
    }

    static int a(r r1, int l)
    {
        r1.f = l;
        return l;
    }

    static ak a(r r1)
    {
        return r1.c;
    }

    public static r a(Context context)
    {
        if (h == null)
        {
            h = new r(context);
        }
        return h;
    }

    private void a(long l)
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putLong("update_time", l).commit();
        }
    }

    static void a(r r1, long l)
    {
        r1.a(l);
    }

    static void a(r r1, boolean flag)
    {
        r1.c(flag);
    }

    static int b(r r1, int l)
    {
        r1.g = l;
        return l;
    }

    static f b(r r1)
    {
        return r1.b;
    }

    private void b(int l)
    {
        com.gtp.a.a.a.a.a().a("\u81EA\u52A8\u66F4\u65B0\u5F00\u59CB\u3002");
        if (i.e())
        {
            b.a(2);
        }
        c.a(l);
    }

    static int c(r r1)
    {
        return r1.g;
    }

    static void c(r r1, int l)
    {
        r1.b(l);
    }

    private void c(boolean flag)
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putBoolean("update", flag).commit();
        }
    }

    static int d(r r1)
    {
        return r1.f;
    }

    private long d()
    {
        long l = 0L;
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences != null)
        {
            l = sharedpreferences.getLong("update_time", 0L);
        }
        return l;
    }

    private boolean e()
    {
        boolean flag = false;
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences != null)
        {
            flag = sharedpreferences.getBoolean("update", false);
        }
        return flag;
    }

    static boolean e(r r1)
    {
        return r1.e();
    }

    private long f()
    {
        return 0xdbba0L;
    }

    static Context f(r r1)
    {
        return r1.a;
    }

    public void a()
    {
        d.cancel(e);
        c(false);
    }

    public void a(int l)
    {
        b.a(l);
    }

    public void a(CityBean citybean)
    {
        i.b(1, false);
        b.a(citybean);
    }

    public void a(u u1)
    {
        g = u1.a;
        f = u1.e;
        if (g == 1)
        {
            a(false);
        }
    }

    public void a(ArrayList arraylist, int l)
    {
        if (i.e())
        {
            b.a(2);
        }
        c.a(arraylist, 22, l);
    }

    public void a(ArrayList arraylist, int l, int i1)
    {
        c.a(arraylist, l, i1);
    }

    public void a(boolean flag)
    {
        long l1 = d();
        long l = l1;
        if (l1 == 0L)
        {
            l = System.currentTimeMillis();
            a(l);
        }
        d.cancel(e);
        if (flag)
        {
            l = f() + System.currentTimeMillis();
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u5237\u65B0\u5931\u8D25\uFF0C\u7B49\u5F85").append((l - System.currentTimeMillis()) / 60000L).append("\u5206\u949F\u540E\u5237\u65B0\u3002").toString());
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append((l - System.currentTimeMillis()) / 60000L).append("\u5206\u949F\u5B9A\u65F6\u5237\u65B0\u5F00\u59CB\u8BA1\u65F6").toString());
        } else
        {
            l = ((l - l % 60000L) + (long)f) - 0x927c0L;
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append((l - System.currentTimeMillis()) / 60000L).append("\u5206\u949F\u5B9A\u65F6\u5237\u65B0\u5F00\u59CB\u8BA1\u65F6").toString());
        }
        d.set(0, l, e);
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            j = false;
            a(System.currentTimeMillis());
            com.gtp.a.a.a.a.a().a("\u5237\u65B0\u6210\u529F\uFF0C\u51C6\u5907\u4E0B\u4E00\u6B21\u5B9A\u65F6\u5237\u65B0\u3002");
            a(false);
            return;
        } else
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u5237\u65B0\u5931\u8D25\uFF0C[mIsLastUpdateFailed]=").append(j).toString());
            a(true);
            return;
        }
    }

    public boolean b()
    {
        return c.b();
    }

    public void c()
    {
        b.b();
        c.c();
        a.unregisterReceiver(k);
        a();
        h = null;
    }
}
