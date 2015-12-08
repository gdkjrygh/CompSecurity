// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.messagecenter.a.b;
import com.jiubang.core.b.a;

// Referenced classes of package com.go.weatherex.wear:
//            d, e, f, WearService, 
//            b

public class c
{

    private static c b;
    private Context a;
    private SharedPreferences c;
    private e d;
    private AlarmManager e;
    private PendingIntent f;
    private Handler g;

    private c(Context context)
    {
        g = new d(this);
        a = context.getApplicationContext();
        c = GoWidgetApplication.c(a).a();
        d();
        e();
    }

    static Handler a(c c1)
    {
        return c1.g;
    }

    private Time a(Time time)
    {
        Time time1 = new Time();
        time1.set(0, 0, 8, time.monthDay, time.month, time.year);
        return time1;
    }

    public static c a(Context context)
    {
        if (b == null)
        {
            b = new c(context);
        }
        return b;
    }

    private Time b(Time time)
    {
        Time time1 = new Time();
        time1.set(0, 30, 9, time.monthDay, time.month, time.year);
        return time1;
    }

    private Time c(Time time)
    {
        Time time1 = new Time();
        time1.set(0, 0, 20, time.monthDay, time.month, time.year);
        return time1;
    }

    private Time d(Time time)
    {
        Time time1 = new Time();
        time1.set(0, 30, 21, time.monthDay, time.month, time.year);
        return time1;
    }

    private void d()
    {
        e = (AlarmManager)a.getSystemService("alarm");
        Intent intent = new Intent("com.go.weatherex.wear.ACTION_WEAR_WEATHER_CARD");
        f = PendingIntent.getBroadcast(a, 0, intent, 0x8000000);
    }

    private void e()
    {
        d = new e(this, null);
        a.registerReceiver(d, new IntentFilter("com.go.weatherex.wear.ACTION_WEAR_WEATHER_CARD"));
    }

    private boolean f()
    {
        return i().equals(h());
    }

    private boolean g()
    {
        return j().equals(h());
    }

    private String h()
    {
        return com.gau.go.launcherex.gowidget.messagecenter.a.b.a(System.currentTimeMillis(), "yyyy-MM-dd");
    }

    private String i()
    {
        String s = c.getString("key_wear_today_weather_card", "none");
        com.go.weatherex.wear.f.a((new StringBuilder()).append("WearNotificationManager - \u4E0A\u6B21\u53D1\u65E9\u4E0A\u5361\u7247\u7684\u65E5\u671F : ").append(s).toString());
        return s;
    }

    private String j()
    {
        String s = c.getString("key_wear_tomorrow_weather_card", "none");
        com.go.weatherex.wear.f.a((new StringBuilder()).append("WearNotificationManager - \u4E0A\u6B21\u53D1\u665A\u4E0A\u5361\u7247\u7684\u65E5\u671F : ").append(s).toString());
        return s;
    }

    private void k()
    {
        a.startService((new Intent(a, com/go/weatherex/wear/WearService)).putExtra("notification_type_key", "/data/weather/today"));
    }

    private void l()
    {
        a.startService((new Intent(a, com/go/weatherex/wear/WearService)).putExtra("notification_type_key", "/data/weather/tomorrow"));
    }

    private boolean m()
    {
        Time time = new Time();
        time.setToNow();
        Time time1 = a(time);
        Time time2 = b(time);
        StringBuilder stringbuilder = (new StringBuilder()).append("WearNotificationManager - isMorining : after 8 :");
        boolean flag;
        if (Time.compare(time, time1) >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = stringbuilder.append(flag).append(" : before 9 :");
        if (Time.compare(time, time2) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.go.weatherex.wear.f.a(stringbuilder.append(flag).toString());
        return Time.compare(time, time1) >= 0 && Time.compare(time, time2) <= 0;
    }

    private boolean n()
    {
        Time time = new Time();
        time.setToNow();
        Time time1 = c(time);
        Time time2 = d(time);
        StringBuilder stringbuilder = (new StringBuilder()).append("WearNotificationManager - isNight : after 8 :");
        boolean flag;
        if (Time.compare(time, time1) >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = stringbuilder.append(flag).append(" : before 9 :");
        if (Time.compare(time, time2) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.go.weatherex.wear.f.a(stringbuilder.append(flag).toString());
        return Time.compare(time, time1) >= 0 && Time.compare(time, time2) <= 0;
    }

    private long o()
    {
        Time time = new Time();
        time.setToNow();
        Time time1 = a(time);
        Time time2 = c(time);
        if (time.before(time1))
        {
            return time1.toMillis(false);
        }
        if (time.before(b(time)) && !f())
        {
            return time.toMillis(false) + 0xdbba0L;
        }
        if (time.before(time2))
        {
            return time2.toMillis(false);
        }
        if (time.before(d(time)) && !g())
        {
            return time.toMillis(false) + 0xdbba0L;
        } else
        {
            return time1.toMillis(false) + 0x5265c00L;
        }
    }

    public void a()
    {
        com.go.weatherex.wear.f.a("WearNotificationManager - managerWearCard");
        if (TextUtils.isEmpty(com.go.weatherex.wear.b.a(a).a()))
        {
            com.go.weatherex.wear.f.a("WearNotificationManager - no city");
            return;
        }
        com.go.weatherex.wear.f.a((new StringBuilder()).append("WearNotificationManager - managerWearCard \u5F53\u524D\u65E5\u671F : ").append(h()).toString());
        if (!m() || f()) goto _L2; else goto _L1
_L1:
        com.go.weatherex.wear.f.a("WearNotificationManager - \u7B26\u5408\u53D1\u65E9\u4E0A\u5361\u7247\u7684\u6761\u4EF6 : 1.\u4ECA\u5929\u6CA1\u53D1\u8FC7\uFF0C\uFF12.\u5929\u6C14\u5E94\u7528\u5DF2\u6253\u5F00, 3.\u6709\u6307\u5B9A\u57CE\u5E02; \u4F46\u4E0D\u4FDD\u8BC1\u624B\u8868\u8FDE\u63A5");
        k();
_L4:
        e.set(0, o(), f);
        return;
_L2:
        if (n() && !g())
        {
            com.go.weatherex.wear.f.a("WearNotificationManager - \u7B26\u5408\u53D1\u665A\u4E0A\u5361\u7247\u7684\u6761\u4EF6 : 1.\u4ECA\u5929\u6CA1\u53D1\u8FC7\uFF0C\uFF12.\u5929\u6C14\u5E94\u7528\u5DF2\u6253\u5F00, 3.\u6709\u6307\u5B9A\u57CE\u5E02; \u4F46\u4E0D\u4FDD\u8BC1\u624B\u8868\u8FDE\u63A5");
            l();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("key_wear_today_weather_card", h());
        editor.commit();
    }

    public void c()
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("key_wear_tomorrow_weather_card", h());
        editor.commit();
    }
}
