// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.jiubang.goweather.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            an, r, ap, al

public class ak
{

    private final Context a;
    private f b;
    private List c;
    private Handler d;
    private boolean e;
    private Intent f;

    public ak(Context context)
    {
        e = false;
        f = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED");
        a = context;
        c = new ArrayList();
        b = com.gau.go.launcherex.gowidget.weather.util.f.a(context.getApplicationContext());
        d();
    }

    static Context a(ak ak1)
    {
        return ak1.a;
    }

    static void a(ak ak1, an an1)
    {
        ak1.a(an1);
    }

    private void a(an an1)
    {
        Iterator iterator = com.gau.go.launcherex.gowidget.weather.b.an.a(an1).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        a a1 = (a)iterator.next();
        if (a1.a != 1 && a1.a != 2) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L9:
        if (an.b(an1) != 3) goto _L6; else goto _L5
_L5:
        a(flag);
_L7:
        a.removeStickyBroadcast(f);
        b.a(an.c(an1).c(), an.c(an1).e(), com.gau.go.launcherex.gowidget.weather.b.an.a(an1), an.b(an1), an.d(an1));
        return;
_L6:
        if (an.b(an1) == 2 || an.b(an1) == 5)
        {
            com.gau.go.launcherex.gowidget.weather.b.r.a(a).b(flag);
        }
        if (true) goto _L7; else goto _L2
_L2:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void a(ap ap1)
    {
        if (ap1.a != null && !ap1.a.isEmpty())
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = ap1.a.iterator(); iterator.hasNext(); arraylist.add(((RequestBean)iterator.next()).a)) { }
            f.putStringArrayListExtra("cityIds", arraylist);
            a.sendStickyBroadcast(f);
            (new an(this, ap1.a, ap1.b, ap1.c)).execute(new Void[0]);
            return;
        } else
        {
            f();
            return;
        }
    }

    private void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("weather_info_file", 0).edit();
        if (flag)
        {
            editor.putLong("KEY_REFRESH_WEATHER_WHEN_ENTER_APP", System.currentTimeMillis());
        }
        editor.commit();
    }

    static void b(ak ak1)
    {
        ak1.f();
    }

    private void b(ArrayList arraylist, int i, int j)
    {
        arraylist = new ap(arraylist, i, j);
        c.add(arraylist);
        if (c.size() == 1 && e)
        {
            a(arraylist);
        }
    }

    static Handler c(ak ak1)
    {
        return ak1.d;
    }

    private void d()
    {
        d = new al(this);
    }

    private boolean e()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            ap ap1 = (ap)iterator.next();
            if (ap1.b == 22 && ap1.c != 2 && ap1.c != 5)
            {
                return true;
            }
        }

        return false;
    }

    private void f()
    {
        if (!c.isEmpty())
        {
            c.remove(0);
            if (!c.isEmpty())
            {
                a((ap)c.get(0));
            }
        }
    }

    public void a()
    {
        e = true;
        if (!c.isEmpty())
        {
            a((ap)c.get(0));
        }
    }

    public void a(int i)
    {
        if (!e())
        {
            ArrayList arraylist = new ArrayList();
            Object obj = b.f();
            if (!((ArrayList) (obj)).isEmpty())
            {
                RequestBean requestbean;
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(requestbean))
                {
                    WeatherBean weatherbean = (WeatherBean)((Iterator) (obj)).next();
                    requestbean = new RequestBean();
                    requestbean.a(weatherbean.c(), weatherbean.d(), weatherbean.l.g());
                }

                b(arraylist, 22, i);
            }
        }
    }

    public void a(ArrayList arraylist, int i, int j)
    {
        if (i != 22 || !e())
        {
            if (j == 3)
            {
                a(false);
            }
            b(arraylist, i, j);
        }
    }

    public boolean b()
    {
        return !c.isEmpty();
    }

    public void c()
    {
        e = false;
        c.clear();
    }
}
