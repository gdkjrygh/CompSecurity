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
import android.text.format.Time;
import com.gau.go.a.e;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.b.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            m, l, c, w, 
//            k

public class i
{

    private static volatile i a;
    private Context b;
    private AlarmManager c;
    private m d;
    private ExecutorService e;

    private i(Context context)
    {
        b = context;
        c = (AlarmManager)context.getSystemService("alarm");
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.statistics.network_time_and_status_upload");
        context.addAction("android.intent.action.TIME_SET");
        context.addAction("android.intent.action.TIMEZONE_CHANGED");
        context.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        d = new m(this, null);
        b.registerReceiver(d, context);
        e = Executors.newFixedThreadPool(1);
    }

    public static i a(Context context)
    {
        com/gau/go/launcherex/gowidget/statistics/i;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new i(context);
        }
        context = a;
        com/gau/go/launcherex/gowidget/statistics/i;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a()
    {
        e.execute(new l(this));
    }

    static void a(i j, long l1)
    {
        j.b(l1);
    }

    static void a(i j, boolean flag)
    {
        j.a(flag);
    }

    private void a(boolean flag)
    {
        SharedPreferences sharedpreferences = b.getSharedPreferences("network_time_and_status_schedule_task", 0);
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putBoolean("network_time_and_status_schedule_upload", flag).commit();
        }
    }

    static boolean a(i j)
    {
        return j.b();
    }

    static Context b(i j)
    {
        return j.b;
    }

    private void b(long l1)
    {
        SharedPreferences sharedpreferences = b.getSharedPreferences("network_time_and_status_schedule_task", 0);
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putLong("network_time_and_status_schedule_upload_time", l1).commit();
        }
    }

    static void b(i j, long l1)
    {
        j.c(l1);
    }

    private boolean b()
    {
        boolean flag = false;
        SharedPreferences sharedpreferences = b.getSharedPreferences("network_time_and_status_schedule_task", 0);
        if (sharedpreferences != null)
        {
            flag = sharedpreferences.getBoolean("network_time_and_status_schedule_upload", false);
        }
        return flag;
    }

    private long c()
    {
        long l1 = 0L;
        SharedPreferences sharedpreferences = b.getSharedPreferences("network_time_and_status_schedule_task", 0);
        if (sharedpreferences != null)
        {
            l1 = sharedpreferences.getLong("network_time_and_status_schedule_upload_time", 0L);
        }
        return l1;
    }

    private void c(long l1)
    {
        try
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append(d(l1)).append("\u540E\u53D1\u9001\u4E0A\u4F20\u6570\u636E\u7684\u5E7F\u64AD").toString(), "statistics_log.txt");
            com.gtp.a.a.b.c.a("CYN", (new StringBuilder()).append(d(l1)).append("\u540E\u53D1\u9001\u4E0A\u4F20\u6570\u636E\u7684\u5E7F\u64AD").toString());
            long l2 = System.currentTimeMillis();
            Object obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.statistics.network_time_and_status_upload");
            obj = PendingIntent.getBroadcast(b, 0, ((Intent) (obj)), 0x8000000);
            c.set(0, l2 + l1, ((PendingIntent) (obj)));
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    static void c(i j)
    {
        j.a();
    }

    private String d()
    {
        Time time = new Time("Asia/Shanghai");
        time.setToNow();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(time.year);
        stringbuilder.append('-');
        stringbuilder.append(time.month + 1);
        stringbuilder.append('-');
        stringbuilder.append(time.monthDay);
        stringbuilder.append(' ');
        stringbuilder.append(time.hour);
        stringbuilder.append(':');
        stringbuilder.append(time.minute);
        stringbuilder.append(':');
        stringbuilder.append(time.second);
        stringbuilder.append(' ');
        stringbuilder.append(time.gmtoff);
        return stringbuilder.toString();
    }

    private String d(long l1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        l1 /= 1000L;
        stringbuilder.append(l1 / 3600L).append("\u5C0F\u65F6").append((l1 % 3600L) / 60L).append("\u5206\u949F").append(l1 % 60L).append("\u79D2");
        return stringbuilder.toString();
    }

    static void d(i j)
    {
        j.e();
    }

    static long e(i j)
    {
        return j.c();
    }

    private void e()
    {
        com.gau.go.launcherex.gowidget.statistics.c.a(b, 1, null);
    }

    public void a(long l1)
    {
        c(l1);
    }

    public void a(f f1)
    {
        byte byte0 = 1;
        this;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("26||");
        stringbuilder.append((new StringBuilder()).append(android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id")).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(d()).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(com.gau.go.a.e.b(b)).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(w.n(b)).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(com.gau.go.launcherex.gowidget.statistics.w.f(b)).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(com.gau.go.launcherex.gowidget.statistics.w.c(b)).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(f1.f()).append("||").toString());
        if (f1.c() != 1 && f1.c() != 2) goto _L2; else goto _L1
_L4:
        stringbuilder.append((new StringBuilder()).append(byte0).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(f1.b()).append("||").toString());
        com.gtp.a.a.b.c.a("NetworkStatistics", (new StringBuilder()).append("\u8BF7\u6C42\u65F6\u95F4 - ").append(f1.d()).toString());
        stringbuilder.append((new StringBuilder()).append(f1.d()).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(f1.g()).append("||").toString());
        stringbuilder.append((new StringBuilder()).append(f1.i()).append("||").toString());
        stringbuilder.append("0||");
        stringbuilder.append("0||");
        stringbuilder.append(f1.k());
        f1 = stringbuilder.toString();
        com.gtp.a.a.a.a.a().a(f1, "weather_statistics_log.txt");
        e.execute(new k(this, f1, "network_time_and_status_statistics.txt", b));
        e.execute(new k(this, f1, "network_time_and_status_statistics_email.txt", b));
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j = f1.e();
        switch (j)
        {
        case 6: // '\006'
            if (false)
            {
            }
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 9: // '\t'
        case 11: // '\013'
        default:
            byte0 = 100;
            break;

        case 7: // '\007'
            byte0 = 2;
            break;

        case 8: // '\b'
            byte0 = 3;
            break;

        case 0: // '\0'
            byte0 = 4;
            break;

        case -1: 
            byte0 = 5;
            break;

        case 10: // '\n'
            byte0 = 6;
            break;

        case 12: // '\f'
            byte0 = 7;
            break;
        }
        continue; /* Loop/switch isn't completed */
        f1;
        throw f1;
_L1:
        byte0 = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s)
    {
        e.execute(new k(this, s, "collect_data_weather_refresh_error_info.txt", b));
    }
}
