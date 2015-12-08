// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.AdapterView;
import android.widget.ListView;
import com.a.a.an;
import com.a.a.d;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.home.current.a.a;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            ab, CityWeatherInfoBase, s, w, 
//            t, u, v

public class CurrentWeatherContent extends ListView
    implements android.widget.AdapterView.OnItemClickListener
{

    private com.go.weatherex.home.current.w a;
    private Activity b;
    private CityWeatherInfoBase c;
    private a d;
    private f e;
    private String f;
    private Context g;
    private boolean h;

    public CurrentWeatherContent(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = "";
        h = false;
        a(context);
        setOnItemClickListener(this);
    }

    static String a(CurrentWeatherContent currentweathercontent)
    {
        return currentweathercontent.f;
    }

    private void a(Context context)
    {
        g = context;
        e = com.gau.go.launcherex.gowidget.weather.util.f.a(context);
    }

    static com.go.weatherex.home.current.w b(CurrentWeatherContent currentweathercontent)
    {
        return currentweathercontent.a;
    }

    private void m()
    {
        int i1 = getResources().getDimensionPixelSize(0x7f0c01ce);
        c = com.go.weatherex.home.current.ab.a(b);
        int ai[] = new int[2];
        com.gau.go.launcherex.gowidget.c.g.a(getContext(), ai);
        c.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, ai[1] - i1));
        c.a(a);
        c.c().setOnClickListener(new s(this));
        addHeaderView(c);
    }

    public void a()
    {
        h = true;
        if (!TextUtils.isEmpty(f))
        {
            c.a(a);
            com.gau.go.launcherex.gowidget.weather.model.WeatherBean weatherbean = e.a(f);
            c.b(weatherbean);
            c.a();
            d = new a(a, f);
            setAdapter(d);
            d.notifyDataSetChanged();
        }
    }

    public void a(w w1)
    {
        if (w1.e != null)
        {
            int i1 = w1.e.indexOf(f);
            if (i1 != -1)
            {
                i1 = ((Integer)w1.f.get(i1)).intValue();
                c.a(i1);
            }
        }
    }

    public void a(com.go.weatherex.home.current.w w1)
    {
        a = w1;
        b = a.getActivity();
        m();
    }

    public void a(String s1)
    {
        f = s1;
    }

    public void b()
    {
        c.a();
    }

    public String c()
    {
        return f;
    }

    public void d()
    {
        if (d != null)
        {
            d.a();
        }
    }

    public void e()
    {
        if (d != null)
        {
            d.b();
        }
    }

    public void f()
    {
        setOnScrollListener(null);
        if (d != null)
        {
            d.c();
        }
    }

    public boolean g()
    {
        return h;
    }

    public a h()
    {
        return d;
    }

    public void i()
    {
        post(new t(this));
    }

    public void j()
    {
        d d1 = new d();
        int i1 = com.gtp.a.a.d.a.a(g, 50F);
        an an1 = new an();
        an1.a(new int[] {
            0, i1
        });
        an1.a(new u(this));
        an1.c(300L);
        an1.e(500L);
        an1.a(new AccelerateDecelerateInterpolator());
        an an2 = new an();
        an2.a(new int[] {
            i1, 0
        });
        an2.c(800L);
        an2.a(new BounceInterpolator());
        an2.a(new v(this));
        d1.a(an1).b(an2);
        d1.a();
    }

    public void k()
    {
        a();
        if (d != null)
        {
            d.g();
        }
    }

    protected void l()
    {
        Object obj = GoWidgetApplication.c(b.getApplicationContext()).a();
        if (!((SharedPreferences) (obj)).getBoolean("key_brief_card_tap_for_more", false))
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("key_brief_card_tap_for_more", true);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
    }

    protected void onFinishInflate()
    {
        setFadingEdgeLength(0);
        setCacheColorHint(0);
        setVerticalFadingEdgeEnabled(false);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (d.a(i1 - 1).intValue())
        {
        case 7: // '\007'
        default:
            return;

        case 3: // '\003'
        case 6: // '\006'
        case 8: // '\b'
            break;

        case 1: // '\001'
            a.b(f);
            l();
            return;

        case 2: // '\002'
            a.c(f);
            l();
            return;

        case 4: // '\004'
            a.a(f);
            l();
            return;

        case 5: // '\005'
            a.d(f);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        l();
        return;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (flag && c != null)
        {
            android.widget.AbsListView.LayoutParams layoutparams = (android.widget.AbsListView.LayoutParams)c.getLayoutParams();
            if (layoutparams == null)
            {
                layoutparams = new android.widget.AbsListView.LayoutParams(-1, l1 - j1);
                c.setLayoutParams(layoutparams);
            } else
            {
                layoutparams.height = l1 - j1;
            }
            c.requestLayout();
        }
    }
}
