// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.p;
import com.gau.go.launcherex.gowidget.weather.systemwidget.t;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.e.a;
import com.go.weatherex.j.a.c;
import com.go.weatherex.j.a.d;
import com.go.weatherex.j.a.e;
import com.go.weatherex.j.a.h;

// Referenced classes of package com.go.weatherex.j:
//            k, g

public abstract class b extends k
    implements c, d, e, h
{

    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected int I;
    protected int J;
    protected int K;
    protected int L;
    protected int M;
    protected int N;
    protected int O;
    protected int P;
    protected int Q;
    private int R[];
    private int S[];
    private int T[];
    private int U[];
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    protected int a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private String ah;
    private Drawable ai;
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
    protected int x;
    protected int y;
    protected int z;

    public b(com.go.weatherex.j.g g1)
    {
        super(g1);
        R = new int[10];
        S = new int[10];
        T = new int[10];
        U = new int[10];
        ah = "";
    }

    private void a(p p1)
    {
        a = ax.c(ax.c());
        b = ax.d("goweatherex_widget_m_bg");
        I = ax.d("goweatherex_widget_m_weather_icon");
        E = ax.d("goweatherex_widget_m_low_high_temp");
        G = ax.d("goweatherex_widget_m_low_temp");
        F = ax.d("goweatherex_widget_m_high_temp");
        t = ax.d("goweatherex_widget_m_layout_city");
        v = ax.d("goweatherex_widget_m_img_next");
        u = ax.d("goweatherex_widget_m_city_name");
        w = ax.d("goweatherex_widget_m_text_next_city");
        y = ax.d("goweatherex_widget_m_layout_now_temp");
        D = ax.d("goweatherex_widget_m_temp_minus");
        A = ax.d("goweatherex_widget_m_temp_num_1");
        B = ax.d("goweatherex_widget_m_temp_num_2");
        C = ax.d("goweatherex_widget_m_temp_num_3");
        z = ax.d("goweatherex_widget_m_temp_unit");
        x = ax.d("goweatherex_widget_m_text_temp");
        H = ax.d("goweatherex_widget_m_weather_desp");
        J = ax.d("goweatherex_widget_m_weather_temp_desp");
        c = ax.d("goweatherex_widget_m_am_pm");
        r = ax.d("goweatherex_widget_m_weekday");
        p = ax.d("goweatherex_widget_m_date_week");
        q = ax.d("goweatherex_widget_m_date");
        s = ax.d("goweatherex_widget_m_style_date");
        e = ax.d("goweatherex_widget_m_hour_num_1");
        f = ax.d("goweatherex_widget_m_hour_num_2");
        g = ax.d("goweatherex_widget_m_min_num_1");
        h = ax.d("goweatherex_widget_m_min_num_2");
        d = ax.d("goweatherex_widget_m_time");
        i = ax.d("goweatherex_widget_m_timeboard");
        j = ax.d("goweatherex_widget_m_time_divider");
        K = ax.d("goweatherex_widget_m_weather_refresh");
        L = ax.d("goweatherex_widget_m_refresh_progress");
        Q = ax.d("goweatherex_widget_m_extreme_icon");
        N = ax.d("goweatherex_widget_m_theme_select");
        O = ax.d("goweatherex_widget_m_themetip_layout");
        P = ax.d("goweatherex_widget_m_themetip");
        k = ax.d("goweatherex_widget_m_text_time_ampm");
        l = ax.d("goweatherex_widget_m_text_time");
        m = ax.d("goweatherex_widget_m_text_time_hour");
        n = ax.d("goweatherex_widget_m_text_time_min");
        o = ax.d("goweatherex_widget_m_text_am_pm");
    }

    private void b(p p1)
    {
        boolean flag = false;
        String s1 = p1.a("go_weatherex_widget_bg");
        int i1 = ax.e(s1);
        Z = i1;
        Y = i1;
        if (Z <= 0)
        {
            s1 = p1.a("go_weatherex_widget_bg_day");
            Z = ax.e(s1);
            s1 = p1.a("go_weatherex_widget_bg_night");
            Y = ax.e(s1);
        }
        s1 = p1.a("go_weatherex_widget_time_pm");
        X = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_time_am");
        ag = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_time_ampm_empty");
        ah = p1.a("go_weatherex_widget_date_style_color");
        ad = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_time_bg");
        V = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_change_city");
        W = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_time_divider");
        aa = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_temp_unit");
        ac = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_temp_unit_centigrade");
        ae = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_temp_unit_fahrenheit");
        af = ax.e(s1);
        s1 = p1.a("go_weatherex_widget_temp_minus");
        ab = ax.e(s1);
        for (i1 = 0; i1 < 10; i1++)
        {
            U[i1] = ax.e(p1.a[i1]);
        }

        for (i1 = 0; i1 < 10; i1++)
        {
            R[i1] = ax.e(p1.b[i1]);
        }

        i1 = 0;
        int j1;
        do
        {
            j1 = ((flag) ? 1 : 0);
            if (i1 >= 10)
            {
                break;
            }
            S[i1] = ax.e(p1.c[i1]);
            i1++;
        } while (true);
        for (; j1 < 10; j1++)
        {
            T[j1] = ax.e(p1.d[j1]);
        }

    }

    protected t a()
    {
        return new p();
    }

    protected void a(RemoteViews remoteviews)
    {
        android.app.PendingIntent pendingintent = h();
        com.go.weatherex.i.d.a(remoteviews, p, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, q, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, s, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, r, pendingintent);
        pendingintent = i();
        com.go.weatherex.i.d.a(remoteviews, d, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, e, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, f, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, g, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, h, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, k, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, c, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, l, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, m, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, n, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, o, pendingintent);
        pendingintent = k();
        com.go.weatherex.i.d.a(remoteviews, I, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, y, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, H, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, J, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, E, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, F, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, G, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, M, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, x, pendingintent);
        pendingintent = g();
        com.go.weatherex.i.d.a(remoteviews, t, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, u, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, w, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, v, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, K, m());
        com.go.weatherex.i.d.a(remoteviews, N, l());
        com.go.weatherex.i.d.a(remoteviews, P, j());
    }

    protected void b()
    {
        a((p)ax);
        b((p)ax);
    }

    protected boolean c()
    {
        return a > 0;
    }

    public RemoteViews d()
    {
        RemoteViews remoteviews = new RemoteViews(ax.g(), a);
        Object obj;
        com.gau.go.launcherex.gowidget.weather.model.WeatherBean weatherbean;
        g g1;
        android.content.res.Resources resources;
        boolean flag;
        obj = aw.l();
        weatherbean = aw.h();
        g1 = aw.m();
        resources = aw.f();
        flag = ((u) (obj)).J;
        Exception exception;
        android.text.format.Time time;
        boolean flag1;
        if (((u) (obj)).r == 1 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1.a(flag);
        if (((u) (obj)).h == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1.b(flag);
        g1.e(((u) (obj)).i);
        time = com.go.weatherex.i.b.a(g1, weatherbean);
        flag = com.go.weatherex.i.b.a(time, weatherbean);
        com.go.weatherex.i.d.a(remoteviews, b, Z, Y, flag);
        flag1 = com.gau.go.launcherex.gowidget.weather.util.r.b(aw.n());
        com.go.weatherex.i.d.c(remoteviews, i, V);
        com.go.weatherex.i.d.d(remoteviews, j, aa);
        com.go.weatherex.i.d.a(remoteviews, time, flag1, e, f, g, h, R, S);
        com.go.weatherex.i.d.a(remoteviews, time, flag1, l);
        com.go.weatherex.i.d.a(remoteviews, time, flag1, m, n);
        com.go.weatherex.i.d.a(remoteviews, time, flag1, c, ag, X, ad);
        com.go.weatherex.i.d.b(remoteviews, time, flag1, o);
        com.go.weatherex.i.d.c(remoteviews, time, flag1, k);
        com.go.weatherex.i.d.a(remoteviews, time, g1, ((u) (obj)), q, false);
        com.go.weatherex.i.d.a(remoteviews, time, g1, ((u) (obj)), resources, s, av, ah, false);
        com.go.weatherex.i.d.a(remoteviews, time, resources, r, au);
        com.go.weatherex.i.d.a(remoteviews, time, g1, ((u) (obj)), resources, p, au, false);
        com.go.weatherex.i.d.e(remoteviews, v, W);
        com.go.weatherex.i.d.a(remoteviews, w);
        com.go.weatherex.i.d.a(remoteviews, v, false);
        com.go.weatherex.i.d.a(remoteviews, w, false);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, u, aw.c(), aw.d());
        com.go.weatherex.i.d.a(remoteviews, weatherbean, flag, I, U);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, H);
        com.go.weatherex.i.d.b(remoteviews, resources, weatherbean, ((u) (obj)), J);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, ((u) (obj)), E);
        com.go.weatherex.i.d.b(remoteviews, weatherbean, ((u) (obj)), F);
        com.go.weatherex.i.d.c(remoteviews, weatherbean, ((u) (obj)), G);
        com.go.weatherex.i.d.d(remoteviews, weatherbean, ((u) (obj)), x);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, ((u) (obj)), A, B, C, z, D, T, ab, ae, af, ac);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, ((u) (obj)), Q, 0);
        com.go.weatherex.i.d.a(remoteviews, Q, false);
        com.go.weatherex.i.d.a(remoteviews, K, L, aw.b());
        com.go.weatherex.i.d.a(remoteviews, aw.n(), resources, weatherbean, M);
        com.go.weatherex.i.d.b(remoteviews, N);
        Log.i("wss", "Current41RemoteViewBean_showNewFlag_start");
        if (!aw.e()) goto _L2; else goto _L1
_L1:
        if (!com.go.weatherex.e.a.a().b()) goto _L4; else goto _L3
_L3:
        if (ai == null) goto _L6; else goto _L5
_L5:
        obj = ai;
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_664;
        }
        com.go.weatherex.i.d.a(remoteviews, P, ((Drawable) (obj)));
_L10:
        if (O == 0) goto _L8; else goto _L7
_L7:
        com.go.weatherex.i.d.a(remoteviews, O, 0);
        return remoteviews;
_L6:
        obj = com.go.weatherex.e.a.a().b("appwidget_star_themetip");
        ai = ((Drawable) (obj));
          goto _L9
        exception;
        obj = remoteviews;
_L11:
        exception.printStackTrace();
        return ((RemoteViews) (obj));
_L4:
        com.go.weatherex.i.d.b(remoteviews, P, 0x7f02006f);
          goto _L10
_L8:
        com.go.weatherex.i.d.a(remoteviews, P, 0);
        return remoteviews;
_L2:
        if (O == 0)
        {
            break MISSING_BLOCK_LABEL_753;
        }
        com.go.weatherex.i.d.a(remoteviews, O, 8);
        return remoteviews;
        com.go.weatherex.i.d.a(remoteviews, P, 8);
        return remoteviews;
        exception;
        obj = null;
          goto _L11
    }
}
