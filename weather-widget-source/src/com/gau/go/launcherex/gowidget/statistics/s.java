// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.go.weatherex.ad.b.c;
import com.gtp.a.a.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            v, u

public final class s
{

    private static s d;
    private Context a;
    private AlarmManager b;
    private v c;

    private s(Context context)
    {
        a = context;
        b = (AlarmManager)context.getSystemService("alarm");
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.statistics.action_upload");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.statistics.action_load_ad");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.seven.action_ad_try");
        context.addAction("android.intent.action.TIME_SET");
        context.addAction("android.intent.action.TIMEZONE_CHANGED");
        context.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        c = new v(this, null);
        a.registerReceiver(c, context);
        d();
    }

    public static s a(Context context)
    {
        com/gau/go/launcherex/gowidget/statistics/s;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new s(context);
        }
        context = d;
        com/gau/go/launcherex/gowidget/statistics/s;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static void a(s s1, long l)
    {
        s1.c(l);
    }

    static void a(s s1, boolean flag)
    {
        s1.a(flag);
    }

    private void a(boolean flag)
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putBoolean("upload", flag).commit();
        }
    }

    static boolean a(s s1)
    {
        return s1.g();
    }

    static Context b(s s1)
    {
        return s1.a;
    }

    private String b(long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        l /= 1000L;
        stringbuilder.append(l / 3600L).append("\u5C0F\u65F6").append((l % 3600L) / 60L).append("\u5206\u949F").append(l % 60L).append("\u79D2");
        return stringbuilder.toString();
    }

    static void b(s s1, long l)
    {
        s1.d(l);
    }

    private void c(long l)
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putLong("upload_time", l).commit();
        }
    }

    static void c(s s1)
    {
        s1.i();
    }

    static long d(s s1)
    {
        return s1.h();
    }

    private void d()
    {
        j();
        k();
    }

    private void d(long l)
    {
        try
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append(b(l)).append("\u540E\u53D1\u9001\u4E0A\u4F20\u6570\u636E\u7684\u5E7F\u64AD").toString(), "statistics_log.txt");
            long l1 = System.currentTimeMillis();
            Object obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.statistics.action_upload");
            obj = PendingIntent.getBroadcast(a, 0, ((Intent) (obj)), 0x8000000);
            b.set(0, l1 + l, ((PendingIntent) (obj)));
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void e()
    {
        (new c(a)).a();
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("schedule_task", 0).edit();
        editor.putLong("load_brand_ad_time", System.currentTimeMillis());
        editor.commit();
    }

    static void e(s s1)
    {
        s1.e();
    }

    private void f()
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences.getLong("seven_try_key", 0L) == 0L)
        {
            return;
        } else
        {
            com.jiubang.golauncher.purchase.sevendaypurchase.a.a(true);
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putLong("seven_try_key", System.currentTimeMillis());
            editor.commit();
            sharedpreferences.edit().putBoolean("seven_try_verification", true).commit();
            return;
        }
    }

    static void f(s s1)
    {
        s1.j();
    }

    static void g(s s1)
    {
        s1.f();
    }

    private boolean g()
    {
        boolean flag = false;
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences != null)
        {
            flag = sharedpreferences.getBoolean("upload", false);
        }
        return flag;
    }

    private long h()
    {
        long l = 0L;
        SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences != null)
        {
            l = sharedpreferences.getLong("upload_time", 0L);
        }
        return l;
    }

    static void h(s s1)
    {
        s1.k();
    }

    private void i()
    {
        (new u(this)).execute(new Void[0]);
    }

    private void j()
    {
        long l2 = 0L;
        long l4 = a.getSharedPreferences("schedule_task", 0).getLong("load_brand_ad_time", 0L);
        long l;
        l = l4;
        if (l4 > 0L)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        e();
        l = System.currentTimeMillis();
        l4 = System.currentTimeMillis() - l;
        long l1 = l2;
        if (l4 >= 0L)
        {
            l1 = l2;
            if (l4 <= 0xdbba00L)
            {
                l1 = 0xdbba00L - l4;
            }
        }
        try
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append(b(l1)).append("\u540E\u53D1\u9001\u8BF7\u6C42\u5E7F\u544A\u6570\u636E\u7684\u5E7F\u64AD").toString(), "statistics_log.txt");
            long l3 = System.currentTimeMillis();
            Object obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.statistics.action_load_ad");
            obj = PendingIntent.getBroadcast(a, 0, ((Intent) (obj)), 0x8000000);
            b.set(0, l1 + l3, ((PendingIntent) (obj)));
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return;
    }

    private void k()
    {
        long l1 = 0L;
        SharedPreferences sharedpreferences;
        sharedpreferences = a.getSharedPreferences("schedule_task", 0);
        if (sharedpreferences.getBoolean("seven_try_verification", false))
        {
            return;
        }
        long l = sharedpreferences.getLong("seven_try_key", 0L);
        if (l == 0L)
        {
            try
            {
                l = System.currentTimeMillis();
                Object obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.seven.action_ad_try");
                obj = PendingIntent.getBroadcast(a, 0, ((Intent) (obj)), 0x8000000);
                b.set(0, l + 0x5265c00L, ((PendingIntent) (obj)));
                return;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            return;
        }
        long l3 = System.currentTimeMillis() - l;
        l = l1;
        if (l3 >= 0L)
        {
            l = l1;
            if (l3 <= 0x240c8400L)
            {
                l = 0x240c8400L - l3;
            }
        }
        long l2 = System.currentTimeMillis();
        Object obj1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.seven.action_ad_try");
        obj1 = PendingIntent.getBroadcast(a, 0, ((Intent) (obj1)), 0x8000000);
        b.set(0, l + l2, ((PendingIntent) (obj1)));
        return;
    }

    public void a()
    {
        d(0x2bf20L);
    }

    public void a(long l)
    {
        d(l);
    }

    public void b()
    {
        try
        {
            SharedPreferences sharedpreferences = a.getSharedPreferences("schedule_task", 0);
            long l = System.currentTimeMillis();
            sharedpreferences.edit().putLong("schedule_task", l);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        a.unregisterReceiver(c);
        d = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
