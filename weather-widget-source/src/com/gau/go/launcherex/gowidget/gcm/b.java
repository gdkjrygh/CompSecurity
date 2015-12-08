// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.gcm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.jiubang.core.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.gau.go.launcherex.gowidget.gcm:
//            c, e, d

public class b
{

    private static b a;
    private ArrayList b;
    private Context c;
    private boolean d;
    private AlarmManager e;
    private PendingIntent f;
    private boolean g;
    private BroadcastReceiver h;

    private b(Context context)
    {
        d = false;
        h = new c(this);
        if (w.s(context))
        {
            c = context;
            b = new ArrayList();
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GCM_OPERATION");
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GCM_UPDATE_REG_ID");
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LAUNCH_GCM_TASKS");
            intentfilter.addAction("android.intent.action.LOCALE_CHANGED");
            context.registerReceiver(h, intentfilter);
            e = (AlarmManager)context.getSystemService("alarm");
            f = PendingIntent.getBroadcast(context, 0, new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LAUNCH_GCM_TASKS"), 0x8000000);
            g = true;
            return;
        } else
        {
            g = false;
            return;
        }
    }

    static Context a(b b1)
    {
        return b1.c;
    }

    public static b a(Context context)
    {
        if (a == null)
        {
            a = new b(context);
        }
        return a;
    }

    static void a(b b1, e e1)
    {
        b1.a(e1);
    }

    private void a(e e1)
    {
        b.remove(e1);
        if (b.size() > 0)
        {
            if (com.gau.go.launcherex.gowidget.c.g.a(c))
            {
                e1 = (e)b.get(0);
                if (e1.b == 1 || e1.b == 3)
                {
                    for (; b.size() > 1; b.remove(1)) { }
                    if (e1.b == 1)
                    {
                        e1 = new Intent("com.google.android.c2dm.intent.REGISTER");
                        e1.putExtra("app", PendingIntent.getBroadcast(c, 0, new Intent(), 0));
                        e1.putExtra("sender", "535733622764");
                        c.startService(e1);
                    } else
                    {
                        (new d(this)).execute(new e[] {
                            e1
                        });
                    }
                } else
                if (e1.b == 2)
                {
                    (new d(this)).execute(new e[] {
                        e1
                    });
                } else
                {
                    e1 = g();
                    (new d(this)).execute(new e[] {
                        e1
                    });
                }
                d = true;
                return;
            } else
            {
                d = false;
                return;
            }
        } else
        {
            d = false;
            return;
        }
    }

    static boolean a(b b1, boolean flag)
    {
        b1.d = flag;
        return flag;
    }

    static ArrayList b(b b1)
    {
        return b1.b;
    }

    static void c(b b1)
    {
        b1.j();
    }

    static PendingIntent d(b b1)
    {
        return b1.f;
    }

    private boolean d()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (g)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(GoWidgetApplication.c(c.getApplicationContext()).a().getString("gcm_cur_reg_id", null)))
            {
                flag = true;
            }
        }
        return flag;
    }

    static AlarmManager e(b b1)
    {
        return b1.e;
    }

    private String e()
    {
        return c.getResources().getConfiguration().locale.getCountry();
    }

    static String f(b b1)
    {
        return b1.e();
    }

    private void f()
    {
        d = false;
        g = false;
        e.cancel(f);
        c.unregisterReceiver(h);
    }

    private e g()
    {
        int k;
        int l;
        l = b.size();
        k = 0;
_L3:
        e e1;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        e1 = (e)b.get(k);
        if (e1.b != 6) goto _L2; else goto _L1
_L1:
        if (e1 != null)
        {
            e1.a = h();
            b.clear();
            b.add(e1);
        }
        return (e)b.get(0);
_L2:
        k++;
          goto _L3
        e1 = null;
          goto _L1
    }

    private String h()
    {
        String s2 = GoWidgetApplication.c(c.getApplicationContext()).a().getString("gcm_cur_reg_id", null);
        ArrayList arraylist = i();
        int k = arraylist.size();
        String s = "";
        String s1 = s;
        if (k > 0)
        {
            int i1 = k - 1;
            for (int l = 0; l < i1; l++)
            {
                s = (new StringBuilder()).append(s).append((String)arraylist.get(l)).toString();
                s = (new StringBuilder()).append(s).append(",").toString();
            }

            s1 = (new StringBuilder()).append(s).append((String)arraylist.get(i1)).toString();
        }
        return (new StringBuilder()).append("http://goweathergcm.goforandroid.com:8099/gcmServer/alarm/city/sync?cityIds=").append(s1).append("&").append("regId").append("=").append(s2).toString();
    }

    private ArrayList i()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = com.gau.go.launcherex.gowidget.weather.util.f.a(c).c().entrySet().iterator(); iterator.hasNext(); arraylist.add(((WeatherBean)((java.util.Map.Entry)iterator.next()).getValue()).c())) { }
        return arraylist;
    }

    private void j()
    {
        e.cancel(f);
        e.setRepeating(0, System.currentTimeMillis() + 0x493e0L, 0x493e0L, f);
    }

    public void a()
    {
        Object obj;
        if (d || b.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj = (e)b.get(0);
        if (((e) (obj)).b != 1 && ((e) (obj)).b != 3)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        for (; b.size() > 1; b.remove(1)) { }
        if (((e) (obj)).b != 1)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        d = true;
        obj = new Intent("com.google.android.c2dm.intent.REGISTER");
        ((Intent) (obj)).putExtra("app", PendingIntent.getBroadcast(c, 0, new Intent(), 0));
        ((Intent) (obj)).putExtra("sender", "535733622764");
        c.startService(((Intent) (obj)));
        return;
        obj;
        ((Exception) (obj)).printStackTrace();
        f();
        return;
        (new d(this)).execute(new e[] {
            obj
        });
        d = true;
        return;
        if (((e) (obj)).b == 2)
        {
            (new d(this)).execute(new e[] {
                obj
            });
            return;
        } else
        {
            e e1 = g();
            (new d(this)).execute(new e[] {
                e1
            });
            d = true;
            return;
        }
    }

    public void a(String s)
    {
        if (d())
        {
            Object obj = GoWidgetApplication.c(c.getApplicationContext()).a();
            ((SharedPreferences) (obj)).edit().putBoolean("city_list_changed", true).commit();
            obj = ((SharedPreferences) (obj)).getString("gcm_cur_reg_id", null);
            s = new e(this, (new StringBuilder()).append("http://goweathergcm.goforandroid.com:8099/gcmServer/alarm/city/delete?cityId=").append(s).append("&").append("regId").append("=").append(((String) (obj))).toString(), 5);
            b.add(s);
            if (!d)
            {
                e.cancel(f);
                if (com.gau.go.launcherex.gowidget.c.g.a(c))
                {
                    s = g();
                    d = true;
                    (new d(this)).execute(new e[] {
                        s
                    });
                }
            }
        }
    }

    public void a(String s, String s1, boolean flag)
    {
        s1 = (new StringBuilder()).append("http://goweathergcm.goforandroid.com:8099/gcmServer/alarm/updateReg?oldRegId=").append(s1).append("&").append("newRegId").append("=").append(s).append("&").append("lang").append("=").append(w.k(c)).append("&").append("region").append("=").append(e()).append("&").append("is_paid_user").append("=");
        int k;
        if (GoWidgetApplication.b(c).b())
        {
            k = 1;
        } else
        {
            k = 0;
        }
        s1 = new e(this, s1.append(k).toString(), 2);
        s1.c = s;
        s1.d = flag;
        if (!d)
        {
            e.cancel(f);
            b.add(0, s1);
            if (com.gau.go.launcherex.gowidget.c.g.a(c))
            {
                d = true;
                (new d(this)).execute(new e[] {
                    (e)b.get(0)
                });
            }
            return;
        } else
        {
            b.add(0, s1);
            return;
        }
    }

    public void b()
    {
        if (b.size() <= 0) goto _L2; else goto _L1
_L1:
        e e1 = (e)b.get(0);
        if (e1.b != 1 && e1.b != 2) goto _L2; else goto _L3
_L3:
        return;
_L2:
        e e2 = new e(this, 6);
        b.add(e2);
        if (!d)
        {
            e.cancel(f);
            b.clear();
            b.add(e2);
            if (com.gau.go.launcherex.gowidget.c.g.a(c))
            {
                e2.a = h();
                d = true;
                (new d(this)).execute(new e[] {
                    e2
                });
                return;
            }
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    public void b(String s)
    {
        if (d())
        {
            Object obj = GoWidgetApplication.c(c.getApplicationContext()).a();
            ((SharedPreferences) (obj)).edit().putBoolean("city_list_changed", true).commit();
            obj = ((SharedPreferences) (obj)).getString("gcm_cur_reg_id", null);
            s = new e(this, (new StringBuilder()).append("http://goweathergcm.goforandroid.com:8099/gcmServer/alarm/city/add?cityIds=").append(s).append("&").append("regId").append("=").append(((String) (obj))).toString(), 4);
            b.add(s);
            if (!d)
            {
                e.cancel(f);
                if (com.gau.go.launcherex.gowidget.c.g.a(c))
                {
                    s = g();
                    d = true;
                    (new d(this)).execute(new e[] {
                        s
                    });
                }
            }
        }
    }

    public void c()
    {
        Object obj;
        if (d)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        e.cancel(f);
        b.clear();
        obj = new e(this, 1);
        b.add(obj);
        if (!com.gau.go.launcherex.gowidget.c.g.a(c))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        d = true;
        obj = new Intent("com.google.android.c2dm.intent.REGISTER");
        ((Intent) (obj)).putExtra("app", PendingIntent.getBroadcast(c, 0, new Intent(), 0));
        ((Intent) (obj)).putExtra("sender", "535733622764");
        c.startService(((Intent) (obj)));
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        f();
        return;
        e e1 = new e(this, 1);
        b.add(0, e1);
        return;
    }
}
