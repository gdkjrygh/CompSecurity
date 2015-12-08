// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview;

import android.content.Context;
import android.os.Handler;
import com.gau.go.launcherex.gowidget.scriptengine.parser.DescriptionBean;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview:
//            b, c

public class a
{

    ConcurrentHashMap a;
    private String b;
    private Context c;
    private Handler d;
    private ExecutorService e;
    private int f;

    public a(Context context)
    {
        c = context;
        a = new ConcurrentHashMap();
        b = c.getPackageName();
        b();
        e = Executors.newCachedThreadPool();
    }

    static int a(a a1)
    {
        return a1.f;
    }

    static int a(a a1, int i)
    {
        a1.f = i;
        return i;
    }

    private void a(String s, String s1, int i, ArrayList arraylist)
    {
        s = ((z)a.get(s)).b();
        DescriptionBean descriptionbean = ((z)a.get(s1)).b();
        if (s == null)
        {
            s = new DescriptionBean();
            s.a(1);
        }
        s.b(i);
        if (descriptionbean == null)
        {
            descriptionbean = new DescriptionBean();
            descriptionbean.a(2);
        }
        descriptionbean.b(i);
        i = s.a();
        int j = descriptionbean.a();
        if (i == 0 && j == 0)
        {
            a.remove(s1);
            arraylist.add(s);
            return;
        } else
        {
            arraylist.add(s);
            arraylist.add(descriptionbean);
            return;
        }
    }

    static ArrayList b(a a1)
    {
        return a1.d();
    }

    private void b()
    {
        d = new b(this);
    }

    static Context c(a a1)
    {
        return a1.c;
    }

    private ArrayList c()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("background/weather_dynamicbackground_sunny_day.xml");
        arraylist.add("background/weather_dynamicbackground_sunny_night.xml");
        arraylist.add("background/weather_dynamicbackground_cloudy_day.xml");
        arraylist.add("background/weather_dynamicbackground_cloudy_night.xml");
        arraylist.add("background/weather_dynamicbackground_overcast_day.xml");
        arraylist.add("background/weather_dynamicbackground_overcast_night.xml");
        arraylist.add("background/weather_dynamicbackground_rainy_day.xml");
        arraylist.add("background/weather_dynamicbackground_rainy_night.xml");
        arraylist.add("background/weather_dynamicbackground_snowy_day.xml");
        arraylist.add("background/weather_dynamicbackground_snowy_night.xml");
        arraylist.add("background/weather_dynamicbackground_foggy_day.xml");
        arraylist.add("background/weather_dynamicbackground_foggy_night.xml");
        arraylist.add("background/weather_dynamicbackground_thunderstorm_day.xml");
        arraylist.add("background/weather_dynamicbackground_thunderstorm_night.xml");
        return arraylist;
    }

    private ArrayList d()
    {
        ArrayList arraylist = new ArrayList();
        a("background/weather_dynamicbackground_sunny_day.xml", "background/weather_dynamicbackground_sunny_night.xml", 2, arraylist);
        a("background/weather_dynamicbackground_overcast_day.xml", "background/weather_dynamicbackground_overcast_night.xml", 4, arraylist);
        a("background/weather_dynamicbackground_cloudy_day.xml", "background/weather_dynamicbackground_cloudy_night.xml", 3, arraylist);
        a("background/weather_dynamicbackground_foggy_day.xml", "background/weather_dynamicbackground_foggy_night.xml", 6, arraylist);
        a("background/weather_dynamicbackground_rainy_day.xml", "background/weather_dynamicbackground_rainy_night.xml", 7, arraylist);
        a("background/weather_dynamicbackground_snowy_day.xml", "background/weather_dynamicbackground_snowy_night.xml", 5, arraylist);
        a("background/weather_dynamicbackground_thunderstorm_day.xml", "background/weather_dynamicbackground_thunderstorm_night.xml", 8, arraylist);
        return arraylist;
    }

    static ArrayList d(a a1)
    {
        return a1.c();
    }

    static ExecutorService e(a a1)
    {
        return a1.e;
    }

    static String f(a a1)
    {
        return a1.b;
    }

    static Handler g(a a1)
    {
        return a1.d;
    }

    public z a(String s)
    {
        return (z)a.get(s);
    }

    public void a()
    {
        a.clear();
        e.shutdown();
    }

    public void b(String s)
    {
        e.execute(new c(this, c, s, false, false));
    }

    public void c(String s)
    {
        b = s;
        d.sendEmptyMessageDelayed(0, 0L);
    }
}
