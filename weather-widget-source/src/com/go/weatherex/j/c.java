// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.q;
import com.gau.go.launcherex.gowidget.weather.systemwidget.t;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.e.a;
import com.go.weatherex.i.b;
import com.go.weatherex.j.a.d;
import com.go.weatherex.j.a.e;
import com.go.weatherex.j.a.h;

// Referenced classes of package com.go.weatherex.j:
//            k, g

public abstract class c extends k
    implements com.go.weatherex.j.a.c, d, e, h
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
    protected int R;
    protected int S;
    protected int T;
    protected int U;
    protected int V;
    protected int W;
    protected int X;
    private int Y[];
    private int Z[];
    protected int a;
    private int aa[];
    private int ab[];
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private String ao;
    private Drawable ap;
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

    public c(com.go.weatherex.j.g g1)
    {
        super(g1);
        Y = new int[10];
        Z = new int[10];
        aa = new int[10];
        ab = new int[10];
        ao = "";
    }

    private void a(q q1)
    {
        a = ax.c(ax.c());
        b = ax.d("goweatherex_widget_l_bg");
        c = ax.d("goweatherex_widget_l_am_pm");
        T = ax.d("goweatherex_widget_l_published_time");
        N = ax.d("goweatherex_widget_l_weather_desp");
        P = ax.d("goweatherex_widget_l_weather_temp_desp");
        e = ax.d("goweatherex_widget_l_hour_num_1");
        f = ax.d("goweatherex_widget_l_hour_num_2");
        g = ax.d("goweatherex_widget_l_min_num_1");
        h = ax.d("goweatherex_widget_l_min_num_2");
        w = ax.d("goweatherex_widget_l_layout_city");
        y = ax.d("goweatherex_widget_l_img_next");
        p = ax.d("goweatherex_widget_l_date_week");
        x = ax.d("goweatherex_widget_l_city_name");
        z = ax.d("goweatherex_widget_l_text_next_city");
        O = ax.d("goweatherex_widget_l_weather_icon");
        d = ax.d("goweatherex_widget_l_time");
        j = ax.d("goweatherex_widget_l_time_divider");
        i = ax.d("goweatherex_widget_l_timeboard");
        B = ax.d("goweatherex_widget_l_layout_now_temp");
        I = ax.d("goweatherex_widget_l_low_high_temp");
        K = ax.d("goweatherex_widget_l_low_temp");
        J = ax.d("goweatherex_widget_l_high_temp");
        H = ax.d("goweatherex_widget_l_temp_minus");
        D = ax.d("goweatherex_widget_l_temp_num_1");
        E = ax.d("goweatherex_widget_l_temp_num_2");
        F = ax.d("goweatherex_widget_l_temp_num_3");
        C = ax.d("goweatherex_widget_l_temp_unit");
        A = ax.d("goweatherex_widget_l_text_temp");
        Q = ax.d("goweatherex_widget_l_weather_refresh");
        R = ax.d("goweatherex_widget_l_refresh_progress");
        G = ax.d("goweatherex_widget_l_detail_depict");
        q = ax.d("goweatherex_widget_l_date");
        u = ax.d("goweatherex_widget_l_style_date");
        v = ax.d("goweatherex_widget_l_style_date_noyear");
        r = ax.d("goweatherex_widget_l_date_noyear");
        s = ax.d("goweatherex_widget_l_lunar");
        t = ax.d("goweatherex_widget_l_weekday");
        S = ax.d("goweatherex_widget_l_festival");
        M = ax.d("goweatherex_widget_l_wind");
        L = ax.d("goweatherex_widget_l_detail_wind");
        X = ax.d("goweatherex_widget_l_extreme_icon");
        U = ax.d("goweatherex_widget_l_theme_select");
        V = ax.d("goweatherex_widget_l_themetip_layout");
        W = ax.d("goweatherex_widget_l_themetip");
        k = ax.d("goweatherex_widget_l_text_time_ampm");
        l = ax.d("goweatherex_widget_l_text_time");
        m = ax.d("goweatherex_widget_l_text_time_hour");
        n = ax.d("goweatherex_widget_l_text_time_min");
        o = ax.d("goweatherex_widget_l_text_am_pm");
    }

    private void b(q q1)
    {
        boolean flag = false;
        String s1 = q1.a("go_weatherex_widget_bg");
        int i1 = ax.e(s1);
        ag = i1;
        af = i1;
        if (ag <= 0)
        {
            s1 = q1.a("go_weatherex_widget_bg_day");
            ag = ax.e(s1);
            s1 = q1.a("go_weatherex_widget_bg_night");
            af = ax.e(s1);
        }
        s1 = q1.a("go_weatherex_widget_time_pm");
        ae = ax.e(s1);
        s1 = q1.a("go_weatherex_widget_time_am");
        an = ax.e(s1);
        ao = q1.a("go_weatherex_widget_date_style_color");
        s1 = q1.a("go_weatherex_widget_time_ampm_empty");
        ak = ax.e(s1);
        s1 = q1.a("go_weatherex_widget_time_bg");
        ac = ax.e(s1);
        s1 = q1.a("go_weatherex_widget_change_city");
        ad = ax.e(s1);
        s1 = q1.a("go_weatherex_widget_time_divider");
        ah = ax.e(s1);
        s1 = q1.a("go_weatherex_widget_temp_unit");
        aj = ax.e(s1);
        s1 = q1.a("go_weatherex_widget_temp_unit_centigrade");
        al = ax.e(s1);
        s1 = q1.a("go_weatherex_widget_temp_unit_fahrenheit");
        am = ax.e(s1);
        s1 = q1.a("go_weatherex_widget_temp_minus");
        ai = ax.e(s1);
        int j2 = ab.length;
        for (int j1 = 0; j1 < j2; j1++)
        {
            ab[j1] = ax.e(q1.a[j1]);
        }

        j2 = Y.length;
        for (int k1 = 0; k1 < j2; k1++)
        {
            Y[k1] = ax.e(q1.b[k1]);
        }

        j2 = Z.length;
        for (int l1 = 0; l1 < j2; l1++)
        {
            Z[l1] = ax.e(q1.c[l1]);
        }

        j2 = aa.length;
        for (int i2 = ((flag) ? 1 : 0); i2 < j2; i2++)
        {
            aa[i2] = ax.e(q1.d[i2]);
        }

    }

    protected t a()
    {
        return new q();
    }

    protected void a(RemoteViews remoteviews)
    {
        android.app.PendingIntent pendingintent = h();
        com.go.weatherex.i.d.a(remoteviews, p, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, q, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, u, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, v, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, r, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, s, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, S, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, t, pendingintent);
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
        com.go.weatherex.i.d.a(remoteviews, O, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, B, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, N, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, P, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, G, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, I, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, J, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, K, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, M, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, L, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, T, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, A, pendingintent);
        pendingintent = g();
        com.go.weatherex.i.d.a(remoteviews, w, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, x, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, z, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, y, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, Q, m());
        com.go.weatherex.i.d.a(remoteviews, U, l());
        com.go.weatherex.i.d.a(remoteviews, W, j());
    }

    protected void b()
    {
        a((q)ax);
        b((q)ax);
    }

    protected boolean c()
    {
        return a > 0;
    }

    public RemoteViews d()
    {
        Object obj;
        try
        {
            obj = new RemoteViews(ax.g(), a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IllegalArgumentException) (obj)).printStackTrace();
            obj = null;
        }
        if (obj == null)
        {
            return null;
        }
        u u1 = aw.l();
        com.gau.go.launcherex.gowidget.weather.model.WeatherBean weatherbean = aw.h();
        g g1 = aw.m();
        android.content.res.Resources resources = aw.f();
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
        time = com.go.weatherex.i.b.a(g1, weatherbean);
        flag = com.go.weatherex.i.b.a(time, weatherbean);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), b, ag, af, flag);
        flag1 = com.gau.go.launcherex.gowidget.weather.util.r.b(aw.n());
        com.go.weatherex.i.d.c(((RemoteViews) (obj)), i, ac);
        com.go.weatherex.i.d.d(((RemoteViews) (obj)), j, ah);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, flag1, e, f, g, h, Y, Z);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, flag1, l);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, flag1, m, n);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, flag1, c, an, ae, ak);
        com.go.weatherex.i.d.b(((RemoteViews) (obj)), time, flag1, o);
        com.go.weatherex.i.d.c(((RemoteViews) (obj)), time, flag1, k);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, g1, u1, r, true);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, g1, u1, q, false);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, g1, u1, resources, v, av, ao, true);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, g1, u1, resources, u, av, ao, false);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, resources, t, au);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, g1, u1, resources, p, au, false);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), time, g1, s);
        com.go.weatherex.i.d.b(((RemoteViews) (obj)), time, g1, S);
        com.go.weatherex.i.d.e(((RemoteViews) (obj)), y, ad);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), z);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), y, false);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), z, false);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), resources, weatherbean, x, aw.c(), aw.d());
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), weatherbean, flag, O, ab);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), resources, weatherbean, u1, G);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), resources, weatherbean, N);
        com.go.weatherex.i.d.b(((RemoteViews) (obj)), resources, weatherbean, u1, P);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), weatherbean, u1, I);
        com.go.weatherex.i.d.b(((RemoteViews) (obj)), weatherbean, u1, J);
        com.go.weatherex.i.d.c(((RemoteViews) (obj)), weatherbean, u1, K);
        com.go.weatherex.i.d.b(((RemoteViews) (obj)), resources, weatherbean, M);
        com.go.weatherex.i.d.c(((RemoteViews) (obj)), resources, weatherbean, u1, L);
        com.go.weatherex.i.d.d(((RemoteViews) (obj)), weatherbean, u1, A);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), weatherbean, u1, D, E, F, C, H, aa, ai, al, am, aj);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), weatherbean, u1, X, 0);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), X, false);
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), Q, R, aw.b());
        com.go.weatherex.i.d.a(((RemoteViews) (obj)), aw.n(), resources, weatherbean, T);
        com.go.weatherex.i.d.b(((RemoteViews) (obj)), U);
        if (aw.e())
        {
            if (com.go.weatherex.e.a.a().b())
            {
                Drawable drawable;
                if (ap != null)
                {
                    drawable = ap;
                } else
                {
                    drawable = com.go.weatherex.e.a.a().b("appwidget_star_themetip");
                    ap = drawable;
                }
                if (drawable != null)
                {
                    com.go.weatherex.i.d.a(((RemoteViews) (obj)), W, drawable);
                }
            } else
            {
                com.go.weatherex.i.d.b(((RemoteViews) (obj)), W, 0x7f02006f);
            }
            if (V != 0)
            {
                com.go.weatherex.i.d.a(((RemoteViews) (obj)), V, 0);
                return ((RemoteViews) (obj));
            } else
            {
                com.go.weatherex.i.d.a(((RemoteViews) (obj)), W, 0);
                return ((RemoteViews) (obj));
            }
        }
        if (V != 0)
        {
            com.go.weatherex.i.d.a(((RemoteViews) (obj)), V, 8);
            return ((RemoteViews) (obj));
        } else
        {
            com.go.weatherex.i.d.a(((RemoteViews) (obj)), W, 8);
            return ((RemoteViews) (obj));
        }
    }
}
