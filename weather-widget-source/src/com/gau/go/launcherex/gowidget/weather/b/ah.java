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
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.view.WeatherDayForecastActivity;
import com.gtp.a.a.b.c;
import com.jiubang.core.b.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ai, aj, x

public class ah
{

    Context a;
    BroadcastReceiver b;
    BroadcastReceiver c;
    a d;
    SharedPreferences e;
    android.content.SharedPreferences.Editor f;
    private boolean g;
    private boolean h;
    private Time i;
    private long j;
    private long k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;

    public ah(Context context)
    {
        g = true;
        h = false;
        i = new Time();
        j = 0L;
        k = 0L;
        l = 0;
        m = false;
        d = null;
        e = null;
        f = null;
        n = false;
        o = false;
        a = context;
        com.gtp.a.a.b.c.a("Remind Handler", "\u6CE8\u518C\u6570\u636E\u52A0\u8F7D\u76D1\u542C\u5668");
        if (c == null)
        {
            c = new ai(this);
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        a.registerReceiver(c, intentfilter);
        d = GoWidgetApplication.c(context.getApplicationContext());
        e = d.a();
        f = e.edit();
    }

    static int a(ah ah1)
    {
        return ah1.j();
    }

    static int a(ah ah1, int i1)
    {
        ah1.l = i1;
        return i1;
    }

    private long a(int i1)
    {
        if (i1 <= 3)
        {
            return 0x493e0L;
        }
        if (i1 == 4)
        {
            return 0x927c0L;
        }
        if (i1 == 5)
        {
            return 0x124f80L;
        }
        return i1 != 6 ? 0x36ee80L : 0x1b7740L;
    }

    static long a(ah ah1, long l1)
    {
        ah1.k = l1;
        return l1;
    }

    static boolean a(ah ah1, boolean flag)
    {
        ah1.o = flag;
        return flag;
    }

    static long b(ah ah1, int i1)
    {
        return ah1.a(i1);
    }

    static long b(ah ah1, long l1)
    {
        ah1.j = l1;
        return l1;
    }

    static Time b(ah ah1)
    {
        return ah1.i;
    }

    static boolean b(ah ah1, boolean flag)
    {
        ah1.m = flag;
        return flag;
    }

    static long c(ah ah1)
    {
        return ah1.j;
    }

    private void c()
    {
        if (b != null)
        {
            a.unregisterReceiver(b);
            b = null;
        }
        if (h)
        {
            i();
            h = false;
        }
    }

    private void d()
    {
        if (!h)
        {
            com.gtp.a.a.b.c.a("Remind Handler", "\u6CE8\u518C\u4E1A\u52A1\u5E7F\u64AD\u63A5\u6536\u5668\uFF0C\u521D\u59CB\u5316\u6570\u636E");
            if (b == null)
            {
                b = new aj(this);
            }
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PREPARE_FORECASET_DATA");
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FORECASET");
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
            intentfilter.addAction("android.intent.action.TIME_SET");
            intentfilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            a.registerReceiver(b, intentfilter);
            h = true;
            m = false;
        }
        h();
    }

    static void d(ah ah1)
    {
        ah1.h();
    }

    private void e()
    {
        if (n && !k())
        {
            f();
        }
        if (o && !l())
        {
            g();
        }
    }

    static boolean e(ah ah1)
    {
        return ah1.g;
    }

    private void f()
    {
        com.gtp.a.a.b.c.a("Remind Handler", "\u89E6\u53D1\u5F39\u7A97");
        Intent intent = new Intent();
        intent.setClass(a, com/gau/go/launcherex/gowidget/weather/view/WeatherDayForecastActivity);
        intent.setFlags(0x10000000);
        a.startActivity(intent);
        i.setToNow();
        f.putLong("last_forecast_time", i.toMillis(true));
        f.commit();
    }

    static boolean f(ah ah1)
    {
        return ah1.n();
    }

    private void g()
    {
        com.gtp.a.a.b.c.a("Remind Handler", "\u89E6\u53D1\u901A\u77E5\u680F");
        com.gau.go.launcherex.gowidget.weather.b.x.a(a);
        i.setToNow();
        f.putLong("last_notify_time", i.toMillis(true));
        f.commit();
    }

    static boolean g(ah ah1)
    {
        return ah1.m();
    }

    private void h()
    {
        com.gtp.a.a.b.c.a("Remind Handler", "\u8BBE\u7F6E\u5B9A\u65F6\u5668");
        AlarmManager alarmmanager = (AlarmManager)a.getSystemService("alarm");
        i.setToNow();
        Object obj = new Time();
        ((Time) (obj)).set(0, 30, 18, i.monthDay, i.month, i.year);
        long l2 = ((Time) (obj)).toMillis(true);
        long l1 = l2;
        if (m())
        {
            l1 = l2 + 0x5265c00L;
        }
        obj = new Intent();
        ((Intent) (obj)).setAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PREPARE_FORECASET_DATA");
        alarmmanager.setRepeating(0, l1, 0x5265c00L, PendingIntent.getBroadcast(a, 2, ((Intent) (obj)), 0x10000000));
        obj = new Intent();
        ((Intent) (obj)).setAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FORECASET");
        alarmmanager.setRepeating(0, l1 + 0x1b7740L, 0x5265c00L, PendingIntent.getBroadcast(a, 3, ((Intent) (obj)), 0x10000000));
    }

    static void h(ah ah1)
    {
        ah1.e();
    }

    private void i()
    {
        com.gtp.a.a.b.c.a("Remind Handler", "\u53D6\u6D88\u5B9A\u65F6\u5668");
        AlarmManager alarmmanager = (AlarmManager)a.getSystemService("alarm");
        Intent intent = new Intent();
        intent.setAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PREPARE_FORECASET_DATA");
        alarmmanager.cancel(PendingIntent.getBroadcast(a, 2, intent, 0x10000000));
        intent = new Intent();
        intent.setAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FORECASET");
        alarmmanager.cancel(PendingIntent.getBroadcast(a, 3, intent, 0x10000000));
    }

    static boolean i(ah ah1)
    {
        return ah1.m;
    }

    private int j()
    {
        i.setToNow();
        int i1 = i.hour;
        int j1 = i.minute;
        if (i1 >= 24 || i1 < 18 || i1 == 18 && j1 < 30)
        {
            return 1;
        }
        return i1 >= 24 || i1 < 19 ? 3 : 2;
    }

    static int j(ah ah1)
    {
        int i1 = ah1.l + 1;
        ah1.l = i1;
        return i1;
    }

    private boolean k()
    {
        long l1 = e.getLong("last_forecast_time", 0L);
        Time time = new Time();
        time.set(l1);
        i.setToNow();
        if (time.yearDay == i.yearDay && time.year == i.year)
        {
            com.gtp.a.a.b.c.a("Remind Handler", "\u4ECA\u5929\u5DF2\u7ECF\u89E6\u53D1\u8FC7\u9884\u62A5");
            return true;
        } else
        {
            com.gtp.a.a.b.c.a("Remind Handler", "\u4ECA\u5929\u6CA1\u89E6\u53D1\u8FC7\u9884\u62A5");
            return false;
        }
    }

    private boolean l()
    {
        long l1 = e.getLong("last_notify_time", 0L);
        Time time = new Time();
        time.set(l1);
        i.setToNow();
        if (time.yearDay == i.yearDay && time.year == i.year)
        {
            com.gtp.a.a.b.c.a("Remind Handler", "\u4ECA\u5929\u5DF2\u7ECF\u89E6\u53D1\u6E29\u5DEE\u63D0\u9192");
            return true;
        } else
        {
            com.gtp.a.a.b.c.a("Remind Handler", "\u4ECA\u5929\u672A\u89E6\u53D1\u6E29\u5DEE\u63D0\u9192");
            return false;
        }
    }

    private boolean m()
    {
        boolean flag;
        if (n)
        {
            if (k())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        if (o)
        {
            return flag && l();
        } else
        {
            return flag;
        }
    }

    private boolean n()
    {
        i.setToNow();
        long l1 = i.toMillis(true) - k;
        boolean flag;
        if (l1 < 0x1b7740L && l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.gtp.a.a.b.c.a("Remind Handler", (new StringBuilder()).append("\u4E0A\u6B21\u5237\u65B0\u6210\u529F\u65F6\u95F4\uFF1A").append(k).toString());
        com.gtp.a.a.b.c.a("Remind Handler", (new StringBuilder()).append("\u5F53\u524D\u65F6\u95F4\uFF1A").append(i.toMillis(true)).toString());
        return flag;
    }

    public void a()
    {
        boolean flag = false;
        u u1 = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext()).f().a();
        boolean flag1;
        if (u1.s == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        n = flag1;
        if (u1.u == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        o = flag1;
        if (o || n)
        {
            flag = true;
        }
        if (flag)
        {
            com.gtp.a.a.b.c.a("Remind Handler", "\u5F00\u5173\u6253\u5F00");
            d();
            return;
        } else
        {
            com.gtp.a.a.b.c.a("Remind Handler", "\u5F00\u5173\u5173\u95ED");
            c();
            return;
        }
    }

    public void b()
    {
        com.gtp.a.a.b.c.a("Remind Handler", "\u9500\u6BC1");
        if (c != null)
        {
            a.unregisterReceiver(c);
            c = null;
        }
        c();
    }
}
