// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.Context;
import android.os.Handler;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            b, c

public class a
{

    ConcurrentHashMap a;
    private int b;
    private ExecutorService c;
    private String d;
    private Handler e;
    private Context f;
    private com.gau.go.launcherex.goweather.livewallpaper.b.c g;
    private int h;
    private boolean i;
    private boolean j;

    public a(Context context, com.gau.go.launcherex.goweather.livewallpaper.b.c c1)
    {
        f = context;
        g = c1;
        d = f.getPackageName();
        c();
        a = new ConcurrentHashMap();
        c = Executors.newCachedThreadPool();
        h = 0;
        i = true;
        j = false;
    }

    static int a(a a1)
    {
        int k = a1.h;
        a1.h = k + 1;
        return k;
    }

    static String a(a a1, String s)
    {
        a1.d = s;
        return s;
    }

    static boolean a(a a1, int k)
    {
        boolean flag = (byte)(a1.i & k);
        a1.i = flag;
        return flag;
    }

    static boolean b(a a1)
    {
        return a1.j;
    }

    static int c(a a1)
    {
        return a1.b;
    }

    private void c()
    {
        e = new b(this);
    }

    static int d(a a1)
    {
        return a1.h;
    }

    private ArrayList d()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("wallpaper/weather_dynamicbackground_sunny_day.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_sunny_night.xml");
        arraylist.add("wallpaper/weather_background_sunny_day.xml");
        arraylist.add("wallpaper/weather_background_sunny_night.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_cloudy_day.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_cloudy_night.xml");
        arraylist.add("wallpaper/weather_background_cloudy_day.xml");
        arraylist.add("wallpaper/weather_background_cloudy_night.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_overcast_day.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_overcast_night.xml");
        arraylist.add("wallpaper/weather_background_overcast_day.xml");
        arraylist.add("wallpaper/weather_background_overcast_night.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_rainy_day.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_rainy_night.xml");
        arraylist.add("wallpaper/weather_background_rainy_day.xml");
        arraylist.add("wallpaper/weather_background_rainy_night.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_snowy_day.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_snowy_night.xml");
        arraylist.add("wallpaper/weather_background_snowy_day.xml");
        arraylist.add("wallpaper/weather_background_snowy_night.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_foggy_day.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_foggy_night.xml");
        arraylist.add("wallpaper/weather_background_foggy_day.xml");
        arraylist.add("wallpaper/weather_background_foggy_night.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_thunderstorm_day.xml");
        arraylist.add("wallpaper/weather_dynamicbackground_thunderstorm_night.xml");
        arraylist.add("wallpaper/weather_background_thunderstorm_day.xml");
        arraylist.add("wallpaper/weather_background_thunderstorm_night.xml");
        return arraylist;
    }

    static boolean e(a a1)
    {
        return a1.i;
    }

    static Context f(a a1)
    {
        return a1.f;
    }

    static String g(a a1)
    {
        return a1.d;
    }

    static com.gau.go.launcherex.goweather.livewallpaper.b.c h(a a1)
    {
        return a1.g;
    }

    static Handler i(a a1)
    {
        return a1.e;
    }

    public z a(String s)
    {
        return (z)a.get(s);
    }

    public String a()
    {
        return d;
    }

    public void b()
    {
        j = true;
        a.clear();
        c.shutdown();
    }

    public void b(String s)
    {
        d = s;
        com.gtp.a.a.b.c.a("wallpaper", (new StringBuilder()).append("setPackageName:[packageName]=").append(s).toString());
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(s))
        {
            g.b(d);
            return;
        }
        h = 0;
        i = true;
        s = d();
        b = s.size();
        String s1;
        for (Iterator iterator = s.iterator(); iterator.hasNext(); c.execute(new com.gau.go.launcherex.goweather.livewallpaper.c(this, f, s1, true, false)))
        {
            s1 = (String)iterator.next();
        }

        s.clear();
    }

    public void c(String s)
    {
        c.execute(new com.gau.go.launcherex.goweather.livewallpaper.c(this, f, s, false, false));
    }
}
