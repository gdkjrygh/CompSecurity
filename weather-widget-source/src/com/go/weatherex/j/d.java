// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.r;
import com.gau.go.launcherex.gowidget.weather.systemwidget.t;
import com.go.weatherex.i.b;
import com.go.weatherex.j.a.a;
import com.go.weatherex.j.a.c;
import com.go.weatherex.j.a.e;
import com.go.weatherex.j.a.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.j:
//            k, f, g, n

public abstract class d extends k
    implements a, c, com.go.weatherex.j.a.d, e, h
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
    protected final List U = new ArrayList();
    protected int V;
    protected int W;
    protected int X;
    protected int Y[];
    protected int Z[];
    protected int a;
    protected int aa[];
    protected int ab[];
    protected int ac[];
    protected int ad;
    protected int ae;
    protected int af;
    protected int ag;
    protected int ah;
    protected int ai;
    protected int aj;
    protected int ak;
    protected int al;
    protected int am;
    protected int an;
    protected int ao;
    protected int ap;
    protected int aq;
    protected String ar;
    private Drawable as;
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

    public d(com.go.weatherex.j.g g1)
    {
        super(g1);
        Y = new int[10];
        Z = new int[10];
        aa = new int[10];
        ab = new int[10];
        ac = new int[10];
        ar = "";
    }

    private void a(r r1)
    {
        a = r1.c(r1.c());
        b = r1.d("goweatherex_widget_days_m_bg");
        e = r1.d("goweatherex_widget_days_m_am_pm");
        m = r1.d("goweatherex_widget_days_m_published_time");
        c = r1.d("goweatherex_widget_days_m_weather_desp");
        d = r1.d("goweatherex_widget_days_m_weather_temp_desp");
        g = r1.d("goweatherex_widget_days_m_hour_num_1");
        h = r1.d("goweatherex_widget_days_m_hour_num_2");
        i = r1.d("goweatherex_widget_days_m_min_num_1");
        j = r1.d("goweatherex_widget_days_m_min_num_2");
        w = r1.d("goweatherex_widget_days_m_layout_city");
        z = r1.d("goweatherex_widget_days_m_text_next_city");
        y = r1.d("goweatherex_widget_days_m_img_next");
        s = r1.d("goweatherex_widget_days_m_date_week");
        x = r1.d("goweatherex_widget_days_m_city_name");
        A = r1.d("goweatherex_widget_days_m_weather_icon");
        f = r1.d("goweatherex_widget_m_time_fore");
        k = r1.d("goweatherex_widget_days_m_time_divider");
        l = r1.d("goweatherex_widget_days_m_timeboard");
        B = r1.d("goweatherex_widget_days_m_layout_now_temp");
        I = r1.d("goweatherex_widget_days_m_low_high_temp");
        K = r1.d("goweatherex_widget_days_m_low_temp");
        J = r1.d("goweatherex_widget_days_m_high_temp");
        G = r1.d("goweatherex_widget_days_m_temp_minus");
        C = r1.d("goweatherex_widget_days_m_temp_num_1");
        D = r1.d("goweatherex_widget_days_m_temp_num_2");
        E = r1.d("goweatherex_widget_days_m_temp_num_3");
        H = r1.d("goweatherex_widget_days_m_temp_unit");
        L = r1.d("goweatherex_widget_days_m_text_temp");
        P = r1.d("goweatherex_widget_days_m_weather_refresh");
        Q = r1.d("goweatherex_widget_days_m_refresh_progress");
        F = r1.d("goweatherex_widget_days_m_detail_depict");
        t = r1.d("goweatherex_widget_days_m_date");
        u = r1.d("goweatherex_widget_days_m_style_date");
        v = r1.d("goweatherex_widget_days_m_weekday");
        N = r1.d("goweatherex_widget_days_m_wind");
        M = r1.d("goweatherex_widget_days_m_detail_wind");
        R = r1.d("goweatherex_widget_days_m_theme_select");
        S = r1.d("goweatherex_widget_m_themetip_layout");
        T = r1.d("goweatherex_widget_m_themetip");
        O = r1.d("goweatherex_widget_days_m_extreme_icon");
        U.clear();
        int i1 = 0;
        while (i1 < 6) 
        {
            f f1 = new f();
            f1.b = r1.d((new StringBuilder()).append("goweatherex_widget_days_m_weather_icon_forecast").append(i1).toString());
            if (f1.b != 0)
            {
                f1.g = r1.d((new StringBuilder()).append("goweatherex_widget_days_m_week_low_high_temp_forecast").append(i1).toString());
                f1.c = r1.d((new StringBuilder()).append("goweatherex_widget_days_m_low_high_temp_forecast").append(i1).toString());
                f1.d = r1.d((new StringBuilder()).append("goweatherex_widget_days_m_low_temp_forecast").append(i1).toString());
                f1.e = r1.d((new StringBuilder()).append("goweatherex_widget_days_m_high_temp_forecast").append(i1).toString());
                f1.a = r1.d((new StringBuilder()).append("goweatherex_widget_days_m_weekday_forecast").append(i1).toString());
                f1.f = r1.d((new StringBuilder()).append("goweatherex_widget_days_m_extreme_icon_forecast").append(i1).toString());
                U.add(f1);
            }
            i1++;
        }
        X = r1.d("goweatherex_widget_days_m_next_page_forecast");
        W = r1.d("goweatherex_widget_days_m_page_pre_forecast");
        V = r1.d("goweatherex_widget_days_m_page_next_forecast");
        n = r1.d("goweatherex_widget_days_m_text_time_ampm");
        o = r1.d("goweatherex_widget_days_m_text_time");
        p = r1.d("goweatherex_widget_days_m_text_time_hour");
        q = r1.d("goweatherex_widget_days_m_text_time_min");
        r = r1.d("goweatherex_widget_days_m_text_am_pm");
    }

    private void b(r r1)
    {
        boolean flag = false;
        String s1 = r1.a("go_weatherex_widget_bg");
        int i1 = ax.e(s1);
        ah = i1;
        ag = i1;
        if (ah <= 0)
        {
            String s2 = r1.a("go_weatherex_widget_bg_day");
            ah = ax.e(s2);
            s2 = r1.a("go_weatherex_widget_bg_night");
            ag = ax.e(s2);
        }
        ar = r1.a("go_weatherex_widget_date_style_color");
        af = r1.e(r1.a("go_weatherex_widget_time_pm"));
        ao = r1.e(r1.a("go_weatherex_widget_time_am"));
        al = r1.e(r1.a("go_weatherex_widget_time_ampm_empty"));
        ad = r1.e(r1.a("go_weatherex_widget_time_bg"));
        ae = r1.e(r1.a("go_weatherex_widget_change_city"));
        ai = r1.e(r1.a("go_weatherex_widget_time_divider"));
        ak = r1.e(r1.a("go_weatherex_widget_temp_unit"));
        am = r1.e(r1.a("go_weatherex_widget_temp_unit_centigrade"));
        an = r1.e(r1.a("go_weatherex_widget_temp_unit_fahrenheit"));
        aj = r1.e(r1.a("go_weatherex_widget_temp_minus"));
        for (i1 = 0; i1 < 10; i1++)
        {
            ab[i1] = r1.e(r1.a[i1]);
        }

        for (i1 = 0; i1 < 10; i1++)
        {
            Y[i1] = r1.e(r1.c[i1]);
        }

        for (i1 = 0; i1 < 10; i1++)
        {
            Z[i1] = r1.e(r1.d[i1]);
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
            aa[i1] = r1.e(r1.e[i1]);
            i1++;
        } while (true);
        for (; j1 < 10; j1++)
        {
            ac[j1] = r1.e(r1.b[j1]);
        }

        ap = r1.e(r1.a("go_weatherex_widget_next_page"));
        aq = r1.e(r1.a("go_weatherex_widget_previous_page"));
    }

    protected t a()
    {
        return new r();
    }

    protected void a(RemoteViews remoteviews)
    {
        android.app.PendingIntent pendingintent = h();
        com.go.weatherex.i.d.a(remoteviews, s, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, t, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, u, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, v, pendingintent);
        android.app.PendingIntent pendingintent1 = i();
        com.go.weatherex.i.d.a(remoteviews, f, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, g, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, h, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, i, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, j, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, e, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, o, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, p, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, q, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, r, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, n, pendingintent1);
        pendingintent1 = k();
        com.go.weatherex.i.d.a(remoteviews, A, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, B, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, c, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, d, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, I, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, J, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, K, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, m, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, L, pendingintent1);
        Object obj = g();
        com.go.weatherex.i.d.a(remoteviews, w, ((android.app.PendingIntent) (obj)));
        com.go.weatherex.i.d.a(remoteviews, x, ((android.app.PendingIntent) (obj)));
        com.go.weatherex.i.d.a(remoteviews, z, ((android.app.PendingIntent) (obj)));
        com.go.weatherex.i.d.a(remoteviews, y, ((android.app.PendingIntent) (obj)));
        com.go.weatherex.i.d.a(remoteviews, P, m());
        com.go.weatherex.i.d.a(remoteviews, R, l());
        com.go.weatherex.i.d.a(remoteviews, T, j());
        obj = aw.i();
        if (((n) (obj)).h())
        {
            android.app.PendingIntent pendingintent3 = e();
            com.go.weatherex.i.d.a(remoteviews, X, pendingintent3);
            com.go.weatherex.i.d.a(remoteviews, V, pendingintent3);
        }
        if (((n) (obj)).i())
        {
            android.app.PendingIntent pendingintent2 = f();
            com.go.weatherex.i.d.a(remoteviews, X, pendingintent2);
            com.go.weatherex.i.d.a(remoteviews, W, pendingintent2);
        }
        f f1;
        for (Iterator iterator = U.iterator(); iterator.hasNext(); com.go.weatherex.i.d.a(remoteviews, f1.a, pendingintent))
        {
            f1 = (f)iterator.next();
            com.go.weatherex.i.d.a(remoteviews, f1.e, pendingintent1);
            com.go.weatherex.i.d.a(remoteviews, f1.d, pendingintent1);
            com.go.weatherex.i.d.a(remoteviews, f1.c, pendingintent1);
            com.go.weatherex.i.d.a(remoteviews, f1.b, pendingintent1);
            com.go.weatherex.i.d.a(remoteviews, f1.g, pendingintent1);
        }

    }

    protected void b()
    {
        a((r)ax);
        b((r)ax);
    }

    protected boolean c()
    {
        return a > 0;
    }

    public RemoteViews d()
    {
        RemoteViews remoteviews = new RemoteViews(ax.g(), a);
        n n1 = aw.i();
        u u1 = aw.l();
        com.gau.go.launcherex.gowidget.weather.model.WeatherBean weatherbean = n1.a();
        g g1 = aw.m();
        android.content.res.Resources resources = aw.f();
        boolean flag = u1.J;
        Object obj1;
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
        obj1 = com.go.weatherex.i.b.a(g1, weatherbean);
        flag = com.go.weatherex.i.b.a(((android.text.format.Time) (obj1)), weatherbean);
        com.go.weatherex.i.d.a(remoteviews, b, ah, ag, flag);
        flag1 = com.gau.go.launcherex.gowidget.weather.util.r.b(aw.n());
        com.go.weatherex.i.d.c(remoteviews, l, ad);
        com.go.weatherex.i.d.d(remoteviews, k, ai);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), flag1, g, h, i, j, Y, Z);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), flag1, o);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), flag1, p, q);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), flag1, e, ao, af, al);
        com.go.weatherex.i.d.b(remoteviews, ((android.text.format.Time) (obj1)), flag1, r);
        com.go.weatherex.i.d.c(remoteviews, ((android.text.format.Time) (obj1)), flag1, n);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, t, false);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, resources, u, av, ar, false);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), resources, v, au);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, resources, s, au, false);
        com.go.weatherex.i.d.e(remoteviews, y, ae);
        com.go.weatherex.i.d.a(remoteviews, z);
        com.go.weatherex.i.d.a(remoteviews, y, false);
        com.go.weatherex.i.d.a(remoteviews, z, false);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, x, aw.c(), aw.d());
        com.go.weatherex.i.d.a(remoteviews, weatherbean, flag, A, ab);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, c);
        com.go.weatherex.i.d.b(remoteviews, resources, weatherbean, u1, d);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, I);
        com.go.weatherex.i.d.b(remoteviews, weatherbean, u1, J);
        com.go.weatherex.i.d.c(remoteviews, weatherbean, u1, K);
        com.go.weatherex.i.d.d(remoteviews, weatherbean, u1, L);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, C, D, E, H, G, aa, aj, am, an, ak);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, O, 0);
        com.go.weatherex.i.d.a(remoteviews, O, false);
        com.go.weatherex.i.d.a(remoteviews, P, Q, aw.b());
        com.go.weatherex.i.d.a(remoteviews, aw.n(), resources, weatherbean, m);
        com.go.weatherex.i.d.b(remoteviews, R);
        if (aw.e())
        {
            if (com.go.weatherex.e.a.a().b())
            {
                Object obj;
                int i1;
                if (as != null)
                {
                    obj = as;
                } else
                {
                    obj = com.go.weatherex.e.a.a().b("appwidget_star_themetip");
                    as = ((Drawable) (obj));
                }
                if (obj != null)
                {
                    com.go.weatherex.i.d.a(remoteviews, T, ((Drawable) (obj)));
                }
            } else
            {
                com.go.weatherex.i.d.b(remoteviews, T, 0x7f02006f);
            }
            if (S != 0)
            {
                com.go.weatherex.i.d.a(remoteviews, S, 0);
            } else
            {
                com.go.weatherex.i.d.a(remoteviews, T, 0);
            }
        } else
        if (S != 0)
        {
            com.go.weatherex.i.d.a(remoteviews, S, 8);
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, T, 8);
        }
        n1.b(U.size());
        obj = n1.a(((android.text.format.Time) (obj1)));
        for (i1 = 0; i1 < ((List) (obj)).size(); i1++)
        {
            obj1 = (ForecastBean)((List) (obj)).get(i1);
            ((f)U.get(i1)).a(remoteviews, u1, ((ForecastBean) (obj1)), resources, ac, au);
        }

        if (n1.h())
        {
            com.go.weatherex.i.d.a(remoteviews, V, true);
            com.go.weatherex.i.d.b(remoteviews, V, ap);
            com.go.weatherex.i.d.b(remoteviews, X, ap);
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, V, false);
        }
        if (n1.i())
        {
            com.go.weatherex.i.d.a(remoteviews, W, true);
            com.go.weatherex.i.d.b(remoteviews, W, aq);
            com.go.weatherex.i.d.b(remoteviews, X, aq);
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, W, false);
        }
        if (n1.h() || n1.i())
        {
            com.go.weatherex.i.d.a(remoteviews, X, true);
            return remoteviews;
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, X, false);
            return remoteviews;
        }
    }
}
