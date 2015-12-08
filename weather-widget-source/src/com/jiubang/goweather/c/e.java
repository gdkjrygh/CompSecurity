// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Looper;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.go.weatherex.g.r;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.goweather.c:
//            f, g, j, h, 
//            l

public class e
{

    private static e a;
    private final j b;
    private final List c;
    private Location d;
    private CityBean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private Context i;
    private BroadcastReceiver j;
    private l k;

    private e(Context context)
    {
        j = new f(this);
        k = new g(this);
        if (!c())
        {
            throw new IllegalStateException("should call on UI thread...");
        } else
        {
            i = context.getApplicationContext();
            c = new ArrayList();
            b = new j(i);
            b.a(k);
            context = new IntentFilter();
            context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
            i.registerReceiver(j, context);
            return;
        }
    }

    static CityBean a(e e1, CityBean citybean)
    {
        e1.e = citybean;
        return citybean;
    }

    public static e a(Context context)
    {
        if (a == null)
        {
            a = new e(context.getApplicationContext());
        }
        return a;
    }

    private void a(int l)
    {
        com.gtp.a.a.b.c.a("GwLocationManager", (new StringBuilder()).append("\u5B9A\u4F4D\u7ECF\u7EAC\u5EA6\u5931\u8D25, state code: ").append(l).toString());
        r.a(i, false, (new StringBuilder()).append("location latlng failed, state code: ").append(l).toString());
        f = false;
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((h)iterator.next()).b(l)) { }
        if (h)
        {
            h = false;
            b(l);
        }
    }

    private void a(CityBean citybean)
    {
        com.gtp.a.a.b.c.a("GwLocationManager", (new StringBuilder()).append("\u5B9A\u4F4D\u57CE\u5E02\u6210\u529F: ").append(citybean.l()).toString());
        g = false;
        e = citybean;
        Object obj = new ArrayList(c);
        citybean = e.n();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((h)((Iterator) (obj)).next()).a(citybean)) { }
    }

    static void a(e e1, int l)
    {
        e1.b(l);
    }

    static void a(e e1, Location location)
    {
        e1.b(location);
    }

    private boolean a(Location location)
    {
        while (e == null || d == null || location == null) 
        {
            return false;
        }
        if (a(d, location))
        {
            e = null;
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean a(Location location, Location location1)
    {
        float af[] = new float[2];
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), location1.getLatitude(), location1.getLongitude(), af);
        com.gtp.a.a.b.c.a("GwLocationManager", (new StringBuilder()).append("\u4E24\u6B21\u5B9A\u4F4D\u7684\u8DDD\u79BB\u662F:").append(af[0]).append("m , bearing: ").append(af[1]).toString());
        return af[0] > 200F;
    }

    private void b(int l)
    {
        com.gtp.a.a.b.c.a("GwLocationManager", (new StringBuilder()).append("\u5B9A\u4F4D\u57CE\u5E02\u5931\u8D25, state code: ").append(l).toString());
        g = false;
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((h)iterator.next()).a(l)) { }
    }

    private void b(Location location)
    {
label0:
        {
            com.gtp.a.a.b.c.a("GwLocationManager", (new StringBuilder()).append("\u5B9A\u4F4D\u7ECF\u7EAC\u5EA6\u6210\u529F: ").append(location.getLatitude()).append(",").append(location.getLongitude()).toString());
            f = false;
            boolean flag = a(location);
            d = location;
            Object obj = new ArrayList(c);
            location = new Location(d);
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((h)((Iterator) (obj)).next()).a(location)) { }
            if (h)
            {
                h = false;
                if (!flag)
                {
                    break label0;
                }
                a(e);
            }
            return;
        }
        b.a(d);
    }

    static void b(e e1, int l)
    {
        e1.a(l);
    }

    static void b(e e1, CityBean citybean)
    {
        e1.a(citybean);
    }

    private static boolean c()
    {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    private boolean d()
    {
        boolean flag = true;
        if (e == null || !e())
        {
            flag = false;
        }
        return flag;
    }

    private boolean e()
    {
        while (d == null || System.currentTimeMillis() - d.getTime() > 0xdbba0L) 
        {
            return false;
        }
        return true;
    }

    public void a()
    {
        if (f)
        {
            return;
        }
        f = true;
        if (e())
        {
            b(d);
            return;
        } else
        {
            b.a();
            return;
        }
    }

    public void a(h h1)
    {
        if (h1 != null && !c.contains(h1))
        {
            c.add(h1);
        }
    }

    public void b()
    {
        if (g)
        {
            return;
        }
        g = true;
        if (d())
        {
            a(e);
            return;
        } else
        {
            h = true;
            a();
            return;
        }
    }

    public void b(h h1)
    {
        if (h1 != null)
        {
            c.remove(h1);
        }
    }
}
