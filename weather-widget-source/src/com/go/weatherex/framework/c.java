// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.util.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.framework:
//            b, d, a

public class c extends b
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private Context c;
    private com.gau.go.launcherex.gowidget.weather.c.c d;
    private f e;
    private com.go.weatherex.city.c f;
    private final BroadcastReceiver g = new d(this);

    public c(Context context)
    {
        c = context;
        d = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        e = d.h();
        f = com.go.weatherex.city.c.a();
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_VISIBILITY_UNIT");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PRESSURE_UNIT");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT");
        context.addAction("android.intent.action.TIME_SET");
        context.addAction("android.intent.action.TIME_TICK");
        context.addAction("android.intent.action.TIMEZONE_CHANGED");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION_FAILED");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE");
        context.addAction("android.intent.action.SCREEN_ON");
        context.addAction("android.intent.action.SCREEN_OFF");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_DONE");
        c.registerReceiver(g, context);
    }

    static Context a(c c1)
    {
        return c1.c;
    }

    static void a(c c1, boolean flag)
    {
        c1.d(flag);
    }

    static f b(c c1)
    {
        return c1.e;
    }

    static void c(c c1)
    {
        c1.f();
    }

    private void d(boolean flag)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).d(flag)) { }
        b.clear();
    }

    private void f()
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).e()) { }
        b.clear();
    }

    public void a()
    {
        c.unregisterReceiver(g);
    }

    protected void a(int i)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a(i)) { }
        b.clear();
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("WeatherChangeListener can not be null!");
        }
        if (a.contains(a1))
        {
            throw new IllegalStateException("WeatherChangeListener had register before, did you forget to unregister it?");
        } else
        {
            a.add(a1);
            return;
        }
    }

    protected void a(String s, String s1, ArrayList arraylist)
    {
        if (!TextUtils.isEmpty(s))
        {
            f.b(s);
        }
        f.b(s);
        b.addAll(a);
        a a1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a1.b(arraylist))
        {
            a1 = (a)iterator.next();
            a1.a(s, s1, e.a(s, arraylist));
        }

        b.clear();
    }

    protected void a(List list)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a(list)) { }
        b.clear();
    }

    protected void a(List list, int i, String s, ArrayList arraylist)
    {
        int k = arraylist.size();
        int j = i;
        if (!r.c(i, 0, k - 1))
        {
            j = k - 1;
        }
        s = (WeatherBean)arraylist.get(j);
        if (s != null)
        {
            s = s.c();
            f.b(s);
        }
        b.addAll(a);
        a a1;
        for (s = b.iterator(); s.hasNext(); a1.b(arraylist))
        {
            a1 = (a)s.next();
            a1.a(list, j);
        }

        b.clear();
    }

    protected void a(List list, w w)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a(list, w)) { }
        b.clear();
    }

    protected void a(boolean flag)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a(flag)) { }
        b.clear();
    }

    protected void a(boolean flag, String s, String s1)
    {
        b.addAll(a);
        byte byte0 = -1;
        int i = byte0;
        if (flag)
        {
            WeatherBean weatherbean = e.g();
            i = byte0;
            if (weatherbean != null)
            {
                i = weatherbean.q();
                f.b(weatherbean.c());
            }
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a(flag, s, s1, i)) { }
        b.clear();
    }

    protected void b()
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a()) { }
        b.clear();
    }

    protected void b(int i)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).b(i)) { }
        b.clear();
    }

    public void b(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("WeatherChangeListener can not be null!");
        }
        if (!a.contains(a1))
        {
            throw new IllegalStateException("WeatherChangeListener did not register before, do unregister the wrong one?");
        } else
        {
            a.remove(a1);
            return;
        }
    }

    protected void b(boolean flag)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).b(flag)) { }
        b.clear();
    }

    protected void c()
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).b()) { }
        b.clear();
    }

    protected void c(int i)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).c(i)) { }
        b.clear();
    }

    protected void c(boolean flag)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).c(flag)) { }
        b.clear();
    }

    protected void d()
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).c()) { }
        b.clear();
    }

    protected void d(int i)
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).d(i)) { }
        b.clear();
    }

    protected void e()
    {
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).d()) { }
        b.clear();
    }

    protected void e(int i)
    {
        d.g().d(i);
        b.addAll(a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).e(i)) { }
        b.clear();
    }
}
