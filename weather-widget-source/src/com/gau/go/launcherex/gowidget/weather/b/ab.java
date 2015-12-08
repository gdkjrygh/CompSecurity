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
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.jiubang.core.b.a;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.f;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ac, ad

public class ab
{

    private static ab a;
    private AlarmManager b;
    private PendingIntent c;
    private Context d;
    private BroadcastReceiver e;

    private ab(Context context)
    {
        e = new ac(this);
        d = context;
        b = (AlarmManager)context.getSystemService("alarm");
        c = PendingIntent.getBroadcast(context, 0, new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHECK_NEW_VERSION"), 0x8000000);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHECK_NEW_VERSION");
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(e, intentfilter);
    }

    static Context a(ab ab1)
    {
        return ab1.d;
    }

    public static ab a(Context context)
    {
        if (a == null)
        {
            a = new ab(context);
        }
        return a;
    }

    private void a(long l)
    {
        long l1 = System.currentTimeMillis();
        Object obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHECK_NEW_VERSION");
        obj = PendingIntent.getBroadcast(d, 0, ((Intent) (obj)), 0);
        b.set(0, l1 + l, ((PendingIntent) (obj)));
    }

    static void a(ab ab1, boolean flag)
    {
        ab1.a(flag);
    }

    private void a(boolean flag)
    {
        SharedPreferences sharedpreferences = GoWidgetApplication.c(d.getApplicationContext()).a();
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putBoolean("check_version_network_ok", flag).commit();
        }
    }

    static PendingIntent b(ab ab1)
    {
        return ab1.c;
    }

    private void b(long l)
    {
        SharedPreferences sharedpreferences = GoWidgetApplication.c(d.getApplicationContext()).a();
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putLong("last_version_update_time", l).commit();
        }
    }

    private long c()
    {
        long l = 0L;
        SharedPreferences sharedpreferences;
        if (GoWidgetApplication.c(d.getApplicationContext()) != null)
        {
            sharedpreferences = GoWidgetApplication.c(d.getApplicationContext()).a();
        } else
        {
            sharedpreferences = d.getSharedPreferences("goweatherex_info", 0);
        }
        if (sharedpreferences != null)
        {
            l = sharedpreferences.getLong("last_version_update_time", 0L);
        }
        return l;
    }

    static AlarmManager c(ab ab1)
    {
        return ab1.b;
    }

    private void d()
    {
        long l = 0xf731400L;
        long l1 = System.currentTimeMillis();
        long l2 = c();
        if (l2 == 0L || l1 - l2 >= 0xf731400L || l1 - l2 <= 0L)
        {
            (new ad(this, null)).execute(new String[0]);
            b(l1);
        } else
        {
            l = 0xf731400L - (l1 - l2);
        }
        a(l);
    }

    static void d(ab ab1)
    {
        ab1.d();
    }

    private boolean e()
    {
        boolean flag = false;
        SharedPreferences sharedpreferences = GoWidgetApplication.c(d.getApplicationContext()).a();
        if (sharedpreferences != null)
        {
            flag = sharedpreferences.getBoolean("check_version_network_ok", false);
        }
        return flag;
    }

    static boolean e(ab ab1)
    {
        return ab1.e();
    }

    public String a(int i, String s, int j, int k)
    {
        Object obj1 = com.gau.go.launcherex.gowidget.language.e.a(d).b();
        if (!"zh".equals(obj1)) goto _L2; else goto _L1
_L1:
        Object obj = String.format("%s-%s", new Object[] {
            obj1, com.gau.go.launcherex.gowidget.language.e.a(d).e()
        });
_L4:
        obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append("http://imupdate.3g.cn:8888/versions/check?");
        ((StringBuilder) (obj1)).append("p=");
        ((StringBuilder) (obj1)).append(42);
        ((StringBuilder) (obj1)).append("&bn=");
        ((StringBuilder) (obj1)).append(248);
        ((StringBuilder) (obj1)).append("&v=");
        ((StringBuilder) (obj1)).append(s);
        if (obj != null)
        {
            ((StringBuilder) (obj1)).append("&lang=");
            ((StringBuilder) (obj1)).append(((String) (obj)));
        }
        ((StringBuilder) (obj1)).append("&channel=");
        ((StringBuilder) (obj1)).append(w.f(d));
        ((StringBuilder) (obj1)).append("&type=");
        ((StringBuilder) (obj1)).append(k);
        ((StringBuilder) (obj1)).append("&vc=");
        ((StringBuilder) (obj1)).append(j);
        obj1 = ((StringBuilder) (obj1)).toString();
        s = null;
        j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            j++;
            obj = com.jiubang.goweather.b.d.a().b(((String) (obj1)), new com.jiubang.goweather.b.e(((String) (obj1)), "GET"), new f());
            s = ((String) (obj));
            if (obj == null)
            {
                continue;
            }
            s = ((String) (obj));
            break;
        } while (true);
        return s;
_L2:
        if ("en".equals(obj1))
        {
            String s1 = com.gau.go.launcherex.gowidget.language.e.a(d).e();
            obj = obj1;
            if (s1.equals("US"))
            {
                obj = String.format("%s-%s", new Object[] {
                    obj1, s1
                });
            }
        } else
        {
            obj = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a()
    {
        if (!g.a(d))
        {
            Object obj;
            if (GoWidgetApplication.c(d.getApplicationContext()) != null)
            {
                obj = GoWidgetApplication.c(d.getApplicationContext()).a();
            } else
            {
                obj = d.getSharedPreferences("goweatherex_info", 0);
            }
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("check_version_network_ok", true);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            return;
        } else
        {
            d();
            return;
        }
    }

    public void b()
    {
        d.unregisterReceiver(e);
        b.cancel(c);
        a = null;
    }
}
