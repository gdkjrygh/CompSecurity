// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.dayforecast;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;
import com.jiubang.a.a.e;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.dayforecast:
//            ForecastDaysColumn, e

public class ForecastDaysForm extends FrameLayout
{

    private Context a;
    private String b;
    private String c[];
    private Time d;
    private Time e;
    private f f;
    private com.gau.go.launcherex.gowidget.weather.c.e g;
    private g h;
    private LayoutInflater i;
    private ArrayList j;
    private ForecastDaysColumn k;
    private View l;
    private View m;
    private ListView n;
    private e o;
    private String p;
    private boolean q;
    private a r;

    public ForecastDaysForm(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new ArrayList();
        p = "";
        q = false;
        a(context);
    }

    private String a(int i1, int j1, int k1)
    {
        d.setToNow();
        d.set(k1, j1 - 1, i1);
        d.normalize(false);
        return c[d.weekDay];
    }

    static String a(ForecastDaysForm forecastdaysform, int i1, int j1, int k1)
    {
        return forecastdaysform.a(i1, j1, k1);
    }

    static ArrayList a(ForecastDaysForm forecastdaysform)
    {
        return forecastdaysform.j;
    }

    private void a(Context context)
    {
        a = context;
        context = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        f = context.h();
        g = context.f();
        h = context.g();
        d = new Time();
        b(a);
    }

    private void a(String s, boolean flag)
    {
        s = f.a(s);
        if (s != null && ((WeatherBean) (s)).g != null)
        {
            j.clear();
            e = h.c(((WeatherBean) (s)).l.n());
            j = com.go.weatherex.i.c.b(a, p);
            o.notifyDataSetChanged();
        }
    }

    static LayoutInflater b(ForecastDaysForm forecastdaysform)
    {
        return forecastdaysform.i;
    }

    private void b(Context context)
    {
        b = com.gau.go.launcherex.gowidget.weather.util.r.e(context.getResources().getString(0x7f0802b7));
        c = com.gau.go.launcherex.gowidget.weather.util.c.h(context);
        for (int i1 = c.length - 1; i1 > -1; i1--)
        {
            c[i1] = com.gau.go.launcherex.gowidget.weather.util.r.e(c[i1]);
        }

    }

    static a c(ForecastDaysForm forecastdaysform)
    {
        return forecastdaysform.r;
    }

    static Time d(ForecastDaysForm forecastdaysform)
    {
        return forecastdaysform.e;
    }

    static String e(ForecastDaysForm forecastdaysform)
    {
        return forecastdaysform.b;
    }

    static com.gau.go.launcherex.gowidget.weather.c.e f(ForecastDaysForm forecastdaysform)
    {
        return forecastdaysform.g;
    }

    public void a()
    {
        a(p, false, true);
    }

    public void a(a a1)
    {
        if (k != null)
        {
            k.a(a1);
        }
        r = a1;
    }

    public void a(String s, boolean flag, boolean flag1)
    {
        if (TextUtils.isEmpty(s) || !flag1 && p.equals(s) && q)
        {
            return;
        }
        p = s;
        q = true;
        if (flag)
        {
            o.a(280L, 130L, 420L, 50F);
        } else
        {
            o.a(0L, 0L, 0L, 0.0F);
        }
        a(p, flag);
        if (!j.isEmpty())
        {
            l.setVisibility(8);
            m.setVisibility(0);
            k.a(s, flag, j);
        } else
        {
            m.setVisibility(8);
            l.setVisibility(0);
        }
        invalidate();
    }

    public void b()
    {
        Resources resources = a.getResources();
        c = com.gau.go.launcherex.gowidget.weather.util.c.a(resources);
        for (int i1 = c.length - 1; i1 > -1; i1--)
        {
            c[i1] = com.gau.go.launcherex.gowidget.weather.util.r.e(c[i1]);
        }

        b = com.gau.go.launcherex.gowidget.weather.util.r.e(resources.getString(0x7f0802b7));
        a();
    }

    protected void onFinishInflate()
    {
        l = findViewById(0x7f0901e3);
        i = LayoutInflater.from(a);
        k = (ForecastDaysColumn)findViewById(0x7f09029e);
        m = findViewById(0x7f09029d);
        n = (ListView)findViewById(0x7f09029f);
        o = new e(new com.go.weatherex.home.dayforecast.e(this));
        o.a(n);
        n.setAdapter(o);
        n.setCacheColorHint(0);
    }
}
