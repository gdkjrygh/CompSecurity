// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.app.PendingIntent;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.i.b;
import com.go.weatherex.i.d;

// Referenced classes of package com.go.weatherex.j:
//            g

class ag
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q[];
    int r[];
    int s[];
    int t;
    protected com.go.weatherex.j.g u;

    ag(com.go.weatherex.j.g g1, int i1)
    {
        u = g1;
        a = i1;
    }

    void a(RemoteViews remoteviews)
    {
        com.go.weatherex.j.g g1 = u;
        u u1 = g1.l();
        com.gau.go.launcherex.gowidget.weather.model.WeatherBean weatherbean = g1.h();
        g g2 = g1.m();
        android.content.res.Resources resources = g1.f();
        boolean flag = u1.J;
        android.text.format.Time time;
        boolean flag1;
        if (u1.r == 1 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g2.a(flag);
        if (u1.h == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g2.b(flag);
        g2.e(u1.i);
        time = com.go.weatherex.i.b.a(g2, weatherbean);
        flag = com.go.weatherex.i.b.a(time, weatherbean);
        flag1 = com.gau.go.launcherex.gowidget.weather.util.r.b(g1.n());
        com.go.weatherex.i.d.a(remoteviews, time, flag1, c, d, e, f, q, r);
        com.go.weatherex.i.d.b(remoteviews, time, flag1, g);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, flag, h, s);
        com.go.weatherex.i.d.d(remoteviews, weatherbean, u1, i);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, j);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, k, g1.c(), g1.d());
        com.go.weatherex.i.d.a(remoteviews, weatherbean, m, t);
        com.go.weatherex.i.d.a(remoteviews, time, g2, u1, n, false);
        com.go.weatherex.i.d.a(remoteviews, o, p, g1.b());
    }

    void a(RemoteViews remoteviews, PendingIntent pendingintent)
    {
        com.go.weatherex.i.d.a(remoteviews, b, pendingintent);
    }

    void b(RemoteViews remoteviews, PendingIntent pendingintent)
    {
        com.go.weatherex.i.d.a(remoteviews, n, pendingintent);
    }

    void c(RemoteViews remoteviews, PendingIntent pendingintent)
    {
        com.go.weatherex.i.d.a(remoteviews, l, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, h, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, i, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, j, pendingintent);
    }

    void d(RemoteViews remoteviews, PendingIntent pendingintent)
    {
        com.go.weatherex.i.d.a(remoteviews, o, pendingintent);
    }

    void e(RemoteViews remoteviews, PendingIntent pendingintent)
    {
        com.go.weatherex.i.d.a(remoteviews, l, pendingintent);
    }
}
