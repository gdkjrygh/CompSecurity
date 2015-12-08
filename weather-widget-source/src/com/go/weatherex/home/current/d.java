// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.a.a.s;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.hourforecast.ForecastHourTrend;
import com.go.weatherex.i.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            aa, f, e, g

public class d extends aa
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, android.view.View.OnClickListener
{

    private Context b;
    private View c;
    private ForecastHourTrend d;
    private TextView e;
    private String f;
    private TextView g;
    private View h;
    private Time i;
    private boolean j;
    private boolean k;

    public d(a a1, int l)
    {
        super(a1, l);
        j = false;
        k = false;
        b = a1.getActivity().getApplicationContext();
        c = a1.getActivity().getLayoutInflater().inflate(0x7f03003c, null);
        d = (ForecastHourTrend)c.findViewById(0x7f0901e6);
        e = (TextView)c.findViewById(0x7f090202);
        a.a(e, 4, true);
        g = (TextView)c.findViewById(0x7f0901e7);
        h = c.findViewById(0x7f0901e3);
        g.setOnClickListener(this);
        i = new Time();
        i.setToNow();
        if (GoWidgetApplication.c(b).a().getBoolean("key_brief_card_tap_for_more", false))
        {
            g.setVisibility(8);
            return;
        } else
        {
            g.setVisibility(0);
            GoWidgetApplication.c(b).a().registerOnSharedPreferenceChangeListener(this);
            k = true;
            return;
        }
    }

    private void a(View view)
    {
        if (j)
        {
            return;
        } else
        {
            j = true;
            s s1 = s.a(view, "alpha", new float[] {
                1.0F, 0.0F
            });
            s1.a(1000L);
            com.a.a.d d1 = new com.a.a.d();
            d1.a(new f(this, view));
            d1.a(s1);
            d1.a();
            return;
        }
    }

    static void a(d d1, View view)
    {
        d1.a(view);
    }

    static boolean a(d d1)
    {
        return d1.j;
    }

    static TextView b(d d1)
    {
        return d1.g;
    }

    static String c(d d1)
    {
        return d1.f;
    }

    private boolean m()
    {
        Time time = new Time();
        time.setToNow();
        if (i.year == time.year && i.month == time.month && i.monthDay == time.monthDay && i.hour == time.hour)
        {
            return false;
        } else
        {
            i.setToNow();
            return true;
        }
    }

    public void a()
    {
        super.a();
        if (!m())
        {
            return;
        } else
        {
            a(f);
            return;
        }
    }

    public void a(int l)
    {
        super.a(l);
        a(f);
    }

    public void a(String s1)
    {
        e.setText(b.getResources().getString(0x7f0802dc));
        if (!TextUtils.isEmpty(s1))
        {
            f = s1;
            ArrayList arraylist = com.go.weatherex.i.c.a(b, s1);
            if (arraylist != null && !arraylist.isEmpty())
            {
                d.setVisibility(0);
                h.setVisibility(8);
                d.a(s1, false, arraylist);
            } else
            {
                d.setVisibility(8);
                h.setVisibility(0);
            }
            if (g.getVisibility() == 0)
            {
                g.postDelayed(new e(this), 5000L);
                return;
            }
        }
    }

    public void a(List list, w w)
    {
        super.a(list, w);
        a(f);
    }

    public void b()
    {
        super.b();
        if (!m())
        {
            return;
        } else
        {
            a(f);
            return;
        }
    }

    public void c()
    {
        super.c();
        a(f);
    }

    public View f()
    {
        return c;
    }

    public void g()
    {
    }

    public void h()
    {
        e.setText(b.getResources().getString(0x7f0802dc));
    }

    public void i()
    {
        d.a();
        if (k)
        {
            GoWidgetApplication.c(b).a().unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    public void onClick(View view)
    {
        if (view.equals(g))
        {
            a(g);
            g.postDelayed(new g(this), 500L);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s1)
    {
        if (!s1.equals("key_brief_card_tap_for_more") || g.getVisibility() != 0)
        {
            return;
        } else
        {
            a(g);
            return;
        }
    }
}
