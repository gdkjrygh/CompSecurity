// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.s;
import com.gau.go.launcherex.gowidget.weather.systemwidget.t;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.i.b;
import com.go.weatherex.j.a.a;
import com.go.weatherex.j.a.c;
import com.go.weatherex.j.a.d;
import com.go.weatherex.j.a.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.j:
//            k, f, g, n

public abstract class e extends k
    implements a, c, d, com.go.weatherex.j.a.e, h
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
    protected final List W = new ArrayList();
    protected int X;
    protected int Y;
    protected int Z;
    protected int a;
    protected int aa[];
    protected int ab[];
    protected int ac[];
    protected int ad[];
    protected int ae[];
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
    protected int ar;
    protected int as;
    protected String at;
    private Drawable ay;
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

    public e(com.go.weatherex.j.g g1)
    {
        super(g1);
        aa = new int[10];
        ab = new int[10];
        ac = new int[10];
        ad = new int[10];
        ae = new int[10];
        at = "";
    }

    private void a(s s1)
    {
        a = s1.c(s1.c());
        b = s1.d("goweatherex_widget_days_l_bg");
        e = s1.d("goweatherex_widget_days_l_am_pm");
        m = s1.d("goweatherex_widget_days_l_published_time");
        c = s1.d("goweatherex_widget_days_l_weather_desp");
        d = s1.d("goweatherex_widget_days_l_weather_temp_desp");
        g = s1.d("goweatherex_widget_days_l_hour_num_1");
        h = s1.d("goweatherex_widget_days_l_hour_num_2");
        i = s1.d("goweatherex_widget_days_l_min_num_1");
        j = s1.d("goweatherex_widget_days_l_min_num_2");
        y = s1.d("goweatherex_widget_days_l_layout_city");
        B = s1.d("goweatherex_widget_days_l_text_next_city");
        A = s1.d("goweatherex_widget_days_l_img_next");
        s = s1.d("goweatherex_widget_days_l_date_week");
        z = s1.d("goweatherex_widget_days_l_city_name");
        C = s1.d("goweatherex_widget_days_l_weather_icon");
        f = s1.d("goweatherex_widget_l_time_fore");
        k = s1.d("goweatherex_widget_days_l_time_divider");
        l = s1.d("goweatherex_widget_days_l_timeboard");
        D = s1.d("goweatherex_widget_days_l_layout_now_temp");
        K = s1.d("goweatherex_widget_days_l_low_high_temp");
        M = s1.d("goweatherex_widget_days_l_low_temp");
        L = s1.d("goweatherex_widget_days_l_high_temp");
        I = s1.d("goweatherex_widget_days_l_temp_minus");
        E = s1.d("goweatherex_widget_days_l_temp_num_1");
        F = s1.d("goweatherex_widget_days_l_temp_num_2");
        G = s1.d("goweatherex_widget_days_l_temp_num_3");
        J = s1.d("goweatherex_widget_days_l_temp_unit");
        N = s1.d("goweatherex_widget_days_l_text_temp");
        R = s1.d("goweatherex_widget_days_l_weather_refresh");
        S = s1.d("goweatherex_widget_days_l_refresh_progress");
        H = s1.d("goweatherex_widget_days_l_detail_depict");
        t = s1.d("goweatherex_widget_days_l_date");
        v = s1.d("goweatherex_widget_days_l_style_date");
        w = s1.d("goweatherex_widget_days_l_style_date_noyear");
        u = s1.d("goweatherex_widget_days_l_date_noyear");
        x = s1.d("goweatherex_widget_days_l_weekday");
        P = s1.d("goweatherex_widget_days_l_wind");
        O = s1.d("goweatherex_widget_days_l_detail_wind");
        T = s1.d("goweatherex_widget_days_l_theme_select");
        U = s1.d("goweatherex_widget_l_themetip_layout");
        V = s1.d("goweatherex_widget_l_themetip");
        Q = s1.d("goweatherex_widget_days_l_extreme_icon");
        W.clear();
        int i1 = 0;
        while (i1 < 6) 
        {
            f f1 = new f();
            f1.b = s1.d((new StringBuilder()).append("goweatherex_widget_days_l_weather_icon_forecast").append(i1).toString());
            if (f1.b != 0)
            {
                f1.g = s1.d((new StringBuilder()).append("goweatherex_widget_days_l_week_low_high_temp_forecast").append(i1).toString());
                f1.c = s1.d((new StringBuilder()).append("goweatherex_widget_days_l_low_high_temp_forecast").append(i1).toString());
                f1.d = s1.d((new StringBuilder()).append("goweatherex_widget_days_l_low_temp_forecast").append(i1).toString());
                f1.e = s1.d((new StringBuilder()).append("goweatherex_widget_days_l_high_temp_forecast").append(i1).toString());
                f1.a = s1.d((new StringBuilder()).append("goweatherex_widget_days_l_weekday_forecast").append(i1).toString());
                f1.f = s1.d((new StringBuilder()).append("goweatherex_widget_days_l_extreme_icon_forecast").append(i1).toString());
                W.add(f1);
            }
            i1++;
        }
        Z = s1.d("goweatherex_widget_days_l_next_page_forecast");
        Y = s1.d("goweatherex_widget_days_l_page_pre_forecast");
        X = s1.d("goweatherex_widget_days_l_page_next_forecast");
        n = s1.d("goweatherex_widget_days_l_text_time_ampm");
        o = s1.d("goweatherex_widget_days_l_text_time");
        p = s1.d("goweatherex_widget_days_l_text_time_hour");
        q = s1.d("goweatherex_widget_days_l_text_time_min");
        r = s1.d("goweatherex_widget_days_l_text_am_pm");
    }

    private void b(s s1)
    {
        boolean flag = false;
        String s2 = s1.a("go_weatherex_widget_bg");
        int i1 = ax.e(s2);
        aj = i1;
        ai = i1;
        if (aj <= 0)
        {
            String s3 = s1.a("go_weatherex_widget_bg_day");
            aj = ax.e(s3);
            s3 = s1.a("go_weatherex_widget_bg_night");
            ai = ax.e(s3);
        }
        at = s1.a("go_weatherex_widget_date_style_color");
        ah = s1.e(s1.a("go_weatherex_widget_time_pm"));
        aq = s1.e(s1.a("go_weatherex_widget_time_am"));
        an = s1.e(s1.a("go_weatherex_widget_time_ampm_empty"));
        af = s1.e(s1.a("go_weatherex_widget_time_bg"));
        ag = s1.e(s1.a("go_weatherex_widget_change_city"));
        ak = s1.e(s1.a("go_weatherex_widget_time_divider"));
        am = s1.e(s1.a("go_weatherex_widget_temp_unit"));
        ao = s1.e(s1.a("go_weatherex_widget_temp_unit_centigrade"));
        ap = s1.e(s1.a("go_weatherex_widget_temp_unit_fahrenheit"));
        al = s1.e(s1.a("go_weatherex_widget_temp_minus"));
        for (i1 = 0; i1 < 10; i1++)
        {
            ad[i1] = s1.e(s1.a[i1]);
        }

        for (i1 = 0; i1 < 10; i1++)
        {
            aa[i1] = s1.e(s1.c[i1]);
        }

        for (i1 = 0; i1 < 10; i1++)
        {
            ab[i1] = s1.e(s1.d[i1]);
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
            ac[i1] = s1.e(s1.e[i1]);
            i1++;
        } while (true);
        for (; j1 < 10; j1++)
        {
            ae[j1] = s1.e(s1.b[j1]);
        }

        ar = s1.e(s1.a("go_weatherex_widget_next_page"));
        as = s1.e(s1.a("go_weatherex_widget_previous_page"));
    }

    protected t a()
    {
        return new s();
    }

    protected void a(RemoteViews remoteviews)
    {
        android.app.PendingIntent pendingintent = h();
        com.go.weatherex.i.d.a(remoteviews, s, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, t, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, v, pendingintent);
        com.go.weatherex.i.d.a(remoteviews, x, pendingintent);
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
        com.go.weatherex.i.d.a(remoteviews, C, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, D, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, c, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, d, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, K, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, L, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, M, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, m, pendingintent1);
        com.go.weatherex.i.d.a(remoteviews, N, pendingintent1);
        Object obj = g();
        com.go.weatherex.i.d.a(remoteviews, y, ((android.app.PendingIntent) (obj)));
        com.go.weatherex.i.d.a(remoteviews, z, ((android.app.PendingIntent) (obj)));
        com.go.weatherex.i.d.a(remoteviews, B, ((android.app.PendingIntent) (obj)));
        com.go.weatherex.i.d.a(remoteviews, A, ((android.app.PendingIntent) (obj)));
        com.go.weatherex.i.d.a(remoteviews, R, m());
        com.go.weatherex.i.d.a(remoteviews, T, l());
        com.go.weatherex.i.d.a(remoteviews, V, j());
        obj = aw.i();
        if (((n) (obj)).h())
        {
            android.app.PendingIntent pendingintent3 = e();
            com.go.weatherex.i.d.a(remoteviews, Z, pendingintent3);
            com.go.weatherex.i.d.a(remoteviews, X, pendingintent3);
        }
        if (((n) (obj)).i())
        {
            android.app.PendingIntent pendingintent2 = f();
            com.go.weatherex.i.d.a(remoteviews, Z, pendingintent2);
            com.go.weatherex.i.d.a(remoteviews, Y, pendingintent2);
        }
        f f1;
        for (Iterator iterator = W.iterator(); iterator.hasNext(); com.go.weatherex.i.d.a(remoteviews, f1.a, pendingintent))
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
        a((s)ax);
        b((s)ax);
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
        com.go.weatherex.i.d.a(remoteviews, b, aj, ai, flag);
        flag1 = com.gau.go.launcherex.gowidget.weather.util.r.b(aw.n());
        com.go.weatherex.i.d.c(remoteviews, l, af);
        com.go.weatherex.i.d.d(remoteviews, k, ak);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), flag1, g, h, i, j, aa, ab);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), flag1, o);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), flag1, p, q);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), flag1, e, aq, ah, an);
        com.go.weatherex.i.d.b(remoteviews, ((android.text.format.Time) (obj1)), flag1, r);
        com.go.weatherex.i.d.c(remoteviews, ((android.text.format.Time) (obj1)), flag1, n);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, t, false);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, u, true);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, t, false);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, resources, w, av, at, true);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, resources, v, av, at, false);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), resources, x, au);
        com.go.weatherex.i.d.a(remoteviews, ((android.text.format.Time) (obj1)), g1, u1, resources, s, au, false);
        com.go.weatherex.i.d.e(remoteviews, A, ag);
        com.go.weatherex.i.d.a(remoteviews, B);
        com.go.weatherex.i.d.a(remoteviews, A, false);
        com.go.weatherex.i.d.a(remoteviews, B, false);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, z, aw.c(), aw.d());
        com.go.weatherex.i.d.a(remoteviews, weatherbean, flag, C, ad);
        com.go.weatherex.i.d.a(remoteviews, resources, weatherbean, c);
        com.go.weatherex.i.d.b(remoteviews, resources, weatherbean, u1, d);
        com.go.weatherex.i.d.b(remoteviews, resources, weatherbean, P);
        com.go.weatherex.i.d.c(remoteviews, resources, weatherbean, u1, O);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, K);
        com.go.weatherex.i.d.b(remoteviews, weatherbean, u1, L);
        com.go.weatherex.i.d.c(remoteviews, weatherbean, u1, M);
        com.go.weatherex.i.d.d(remoteviews, weatherbean, u1, N);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, E, F, G, J, I, ac, al, ao, ap, am);
        com.go.weatherex.i.d.a(remoteviews, weatherbean, u1, Q, 0);
        com.go.weatherex.i.d.a(remoteviews, Q, false);
        com.go.weatherex.i.d.a(remoteviews, R, S, aw.b());
        com.go.weatherex.i.d.a(remoteviews, aw.n(), resources, weatherbean, m);
        com.go.weatherex.i.d.b(remoteviews, T);
        if (aw.e())
        {
            if (com.go.weatherex.e.a.a().b())
            {
                Object obj;
                int i1;
                if (ay != null)
                {
                    obj = ay;
                } else
                {
                    obj = com.go.weatherex.e.a.a().b("appwidget_star_themetip");
                    ay = ((Drawable) (obj));
                }
                if (obj != null)
                {
                    com.go.weatherex.i.d.a(remoteviews, V, ((Drawable) (obj)));
                }
            } else
            {
                com.go.weatherex.i.d.b(remoteviews, V, 0x7f02006f);
            }
            if (U != 0)
            {
                com.go.weatherex.i.d.a(remoteviews, U, 0);
            } else
            {
                com.go.weatherex.i.d.a(remoteviews, V, 0);
            }
        } else
        if (U != 0)
        {
            com.go.weatherex.i.d.a(remoteviews, U, 8);
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, V, 8);
        }
        n1.b(W.size());
        obj = n1.a(((android.text.format.Time) (obj1)));
        for (i1 = 0; i1 < ((List) (obj)).size(); i1++)
        {
            obj1 = (ForecastBean)((List) (obj)).get(i1);
            ((f)W.get(i1)).a(remoteviews, u1, ((ForecastBean) (obj1)), resources, ae, au);
        }

        if (n1.h())
        {
            com.go.weatherex.i.d.a(remoteviews, X, true);
            com.go.weatherex.i.d.b(remoteviews, X, ar);
            com.go.weatherex.i.d.b(remoteviews, Z, ar);
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, X, false);
        }
        if (n1.i())
        {
            com.go.weatherex.i.d.a(remoteviews, Y, true);
            com.go.weatherex.i.d.b(remoteviews, Y, as);
            com.go.weatherex.i.d.b(remoteviews, Z, as);
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, Y, false);
        }
        if (n1.h() || n1.i())
        {
            com.go.weatherex.i.d.a(remoteviews, Z, true);
            return remoteviews;
        } else
        {
            com.go.weatherex.i.d.a(remoteviews, Z, false);
            return remoteviews;
        }
    }
}
