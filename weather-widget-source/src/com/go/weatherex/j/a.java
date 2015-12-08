// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.o;
import com.gau.go.launcherex.gowidget.weather.systemwidget.t;
import com.go.weatherex.i.b;
import com.go.weatherex.i.d;
import com.go.weatherex.j.a.e;

// Referenced classes of package com.go.weatherex.j:
//            k, g

public abstract class a extends k
    implements e
{

    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private Drawable G;
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected int w;
    private int x[];
    private int y[];
    private int z;

    public a(com.go.weatherex.j.g g1)
    {
        super(g1);
        x = new int[10];
        y = new int[10];
    }

    private void a(o o1)
    {
        a = ax.c(ax.c());
        b = o1.d("goweatherex_widget_s_bg");
        r = o1.d("goweatherex_widget_s_weather_icon");
        c = o1.d("goweatherex_widget_s_layout_city");
        e = o1.d("goweatherex_widget_s_img_next");
        d = o1.d("goweatherex_widget_s_city_name");
        f = o1.d("goweatherex_widget_s_text_next_city");
        q = o1.d("goweatherex_widget_s_weather_desp");
        h = o1.d("goweatherex_widget_s_layout_now_temp");
        m = o1.d("goweatherex_widget_s_temp_minus");
        j = o1.d("goweatherex_widget_s_temp_num_1");
        k = o1.d("goweatherex_widget_s_temp_num_2");
        l = o1.d("goweatherex_widget_s_temp_num_3");
        i = o1.d("goweatherex_widget_s_temp_unit");
        g = o1.d("goweatherex_widget_s_text_temp");
        u = o1.d("goweatherex_widget_s_extreme_icon");
        t = o1.d("goweatherex_widget_s_theme_select");
        w = o1.d("goweatherex_widget_s_themetip");
        v = o1.d("goweatherex_widget_s_themetip_layout");
    }

    private void b(o o1)
    {
        boolean flag = false;
        String s1 = o1.a("go_weatherex_widget_bg");
        int i1 = ax.e(s1);
        B = i1;
        A = i1;
        if (B <= 0)
        {
            String s2 = o1.a("go_weatherex_widget_bg_day");
            B = ax.e(s2);
            s2 = o1.a("go_weatherex_widget_bg_night");
            A = ax.e(s2);
        }
        z = o1.e(o1.a("go_weatherex_widget_change_city"));
        D = o1.e(o1.a("go_weatherex_widget_temp_unit"));
        E = o1.e(o1.a("go_weatherex_widget_temp_unit_centigrade"));
        F = o1.e(o1.a("go_weatherex_widget_temp_unit_fahrenheit"));
        C = o1.e(o1.a("go_weatherex_widget_temp_minus"));
        i1 = 0;
        int j1;
        do
        {
            j1 = ((flag) ? 1 : 0);
            if (i1 >= 10)
            {
                break;
            }
            y[i1] = o1.e(o1.a[i1]);
            i1++;
        } while (true);
        for (; j1 < 10; j1++)
        {
            x[j1] = o1.e(o1.b[j1]);
        }

    }

    protected t a()
    {
        return new o();
    }

    protected void a(RemoteViews remoteviews)
    {
        android.app.PendingIntent pendingintent = k();
        com.go.weatherex.i.d.a(remoteviews, r, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, h, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, q, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, s, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, n, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, o, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, p, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, g, pendingintent);
        pendingintent = g();
        com.go.weatherex.i.d.a(remoteviews, c, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, d, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, f, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, e, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, t, l());
        com.go.weatherex.i.d.a(remoteviews, w, j());
    }

    protected void b()
    {
        a((o)ax);
        b((o)ax);
    }

    protected boolean c()
    {
        return a > 0;
    }

    public RemoteViews d()
    {
        RemoteViews remoteviews = new RemoteViews(ax.g(), a);
        u u1 = aw.l();
        com.gau.go.launcherex.gowidget.weather.model.WeatherBean weatherbean = aw.h();
        g g1 = aw.m();
        android.content.res.Resources resources = aw.f();
        boolean flag = u1.J;
        if (u1.r == 1 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1.a(flag);
        if (u1.h == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1.b(flag);
        g1.e(u1.i);
        flag = com.go.weatherex.i.b.a(com.go.weatherex.i.b.a(g1, weatherbean), weatherbean);
        com.go.weatherex.i.d.a(remoteviews, b, B, A, flag);
        com.go.weatherex.i.d.e(remoteviews, e, z);
        com.go.weatherex.i.d.a(remoteviews, f);
        com.go.weatherex.i.d.a(remoteviews, e, false);
        com.go.weatherex.i.d.a(remoteviews, f, false);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, d, aw.c(), aw.d());
        com.go.weatherex.i.d.a(remoteviews, weatherbean, flag, r, y);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, q);
        com.go.weatherex.i.d.b(remoteviews, resources, weatherbean, u1, s);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, n);
        com.go.weatherex.i.d.b(remoteviews, weatherbean, u1, o);
        com.go.weatherex.i.d.c(remoteviews, weatherbean, u1, p);
        com.go.weatherex.i.d.d(remoteviews, weatherbean, u1, g);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, j, k, l, i, m, x, C, E, F, D);
        com.go.weatherex.i.d.b(remoteviews, t);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, u, 0);
        com.go.weatherex.i.d.a(remoteviews, u, false);
        if (aw.e())
        {
            if (com.go.weatherex.e.a.a().b())
            {
                Drawable drawable;
                if (G != null)
                {
                    drawable = G;
                } else
                {
                    drawable = com.go.weatherex.e.a.a().b("appwidget_star_themetip");
                    G = drawable;
                }
                if (drawable != null)
                {
                    com.go.weatherex.i.d.a(remoteviews, w, drawable);
                }
            } else
            {
                com.go.weatherex.i.d.b(remoteviews, w, 0x7f02006f);
            }
            if (v != 0)
            {
                com.go.weatherex.i.d.a(remoteviews, v, 0);
                return remoteviews;
            } else
            {
                com.go.weatherex.i.d.a(remoteviews, w, 0);
                return remoteviews;
            }
        }
        if (v != 0)
        {
            com.go.weatherex.i.d.a(remoteviews, v, 8);
            return remoteviews;
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, w, 8);
            return remoteviews;
        }
    }
}
